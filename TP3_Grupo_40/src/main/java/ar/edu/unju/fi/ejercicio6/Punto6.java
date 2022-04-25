package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

public class Punto6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length;i++ ) {
			System.out.println("ingrese un numero: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Los numeros inversos son: ");
		int j=9;
		while(j>=0) {
			System.out.print("|"+arr[j]+"|");
			j--;
		}
		
		
	}

}

