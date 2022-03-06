package tarea10;

import java.util.Scanner;

public class Ejercicio3 {

	public static int[][]modificar (int[][] numeros, int e){
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" fila " + i + " -> ");
			for (int j = 0; j < numeros[i].length; j++) {
				if (j == 3) {
					System.out.print("columna " + j + " = " + (numeros[i][j]*e) + "\n");
					} else {
						System.out.print("columna " + j + " = " + (numeros[i][j]*e) + " ");
					}
			}
		}
		return numeros;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserta un numero para multiplicar cada numero de la tabla por ese valor:\n");
		int entero=s.nextInt();
		int [][] t = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		t = modificar(t,entero);
		s.close();
	}
}