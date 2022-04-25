package ar.edu.unju.ejercicio2;

import java.util.Scanner;

public class Punto2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] numeros = new int[10];
		int aux = 0, vinicial, vfinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numeros enteros: ");
		vinicial = sc.nextInt();
		System.out.println("Ingrese numeros enteros: ");
		vfinal = sc.nextInt();
		
		do {
			for(int i = 0; i< numeros.length; i++) {
				numeros[i] = vinicial * aux++;
			}
			for(int i = 0; i< numeros.length; i++) {
				System.out.print("|"+numeros.length[i]+"|");
			}
			vinicial++;
			
		}while(vinicial<=vfinal);
		

	}

}
