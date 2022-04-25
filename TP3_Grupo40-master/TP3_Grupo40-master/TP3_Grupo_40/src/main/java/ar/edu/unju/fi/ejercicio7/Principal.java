package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		ArrayList<String> almacen = new ArrayList();
		String x;
		int y;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese nombres de frutas");
			String nombreFruta = sc.nextLine();
			almacen.add(nombreFruta);
			System.out.println("Desea ingresar mas datos? (S/N)");
			x = sc.nextLine();
		}while(!(x.equals("N")));
			System.out.println("Lista de fruta que contiene el numero par");
		  for (int i = 0; i <= almacen.size(); i = i + 1) { 
			  y = almacen.size() - i; 
			  if (y % 2 == 0) {
				  System.out.println(almacen.get(y));
				  } 
			  
		  }
		  System.out.println("Ingrese un numero entero positivo");
			Scanner sc1 = new Scanner(System.in);
		    int num = sc1.nextInt();
			if (num == 0 || num <= almacen.size()) {
				almacen.remove(num);
				System.out.println("Contenido del ArrayList: " + almacen);
				System.out.println("Cantidad de elementos que contiene: " + almacen.size());  
			}
			else {
				System.out.println("Ingrese un numero que este dentro del rango: " + almacen.size());
			}
	}
}
