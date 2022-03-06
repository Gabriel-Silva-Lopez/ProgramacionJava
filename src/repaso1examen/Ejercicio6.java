package repaso1examen;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta 2 strings para comparar si uno es el invertido de otro");
		String entrada = s.nextLine();
		String entrada2 = s.nextLine();
		String invertida = "";
		for(int i = entrada.length() -1; i >= 0; i--) {
			invertida += entrada.charAt(i);
		}
		if(entrada2.contains(invertida)) {
			System.out.print("¡¡SON ROTACION!!");
		} else {
			System.out.print("No son rotacion");
		}
		s.close();
	}
}