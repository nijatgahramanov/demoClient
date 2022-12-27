package com.br.demoClient.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;


@JacksonXmlRootElement(localName = "Valcurs")
public class ValCurs {

    @JacksonXmlProperty(isAttribute = true,localName = "Description")
    private String description;

    @JacksonXmlProperty(isAttribute = true,localName = "Date")
    private String date;

    @JacksonXmlProperty(isAttribute = true,localName = "Name")
    private String name;


    @JacksonXmlElementWrapper(useWrapping = false,localName = "ValType")
    @JacksonXmlProperty(localName = "ValType")
    private List<ValType> valType;

    public ValCurs(String description, String date, String name, List<ValType> valType) {
        this.description = description;
        this.date = date;
        this.name = name;
        this.valType = valType;
    }

    public ValCurs() {
    }


    public String getDescription() {
        return description;
    }

    public ValCurs setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ValCurs setDate(String date) {
        this.date = date;
        return this;
    }

    public String getName() {
        return name;
    }

    public ValCurs setName(String name) {
        this.name = name;
        return this;
    }

    public List<ValType> getValType() {
        return valType;
    }

    public ValCurs setValType(List<ValType> valType) {
        this.valType = valType;
        return this;
    }
}
