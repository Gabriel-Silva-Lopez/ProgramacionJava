package tarea1;

import java.util.Scanner;

public class Ejercicio6 {
	
	/** Pre:  Numeros enteros
	 *  Post: Calcula la tabla de multiplicar hasta el 10 de un numero que da el usuario mediante el terminal
	 */
	
	public static void main (String[] args) {
		int a, b, c, d, e, f, g, h, i, j, k, l= 0;
		System.out.println(" Introduce un numero: ");
		Scanner s = new Scanner(System.in );
		a = s.nextInt();
		b = a * 0;
		c = a * 1;
		d = a * 2;
		e = a * 3;
		f = a * 4;
		g = a * 5;
		h = a * 6;
		i = a * 7;
		j = a * 8;
		k = a * 9;
		l = a * 10;
		
		/** Otra forma seria
		 * system.out.println(a + " x 1 = " + (a * 1));
		 * system.out.println(a + " x 1 = " + (a * 2));
		 * system.out.println(a + " x 1 = " + (a * 3));
		 * system.out.println(a + " x 1 = " + (a * 4));
		 * system.out.println(a + " x 1 = " + (a * 5));
		 * system.out.println(a + " x 1 = " + (a * 6));
		 * system.out.println(a + " x 1 = " + (a * 7)); 
		 * .......
		 */
		
		System.out.println(a + " x 0 " + " = " + b);
		System.out.println(a + " x 1 " + " = " + c);
		System.out.println(a + " x 2 " + " = " + d);
		System.out.println(a + " x 3 " + " = " + e);
		System.out.println(a + " x 4 " + " = " + f);
		System.out.println(a + " x 5 " + " = " + g);
		System.out.println(a + " x 6 " + " = " + h);
		System.out.println(a + " x 7 " + " = " + i);
		System.out.println(a + " x 8 " + " = " + j);
		System.out.println(a + " x 9 " + " = " + k);
		System.out.println(a + " x 10 " + " = " + l);
		s.close();
	}
	
}
