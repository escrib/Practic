package validadorCorrelativasTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import validadorCorrelativas.Alumno;
import validadorCorrelativas.Inscripcion;
import validadorCorrelativas.Materia;

public class inscripcionTest {

    
	@Test
	public void juanSePuedeAnotarAProgramacion1() {
		Alumno Juan = new Alumno("Juan", "27953339");
		Materia programacion1 = new Materia("Programacion 1");
		Inscripcion inscripcionDeJuanAProgra1 = new Inscripcion(Juan, programacion1);
		
		Assertions.assertTrue(inscripcionDeJuanAProgra1.aprobada());
	}
	
	public void juanNoSePuedeAnotarProgra2() {
		Alumno Juan = new Alumno("Juan", "27953339");
        Materia programacion1 = new Materia("Programacion 1");
        Materia programacion2 = new Materia("Programacion 2");
        
        programacion2.agregarCorrelativa(programacion1);
                
        Inscripcion inscripcionDeJuanProgra2 = new Inscripcion(Juan, programacion2);
                
        Assertions.assertFalse(inscripcionDeJuanProgra2.aprobada());
                
	}
}
