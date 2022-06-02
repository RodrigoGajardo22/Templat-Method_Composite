package test_eje4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import eje4.Calculador;
import eje4.CalculadorJubilado;
import eje4.CalculadorNoJubilado;

class testEje4 {

	@Test
	void testJubiladoSinPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue() - 1);

		double resultado = calculador.calcularPrecio(100);

		assertEquals(110d, resultado, 0.01f);
	}

	@Test
	void testJubiladoConPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue());

		double resultado = calculador.calcularPrecio(100);

		assertEquals(100d, resultado, 0.01f);

	}

	@Test
	void testNoJubiladoConPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue());

		double resultado = calculador.calcularPrecio(100);

		assertEquals(115d, resultado, 0.01f);
	}

	@Test
	void testNoJubiladoSinPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue() - 1);

		double resultado = calculador.calcularPrecio(100);

		assertEquals(121d, resultado, 0.01f);

	}

}
