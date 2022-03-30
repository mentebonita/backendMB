package com.prueba.example.pruebaBack.component;

import com.prueba.example.pruebaBack.model.ReservarCita;

public interface ReservarCitaImpl {
    public String generarCita(ReservarCita reservarCita);
    public String guardarCita(ReservarCita reservarCita);
    public String eliminarCita(ReservarCita reservarCita);
    public int actualizarCita(ReservarCita reservarCita);
}
