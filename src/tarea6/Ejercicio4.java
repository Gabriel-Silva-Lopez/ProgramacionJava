package tarea6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		String estrella = "*";
		int num = s.nextInt();
		String largo = estrella.repeat(num);
		for (int i = 0; i <= num; i++) {
			String ekis = i + "";
			String corte = largo.substring( 0, largo.length() -i);
			String cadena = ekis.repeat(num);
			String corte2 = cadena.substring(num-i);
			System.out.print(corte2 + corte + "\n");
		}
		s.close();
	}
}
