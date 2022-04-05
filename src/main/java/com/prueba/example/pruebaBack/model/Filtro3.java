package com.prueba.example.pruebaBack.model;

public class Filtro3 {
    private String nombres;
    private String apellido;

    public Filtro3() {
    }

    public Filtro3(String nombres, String apellido) {
        this.nombres = nombres;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Filtro3{" +
                "nombres='" + nombres + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
