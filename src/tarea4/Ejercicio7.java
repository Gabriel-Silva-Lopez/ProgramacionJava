package tarea4;

import java.util.Scanner;

public class Ejercicio7 {
	
	/** Pre:
	 *  Post: programa Java que escribe la tabla de multiplicar de un numero que el usuario da
	 */
	
	public static void main (String[] args) {
		int a;
		System.out.println(" Introduce un numero para mostrar la tabla de multiplicar: ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		for (int b = 0; b <= 10; b++) {
			System.out.println(a + "x" + b + "=" + (a*b));
		}
		s.close();
	}

}
