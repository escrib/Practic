import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class _03_Archivos {
    public static void main(String[] args) throws IOException {
        String rutaAMiArchivo = "C:\\Users\\smsua\\OneDrive\\Escritorio\\ejemplo.txt";

        ejemploLecturaArchivo(rutaAMiArchivo);
        ejemploEscrituraArchivo(rutaAMiArchivo);
        ejemploEscrituraArchivo2(rutaAMiArchivo);
    }

    private static void ejemploEscrituraArchivo(String ruta) throws IOException {
        String palabraAEscribir = System.lineSeparator() + "Julia";
        Files.writeString(Paths.get(ruta), palabraAEscribir, StandardOpenOption.APPEND);
    }

    private static void ejemploLecturaArchivo(String ruta) throws IOException {
        for (String unaLinea: Files.readAllLines(Paths.get(ruta))) {
            System.out.println(unaLinea);
        }
    }

    private static void ejemploEscrituraArchivo2(String ruta) throws IOException {
        String fraseAEscribir = System.lineSeparator() + "Esta es una nueva frase para escribir";
        Files.write(Paths.get(ruta), fraseAEscribir.getBytes(), StandardOpenOption.APPEND); // convierte a Bytes
    }

}
