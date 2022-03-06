package tarea7;

public class Ejercicio4 {
	
	private static String[] indexContains (String[] tabla) {
		String escadena = "-1";
		String cadena = "hola";
		for(int i = 0; i < tabla.length; i++) {
			if(cadena == tabla[i]) {
				tabla[i] = cadena;
				System.out.println("la columna " + i + " es igual a: cadena");
			} else {
				tabla[i] = escadena;
				System.out.println("la columna " + i +" es igual a: " + escadena);
			}
		}
		return tabla;
	}
	
	public static void main(String[] args) {
		String[] t = new String[11];
		String cadena = "hola";
		for(int i = 0; i < t.length; i++) {
			if( i/5 != 0) {
				t[i] = cadena;
			} else {
				t[i] = cadena.substring( 0, cadena.length() -1);
			}
		}
		indexContains(t);
	}
}
