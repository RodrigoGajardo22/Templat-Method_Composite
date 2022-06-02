package eje1;

import java.util.ArrayList;
import java.util.List;

public class CompositeLiderProyecto extends Empleado {

	private List<Empleado> empleados;

	public CompositeLiderProyecto(int salario, String nombre) {

		super(salario, nombre);

		empleados = new ArrayList<>();
	}

	public int salario() {
		int aux = this.salario;
		for (Empleado empleado : empleados) {
			aux = aux + empleado.salario();

		}

		return aux;

	}

	public void add(Empleado empleado) {

		empleados.add(empleado);

	}

	public void remove(Empleado empleado) {
		empleados.remove(empleado);

	}

}
