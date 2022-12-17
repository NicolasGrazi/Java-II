package ar.edu.davinci.test;

import ar.edu.davinci.domain.Cabina;
import ar.edu.davinci.domain.CategoriaVehiculo;
import ar.edu.davinci.domain.Efectivo;
import ar.edu.davinci.domain.Estacion;
import ar.edu.davinci.domain.Pase;
import ar.edu.davinci.domain.Sube;
import ar.edu.davinci.domain.Vehiculo;

public class EstacionTest {

	public static void main(String[] args) {

		Estacion estacion12 = new Estacion(12, "Estacion12");

		System.out.println(estacion12.toString());

		estacion12.addCabina(1, new Sube(10));

		System.out.println(estacion12.toString());

		// Obtener la cabina 1 y asignarle un registro

		Cabina cab = estacion12.getCabinaById(1);
		if (cab != null) {

			System.out.println(cab.toString());

			cab.addRegistro(new Vehiculo("3333", CategoriaVehiculo.MOTO));

			System.out.println(cab.toString());

			System.out.println(estacion12.toString());
		} else {
			System.out.println("No existe cabina");
		}

		estacion12.addCabina(2, new Pase(10));
		estacion12.addCabina(3, new Pase(2));
		estacion12.addCabina(4, new Efectivo());
		estacion12.addCabina(7, new Efectivo());
		estacion12.addCabina(8, new Efectivo());
		


		System.out.println(estacion12.toString());

		Cabina cab4 = estacion12.getCabinaById(4);
		if (cab4 != null) {
			System.out.println(cab4.toString());

			cab4.addRegistro(new Vehiculo("444", CategoriaVehiculo.CAMION));

			System.out.println(cab4.toString());

			System.out.println(estacion12.toString());

		} else {
			System.out.println("No existe cabina");
		}

		System.out.println(	estacion12.cabinasConEfectivo());


	}

}
