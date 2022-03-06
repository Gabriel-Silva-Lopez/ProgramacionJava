
package tarea5;

import java.util.Scanner;

public class Ejercicio1 {
	
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzce 4 numeros enteros:\nsi introduce 4 veces el mismo numero"
				+ " el programa te lo dira");
		int num1 = s.nextInt();
		for (int i = 0;i < 3; i++) {
			int num2 = s.nextInt();
			if (i > 3) {
				s.close();
				if (num2 == num1) {
					System.out.println("Los numeros son iguales");
					break;
					} else {
						System.out.println("Los numeros no son iguales");
					 break;
					}
			}
		}
	}
}

