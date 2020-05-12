package feedbackEntornos.clases;

public class Partidos {

	private String campo;
	private String nombreArbitro;
	private int resultadoLocal;
	private int resultadoVisitante;
	private String incidencias;
	private static int numPartidos;
	
	public Partidos(String campo, String nombreArbitro, int resultadoLocal, int resultadoVisitante,
			String incidencias) {
		this.campo = campo;
		this.nombreArbitro = nombreArbitro;
		this.resultadoLocal = resultadoLocal;
		this.resultadoVisitante = resultadoVisitante;
		this.incidencias = incidencias;
		numPartidos++;
	}

	public String getCampo() {
		return campo;
	}

	public String getNombreArbitro() {
		return nombreArbitro;
	}

	public int getResultadoLocal() {
		return resultadoLocal;
	}

	public int getResultadoVisitante() {
		return resultadoVisitante;
	}

	public String getIncidencias() {
		return incidencias;
	}
	
	public String dimeResultado() {
		return "El resultado es "+getResultadoLocal()+ " - " +getResultadoVisitante();
	}
	
	public static int dimeNumeroDePartidos() {
		return numPartidos;
	}
	
	
}
