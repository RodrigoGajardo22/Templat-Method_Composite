package eje2;

import java.util.ArrayList;
import java.util.List;

//Composite
public class HistoriaDeUsuario implements ItemDeProyecto {

	private String               nombre;
	private int                  tiempo;
	private List<ItemDeProyecto> items;

	public HistoriaDeUsuario(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.items  = new ArrayList<>();

	}

	@Override
	public int tiempo() {
		int aux = tiempo;

		for (ItemDeProyecto item : items) {
			aux += item.tiempo();
		}
		return aux;
	}

	public void add(ItemDeProyecto item) {
		items.add(item);
	}

}
