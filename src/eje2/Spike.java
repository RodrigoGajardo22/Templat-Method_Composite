package eje2;

public class Spike implements ItemDeProyecto {
	private String nombre;
	private int    tiempo;

	public Spike(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	@Override
	public int tiempo() {
		return tiempo;
	}

}
