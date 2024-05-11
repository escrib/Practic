package view;

import controller.IncidenteController;
import controller.PersonaController;
import model.Incidente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;


public class Main {


    public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tp_integrador_java");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }


    public static void main(String[] args) {
        EntityManager em = getEntityManager();

        PersonaController pc = new PersonaController();

        pc.getPr().setEm(em);

        IncidenteController ic = new IncidenteController();

        ic.getIr().setEm(em);

        Scanner scanner = new Scanner(System.in);

        int opcion;
        long nroCliente;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Técnico");
            System.out.println("3. Mostrar Clientes");
            System.out.println("4. Mostrar Técnicos");
            System.out.println("5. Mostrar Especialidad");
            System.out.println("6. Registrar Incidente");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pc.agregarCliente(scanner);
                    break;
                case 2:
                    pc.agregarTecnico(scanner);
                    break;
                case 3:
                    pc.mostrarClientes();
                    break;
                case 4:
                    pc.mostrarTecnicos();
                    break;
                case 5:
                    pc.mostrarEspecialidad();

                    break;
                case 6:
                    pc.mostrarClientes();
                    System.out.println("Ingrese el numero del cliente: ");
                    nroCliente = scanner.nextLong();
                    ic.agregarIncidente(pc.buscarClienteId(nroCliente));
                    System.out.println("Ingrese la descripcion del incidente para: ");
                    ic.descripcionIncidente(pc.buscarClienteId(nroCliente));


                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);
    }
}
