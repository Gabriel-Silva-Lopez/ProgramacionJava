package tarea1;

import java.util.Scanner;

public class Ejercicio5 {
	
	/** Pre:  Numeros enteros
	 *  Post: Calcula las operaciones de dos numeros que da el usuario mediante el terminal
	 */
	
	public static void main (String[] args) {
		int a, b, c, d, e, f, g = 0;
		System.out.println(" Introduce dos numeros: ");
		Scanner s = new Scanner(System.in );
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		System.out.println("la suma de " + a + " y " + b + " es: " + c);
		System.out.println("la resta de " + a +" y " + b + " es: " + d);
		System.out.println("la multiplicacion de " + a + " y " + b + " es: " + e);
		System.out.println("la division de" + a + " y " + b + " es: " + f);
		System.out.println("el resto de " + a + " y " + b + " es: " + g);
		s.close();
	}

}
