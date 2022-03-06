package repaso1examen;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta 2 numeros para multiplicarlos");
		int entrada = s.nextInt();
		int entrada2 = s.nextInt();
		System.out.println((entrada*entrada2));
		s.close();
	}
}
