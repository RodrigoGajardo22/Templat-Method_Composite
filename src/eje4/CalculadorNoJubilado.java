package eje4;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	protected double conPromocion(double precio) {
		return (precio * 0.15) + precio;
	}

	protected double sinPromocion(double precio) {
		return (precio * 0.21) + precio;
	}
}
