package tarea6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero para que el programa escriba su nombre en español");
		int entrada = s.nextInt();
		while(entrada <= 9 && entrada > 0) {
			if (entrada == 1) {
				System.out.println(entrada + " se escribe = " + "Uno");
				break;
			} 
			else if (entrada == 2) {
				System.out.println(entrada + " se escribe = " + "Dos");
				break;
			}
			else if (entrada == 3) {
				System.out.println(entrada + " se escribe = " + "Tres");
				break;
			}
			else if (entrada == 4) {
				System.out.println(entrada + " se escribe = " + "Cuatro");
				break;
			}
			else if (entrada == 5) {
				System.out.println(entrada + " se escribe = " + "Cinco");
				break;
			}
			else if (entrada == 6) {
				System.out.println(entrada + " se escribe = " + "Seis");
				break;
			}
			else if (entrada == 7) {
				System.out.println(entrada + " se escribe = " + "Siete");
				break;
			}
			else if (entrada == 8) {
				System.out.println(entrada + " se escribe = " + "Ocho");
				break;
			}
			else if (entrada == 9) {
				System.out.println(entrada + " se escribe = " + "Nueve");
				break;
			}
			s.close();
		}
	}
}