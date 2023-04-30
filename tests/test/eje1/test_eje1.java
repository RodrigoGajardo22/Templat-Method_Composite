package test.eje1;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import eje1.CompositeLiderProyecto;
import eje1.Director;
import eje1.Empleado;
import eje1.EmpleadoRegular;
import eje1.Gerente;
import eje1.MandoMedio;

class test_eje1 {

	@Test
	void test() {

		// Set Up

		Empleado juan = new EmpleadoRegular(1000, "Juan");
		Empleado franco = new EmpleadoRegular(1000, "Franco");

		CompositeLiderProyecto LP1 = new CompositeLiderProyecto(2000, "Alverto - LP1");
		CompositeLiderProyecto LP2 = new CompositeLiderProyecto(2000, "Tomas - LP2");

		CompositeLiderProyecto MM1 = new MandoMedio(3000, "Ana - MM1");
		CompositeLiderProyecto MM2 = new MandoMedio(3000, "Florencia - MM2");

		CompositeLiderProyecto G1 = new Gerente(4000, "Ariel - G1");
		CompositeLiderProyecto G2 = new Gerente(4000, "Gloria - G2");
		CompositeLiderProyecto G3 = new Gerente(4500, "Noelia - G3"); 

		CompositeLiderProyecto D1 = new Director(5000, "Rodrigo - D1");
		CompositeLiderProyecto D2 = new Director(5000, "Emilio - D2");

		D1.add(G1);
		G1.add(MM1);
		MM1.add(LP1);
		LP1.add(juan);

		D2.add(G2);
		D2.add(G3);
		G2.add(MM2);
		MM2.add(LP2);
		LP2.add(juan);
		LP2.add(franco);

		// Testeo

		int resultadoEsperado1 = 5000 + 4000 + 3000 + 2000 + 1000; // 15000
		int resultadoEsperado2 = 5000 + 8500 + 3000 + 2000 + 2000; // 20500

		// Verificacion

		assertTrue(resultadoEsperado1 == D1.salario());
		assertTrue(resultadoEsperado2 == D2.salario());

	}

}