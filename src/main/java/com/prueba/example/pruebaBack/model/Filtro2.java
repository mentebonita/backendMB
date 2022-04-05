package com.prueba.example.pruebaBack.model;

public class Filtro2 {
    private String tipoServicio;

    public Filtro2() {
    }

    public Filtro2(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "Filtro2{" +
                "tipoServicio='" + tipoServicio + '\'' +
                '}';
    }
}
