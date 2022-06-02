package eje1;

public abstract class Empleado {

	protected int salario;
	protected String nombre;

	public Empleado(int salario, String nombre) {

		this.salario = salario;
		this.nombre = nombre;
	}

	public int salario() {
		return salario;
	}

	public String nombre() {

		return nombre;
	}

}
