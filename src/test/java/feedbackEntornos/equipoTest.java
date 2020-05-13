package feedbackEntornos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import feedbackEntornos.clases.Equipo;
import feedbackEntornos.clases.Torneo;

public class equipoTest {
		
	
	@Test
	public void registrarEquipo() {
		Torneo torneo = new Torneo();
		Equipo equipo = new Equipo("Barcelona", "Primera división");
		
		assertEquals(true, torneo.registrarEquipo(equipo));
		assertEquals(false, torneo.registrarEquipo(equipo));
		
		assertEquals(1, torneo.getCantidadEquipos());
		
	}

}
