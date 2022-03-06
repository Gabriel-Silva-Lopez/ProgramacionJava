package tarea2;

import java.util.Scanner;

public class Ejercicio8 {

	/** Pre:
	 *  Post: programa que coge el numero mayor y el menor de un grupo de 
	 *  10 numeros introducidos por el usuario
	 */
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int maximo = 0;
		int minimo = 0;
		int i = 0;
		System.out.println("Introduzca 10 números enteros:");
		if (i == 10) {
			s.close();
		}
		while (i <= 9) {
			int valor = s.nextInt();
			if ( i == 0) {
				maximo = valor;
				minimo = valor;
			}
			if (valor > maximo) {
				maximo = valor;
			} else if (valor < minimo) {
				minimo = valor;
			}
			i++;
			
		}
		System.out.println("el mayor es: " + maximo);
		System.out.println("el menor es: " + minimo);
	}
}
