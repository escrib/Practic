package validadorCorrelativas;

import java.time.LocalDate;

public class Inscripcion {

	private Alumno alumno;
	
	private Materia materia;
	
	private LocalDate fecha;
	
	public Inscripcion(Alumno alumno, Materia materia) {
		super();
		this.alumno = alumno;
		this.materia = materia;
		this.fecha = LocalDate.now();
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public boolean aprobada() {
		/**
		 * - Inscripcion aceptada (true): si Materia no tiene correlativas 
		 * - Inscripcion aceptada (true): si Materia tiene correlativas y alumno las aprobo
		 */
		//TODO
		return !this.materia.tenesCorrelativas() || this.materia.puedeCUrsar(this.alumno);
	}
}
