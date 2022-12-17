package ar.edu.davinci.domain;

public class Pase extends MedioDePago {

	public Pase(Integer diasDemora) {
		super("PASE", diasDemora);
	}

	@Override
	public Double getDescuento() {
		if (super.getDiasDemora() <= 5) {
			return 15.0;
		} else {
			return 12.0;
		}
	}

}
