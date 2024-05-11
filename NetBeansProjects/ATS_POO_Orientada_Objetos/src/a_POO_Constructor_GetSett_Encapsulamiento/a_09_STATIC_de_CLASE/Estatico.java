package a_POO_Constructor_GetSett_Encapsulamiento.a_09_STATIC_de_CLASE;

//STATIC: si cambia en un objeto cambia para TODOS.

public class Estatico {
    //Atributos STATIC
    private static String frase = "Primera frase";
    
    //Metodos STATIC
    public static int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
    
    
    
    public static void main(String[] args) {
        
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Personal frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        
        //STATICs no requieren instanciar objetos
        System.out.println(Estatico.frase);

        //STATICs no requieren instanciar objetos
        System.out.println("La suma es: "+Estatico.sumar(4,6));
    }
}
