package a_POO_Constructor_GetSett_Encapsulamiento.a_06_Metodos_Parametros_Argumentos;

import javax.swing.JOptionPane;

public class Main_parametros_Argumentos {
    
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

    Operacion op = new Operacion();
    op.sumar(n1, n2);
    op.restar(n1, n2);
    op.multiplicar(n1, n2);
    op.dividir(n1, n2);
    
    op.mostrarResultados();
    }
    
}
