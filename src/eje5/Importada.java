package eje5;

public class Importada extends Remera {

	private final float recargo    = 0.03f;
	private final float aduana     = 0.05f;
	private final float aplicativo = 0.25f;

	public Importada(float precio) {
		super(precio);
	}

	@Override

	public float intereses(float precioRemera) {
		float precioFinal = precioRemera;
		precioFinal += precioFinal * recargo;
		precioFinal += precioFinal * aduana;
		precioFinal += precioFinal * aplicativo;
		return precioFinal;
	}

}
