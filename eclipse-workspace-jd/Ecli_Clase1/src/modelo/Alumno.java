package modelo;

import java.util.HashSet;
import java.util.Set;

public class Alumno {

	private int legajo;
	private String nombre;
	private String apellido;
	private Set<Materia> materiasAprobadas;
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Set<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(Set<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.setMateriasAprobadas(new HashSet());
	}
	public Alumno(String nombre, String apellido, HashSet<Materia> aprobadas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.materiasAprobadas = materiasAprobadas;
	}
	
	
	
}
