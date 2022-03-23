package com.prueba.example.pruebaBack.Component;

import org.springframework.stereotype.Component;

@Component
public class Persona implements PersonaDependency {

    @Override
    public void revisar() {
        System.out.println("Priueba MB");
    }
}
