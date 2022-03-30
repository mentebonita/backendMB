package com.prueba.example.pruebaBack.model;

import java.util.Date;

public class PagoPersona {
    private int idPago;
    private Date fechaLlegada;
    private Date fechaLimite;
    private double pagoTotal;
    private String responsablePago;
    private ReservarCita reservarCita;

    public PagoPersona() {
    }

    public PagoPersona(int idPago, Date fechaLlegada, Date fechaLimite, double pagoTotal, String responsablePago, ReservarCita reservarCita) {
        this.idPago = idPago;
        this.fechaLlegada = fechaLlegada;
        this.fechaLimite = fechaLimite;
        this.pagoTotal = pagoTotal;
        this.responsablePago = responsablePago;
        this.reservarCita = reservarCita;
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

    public String getResponsablePago() {
        return responsablePago;
    }

    public void setResponsablePago(String responsablePago) {
        this.responsablePago = responsablePago;
    }

    public ReservarCita getReservarCita() {
        return reservarCita;
    }

    public void setReservarCita(ReservarCita reservarCita) {
        this.reservarCita = reservarCita;
    }

    @Override
    public String toString() {
        return "PagoPersona{" +
                "idPago=" + idPago +
                ", fechaLlegada=" + fechaLlegada +
                ", fechaLimite=" + fechaLimite +
                ", pagoTotal=" + pagoTotal +
                ", responsablePago='" + responsablePago + '\'' +
                ", reservarCita=" + reservarCita +
                '}';
    }
}
