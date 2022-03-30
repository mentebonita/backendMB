package com.prueba.example.pruebaBack.model;

public class DetalleSesion {
    private int  idDetalle;
    private int nroSesion;
    private double precioSesion;
    private ReservarCita reservarCita;

    public DetalleSesion() {
    }

    public DetalleSesion(int idDetalle, int nroSesion, double precioSesion, ReservarCita reservarCita) {
        this.idDetalle = idDetalle;
        this.nroSesion = nroSesion;
        this.precioSesion = precioSesion;
        this.reservarCita = reservarCita;
    }



    public int getNroSesion() {
        return nroSesion;
    }

    public void setNroSesion(int nroSesion) {
        this.nroSesion = nroSesion;
    }

    public double getPrecioSesion() {
        return precioSesion;
    }

    public void setPrecioSesion(double precioSesion) {
        this.precioSesion = precioSesion;
    }

    public ReservarCita getReservarCita() {
        return reservarCita;
    }

    public void setReservarCita(ReservarCita reservarCita) {
        this.reservarCita = reservarCita;
    }

    @Override
    public String toString() {
        return "DetalleSesion{" +
                "idDetalle=" + idDetalle +
                ", nroSesion=" + nroSesion +
                ", precioSesion=" + precioSesion +
                ", reservarCita=" + reservarCita +
                '}';
    }
}
