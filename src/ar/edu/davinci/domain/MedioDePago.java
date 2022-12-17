package ar.edu.davinci.domain;

import java.util.Objects;

public abstract class MedioDePago {

	private String descripcion;
	private Integer diasDemora;

	public MedioDePago(String descripcion, Integer diasDemora) {
		this.descripcion = descripcion;
		this.diasDemora = diasDemora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDiasDemora() {
		return diasDemora;
	}

	public void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}

	public abstract Double getDescuento();

	@Override
	public int hashCode() {
		return Objects.hash(descripcion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedioDePago other = (MedioDePago) obj;
		return Objects.equals(descripcion, other.descripcion);
	}

	@Override
	public String toString() {
		return "MedioDePago [descripcion=" + descripcion + ", diasDemora=" + diasDemora + ", descuento=" + getDescuento()  + "]";
	}

}
