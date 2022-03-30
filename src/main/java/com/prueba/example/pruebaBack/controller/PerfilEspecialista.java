package com.prueba.example.pruebaBack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/perfilEspecialista")
public class PerfilEspecialista {
        @GetMapping ("/lista")
        public String  listEspecialista(){
            return "ver.component";
        }
}
