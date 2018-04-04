package com.chemasmas.uamasesoratemvn.models;
// Generated 4/04/2018 08:58:21 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ueas generated by hbm2java
 */
public class Ueas  implements java.io.Serializable {


     private Integer id;
     private Divisiones divisiones;
     private Troncos troncos;
     private String nombre;
     private String clave;
     private Integer trimestre;
     private Set profesoresHasUeases = new HashSet(0);

    public Ueas() {
    }

	
    public Ueas(Divisiones divisiones, Troncos troncos) {
        this.divisiones = divisiones;
        this.troncos = troncos;
    }
    public Ueas(Divisiones divisiones, Troncos troncos, String nombre, String clave, Integer trimestre, Set profesoresHasUeases) {
       this.divisiones = divisiones;
       this.troncos = troncos;
       this.nombre = nombre;
       this.clave = clave;
       this.trimestre = trimestre;
       this.profesoresHasUeases = profesoresHasUeases;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Divisiones getDivisiones() {
        return this.divisiones;
    }
    
    public void setDivisiones(Divisiones divisiones) {
        this.divisiones = divisiones;
    }
    public Troncos getTroncos() {
        return this.troncos;
    }
    
    public void setTroncos(Troncos troncos) {
        this.troncos = troncos;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Integer getTrimestre() {
        return this.trimestre;
    }
    
    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }
    public Set getProfesoresHasUeases() {
        return this.profesoresHasUeases;
    }
    
    public void setProfesoresHasUeases(Set profesoresHasUeases) {
        this.profesoresHasUeases = profesoresHasUeases;
    }




}


