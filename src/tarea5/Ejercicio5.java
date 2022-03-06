package tarea5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		String letras = "aaa";
		int i = 0;
		int nveces = 0;
		while(i < texto.length() -2) {
			//String bloques = texto desde el caracter i hasta el caracter i+3
			String bloque = texto.substring(i, i + 3);
			//System.out.println(bloque); para comprobar que coge los bloques en 3
			if(bloque.equals(letras)) {
				nveces++;	
			}
			i++;
		}
		System.out.println("aaa se repite en el texto = " + nveces);
		s.close();
	}	
}

