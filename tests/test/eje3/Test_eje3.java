package test.eje3;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import eje3.Automovil;
import eje3.Hogar;
import eje3.Medico;
import eje3.Paquete;
import eje3.Seguro;
import eje3.Vida;

class Test_eje3 {

	@Test
	void test() {
		// Set UP
		Seguro hogar1, medico1, vida1, auto1;

		hogar1  = new Hogar(1500, "Hogar");
		medico1 = new Medico(2000, "Medico");
		vida1   = new Vida(1500, "Vida");
		auto1   = new Automovil(1000, "Auto");

		Paquete combo1 = new Paquete(200, "Combo Basico");

		combo1.add(hogar1);
		combo1.add(medico1);

		Paquete combo2 = new Paquete(300, "Combo Premium");

		combo2.add(combo1);
		combo2.add(vida1);
		combo2.add(auto1);

		// Test

		float resultadoCombo1 = 3434.25f;
		float resultadoCombo2 = 5505.403f;

		// Validacion

		assertTrue(resultadoCombo1 == combo1.valor());
		assertTrue(resultadoCombo2 == combo2.valor());

	}

}
