package tarea5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingresa el primer numero: ");
		int num1 = s.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		int num2 = s.nextInt();
		while(num1 < num2) {
			int a = (int) (Math.random()*(num2-num1+1)+num1);
			System.out.print("el numero aleatorio es: " + a);
			break;
		}
		while(num1 > num2) {
			int b = (int) (Math.random()*(num1-num2+1)+num2);
			System.out.print("el numero aleatorio es: " + b);
			break;
		}
		s.close();
	}
}
