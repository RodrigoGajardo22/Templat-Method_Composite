package test.eje2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import eje2.HistoriaDeUsuario;
import eje2.ItemDeProyecto;
import eje2.Spike;
import eje2.Tarea;

public class TiempoTest {

	@Test
	public void test() {
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

	@Test
	public void test2() {
		HistoriaDeUsuario historia  = new HistoriaDeUsuario("Cargar datos", 5);
		ItemDeProyecto    tarea1    = new Tarea("Validar DNI", 3);
		ItemDeProyecto    tarea2    = new Tarea("registrar en BD", 2);
		ItemDeProyecto    spike1    = new Spike("mostrar msj", 1);
		ItemDeProyecto    spike2    = new Spike("cerrar ventana", 1);

		HistoriaDeUsuario historia2 = new HistoriaDeUsuario("segunda historia", 7);
		ItemDeProyecto    tarea3    = new Tarea("tarea3", 3);
		ItemDeProyecto    spike3    = new Spike("Spike3", 3);

		historia.add(spike2);
		historia.add(spike1);
		historia.add(tarea2);
		historia.add(tarea1);

		historia2.add(spike3);
		historia2.add(tarea3);

		historia.add(historia2);

		int resultado = 5 + 3 + 2 + 1 + 1 + 7 + 3 + 3;

		assertTrue(resultado == historia.tiempo());

	}

}
