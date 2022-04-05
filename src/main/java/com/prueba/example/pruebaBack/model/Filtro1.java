package com.prueba.example.pruebaBack.model;

public class Filtro1 {
        private int idFiltro1;
        private int rangoEdad;

    public Filtro1() {
    }

    public Filtro1(int idFiltro1, int rangoEdad) {
        this.idFiltro1 = idFiltro1;
        this.rangoEdad = rangoEdad;
    }

    @Override
    public String toString() {
        return "Filtro1{" +
                "idFiltro1=" + idFiltro1 +
                ", rangoEdad=" + rangoEdad +
                '}';
    }
}
