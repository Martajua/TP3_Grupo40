package ar.edu.unju.fi.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	//@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> Lista1 = new ArrayList<Integer>(5);
		List<Integer> Lista2 = new ArrayList<Integer>(5);
		List<Double> Div = new ArrayList<Double>(5);
		
		int num=5;
		System.out.println("Ingrese 1er conjunto de números:");
			for(int i=0; i<num; i++) {
				int conj1= sc.nextInt();
				Lista1.add(conj1 );
			}
		System.out.println("Ingrese 2er conjunto de números:");
			for(int i=0; i<num; i++) {
				int conj2= sc.nextInt();
				Lista2.add(conj2 );
			}
			
			// try { 	
		            for (int i = 0; i < num; i++) {
		            	double Div[i]=Lista1[i]/Lista2[i];
		            }
		            
		               try { //try anidado
		                } catch (ArithmeticException exc) {
		                    //Capturando la excepción
		                    System.out.println("No se puede dividir por cero!");
		                }
		            }
		        }
		        catch (ArrayIndexOutOfBoundsException exc) {
		                    //Capturando la excepción
		                    System.out.println("Alguna excepción ocurrió.");
		                    System.out.println("ERROR: Programa terminado.");
		                }
		            }	
	
	}
}