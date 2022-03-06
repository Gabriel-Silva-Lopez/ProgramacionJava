package tarea4;

import java.util.Scanner;

public class Ejercicio10 {
	
	/**
	 * Pre: ---
	 * Post: muestra al usuario la cantidad de numeros
	 * de la secuencia de Fibonacci que el usuario le pida.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la cantidad de numeros que quieres "
				+ "ver de la seciencia de Fibonacci: ");
		int fibo1 = 0;
		int fibo2 = 1;
		int a = sc.nextInt();
		if(a == 0) {
			System.out.println();	
		} else if(a == fibo2) {
			System.out.println(fibo1);
		} else if(a == 2) {
			System.out.println(fibo1 + ", " + fibo2);
		} else {

			System.out.print("0, 1");
			for (int i = 2; i < a + 2; i++) {
				int fibo3 = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibo3;
				System.out.print(", " + fibo3);
				sc.close();
			}
		}
	}

}
