package ar.edu.davinci.pruebasvarias;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JOptionPane;

public class Pepe extends ArrayList{

	public void	clear() {
		System.out.println("Pase por acá");
		super.clear();
	}


	public static void main(String[] args) {

		List<Integer> pepitos = new Pepe();
		pepitos.add(1);
		pepitos.add(2);
		pepitos.add(3);

		mostrarPepito(pepitos);



		int vector[] = new int[4];
		for (int i = 0; i < 3; i++) {
			vector[i] = pepitos.get(i);
		}

		for (int i = 0; i < vector.length; i++) {
			System.out.println("........> :" + vector[i]);
		}


		pepitos.clear();

		pepitos.add(null);
		pepitos.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")));
		pepitos.add(1);
		pepitos.add(null);
		pepitos.add(2);

		mostrarPepito(pepitos);
	}


	private static void mostrarPepito(List<Integer> pepitos) {
		System.out.println("Mostramos pepitos");
		for(Integer numero : pepitos) {
			System.out.println("-----> :" + numero);
		}
	}

}
