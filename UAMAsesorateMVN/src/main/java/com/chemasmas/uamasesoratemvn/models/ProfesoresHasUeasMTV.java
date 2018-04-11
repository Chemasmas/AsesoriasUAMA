package com.chemasmas.uamasesoratemvn.models;
// Generated 4/04/2018 08:58:21 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * ProfesoresHasUeas generated by hbm2java
 */
public class ProfesoresHasUeasMTV  implements java.io.Serializable {


     StringProperty profesor;
     StringProperty uea;
     StringProperty lugar;
     StringProperty inicio;
     StringProperty fin;
     private ProfesoresHasUeas me;
     
    public ProfesoresHasUeasMTV(ProfesoresHasUeas phu) {
        profesor = new SimpleStringProperty(phu.getProfesores().getNombre());
        uea = new SimpleStringProperty(phu.getUeas().getNombre());
        lugar = new SimpleStringProperty(phu.getUeas().getNombre());
        inicio = new SimpleStringProperty(phu.getInicio().toString());
        fin = new SimpleStringProperty(phu.getInicio().toString());
        me = phu;
    }

    @Override
    public String toString() {
        return uea.getValueSafe();
    }

    public StringProperty getProfesor() {
        return profesor;
    }

    public void setProfesor(StringProperty profesor) {
        this.profesor = profesor;
    }

    public StringProperty getUea() {
        return uea;
    }

    public void setUea(StringProperty uea) {
        this.uea = uea;
    }

    public StringProperty getLugar() {
        return lugar;
    }

    public void setLugar(StringProperty lugar) {
        this.lugar = lugar;
    }

    public StringProperty getInicio() {
        return inicio;
    }

    public void setInicio(StringProperty inicio) {
        this.inicio = inicio;
    }

    public StringProperty getFin() {
        return fin;
    }

    public void setFin(StringProperty fin) {
        this.fin = fin;
    }

    public ProfesoresHasUeas getMe() {
        return me;
    }

    public void setMe(ProfesoresHasUeas me) {
        this.me = me;
    }
    
    
    
    

}


