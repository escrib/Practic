package controller;

import model.Cliente;
import model.Especialidad;
import model.Tecnico;
import repository.PersonaRepository;
import java.util.Scanner;

public class PersonaController {
	private PersonaRepository pr;
	
	public PersonaRepository getPr() {
		return pr;
	}
	
	public void setPr(PersonaRepository pr) {
		this.pr = pr;
	}
	
	public PersonaController() {
		this.pr = new PersonaRepository();
	}
	
	public void agregarCliente(Scanner scanner) {
		System.out.println("Ingrese el nombre del cliente: ");
		String nombreCliente = scanner.next();
		Cliente cliente = new Cliente();
		cliente.setNombre(nombreCliente);
		pr.getEm().getTransaction().begin();
		pr.insertar(cliente);
		pr.getEm().getTransaction().commit();
		System.out.println("Cliente agregado con exito.\n");
	}
	
	public void mostrarClientes() {
		System.out.println("Clientes: ");
		pr.buscarClientes().forEach(
				cliente -> System.out.println(cliente));
        System.out.println();
	}
	
	public Cliente buscarClienteId(long nroCliente) {
        Cliente cliente = pr.buscarUno(nroCliente);
        System.out.println(cliente);
        return cliente;
    }

	public void agregarTecnico(Scanner scanner) {
		System.out.print("Ingrese el nombre del tecnico: ");
		String nombre = scanner.next();

		Tecnico tecnico = new Tecnico();
		tecnico.setNombre(nombre);

		pr.getEm().getTransaction().begin();
		pr.insertar(tecnico);
		pr.getEm().getTransaction().commit();

		System.out.println("Tecnico agregado con éxito.\n");
	}

	public void mostrarTecnicos() {
		System.out.println("Tecnicos: ");
		pr.buscarTecnicos().forEach(
				tecnico -> System.out.println(tecnico));
		System.out.println();
	}



	public void mostrarEspecialidad() {
		Especialidad esp1Tango = new Especialidad("tango");
		Especialidad esp2Sap = new Especialidad("sap");
		Especialidad esp3Ubuntu = new Especialidad("ubuntu");
		Especialidad esp4Windows = new Especialidad("windows");
		Tecnico tecnico1 = new Tecnico();
		tecnico1.addEspecialidad(esp1Tango);
		tecnico1.addEspecialidad(esp3Ubuntu);
		Tecnico tecnico2 = new Tecnico();
		tecnico2.addEspecialidad(esp2Sap);
		tecnico2.addEspecialidad(esp4Windows);
		System.out.println(tecnico2.getEspecialidades());

	}
}
