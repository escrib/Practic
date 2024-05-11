package a_POO_Constructor_GetSett_Encapsulamiento.a_08_ENCAPSULAMIENTO_Metodos_Accesores;


public class Clase1 {
    private int edad;
    private String nombre;
    
    //Metodo SETTER: establece la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodo GETTER: muestra la edad
    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
