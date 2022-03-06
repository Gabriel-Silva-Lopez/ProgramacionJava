package tarea5;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.next();
		//pido texto
		String recorte = texto.substring( 1, texto.length() -1);
		//le quito el digito 0 y el ultimo digito
		char remplazo = texto.charAt(texto.length() -1);
		// aquí cogemos el caracter del final y lo ponemos al principio en el println
		System.out.println(remplazo + recorte + texto.substring(0,1));
		s.close();
	}	
}
