package repaso1examen;

import java.util.Scanner;

public class Ejercicio14 {

	public static String[]comparar (String[] tabla1){
		String almacen="";
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1.length; j++) {
				if (tabla1[i].equals(tabla1[j]) && i != j && !almacen.contains(tabla1[i])) {
					almacen = almacen + " " + tabla1[j];
					System.out.println("\nla cadena " + tabla1[i] + " Esta duplicada" );
				}
			}
		}
		System.out.println("\ncadenas repetidas:" + almacen);
		return tabla1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Dime la cantidad de datos que vas a almacenar:");
		int longitud =s.nextInt();
		String[] t1 =  new String [longitud];
		for(int i = 0; i < t1.length; i++) {
			System.out.println("\nIntroduzca el texto de la casilla " + (i+1) + 
					" de tabla 1 ");
			String valorxdetabla1 = s.next();
			t1[i]= valorxdetabla1;
		}
		comparar(t1);
		s.close();
	}
}
