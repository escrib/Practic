package com.java.clase1.modelo;

import java.util.ArrayList;
import java.util.List;


public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
         
    }     
    
    public void agregarMateriaAprobada(Materia aprobada){
        this.materiasAprobadas.add(aprobada);
    }
    
}