package eje4;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	protected double conPromocion(double precio) {
		return precio;
	}

	protected double sinPromocion(double precio) {
		return (precio * 0.1) + precio;
	}
}
