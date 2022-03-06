package tarea1;

import java.util.Scanner;

public class Ejercicio4 {

	/** Pre:  Numeros enteros
	 *  Post: Calcula la suma de dos numeros que da el usuario mediante el terminal
	 */
	
	public static void main (String[] args) {
		int a, b, c = 0;
		System.out.println(" Introduce dos numeros: ");
		Scanner s = new Scanner(System.in );
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println("la suma de 2" + a +" y " + b + " es: " + c);
		s.close();
	}
}
