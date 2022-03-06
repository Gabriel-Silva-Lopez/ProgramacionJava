package repaso1examen;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static int[]comparar (int[] tabla1, int[] tabla2){
		for(int i = 0; i < tabla1.length; i++) {
			for(int j = 0; j < tabla2.length; j++) {
				if(tabla1[i]==tabla2[j]) {
					System.out.println("\nel numero " + tabla1[i] + " es comun en la celda " + (i+1)
							+ " de tabla 1 y la celda " + (j+1) + " de tabla 2" );
				}
			}
		}
		return tabla1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Dime la cantidad de datos que vas a almacenar:");
		int longitud =s.nextInt();
		int[] t1 =  new int [longitud];
		int[] t2 =  new int [longitud];
		for(int i = 0; i < t1.length; i++) {
			System.out.println("\nIntroduzca el valor de la casilla " + (i+1) + 
					" de tabla 1 ");
			int valorxdetabla1 = s.nextInt();
			t1[i]= valorxdetabla1;
		}
		for(int i = 0; i < t2.length; i++) {
			System.out.println("\nIntroduzca el valor de la casilla " + (i+1) + 
					" de tabla 2 ");
			int valorxdetabla2 = s.nextInt();
			t2[i]= valorxdetabla2;
		}
		comparar(t1,t2);
		s.close();
	
	}
}
