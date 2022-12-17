package ar.edu.davinci.domain;

public enum CategoriaVehiculo {
	AUTO (100.0),
	MOTO (50.0),
	CAMION (250.0);

	// Atributos
	private Double precio;

	// Constructor Privado
	private CategoriaVehiculo (Double precio) {
		this.precio = precio;
	}

	// GETTERS
	public Double getPrecio() {
		return precio;
	}

	// NOTA: NO ES RECOMENDABLE USAR SETTERS


}
