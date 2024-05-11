package model;

import javax.persistence.*;

@Entity
@Table(name = "incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descripcion;
    @ManyToOne(targetEntity = Cliente.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Cliente cliente;
	private String tipo;
    @ManyToOne(targetEntity = Tecnico.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
	private Tecnico tecnico;

    public Incidente() {
    }

    public Incidente(Cliente cliente) {
        this.setCliente(cliente);
    }

    public Incidente(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    
        

	
	
	
	
	
}