package com.prueba.example.pruebaBack.service;

import com.prueba.example.pruebaBack.component.ReservarCitaImpl;
import com.prueba.example.pruebaBack.model.ReservarCita;
import org.springframework.stereotype.Service;

@Service
public class ReservarCitaService implements ReservarCitaImpl {

    @Override
    public String generarCita(ReservarCita reservarCita) {
        String resultado="";
        return null;
    }

    @Override
    public String guardarCita(ReservarCita reservarCita) {
        return null;
    }

    @Override
    public String eliminarCita(ReservarCita reservarCita) {
        return null;
    }

    @Override
    public int actualizarCita(ReservarCita reservarCita) {
        return 0;
    }
}
