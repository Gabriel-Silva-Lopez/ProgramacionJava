package repaso1examen;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta dos palabras para comprobar si una contiene a la otra:");
		String string1 = s.nextLine();
		String string2 = s.nextLine();
		System.out.println(string1 + " " + string2);
		s.close();
	}
}
