package com.sanvalero.feedbackentornos.clases;


public class Equipo {

	private String nombreEquipo;
	private String patrocinador;
	private String colorCamiseta1;
	private String colorCamiseta2;
	private String categoria;
	
	public Equipo (String nombreEquipo, String categoria) {
		this.nombreEquipo = nombreEquipo;
		this.categoria = categoria;
	}

	
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	public String getColorCamiseta1() {
		return colorCamiseta1;
	}

	public void setColorCamiseta1(String colorCamiseta1) {
		this.colorCamiseta1 = colorCamiseta1;
	}
	public String getColorCamiseta2() {
		return colorCamiseta2;
	}
	public void setColorCamiseta2(String colorCamiseta2) {
		this.colorCamiseta2 = colorCamiseta2;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	
	
	
	
}
