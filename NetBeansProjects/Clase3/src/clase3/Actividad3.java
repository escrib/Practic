package clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Actividad3 {
    
       public void pasarMayus(){
        List<String> listaOrigen = Arrays.asList("hola", "chau","rayo", "caramelo", "ropero");        
        List<String> listaMayus = listaOrigen.stream().map(dato -> dato.toUpperCase()).collect(Collectors.toList());      
        listaMayus.forEach(System.out::println);        
    }
    
    public String tamanioCadena(List<String> lista, Integer n) {
        
        return lista.stream().filter(cad -> cad.length()>n).collect(Collectors.joining(", "));
    }
}