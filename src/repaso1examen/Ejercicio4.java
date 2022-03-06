package repaso1examen;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta dos palabras para comprobar si el primero finaliza con el valor del segundo");
		String string1 = s.nextLine();
		String string2 = s.nextLine();
		if(string1.endsWith(string2)){
			System.out.println("La primera contiene al final el segundo string");
		} else {
			System.out.println("No contiene al final el segundo string");
		}
		s.close();
	}
}
