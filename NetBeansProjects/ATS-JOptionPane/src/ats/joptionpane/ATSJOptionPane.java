
package ats.joptionpane;

import javax.swing.JOptionPane;


public class ATSJOptionPane {

    public static void main(String[] args) {

        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));

        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero no es 5");
        }
    }
    
}
