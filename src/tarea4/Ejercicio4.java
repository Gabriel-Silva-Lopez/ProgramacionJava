package tarea4;

import java.util.Scanner;

public class Ejercicio4 {

	
	/** Pre:
	 *  Post: programa Java que pregunta al usuario por 2 n�meros, y te muestre por pantalla 
	 *  todos los n�meros situados entre ambos
	 */
	public static void main (String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("inserta un numero entero menor y luego el mayor para ver los numeros entre ambos:");
		a = s.nextInt();
		// Incremento la variable a en la unidad para evitar que salga el primer numero
		a= a + 1;
		for (int b =s.nextInt();b > a; a++) {
			System.out.println(a);		
		}
		s.close();
	}
}
