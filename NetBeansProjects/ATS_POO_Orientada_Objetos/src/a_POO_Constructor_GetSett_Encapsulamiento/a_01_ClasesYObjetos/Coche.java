package a_POO_Constructor_GetSett_Encapsulamiento.a_01_ClasesYObjetos;


public class Coche {
    
    String color;
    String marca;
    int km;
    
    public static void main (String[] args){
        Coche coche1 = new Coche();
        
        coche1.color= "Blanco";
        coche1.marca= "Audi";
        coche1.km = 0;
        
        System.out.println("EL color del coche1 es: "+coche1.color);
        System.out.println("Marca del coche1 es: "+coche1.marca);
        System.out.println("EL KM del coche1 es: "+coche1.km);

        Coche coche2 = new Coche();
        coche2.color= "Rojo";
        coche2.marca= "FOrd";
        coche2.km = 100;
        
        System.out.println("\nEL color del coche2 es: "+coche2.color);
        System.out.println("Marca del coche2 es: "+coche2.marca);
        System.out.println("EL KM del coche2 es: "+coche2.km);
    }
    
}
