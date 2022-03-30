package com.prueba.example.pruebaBack.controller;

import com.prueba.example.pruebaBack.model.ReservarCita;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping (value="/reservar")
public class ReservarCitaController {
    private final Log LOOGER= LogFactory.getLog(ReservarCitaController.class);

    @GetMapping (value="/crearCita")

    public String crearReserva(){

        return "planyHorario.component";
    }
}
