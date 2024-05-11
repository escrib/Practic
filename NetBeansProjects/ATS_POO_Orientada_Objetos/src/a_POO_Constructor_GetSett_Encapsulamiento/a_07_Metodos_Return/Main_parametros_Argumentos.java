package a_POO_Constructor_GetSett_Encapsulamiento.a_07_Metodos_Return;

import javax.swing.JOptionPane;

public class Main_parametros_Argumentos {
    
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

    Operacion op = new Operacion();
    
    int suma = op.sumar(n1, n2);
    int resta = op.restar(n1, n2);
    int mult = op.multiplicar(n1, n2);
    int div = op.dividir(n1, n2);
    
    op.mostrarResultados(suma, resta, mult, div);
    }
    
}
