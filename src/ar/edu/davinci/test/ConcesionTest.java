package ar.edu.davinci.test;

import ar.edu.davinci.domain.Cabina;
import ar.edu.davinci.domain.CategoriaVehiculo;
import ar.edu.davinci.domain.Concesion;
import ar.edu.davinci.domain.Estacion;
import ar.edu.davinci.domain.Sube;
import ar.edu.davinci.domain.Vehiculo;

public class ConcesionTest {

	public static void main(String[] args) {
		Concesion concesion = new Concesion();

		System.out.println(concesion.toString());

		concesion.addEstacion(11, "Estacion11");

		System.out.println(concesion.toString());

		concesion.addEstacion(15, "Estacion15");

		System.out.println(concesion.toString());

		Estacion estacion = concesion.getEstacionById(15);
		if (estacion != null) {
			System.out.println(estacion.toString());

			estacion.addCabina(1, new Sube(4));

			System.out.println(estacion.toString());

			Cabina cab = estacion.getCabinaById(1);
			if (cab != null) {
				System.out.println(cab.toString());

				cab.addRegistro(new Vehiculo("444", CategoriaVehiculo.CAMION));

				System.out.println(cab.toString());

				System.out.println(estacion.toString());

			} else {
				System.out.println("No existe cabina");
			}


		} else {
			System.out.println("No existe estación");
		}

		System.out.println(concesion.toString());

	}

}
