package com.sanvalero.feedbackentornos.clases;

public class Partidos {

	private String campo;
	private String nombreArbitro;
	private int resultadoLocal;
	private int resultadoVisitante;
	private String incidencias;
	private int golesTotalPartido = 0;
	
	
	public Partidos(String campo, String nombreArbitro, int resultadoLocal, int resultadoVisitante,
			String incidencias) {
		this.campo = campo;
		this.nombreArbitro = nombreArbitro;
		this.resultadoLocal = resultadoLocal;
		this.resultadoVisitante = resultadoVisitante;
		this.incidencias = incidencias;
		this.golesTotalPartido = resultadoLocal+resultadoVisitante;
	}


	public String getCampo() {
		return campo;
	}


	public void setCampo(String campo) {
		this.campo = campo;
	}


	public String getNombreArbitro() {
		return nombreArbitro;
	}


	public void setNombreArbitro(String nombreArbitro) {
		this.nombreArbitro = nombreArbitro;
	}


	public int getResultadoLocal() {
		return resultadoLocal;
	}


	public void setResultadoLocal(int resultadoLocal) {
		this.resultadoLocal = resultadoLocal;
	}


	public int getResultadoVisitante() {
		return resultadoVisitante;
	}


	public void setResultadoVisitante(int resultadoVisitante) {
		this.resultadoVisitante = resultadoVisitante;
	}


	public String getIncidencias() {
		return incidencias;
	}


	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}


	public int getGolesTotalPartido() {
		return golesTotalPartido;
	}


	public void setGolesTotalPartido(int golesTotalPartido) {
		this.golesTotalPartido = golesTotalPartido;
	}


	
	
}
