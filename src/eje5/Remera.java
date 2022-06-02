package eje5;

public abstract class Remera {

	protected float precio;

	public Remera(float precio) {

		this.precio = precio;

	}

	public float precio() {

		return this.intereses(precio);
	}

	protected abstract float intereses(float precioRemera);

}
