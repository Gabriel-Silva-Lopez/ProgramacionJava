package tarea5;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String [] args) {
		Scanner s = new Scanner (System.in);
		boolean condicion = false;
		System.out.println("dame dos numeros \nSi los numeros no estan entre 0 y 1"
				+ " no se cumplira la funcion");
		for(int i = 0; i < 2; i++) {
			double num = s.nextDouble();
			//para escribir or en java || y and &&
			if (i >= 1 && num > 0 && num < 1) {
				condicion = true;
				s.close();
				if (condicion == true) {
					System.out.println("Se cumple la funcion");
				}
			}
		}
	}
}
