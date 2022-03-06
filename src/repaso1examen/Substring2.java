package repaso1examen;

import java.util.Scanner;

public class Substring2 {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		String letras = "abc";
		int nveces = 0;
		//texto.length() -2 porque al coger los caracteres de 3 en tres, al coger 
		//los tres ultimos dejamos de coger
		for(int i = 0; i < texto.length() -2; i++) {
			//String bloques = texto desde el caracter i hasta el caracter i+3
			String bloque = texto.substring(i, i + 3);
			//System.out.println(bloque); para comprobar que coge los bloques en 3
			if(bloque.equals(letras)) {
				nveces++;	
			}
		}
		System.out.println(letras + " se repite en el texto = " + nveces);
		s.close();
	}	
}

