package b_POO_HERENCIA.a_03_Class_Abstrac;

/**
 *
 * @author smsua
 */
public class AnimalCarnivoro extends Animal{
    
    @Override
    public void alimentarse(){
        System.out.println("El carnivoro se alimenta de carne");
    }
}
