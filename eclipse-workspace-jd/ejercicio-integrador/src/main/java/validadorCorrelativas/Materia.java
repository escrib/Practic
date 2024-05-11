package validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	
	private String nombre;
	
	private List<Materia> correlativas;
	
	//COnstructor
	public Materia(String nombre) {
		this.nombre = nombre;
		
		//inicioalizamos List<>
		this.correlativas = new ArrayList<Materia>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Materia> getCorrelativas() {
		return correlativas;
	}
        
        public void agregarCorrelativa(Materia correlativa){
            this.correlativas.add(correlativa);
        }
	
	public boolean puedeCursar(Alumno alumno) {
		//TODO
		return true;
	}

	public boolean tenesCorrelativas() {
		return !this.correlativas.isEmpty();
	}

	public boolean puedeCUrsar(Alumno alumno) {
		/**
		 * Alumno puede cursar si tiene/cumple todas las materias coprrelativas
		 */
		return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.tenesCorrelativa(materiaCorrelativa));
	}
}
