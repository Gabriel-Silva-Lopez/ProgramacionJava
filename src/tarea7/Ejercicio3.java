package tarea7;

public class Ejercicio3 {

	private static String[] indexContains (String[] tabla) {
		boolean escadena = true;
		String cadena = "hola";
		for(int i = 0; i < tabla.length; i++) {
			if(cadena == tabla[i]) {
				escadena = true;
			} else {
				escadena = false;
			}
			System.out.println("los valores son igual a cadena: " + escadena);
		}
		return tabla;
	}
	
	public static void main(String[] args) {
		String[] t = new String[9];
		String cadena = "hola";
		for(int i = 0; i < t.length; i++) {
			if(i/3 != 1) {
				t[i] = cadena;
			} else {
				t[i] = cadena.substring( 0, cadena.length() -1);
			}
		}
		indexContains(t);
	}
}