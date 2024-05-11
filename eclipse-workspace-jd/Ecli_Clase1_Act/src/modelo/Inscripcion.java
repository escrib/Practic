package modelo;

import java.time.LocalDate;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;

    public Inscripcion(Alumno alumno, Materia materia) {
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
        //TODO
        /**
        *inscripcion aprobada si: NO tiene correlativas, si aprobo las correlativas.
        */
        

        return !this.materia.tieneCorrelativas() || this.materia.puedeCursar(this.alumno);
    }

}
