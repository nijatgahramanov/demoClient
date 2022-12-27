package com.br.demoClient.controller;


import com.br.demoClient.dto.ValCurs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.sql.Date;

@RestController
@RequestMapping("api/client")
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private XmlMapper xmlMapper;

    @GetMapping
    public ResponseEntity<?> getData() throws JsonProcessingException {

        Date date = Date.valueOf(LocalDate.now());
        SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        String str = df.format(date);

        String url = "https://www.cbar.az/currencies/27.12.2022.xml";
        ResponseEntity<String> result = restTemplate.getForEntity(url, String.class, str);

        ValCurs val = xmlMapper.readValue(result.getBody(), ValCurs.class);
        String json = objectMapper.writeValueAsString(val);

        return ResponseEntity.ok(json);
    }


}
