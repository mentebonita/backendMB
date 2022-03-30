package com.prueba.example.pruebaBack.model;


import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class HorarioEspecialista extends Especialistas {
    private int idItinerario;
    private Date fechaNc;
    private Date fechActualizacion;
    private TimeZone horaNc;
    private TimeZone horafin;
    private Date fechaInicio;
    private Date fechaFin;
    private ReservarCita reservarCita;

    public HorarioEspecialista() {
    }

    public HorarioEspecialista(int idItinerario, Date fechaNc, Date fechActualizacion, TimeZone horaNc, TimeZone horafin, Date fechaInicio, Date fechaFin, ReservarCita reservarCita) {
        this.idItinerario = idItinerario;
        this.fechaNc = fechaNc;
        this.fechActualizacion = fechActualizacion;
        this.horaNc = horaNc;
        this.horafin = horafin;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.reservarCita = reservarCita;
    }

    public Date getFechaNc() {
        return fechaNc;
    }

    public void setFechaNc(Date fechaNc) {
        this.fechaNc = fechaNc;
    }

    public Date getFechActualizacion() {
        return fechActualizacion;
    }

    public void setFechActualizacion(Date fechActualizacion) {
        this.fechActualizacion = fechActualizacion;
    }

    public TimeZone getHoraNc() {
        return horaNc;
    }

    public void setHoraNc(TimeZone horaNc) {
        this.horaNc = horaNc;
    }

    public TimeZone getHorafin() {
        return horafin;
    }

    public void setHorafin(TimeZone horafin) {
        this.horafin = horafin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ReservarCita getReservarCita() {
        return reservarCita;
    }

    public void setReservarCita(ReservarCita reservarCita) {
        this.reservarCita = reservarCita;
    }

    @Override
    public String toString() {
        return "HorarioEspecialista{" +
                "idItinerario=" + idItinerario +
                ", fechaNc=" + fechaNc +
                ", fechActualizacion=" + fechActualizacion +
                ", horaNc=" + horaNc +
                ", horafin=" + horafin +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", reservarCita=" + reservarCita +
                '}';
    }
}
