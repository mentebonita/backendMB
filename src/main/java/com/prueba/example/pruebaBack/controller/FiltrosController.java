package com.prueba.example.pruebaBack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filtros")
public class FiltrosController {
    @GetMapping("/mostrar1")
    public String mostrarFiltro1(){
        return "preguntasFiltro1.component";
    }
    @PostMapping ("/mostrar2")
    public String mostrarFiltro2(){
        return "preguntasFiltro2.component";
    }
    @PostMapping ("/mostrar3")
    public String mostrarFiltro3(){
        return "preguntasFiltro3.component";
    }

}
