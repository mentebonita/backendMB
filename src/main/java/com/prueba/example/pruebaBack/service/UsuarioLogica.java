package com.prueba.example.pruebaBack.service;

import com.prueba.example.pruebaBack.component.UsuarioImplement;
import com.prueba.example.pruebaBack.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioLogica implements UsuarioImplement {


    @Override
    public boolean validarDatos(Usuario usuario) {

        if (usuario.getCorreo().equals("daysimancco@gmail.com")) {
            if (usuario.getPassword().equals("123")) {
                return true;
            }
        }
        return false;
            }
        }


