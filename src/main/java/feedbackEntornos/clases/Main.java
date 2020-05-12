package feedbackEntornos.clases;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Equipo equipo1 = new Equipo("Madrid", "Primera división");
		Equipo equipo2 = new Equipo("Zaragoza", "Primera división");
		Equipo equipo3 = new Equipo("Sevilla", "Primera división");
		
		ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
		listaEquipos.add(equipo1);
		listaEquipos.add(equipo2);
		listaEquipos.add(equipo3);
		
		Partidos partido1 = new Partidos("Romareda", "Pepe", 2, 1, "Sin incidencias");
		Partidos partido2 = new Partidos("Bernabeu", "Juan", 5, 1, "Sin incidencias");
		Partidos partido3 = new Partidos("Pizjuan", "Roberto", 4, 1, "Sin incidencias");
		
		ArrayList<Partidos> listaPartidosJugadosArrayList = new ArrayList<Partidos>();
		listaPartidosJugadosArrayList.add(partido1);
		listaPartidosJugadosArrayList.add(partido2);
		listaPartidosJugadosArrayList.add(partido3);
		
		System.out.println(partido1.dimeResultado());

	}

}
