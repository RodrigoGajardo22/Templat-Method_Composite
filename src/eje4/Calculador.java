package eje4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
	protected LogTransaction log;
	protected int            mesEnPromocion;

	public Calculador(int mesEnPromocion) {
		this.mesEnPromocion = mesEnPromocion;
		this.log            = new LogTransaction();
	}

	public double calcularPrecio(double precioProducto) {

		log.log(this.getClass().getName());

		if (of(mesEnPromocion).equals(now().getMonth()))
			return this.conPromocion(precioProducto);

		return this.sinPromocion(precioProducto);

	}

	protected abstract double conPromocion(double d);

	protected abstract double sinPromocion(double d);
}
