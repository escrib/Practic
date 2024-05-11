package b_POO_HERENCIA.a_01_Herencia;

public class Estudiante extends Persona {
    
    private int codigoEstudiante;
    private float notaFinal;
    
    //Constructor con HERENCIA
    //Super(heredados)
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        /* usando PROTECTED
        System.out.println("Nombre: "+nombre+
                "\nApellido: "+apellido+
                "\nEdad: "+edad+
                "\nCodigo estudiante: "+codigoEstudiante+
                "\nNota final: "+notaFinal);
                */
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCodigo estudiante: "+codigoEstudiante+
                "\nNota final: "+notaFinal);
}
}   
