package com.sanvalero.feedbackentornos.clases;

public class Jugadores extends Persona{

	private String nombreEquipo;

	public Jugadores(String nombre, String apellidos, String nombreEquipo) {
		super(nombre, apellidos);
		this.nombreEquipo = nombreEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	
	
	
}
