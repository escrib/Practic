package validadorCorrelativasTest;

import com.java.clase1.modelo.Alumno;
import com.java.clase1.modelo.Inscripcion;
import com.java.clase1.modelo.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InscripcionTest {
    
//    @Test
//    public void juanSePuedeAnotarAProgramacion1(){
//        Alumno juan = new Alumno("Juan", "27953339");
//        Materia programacion1 = new Materia("Programacion 1");
//        Inscripcion inscripcionDeJuanAProgra1 = new Inscripcion(juan, programacion1);
//        
//        Assertions.assertTrue(inscripcionDeJuanAProgra1.aprobada());
//    }
//    @Test
//    public void juanNoSePuedeAnotarAProgra2(){
//        Alumno juan = new Alumno("Juan", "27953339");
//        Materia programacion1 = new Materia("Programacion 1");
//        Materia programacion2 = new Materia("Programacion 2");
//        programacion2.agregarCorrelativa(programacion1);
//
//        Inscripcion inscripcionDeJuanAProgra2 = new Inscripcion(juan, programacion2);
//        
//        Assertions.assertFalse(inscripcionDeJuanAProgra2.aprobada());              
//        
//    }
    
    @Test
    public void juanSePuedeAnotarAProgra2(){
        Alumno juan = new Alumno("Juan", "27953339");
        Materia programacion1 = new Materia("Programacion 1");
        Materia programacion2 = new Materia("Programacion 2");
        programacion2.agregarCorrelativa(programacion1);
        juan.agregarMateriaAprobada(programacion1);

        Inscripcion inscripcionDeJuanAProgra2 = new Inscripcion(juan, programacion2);
        
        Assertions.assertTrue(inscripcionDeJuanAProgra2.aprobada());              
        
    }
    
}
