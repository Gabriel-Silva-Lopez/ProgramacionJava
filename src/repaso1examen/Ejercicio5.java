package repaso1examen;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Dame un texto para ver los caracteres que contiene: ");
		String cadena = s.nextLine(); // pido texto
		String almacen=""; // almacena los caracteres que ya se
		for(int i = 0; i < cadena.length(); i++) { // recorro el texto del usuario por caracteres.
			int constante = 0; // creo una constante para contar cuantas veces se repite ese caracter.
			if(!almacen.contains(String.valueOf(cadena.charAt(i)))) { // si almacen no contiene ese caracter entro al siguiente bucle.
				for(int j = 0; j < cadena.length(); j++) { // bucle para comparar las veces que se repite ese caracter.
					if(cadena.charAt(j)==cadena.charAt(i)) { // si el caracter i del primer texto es igual al caracter j del segundo texto entro.
						constante++; //incremento valor de constante.
						almacen = cadena.charAt(j) + almacen; // almaceno el caracter j para que no me repita el system.out.Println de las veces que aparece.
					}
				}
				System.out.println(cadena.charAt(i) + " aparece " + constante + " veces."); //imprimo las veces que se repite
			}
			constante = 0; //me muevo al siguiente caracter y restablezco la constante a 0
		}
		s.close();
		}
	}
