package examenProgramacion;

import java.util.Scanner;

public class Ejercicio1 {
	
	/**
	 * Pre:---------
	 * Post:metodo en el que ordeno el array o tabla de menor a mayor
	 * para poder presentarsela al usuario
	 */
	
	public static int[]mejores (int[] tabla, int m){
		//ordeno de mayor a menor
		for (int i = 0; i < tabla.length; i++) {
			for (int j = i+1; j < tabla.length; j++) {
					if (tabla[i] > tabla[j]) {
						int almacentemporal = 0;
						almacentemporal = tabla[i];
						tabla[i] = tabla[j];
						tabla[j] = almacentemporal;
					}
				}
			}
		System.out.println("\n\n---------- MEJORES M = " + m + " ----------");
		//imprimo por pantalla la cantidad de mejores o M que el usuario quiere
		for(int k = 0; k < tabla.length; k++) {
			if(k>=tabla.length-m)
			System.out.print(" " + tabla[k]);
		}
		return tabla;
	}
	
	/**
	 * Pre:---------
	 * Post:programa que muestra la cantidad de los nuemeros mayores que el usuario
	 * le pida. En el metodo main, envio a arreglar la tabla de menores a mayores al
	 * metodo mejores y le pido al usuario la cantidad de numeros que quieres
	 * que le enseñe que sean los mejores
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int[] t =   {10, 40, 100, 1, -3, 20, 50};
		System.out.println("---------- LISTA ----------");
		for(int i = 0; i < t.length; i++) {
			System.out.print(" " + t[i]);
		}
		/**le imprimo por pantalla la lista de los numeros al usuario y
		 * le pido la cantidad de mejore que quiere que le muestre
		 * y envio la tabla al metodo mejores para ordenar
		 */
		System.out.println("\n\nDame la cantidad de los mejores numeros que quieres que te muestre:");
		int mejor=s.nextInt();//pido al usuario los numeros mejores que quiere ver
		t=mejores(t, mejor);//envio al metodo mejores
		s.close();
	}
}
