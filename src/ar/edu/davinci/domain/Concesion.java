package ar.edu.davinci.domain;

import java.util.ArrayList;
import java.util.List;

public class Concesion {

	private List<Estacion> estaciones;

	public Concesion() {
		this.estaciones = new ArrayList<Estacion>();
	}

	public List<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List<Estacion> estaciones) {
		this.estaciones = estaciones;
	}


	public void addEstacion(Estacion estacion) {
		this.estaciones.add(estacion);
	}

	public void addEstacion(Integer id, String nombre) {
		Estacion estacion = new Estacion(id, nombre);
		this.addEstacion(estacion);
	}

	@Override
	public String toString() {
		return "Concesion [estaciones=" + estaciones + "]";
	}

	public Estacion getEstacionById(Integer id) {
		Estacion aBuscar = new Estacion(id);
		for (Estacion estacion : estaciones) {
			if (estacion.equals(aBuscar)) {
				return estacion;
			}
		}
		return null;
	}


	public void cobrar(Estacion esta,Vehiculo vei, Cabina cab) {
		for(Estacion estacio: estaciones) {
			if(estacio.getId() == esta.getId()) {
				
				for(Cabina cabinas: estacio.getCabinas()) {
					if(cabinas.getId()==cab.getId()) {
					cabinas.cobrar(vei,estacio.dameHoraActual());
					}
				}
				
			}
		}
			
	}


	public void promedioDeDemora() {
		for(Estacion esta:estaciones) {
			esta.promedioDeDemora();
		}
	}
}

