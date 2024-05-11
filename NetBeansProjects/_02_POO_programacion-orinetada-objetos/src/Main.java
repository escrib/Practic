import argprograma.dominio.personas.Persona;
import argprograma.dominio.personas.TipoDocumento;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Persona unaPersona = new Persona("Eze", "Escobar");
        Persona otraPersona = new Persona("Seba", "Sua");

        unaPersona.setNumeroDocumento("AA27953339");
        // unaPersona.numeroDocumento = "AA27953339";
        unaPersona.getNumeroDocumento();

        unaPersona.setTipoDocumento(TipoDocumento.PASAPORTE);
        // unaPersona.tipoDocumento = TipoDocumento.PASAPORTE;

        otraPersona.setNumeroDocumento("AA5656898");
        otraPersona.setTipoDocumento(TipoDocumento.PASAPORTE);

        // unaPersona.nombre = "Ezequiel";
        // unaPersona.apellido = "Escobar";
        // otraPersona.nombre = "Seba";
        // otraPersona.apellido = "Sua";

        System.out.println(unaPersona.presentate());
        System.out.println(otraPersona.presentate());

    }
}