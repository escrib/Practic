package a_POO_Constructor_GetSett_Encapsulamiento.a_08_ENCAPSULAMIENTO_Metodos_Accesores;


public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
        
        objeto1.setEdad(43);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Seba");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
}
