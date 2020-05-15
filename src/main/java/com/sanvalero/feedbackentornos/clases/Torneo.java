package com.sanvalero.feedbackentornos.clases;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
	
	//ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
	private List<Equipo> listaEquipos;
	
	public Torneo() {
		listaEquipos = new ArrayList<Equipo>();
	}
	
	
	public boolean registrarEquipo(Equipo equipo) {
		for (Equipo unEquipo : listaEquipos) {
			if(unEquipo.getNombreEquipo().equals(equipo.getNombreEquipo())) {
				return false;
			}			
		}
		
		
		listaEquipos.add(equipo);
		return true;
	}
	
	public int getCantidadEquipos() {
		return listaEquipos.size();
	}

}
