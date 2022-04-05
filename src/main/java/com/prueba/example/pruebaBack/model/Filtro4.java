package com.prueba.example.pruebaBack.model;

public class Filtro4 {
    private String telefono;
    private String correo;

    public Filtro4() {
    }

    public Filtro4(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Filtro4{" +
                "telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
