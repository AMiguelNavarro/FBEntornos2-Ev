package com.sanvalero.feedbackentornos;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sanvalero.feedbackentornos.clases.Equipo;
import com.sanvalero.feedbackentornos.clases.Torneo;

public class EquipoTest {

	@Test
	public void registrarEquipo() {
		Torneo torneo = new Torneo();
		Equipo equipo = new Equipo("Barcelona", "Primera división");
		
		assertEquals(true, torneo.registrarEquipo(equipo));
		assertEquals(false, torneo.registrarEquipo(equipo));

		
	}
		
	
}
