package a_POO_Constructor_GetSett_Encapsulamiento.a_11_Ejercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
       Cuadrilatero c1;
       float lado1, lado2;
       
       lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado1: "));
       lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado2: "));

       if(lado1 == lado2){//Es un Cuadrado
           c1 = new Cuadrilatero(lado1);
       }
       else {
           c1 = new Cuadrilatero(lado1, lado2);
       }
       
        System.out.println("El area es: "+c1.getArea());
        System.out.println("El perimetro es: "+c1.getPerimetro());
        
       }
}
