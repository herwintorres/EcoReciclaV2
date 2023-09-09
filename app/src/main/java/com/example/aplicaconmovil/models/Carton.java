package com.example.aplicaconmovil.models;

public class Carton {
    float peso;
    float precious;
    String mes;

    public Carton(float peso, float precious, String mes) {
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
