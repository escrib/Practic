package a_POO_Constructor_GetSett_Encapsulamiento.a_05_Metodos_Sobrecarga;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Metodos
    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros");
        
    }
    
}
