package tarea5;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String entrada = s.nextLine();
		String invertida = "";
		for(int i = entrada.length() -1; i >= 0; i--) {
			invertida += entrada.charAt(i);
		}
		System.out.println("Cadena invertida: " + invertida);
		s.close();
	}
}
