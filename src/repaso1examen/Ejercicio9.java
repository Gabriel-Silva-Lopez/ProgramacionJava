package repaso1examen;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Dame dos numeros para compararlos: ");
		int a = s.nextInt();
		int b = s.nextInt();
		if(a!=b) {
			System.out.println("Son diferentes; y\n");
			if(a>b) {
				System.out.print(a + " > " + b);
			} 
			else if(b>a) {
				System.out.print(b + " > " + a);
			}
		} else {
			System.out.print("Son iguales");
		}
		s.close();
	}
}
