package controller;

import model.Cliente;
import model.Incidente;
import repository.IncidenteRepository;

import java.util.Scanner;

public class IncidenteController {

	private IncidenteRepository ir;
	
	public IncidenteRepository getIr() {
		return ir;
	}
	
	public IncidenteController() {
		this.ir = new IncidenteRepository();
	}
	
	public void setIr(IncidenteRepository ir) {
		this.ir = ir;
	}
	
	public void agregarIncidente(Cliente cliente) {
		Incidente inc = new Incidente();
		
		ir.getEm().getTransaction().begin();
		ir.insertar(inc);
		ir.getEm().getTransaction().commit();
	}

		public void descripcionIncidente(Cliente cliente) {
			Scanner scanner = new Scanner(System.in);
			String descripcionIncident = scanner.next();
			Incidente inc = new Incidente(descripcionIncident, cliente);

		ir.getEm().getTransaction().begin();
		ir.insertar(inc);
		ir.getEm().getTransaction().commit();
	}


}
