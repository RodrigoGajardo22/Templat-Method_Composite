package eje3;

public abstract class Seguro implements Componente {

	protected float valor;
	protected String nombre;

	public Seguro(float valor, String nombre) {

		this.valor = valor;
		this.nombre = nombre;
	}

	public float valor() {
		return valor;
	}

	public String nombre() {
		return nombre;
	}

}
