package com.sanvalero.feedbackentornos.clases;

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

	public void setCampoJuego(String campoJuego) {
		this.campoJuego = campoJuego;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public Date getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(Date fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	
	
	
}
