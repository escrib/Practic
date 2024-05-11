package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Cliente extends Persona{

    public Cliente() {
    }
    
    public Cliente(String nombreCliente){this.setNombre(nombreCliente);}

    @Override
    public String toString() {
        return "|Cliente " + this.getId() + "| - " + this.getNombre();
    }                
}
