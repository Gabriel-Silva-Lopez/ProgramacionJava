package tarea6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		String estrella = "*";
		int num = s.nextInt();
		String largo = estrella.repeat(num);
		for (int i = 0; i < num; i++) {
			String corte = largo.substring( 0, largo.length() -i);
			System.out.print(corte + "\n");
		}
		s.close();
	}
}
