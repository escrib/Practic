package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tecnico")
public class Tecnico extends Persona{
    @ManyToMany(targetEntity = Especialidad.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private List<Especialidad> especialidades;


    public void addEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }

    public void eliminarEspecilidad(Especialidad especialidad){
        this.especialidades.remove(especialidad);
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public Tecnico() {
    }
    public Tecnico(List<Especialidad> especialidades) {
        this.especialidades = new ArrayList<>();
    }




    @Override
    public String toString() {
        return "|Tecnico " + this.getId() + "| - " + this.getNombre();
    }


}
