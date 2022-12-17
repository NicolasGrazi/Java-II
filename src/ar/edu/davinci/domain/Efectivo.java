package ar.edu.davinci.domain;

public class Efectivo extends MedioDePago {

	public Efectivo() {
		super("EFECTIVO", 0);
	}

	@Override
	public Double getDescuento() {
		return 0.0;
	}

}
