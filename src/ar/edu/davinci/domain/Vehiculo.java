package ar.edu.davinci.domain;

import java.util.Objects;

public class Vehiculo {

	// Atributos
	private String patente;

	private CategoriaVehiculo categoria;

	// Constructor
	public Vehiculo(String patente, CategoriaVehiculo categoria) {
		this.patente = patente;
		this.categoria = categoria;
	}

	// Getters & Setters
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public CategoriaVehiculo getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaVehiculo categoria) {
		this.categoria = categoria;
	}


	// Métodos sobreescritos de la clase Object
	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", categoria=" + categoria +  ", categoria.Precio=" + categoria.getPrecio() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(patente, other.patente);
	}

}
