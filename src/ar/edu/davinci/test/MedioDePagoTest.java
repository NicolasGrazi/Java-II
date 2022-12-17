package ar.edu.davinci.test;

import ar.edu.davinci.domain.Efectivo;
import ar.edu.davinci.domain.MedioDePago;
import ar.edu.davinci.domain.Pase;
import ar.edu.davinci.domain.Sube;

public class MedioDePagoTest {

	public static void main(String[] args) {

		MedioDePago sube = new Sube(6);

		System.out.println(sube.toString());

		MedioDePago pase1 = new Pase(3);
		System.out.println(pase1.toString());

		MedioDePago pase2 = new Pase(45);
		System.out.println(pase2.toString());

		MedioDePago efectivo = new Efectivo();
		System.out.println(efectivo.toString());



	}

}
