package c_POO_EXCEPSIONES._04_Try_Catch_FINALLY_Excepsiones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

//TRY CATCH para Excepciones Verificadas (de IOException)
//TRY: lo que puede fallar. 
// CATCH: atrapa exception y puede mensaje
// FINALLY: se ejecuta siempre, sea TRY true o false
public class Try_Catch {
    
    public void leerArchivos() throws FileNotFoundException, IOException {
        File archivo = new File("C:\\Users\\smsua\\MEGA\\WorkSpaces\\Prueba-Fs-texto-txt\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        
        while ((linea = bf.readLine()) != null) {            
            System.out.println(linea);
        }
    }
    
    public void leerArchivo2(){
        try{
            leerArchivos();
        } 
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error, verifique la ruta del archivo");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        }
        finally {
            System.out.println("FINALLY pasa siempre");
        }
        System.out.println("Programa terminado");
    }
    
    public static void main(String[] args) {
        Try_Catch pruebaTry_Catch = new Try_Catch();
        
        pruebaTry_Catch.leerArchivo2();
    }
    
}
