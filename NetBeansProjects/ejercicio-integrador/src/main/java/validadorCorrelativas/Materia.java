/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validadorCorrelativas;

/**
 *
 * @author smsua
 */
import java.util.ArrayList;
import java.util.List;

public class Materia {
	
	private String nombre;
	
	private List<Materia> correlativas;
	
	//COnstructor
	public Materia(String nombre) {
		this.nombre = nombre;
		
		//inicioalizamos List<>
		this.correlativas = new ArrayList<Materia>();
	}
	//TODO
        
}