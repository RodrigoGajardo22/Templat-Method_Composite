package test.eje2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import eje2.HistoriaDeUsuario;
import eje2.ItemDeProyecto;
import eje2.Spike;
import eje2.Tarea;

class TieTest {

	@Test
	void test1() {
		HistoriaDeUsuario historia = new HistoriaDeUsuario("Cargar datos", 5);
		ItemDeProyecto    tarea1   = new Tarea("Validar DNI", 3);
		ItemDeProyecto    tarea2   = new Tarea("registrar en BD", 2);
		ItemDeProyecto    spike1   = new Spike("mostrar msj", 1);
		ItemDeProyecto    spike2   = new Spike("cerrar ventana", 1);

		historia.add(spike2);
		historia.add(spike1);
		historia.add(tarea2);
		historia.add(tarea1);

		int resultado = 5 + 3 + 2 + 1 + 1;

		assertTrue(resultado == historia.tiempo());

	}

}
