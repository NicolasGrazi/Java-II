package ar.edu.davinci.domain;

public class Sube extends MedioDePago {

	public Sube(Integer diasDemora) {
		super("SUBE", diasDemora);
	}

	@Override
	public Double getDescuento() {
		return 10.0;
	}

}
