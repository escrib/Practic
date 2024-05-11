package b_POO_HERENCIA.a_02_SobreEscritura_Miembros_Metodos;

/**
 *
 * @author smsua
 */
public class Persona extends Animal{
    
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
