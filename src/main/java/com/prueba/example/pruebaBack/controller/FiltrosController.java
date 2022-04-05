package com.prueba.example.pruebaBack.controller;

import com.prueba.example.pruebaBack.model.Filtro1;
import com.prueba.example.pruebaBack.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/filtros")
public class FiltrosController {

    @PostMapping ("/enviar")
    private String enviarInfo(Model model, @RequestParam(name="rangoEdad") int rangoEdad){
        Filtro1 filtro1= new Filtro1(1,rangoEdad);

        return "iniciarSesion";
    }
    @PostMapping ("/mostrar3")
    public String mostrarFiltro3(){
        return "preguntasFiltro3.component";
    }

}
