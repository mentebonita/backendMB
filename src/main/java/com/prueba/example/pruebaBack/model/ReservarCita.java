package com.prueba.example.pruebaBack.model;

import java.util.Date;
import java.util.List;

public class ReservarCita extends Cita {
    private int idReservarCita;
    private Date fechaLlegada;
    private Date fechaLimite;
    private double pagoTotal;
    private Especialistas especialista;
    private List<HorarioEspecialista> horarioEspecialistaList;
    private DetalleSesion detalleSesion;
    private PagoPersona pagoParsona;

    public ReservarCita() {
    }

    public ReservarCita(int idReservarCita, Date fechaLlegada, Date fechaLimite, double pagoTotal, Especialistas especialista, List<HorarioEspecialista> horarioEspecialistaList, DetalleSesion detalleSesion, PagoPersona pagoParsona) {
        this.idReservarCita = idReservarCita;
        this.fechaLlegada = fechaLlegada;
        this.fechaLimite = fechaLimite;
        this.pagoTotal = pagoTotal;
        this.especialista = especialista;
        this.horarioEspecialistaList = horarioEspecialistaList;
        this.detalleSesion = detalleSesion;
        this.pagoParsona = pagoParsona;
    }


    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public Especialistas getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialistas especialista) {
        this.especialista = especialista;
    }

    public List<HorarioEspecialista> getHorarioEspecialistaList() {
        return horarioEspecialistaList;
    }

    public void setHorarioEspecialistaList(List<HorarioEspecialista> horarioEspecialistaList) {
        this.horarioEspecialistaList = horarioEspecialistaList;
    }

    public DetalleSesion getDetalleSesion() {
        return detalleSesion;
    }

    public void setDetalleSesion(DetalleSesion detalleSesion) {
        this.detalleSesion = detalleSesion;
    }

    public PagoPersona getPagoParsona() {
        return pagoParsona;
    }

    public void setPagoParsona(PagoPersona pagoParsona) {
        this.pagoParsona = pagoParsona;
    }

    @Override
    public String toString() {
        return "ReservarCita{" +
                "idReservarCita=" + idReservarCita +
                ", fechaLlegada=" + fechaLlegada +
                ", fechaLimite=" + fechaLimite +
                ", pagoTotal=" + pagoTotal +
                ", especialista=" + especialista +
                ", horarioEspecialistaList=" + horarioEspecialistaList +
                ", detalleSesion=" + detalleSesion +
                ", pagoParsona=" + pagoParsona +
                '}';
    }
}
