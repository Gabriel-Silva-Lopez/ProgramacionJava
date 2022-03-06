package tarea5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		System.out.println("esta son la cantidad de caracteres de tu texto: " + texto.length());
		s.close();
	}
}
