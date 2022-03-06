package repaso1examen;

import java.util.Scanner;

public class Ejercicio4b {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta un string para eleminar 'ac' y 'b'");
		String string1 = s.nextLine();
		String string2 = string1.replace("ac","");
		String string3 = string2.replace("b","");
		System.out.println(string3);
		s.close();
	}
}