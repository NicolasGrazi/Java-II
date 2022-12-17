package ar.edu.davinci.test;

import ar.edu.davinci.domain.Cabina;
import ar.edu.davinci.domain.CategoriaVehiculo;
import ar.edu.davinci.domain.Efectivo;
import ar.edu.davinci.domain.MedioDePago;
import ar.edu.davinci.domain.Pase;
import ar.edu.davinci.domain.Registro;
import ar.edu.davinci.domain.Sube;
import ar.edu.davinci.domain.Vehiculo;

public class CabinaTest {

	public static void main(String[] args) {
		MedioDePago medioDePago = new Sube(12);
		Cabina cabina1 = new Cabina(1, medioDePago);

		System.out.println(cabina1.toString());

		Cabina cabina2 = new Cabina(2, new Pase(5));

		System.out.println(cabina2.toString());

		Cabina cabina3 = new Cabina(3, new Pase(15));

		System.out.println(cabina3.toString());

		Cabina cabina4 = new Cabina(5, new Efectivo());

		System.out.println(cabina4.toString());

		Vehiculo auto =  new Vehiculo("123", CategoriaVehiculo.AUTO);

		// Acá alguien es responsable de crear el registro y asociarlo
		Registro registro1 = new Registro(10, auto, 100 );
		System.out.println(registro1.toString());
		cabina1.addRegistro(registro1);

		System.out.println(cabina1.toString());

		// Acá la cabina es responsable de crear el registro y asociarlo,
		//es más simple que andar creando por afuera un registro.
		System.out.println("PRECIOOOOOOOOOOOOOOOOOOOOOOO");
		
		cabina1.cobrar( auto,8);

		System.out.println(cabina1.toString());
		System.out.println("PRECIOOOOOOOOOOOOOOOOOOOOOOO");
		cabina2.cobrar( new Vehiculo("432", CategoriaVehiculo.CAMION),11);

		System.out.println(cabina2.toString());
		
		cabina3.addRegistro(new Vehiculo("888", CategoriaVehiculo.MOTO));
		//System.out.println(cabina3.toString());
		
		
		System.out.println("*****************************");
		//cabina1.diasDemora();

	}

}
