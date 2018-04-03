/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

/**
 *
 * @author eva_0
 */
public class UEAsDTO {
    private long id;
    private String nombre;
    private String clave;
    private int trimestre;
    private DivisionesDTO division;
    private long division_id;
    private TroncosDTO tronco;
    private long tronco_id;
    
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public DivisionesDTO getDivision() {
        return division;
    }

    public void setDivision(DivisionesDTO division) {
        this.division = division;
    }

    public TroncosDTO getTronco() {
        return tronco;
    }

    public void setTronco(TroncosDTO tronco) {
        this.tronco = tronco;
    }

    public long getDivision_id() {
        return division_id;
    }

    public void setDivision_id(long division_id) {
        this.division_id = division_id;
    }

    public long getTronco_id() {
        return tronco_id;
    }

    public void setTronco_id(long tronco_id) {
        this.tronco_id = tronco_id;
    }
    
}
