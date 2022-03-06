package tarea10;

public class Ejercicio5 {

	//Forma mas sencilla
/*
	 * 	public static String[] ordenar(String[] t) {
		 Arrays.sort(t);
		 for(int i = 0; i < t.length; i++) {
			 System.out.print(" " + t[i] + " ");
		 }
		return t;
	}
	
	public static void main(String[] args) {
		String[] nombres = {"Pepe","Juan","María","Antonio","Luisa"};
		ordenar(nombres);
	}
}
*/
	public static String[] ordenar(String[] t) {
		String almacen;
		for(int i = 0; i < t.length; i++) { 
			for (int j=i+1; j < t.length; j++) {
				int comparar = t[i].compareTo(t[j]);
				if(comparar>0){
					almacen = t[i];
					t[i] = t[j];
					t[j] = almacen; 
				}
			}
		}
		return t;
	}
	
	public static void main(String[] args) {
		String[] nombres = {"Pepe","Juan","María","Antonio","Luisa"};
		nombres = ordenar(nombres);
		for(int i = 0; i < nombres.length; i++) { 
			System.out.print(" " + nombres[i] + " ");
		}
	}
}
