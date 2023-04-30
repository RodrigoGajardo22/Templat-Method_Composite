package eje2;

public class Tarea implements ItemDeProyecto {
	private String nombre;
	private int    tiempo;

	public Tarea(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	@Override
	public int tiempo() {
		return tiempo;
	}

}
