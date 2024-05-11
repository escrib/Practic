package transformador;

public class Nombre {

    public String formateoMayuscula(String cadena){
        
        TransMayuscula m = (cad) -> cad.toUpperCase();
        return m.formatear(cadena);
    }
    
}
