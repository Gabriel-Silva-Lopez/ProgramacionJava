package tarea3;

import java.util.Scanner;

public class Ejercicio2 {
	
	/** Pre: 
	 *  Post: El programa cuenta la cantidad de numeros mayores 
	 *  a 0 y menores a 0, si se escribe 0 el programa termina.
	 */

	public static void main (String[] args){	
		
		System.out.println("escriba un numero positivo o negativo,"
				+ " si escribes 0 se cierra el programa");
		int mayor = 0;
		int menor = 0;
		Scanner s = new Scanner(System.in);
		while (true) {
			double a = s.nextDouble();
			if (a == 0) {
			System.out.println("fin del programa");
			s.close();
			break;
		} else if (a > 0) {
			mayor++;
			System.out.println("cantidad mayores a cero = " + mayor + 
					" y cantidad menores a cero = " + menor);
			} else {
				menor++;
				System.out.println("cantidad mayores a cero = " + mayor + 
						" y cantidad menores a cero = " + menor);
			}
		}
	}
}
