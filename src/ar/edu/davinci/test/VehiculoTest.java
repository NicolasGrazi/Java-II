package ar.edu.davinci.test;

import ar.edu.davinci.domain.CategoriaVehiculo;
import ar.edu.davinci.domain.Vehiculo;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo auto = new Vehiculo("A1123B", CategoriaVehiculo.AUTO);

		System.out.println("");
		System.out.println("auto: " + auto.toString());
		System.out.println("auto.precio: " + auto.getCategoria().getPrecio());

		Vehiculo moto = new Vehiculo("A443V", CategoriaVehiculo.MOTO);

		System.out.println("");
		System.out.println("moto: " + moto.toString());
		System.out.println("moto.precio: " + moto.getCategoria().getPrecio());

		Vehiculo camion = new Vehiculo("B443V", CategoriaVehiculo.CAMION);

		System.out.println("");
		System.out.println("camion: " + camion.toString());
		System.out.println("camion.precio: " + camion.getCategoria().getPrecio());


	}

}
