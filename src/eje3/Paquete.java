package eje3;

import java.util.ArrayList;
import java.util.List;

public class Paquete extends Seguro {

	private List<Seguro> seguros;
	private float descuento = 0.05f;

	public Paquete(float valor, String nombre) {
		super(valor, nombre);
		seguros = new ArrayList<>();
	}

	public float valor() {
		float aux = this.valor;

		for (Seguro seguro : seguros) {
			aux += seguro.valor();
			aux -= (float) aux * descuento;

		}

		return aux;
	}

	public void add(Seguro seguro) {
		seguros.add(seguro);
	}
}
