package tarea3;

import java.util.Scanner;

public class Ejercicio1 {
	
	/** Pre: 
	 *  Post: El programa calcula todos los cuadrados de todos los
	 *  mayores a 0, si se escribe 0 el programa termina.
	 */
	
	public static void main (String[] args){	
		
		System.out.println("escriba un numero positivo para coger el cuadrado, "
				+ "si escribe un negativo se acaba el programa");
		int x = 1;
		Scanner s = new Scanner(System.in);
		while (x >= 0) {
			double a = s.nextDouble();
			if (a < 0) {
				System.out.println("fin del programa");
				s.close();
				break;
		}
			System.out.println("el cuadrado de a es:" + (a*a));
			System.out.println("introduzca otro numero para hallar el cuadrado:");
		}
	}
}
