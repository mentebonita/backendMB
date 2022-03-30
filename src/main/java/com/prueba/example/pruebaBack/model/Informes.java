package com.prueba.example.pruebaBack.model;

import java.util.Date;
import java.util.List;

public class Informes extends Persona {
    private int idInformes;
    private String nombreInforme;
    private Date fechaRealizado;
    private Date fechaRevisado;
    private List<Especialistas> especialistasList;
}
