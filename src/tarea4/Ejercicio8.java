package tarea4;

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
		int closer = 0;
		System.out.println("Introduzca 10 números enteros:");
		if (closer == 10) {
			s.close();
		}
		for (int i = 0; i <= 9; i++) {
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
			closer++;
		}
		System.out.println("el mayor es: " + maximo);
		System.out.println("el menor es: " + minimo);
	}
}
