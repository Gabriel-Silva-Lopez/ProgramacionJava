package repaso1examen;

import java.util.Scanner;

public class Ejercicio15 {


	public static int[]comparar (int[] tabla1){
		String almacenrepetidos="";
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1.length; j++) {
				if (tabla1[i]==tabla1[j] && i != j){
					int almacentemporal = 0;
					almacentemporal = tabla1[i];
					tabla1[i] = tabla1[j];
					tabla1[j] = almacentemporal;
					if(!almacenrepetidos.contains(Integer.toString(tabla1[i]))) {
						almacenrepetidos= almacenrepetidos + " " + Integer.toString(tabla1[i]);
						System.out.println("\nla cadena " + tabla1[i] + " Esta duplicada ");	
					}
				}
			}
		}
		System.out.println("\nnumeros repetidos:" + almacenrepetidos);
		return tabla1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Dime la cantidad de datos que vas a almacenar:");
		int longitud =s.nextInt();
		int[] t1 =  new int [longitud];
		for(int i = 0; i < t1.length; i++) {
			System.out.println("\nIntroduzca el entero para la casilla " + (i+1));
			int valorxdetabla1 = s.nextInt();
			t1[i]= valorxdetabla1;
		}
		comparar(t1);
		s.close();
	}
}
