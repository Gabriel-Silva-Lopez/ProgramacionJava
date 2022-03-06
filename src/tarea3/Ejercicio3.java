package tarea3;

import java.util.Scanner;

public class Ejercicio3 {
	/** Pre: 
	 *  Post: El usuario puede ingresar todos los numeros que quiera al
	 *  añadir un numero negativo el programa deja de contar numeros los
	 *  numeros y muestra la cantidad de numeros introducidos por pantalla.
	 */
	
	public static void main (String[] args){	
		System.out.println("escriba numeros, si escribes un negativo se cierra el programa");
		int i = 0;
		int x = 1;
		Scanner s = new Scanner(System.in);
		while (i > Double.POSITIVE_INFINITY) {
			s.close();
		}
		while (x > 0) {
			double a = s.nextDouble();
			i++;
			if (a < 0) {
				System.out.println("has ingresado: " + (i-1) + " numeros positivos");
				System.out.println("fin del programa");
				break;
			}
		}
	}
}
