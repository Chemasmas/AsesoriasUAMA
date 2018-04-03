/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import java.sql.Time;

/**
 *
 * @author eva_0
 */
public class BitacoraDAO {
 
    private ProfesoresDAO profesor;
    private long profesor_id;
    private UEAsDAO uea;
    private long uea_id;
    private String lugar;
    private Time inicio;
    private Time fin;

    public ProfesoresDAO getProfesor() {
        return profesor;
    }

    public void setProfesor(ProfesoresDAO profesor) {
        this.profesor = profesor;
    }

    public long getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(long profesor_id) {
        this.profesor_id = profesor_id;
    }

    public UEAsDAO getUea() {
        return uea;
    }

    public void setUea(UEAsDAO uea) {
        this.uea = uea;
    }

    public long getUea_id() {
        return uea_id;
    }

    public void setUea_id(long uea_id) {
        this.uea_id = uea_id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Time getInicio() {
        return inicio;
    }

    public void setInicio(Time inicio) {
        this.inicio = inicio;
    }

    public Time getFin() {
        return fin;
    }

    public void setFin(Time fin) {
        this.fin = fin;
    }
    
    
}
