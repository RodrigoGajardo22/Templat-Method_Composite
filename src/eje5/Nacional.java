package eje5;

public class Nacional extends Remera {

	// porsentajes;
	private final float transporte = 0.015f;
	private final float bonificacion = 0.2f;
	private final float aplicativo = 0.15f;

	public Nacional(float precio) {
		super(precio);

	}

	@Override
	public float intereses(float precioRemera) {
		float precioFinal = precioRemera;
		precioFinal += precioFinal * transporte;
		precioFinal -= precioFinal * bonificacion;
		precioFinal += precioFinal * aplicativo;

		return precioFinal;
	}

}
