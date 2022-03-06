package repaso1examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta dos palabras para compararalas lexicograficamente:");
		String string1 = s.nextLine();
		String string2 = s.nextLine();
		if(string1.equals(string2)) {
			System.out.println("Son iguales lexicograficamente");
		} else {
			System.out.println("No son iguales lexicograficamente");
		}
		s.close();
	}
}
