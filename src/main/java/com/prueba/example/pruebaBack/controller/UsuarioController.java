package com.prueba.example.pruebaBack.controller;



import com.prueba.example.pruebaBack.model.Usuario;
import com.prueba.example.pruebaBack.service.UsuarioLogica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioLogica usuarioLogica;
    @PostMapping("/validar")
    private String validarUser(Model model, @RequestParam(name="correo") String correo, @RequestParam(name="password") String password){
        Usuario usuario= new Usuario(0,correo,password);
        if(usuarioLogica.validarDatos(usuario)) {
               return "redirect:/inicioMB";
            }
        return "iniciarSesion";
        }
}
