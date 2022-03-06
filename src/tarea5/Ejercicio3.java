package tarea5;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("mete una palabra o letra:\n");
		String texto = s.nextLine();
		String recorte = texto.substring( 0, texto.length() -1);
		System.out.println(recorte);
		s.close();
	}	
}
