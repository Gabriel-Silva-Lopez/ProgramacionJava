package tarea2;

import java.util.Scanner;

/** Pre:
 *  Post: programa Java que escribe la tabla de multiplicar de un numero que el usuario da
 */

public class Ejercicio7 {
	public static void main (String[] args) {
		int a, b;
		System.out.println(" Introduce un numero para mostrar la tabla de multiplicar: ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = 0;
		while(b <= 10) {
			System.out.println(a + "x" + b + "=" + (a*b));
			b++;
		}
		s.close();
	}
}
