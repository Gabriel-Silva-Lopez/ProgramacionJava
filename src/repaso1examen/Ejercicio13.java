package repaso1examen;

import java.util.Scanner;

public class Ejercicio13 {

	public static String[]comparar (String[] tabla1, String[] tabla2){
		for(int i = 0; i < tabla1.length; i++) {
			for(int j = 0; j < tabla2.length; j++) {
				if(tabla1[i].equals(tabla2[j])) {
					System.out.println("\n la cadena " + tabla1[i] + " es comun en la celda " + (i+1)
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
		String[] t1 =  new String [longitud];
		String[] t2 =  new String [longitud];
		for(int i = 0; i < t1.length; i++) {
			System.out.println("\nIntroduzca el texto de la casilla " + (i+1) + 
					" de tabla 1 ");
			String valorxdetabla1 = s.next();
			t1[i]= valorxdetabla1;
		}
		for(int i = 0; i < t2.length; i++) {
			System.out.println("\nIntroduzca el texto de la casilla " + (i+1) + 
					" de tabla 2 ");
			String valorxdetabla2 = s.next();
			t2[i]= valorxdetabla2;
		}
		comparar(t1,t2);
		s.close();
	
	}
}
