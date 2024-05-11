package com.java.clase1.modelo;


import java.util.ArrayList;
import java.util.List;

public class Materia {
    
    private String nombre;
    private List<Materia> correlativas;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    
    public Materia(String nombre){
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }
    
    public void agregarCorrelativa(Materia correlativa){
        this.correlativas.add(correlativa);
    }
    
    public boolean puedeCursar(Alumno alumno){
        //TODO
        return alumno.getMateriasAprobadas().containsAll(this.correlativas);  
         
    }

    
    
    
    
    boolean tieneCorrelativas() {
        return !this.correlativas.isEmpty();

   
    }  
    
}