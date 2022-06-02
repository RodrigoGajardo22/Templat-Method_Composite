package test_eje5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eje5.Importada;
import eje5.Nacional;
import eje5.Remera;

class test_eje5 {

	@Test
	void testNacionales() {
		Remera remera = new Nacional(100);
		float precio = remera.precio();

		double redondeado = Math.round(precio * 100.0) / 100.0;

		assertEquals(93.38, redondeado);

	}

	@Test
	void testImporadas() {
		Remera remera = new Importada(100);
		float precio = remera.precio();
		double redondeado = Math.round(precio * 100.0) / 100.0;

		assertEquals(135.19, redondeado);

	}

}
