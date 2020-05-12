package feedbackEntornos.clases;

public class Arbitros extends Persona{

	private String observacionesPartido;

	public Arbitros(String nombre, String apellidos, String observacionesPartido) {
		super(nombre, apellidos);
		this.observacionesPartido = observacionesPartido;
	}

	public String getObservacionesPartido() {
		return observacionesPartido;
	}
	
	public String registrarResultadoPartido() {
		return "Ha ganado el equipo local";
	}
	
}
