package Exercicio01;

//Fa?a um programa que entre com tr?s n?meros e coloque em ordem crescente.

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);

		int[] listaDeNumeros = new int[4];
		           
		           
		for (int i = 1; i < listaDeNumeros.length; i++) {
			      System.out.print("Digite "+ i + "? numeros: "); 
			      listaDeNumeros[i] = (numeros.nextInt());
			       }
		           
		 Arrays.sort(listaDeNumeros);
		           
		           
		  System.out.print("Ordem crescente: "); 
		    for (int j = 1; j < listaDeNumeros.length; j++) {
		       		System.out.print(listaDeNumeros[j]+ "  ");       		
				  }
		       	  
	    numeros.close();   	           
		        	 
	}

}


