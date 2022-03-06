package tarea4;

import java.util.Scanner;

public class Ejercicio9 {
	
	/** Pre:
	 *  Post: programa Java que escribe la cantidad de numeros menores a 10
	 *  mayores a 10 y iguales a 0
	 */
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca 10 números enteros:");
		int totaldeceros = 0;
		int mayoresacero = 0;
		int menoresacero = 0;
		int closer = 0;
		if (closer == 10) {
			s.close();
		}
		for (int i = 1; i < 11; i++) {
			int a = s.nextInt();
			if (a != 0) {
				if (a < 0) {
					menoresacero++;	
				} else {
					mayoresacero++;
				}
			} else {
				totaldeceros++;
			}
		closer++;
		System.out.println("numeros introducidos: " + i);
		}
		System.out.println("total de ceros: " + totaldeceros);
		System.out.println("total de menores a cero: " + menoresacero);
		System.out.println("total de mayores a cero: " + mayoresacero);
	}
}
