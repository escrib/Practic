package clase3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listaDeDatos = Arrays.asList("dat", "dato1","datodos2", "datotres3", "datocuatro4");

    //for iterado
//        for (int i = 0; i < listaDeDatos.size(); i++) {
//            System.out.println(listaDeDatos.get(i));
//        }
        
    //con STREAM
//            listaDeDatos.stream().forEach((da) -> System.out.println(da.toUpperCase()));
            Actividad3 act3 = new  Actividad3();
//            act3.pasarMayus();
            
            Integer n = 5;
            System.out.println(act3.tamanioCadena(listaDeDatos, n));
    }
}