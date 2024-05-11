package c_POO_EXCEPSIONES._02_Exception_Verificadas_NoVerificadas;

import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcepcionesVerificadas_NoVerificadas {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
        //Excepciones Verificadas (IOException)
            //Lectura de archivo de texto txt
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\smsua\\MEGA\\WorkSpaces\\Prueba-Fs-texto-txt\\texto.txt"));
            String linea;
            while ((linea=bf.readLine()) != null) {
                System.out.println(linea);
            }
        */
        
        //Excepciones No Verificadas (RunTimeException)
            //Division por cero
            int num1 =5, num2 = 0, resultado;
            
            resultado = num1*num2;
            
            System.out.println(resultado);
            
            
            
    }
}
