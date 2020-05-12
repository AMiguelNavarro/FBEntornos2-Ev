package feedbackEntornos.clases;

import java.sql.Date;

public class Calendario {

	private String campoJuego;
	private String equipoLocal;
	private String equipoVisitante;
	private Date fechaPartido;
	
	public Calendario(String campoJuego, String equipoLocal, String equipoVisitante, Date fechaPartido) {
		super();
		this.campoJuego = campoJuego;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.fechaPartido = fechaPartido;
	}

	public String getCampoJuego() {
		return campoJuego;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public Date getFechaPartido() {
		return fechaPartido;
	}
	
	
	
}
