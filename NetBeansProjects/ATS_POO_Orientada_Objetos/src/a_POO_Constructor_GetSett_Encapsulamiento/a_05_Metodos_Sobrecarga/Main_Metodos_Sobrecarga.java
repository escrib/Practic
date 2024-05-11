package a_POO_Constructor_GetSett_Encapsulamiento.a_05_Metodos_Sobrecarga;

public class Main_Metodos_Sobrecarga {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Seba",43);
        persona1.correr();
        
        Persona persona2 = new Persona("27953339");
        persona2.correr(20);
    }
    
}
