package b_POO_HERENCIA.a_03_Class_Abstrac;

/**
 *
 * @author smsua
 */
public class Main {
    public static void main(String[] args) {
        
        Planta planta = new Planta();
        planta.alimentarse();
        
        AnimalCarnivoro animalc = new AnimalCarnivoro();
        animalc.alimentarse();
    }
}
