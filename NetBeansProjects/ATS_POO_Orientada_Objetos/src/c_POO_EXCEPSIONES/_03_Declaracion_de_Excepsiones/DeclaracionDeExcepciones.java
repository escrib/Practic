package c_POO_EXCEPSIONES._03_Declaracion_de_Excepsiones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Exception en el Metodo para tratarlo en otro Metodo

public class DeclaracionDeExcepciones {

    private String archivo;
    private FileReader fr;

      
    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("C:\\Users\\smsua\\MEGA\\WorkSpaces\\Prueba-Fs-texto-txt\\texto.txt");
        FileReader fr = new FileReader(archivo);
    }   
    
    public void leerArchivo2() throws IOException {
        leerArchivo();
    }  
    
    public static void main(String[] args) {
        
    }

   
    
    
}
