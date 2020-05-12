package feedbackEntornos.clases;

public class Jugadores extends Persona{

	private String nombreEquipo;

	public Jugadores(String nombre, String apellidos, String nombreEquipo) {
		super(nombre, apellidos);
		this.nombreEquipo = nombreEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	
	
}
