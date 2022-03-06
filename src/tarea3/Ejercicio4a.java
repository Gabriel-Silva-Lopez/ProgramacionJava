package tarea3;

import java.util.Scanner;

public class Ejercicio4a {
	
	/** Pre: 
	 *  Post: El programa genera un numero aleatorio del 1 al 20 y el usuario
	 *  tiene que adivinar tal numero, en este ejercicio el usuario tiene
	 *  intentos infinitos
	 */
	
	public static void main (String[] args) {
		System.out.print("Tienes todos los intentos que quieras. Escribe un número entre 1 y 20: ");
		Scanner s = new Scanner(System.in);
		int a = (int) ((Math.random() * 20)+1); // Número aleatorio de 1 a 20
		while(a < Double.POSITIVE_INFINITY) {
			int b = s.nextInt();
			if (a == b) {  
				System.out.println("¡Correcto!, ¡Has ganado!");
				s.close();
				break;
			} 
			else if (b < a) {
				System.out.println("No es correcto, pero, te doy pista. Es mayor que " + b);	
			} else {
				System.out.println("No es correcto, pero, te doy pista. Es menor que " + b);
			}
		}
	}
}
