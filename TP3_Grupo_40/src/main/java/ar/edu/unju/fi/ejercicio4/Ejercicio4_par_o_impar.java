package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Ejercicio4_par_o_impar {
     
	public static int num;
	static int n=8;
	
	
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner (System.in);
	
	
	int[] aux= new int[n];
	
	int cont=0;
	do {
		System.out.println("Ingrese numeros"); 
	num=sc.nextInt();
		
	cont++;
	if (num % 2==0){  
		System.out.println("Es par:"); 
		  }
	
	else{
	System.out.println("Es impar:");
	}

	
	}while(cont<n);	
	
	
}
}	
	


