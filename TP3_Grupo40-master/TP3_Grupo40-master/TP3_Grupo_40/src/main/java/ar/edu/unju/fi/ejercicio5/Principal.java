package ar.edu.unju.fi.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		char invertida;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de texto: ");
		cadena = sc.nextLine();
		ArrayList<Character> almacen = new ArrayList();
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			invertida = cadena.charAt(indice);
			almacen.add(invertida);
		}
		System.out.println(almacen);
	}

}
