package tarea8;

import java.util.Scanner;

public class Ejercicio2 {

	public static int[] incrementarValores (int[] tabla, int numero){
			for (int i = 0; i < tabla.length-1; i++) {
				tabla[i]= i*numero;
				if(tabla[i]==tabla[0]) {
					tabla[i]=tabla[i+1];
				} else {
					System.out.println(tabla[i]);
				}
			}
		return tabla;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Ingrese la longitud de la tabla");
		int longitud = s.nextInt();
		int[] t =  new int [longitud];
		System.out.println("Ingresa un numero para multiplicar los datos de la tabla");
		int multiplicador = s.nextInt();
		incrementarValores(t, multiplicador);
			s.close();
	}
}
