package tarea3;

import java.util.Scanner;

public class Ejercicio4b {
	
	/** Pre: 
	 *  Post: El programa genera un numero aleatorio del 1 al 20 y el usuario
	 *  tiene que adivinar tal numero, en este ejercicio el usuario tiene un
	 *  maximo de 5 intentos
	 */
	
	public static void main (String[] args) {
		System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 20: ");
		Scanner s = new Scanner(System.in);
		int a = (int) ((Math.random() * 20)+1); // Número aleatorio de 1 a 20
		int i = 5;
		while(i >= 0) {
			int b = s.nextInt();
			if (i == 0) {
				System.out.println("No has conseguido adivinar el numero, Has perdido");
				System.out.println("El numero era: " + a);
				s.close();
				break;
			}
			if (a == b) {  
				System.out.println("¡Correcto!, ¡Has ganado!");
				break;
			} 
			else if (b < a) {
				i--;
				System.out.println("No es correcto, pero, te doy pista. Es mayor que " + b);
				System.out.println("te quedan " + i + " intentos"); 	
			} else {
				i--;
				System.out.println("No es correcto, pero, te doy pista. Es menor que " + b);
				System.out.println("te quedan " + i + " intentos"); 
			}
		}
	}
}
