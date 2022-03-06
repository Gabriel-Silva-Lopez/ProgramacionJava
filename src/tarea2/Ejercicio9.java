package tarea2;

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
		int i = 0;
		if (i == 10) {
			s.close();
		}
		while (i < 10) {
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
		i++;
		System.out.println("numeros introducidos: " + i);
		}
		System.out.println("total de ceros: " + totaldeceros);
		System.out.println("total de menores a cero: " + menoresacero);
		System.out.println("total de mayores a cero: " + mayoresacero);
	}
}
