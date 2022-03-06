package repaso1examen;

import java.util.Scanner;

public class Ejercicio2 {
	
	//String cadena = "Hola";
	//String sub = "la";
	//cadena.cotains(sub);

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta dos palabras para comparar si una contiene a la otra:");
		String string1 = s.nextLine();
		String string2 = s.nextLine();
		if(string1.contains(string2) || string2.contains(string1)) {
			System.out.println("Si lo contiene");
		}else{
			System.out.println("No lo contiene");
		}
		s.close();
	}
}

