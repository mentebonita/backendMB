package com.prueba.example.pruebaBack.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Persona {
    private int idPersona;
    private int dni;
    private String nombre;
    private String apelliodPaterno;
    private String apelliodMaterno;
    private int edad;
    private int nrocelular;
    private String creenciaReligiosa;
    private Date birthday;
    private String sexo;
    private String genero;
    private String estadoCivil;
    private String pais;
    private  String ciudad;

    public Persona() {
    }

    public Persona(int idPersona, int dni, String nombre, String apelliodPaterno, String apelliodMaterno, int edad, int nrocelular, String creenciaReligiosa, Date birthday, String sexo, String genero, String estadoCivil, String pais, String ciudad) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.nombre = nombre;
        this.apelliodPaterno = apelliodPaterno;
        this.apelliodMaterno = apelliodMaterno;
        this.edad = edad;

        this.nrocelular = nrocelular;
        this.creenciaReligiosa = creenciaReligiosa;
        this.birthday = birthday;
        this.sexo = sexo;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelliodPaterno() {
        return apelliodPaterno;
    }

    public void setApelliodPaterno(String apelliodPaterno) {
        this.apelliodPaterno = apelliodPaterno;
    }

    public String getApelliodMaterno() {
        return apelliodMaterno;
    }

    public void setApelliodMaterno(String apelliodMaterno) {
        this.apelliodMaterno = apelliodMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public int getNrocelular() {
        return nrocelular;
    }

    public void setNrocelular(int nrocelular) {
        this.nrocelular = nrocelular;
    }

    public String getCreenciaReligiosa() {
        return creenciaReligiosa;
    }

    public void setCreenciaReligiosa(String creenciaReligiosa) {
        this.creenciaReligiosa = creenciaReligiosa;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apelliodPaterno='" + apelliodPaterno + '\'' +
                ", apelliodMaterno='" + apelliodMaterno + '\'' +
                ", edad=" + edad +
                ", nrocelular=" + nrocelular +
                ", creenciaReligiosa='" + creenciaReligiosa + '\'' +
                ", birthday=" + birthday +
                ", sexo='" + sexo + '\'' +
                ", genero='" + genero + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
