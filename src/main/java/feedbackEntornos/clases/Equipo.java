package feedbackEntornos.clases;

public class Equipo {

	private String nombreEquipo;
	private String patrocinador;
	private String colorCamiseta1;
	private String colorCamiseta2;
	private String categoria;
	private static int numEquipos;
	
	public Equipo (String nombreEquipo, String categoria) {
		this.nombreEquipo = nombreEquipo;
		this.categoria = categoria;
		numEquipos++;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public String getColorCamiseta1() {
		return colorCamiseta1;
	}

	public String getColorCamiseta2() {
		return colorCamiseta2;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public static int dimeNumeroDeEquipos() {
		return numEquipos;
	}
	
}
