package a_POO_Constructor_GetSett_Encapsulamiento.a_10_CONSTANTES;

public class Persona {
    //Atributos
    private int edad;
    
    //CONTANTES (final)
    private final String nombre;
    
    //METODOS
    //CONSTRUCTOR
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
