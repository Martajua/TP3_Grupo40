package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Alumno {

	public static String nombre;
	public static String apellido;
	public static String Libreta_Universitaria;
	public static double[] notas;
	public static double promedio;
	public double nota_max;
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);	
	System.out.println("ingrese nombre:");
	nombre= sc.next();
	
	System.out.println("ingrese apellido:");
	apellido= sc.next();
	
	System.out.println("ingrese LU:");
	Libreta_Universitaria= sc.next();
	double [] notas= new double[5];
	Alumno.calcularPromedio(notas);
	Alumno.NotaMaxima(notas);
	
	}//LLAVE DEL MAIN
	
	
	//Metodo del Promedio.
	@SuppressWarnings({ "resource" })
    public static void calcularPromedio(double notas[]){
	double suma=0;
	
    Scanner sc = new Scanner (System.in);
	System.out.println("ingrese las notas:");
    for (int i=0; i<notas.length; i++){
    	
    	System.out.println("nota"+(i+1)+":");
    	
    	notas[i]=sc.nextDouble();	
    }
    for (int i=0;i<notas.length;i++) {
    	
    	suma=suma+notas[i];
    	
    }
    System.out.println("El promedio es: " + (suma/notas.length));
	}
	
	public static void NotaMaxima(double notas[]){
		
		double max=notas[0];
		
		for (int i=0;i<notas.length;i++) {
	    	
	    if (notas[i]>max){
	    	
	    	max=notas[i];
	    	
	    	
	    	
	    }	
	    
	    }
		System.out.println("La nota maxima es: " + max);
		return;	
	}

}	


