package tarea8;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static int[] calcularmoda (int[] tabla){
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("numero " + i + ":" + " se repite veces " + tabla[i]);
		}
		return tabla;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int[] t =  {1, 1, 2, 3, 4, 5, 2, 3, 5, 4, 2};
		int[] contador = new int [11];
			for(int i = 0; i < t.length; i++) {
				contador[t[i]]+=1;
			}
			calcularmoda(contador);
			s.close();
	}
}
