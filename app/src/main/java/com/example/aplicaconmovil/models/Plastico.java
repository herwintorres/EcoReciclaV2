package com.example.aplicaconmovil.models;

public class Plastico {
    float peso;
    float precious;
    String mes;

    public Plastico(float peso, float precious, String mes) {
        this.peso = peso;
        this.precious = precious;
        this.mes = mes;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecious() {
        return precious;
    }

    public String getMes() {
        return mes;
    }
}
