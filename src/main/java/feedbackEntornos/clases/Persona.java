package feedbackEntornos.clases;

import java.sql.Date;

public class Persona {

	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;
	
	
	public Persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	
	
	
	
}
