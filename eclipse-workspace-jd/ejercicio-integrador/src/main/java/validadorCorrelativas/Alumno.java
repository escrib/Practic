package validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	
	private String nombre;
	
	private String legajo;
	
	private List<Materia> materiasAprobadas;

	public Alumno(String nombre, String legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
		materiasAprobadas = new ArrayList<Materia>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public List<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public boolean tenesCorrelativa(Materia materiaCorrelativa) {
		// TODO Auto-generated method stub
		return this.materiasAprobadas.contains(materiaCorrelativa);
	}
	
	

}
