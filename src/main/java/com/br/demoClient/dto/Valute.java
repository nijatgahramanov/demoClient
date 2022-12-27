package com.br.demoClient.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Valute")
public class Valute {

    @JacksonXmlProperty(isAttribute = true, localName = "Code")
    private String code;

    @JacksonXmlProperty(isAttribute = true, localName = "Nominal")
    private String nominal;

    @JacksonXmlProperty(isAttribute = true, localName = "Value")
    private Double value;

    @JacksonXmlProperty(isAttribute = true, localName = "Name")
    private String name;

    public Valute(String code, String nominal, Double value, String name) {
        this.code = code;
        this.nominal = nominal;
        this.value = value;
    }

    public Valute() {
    }

    public String getCode() {
        return code;
    }

    public Valute setCode(String code) {
        this.code = code;
        return this;
    }

    public String getNominal() {
        return nominal;
    }

    public Valute setNominal(String nominal) {
        this.nominal = nominal;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public Valute setValue(Double value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return name;
    }

    public Valute setName(String name) {
        this.name = name;
        return this;
    }
}
