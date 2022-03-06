package tarea7;

public class Ejercicio1 {

	public static int[] sum (int[] tabla) {
		int suma = 0;
		for(int i = 0; i < tabla.length; i++) {
			suma+=tabla.length;
		}
		System.out.println("Suma de valores: " + suma);
		return tabla;
	}
	
	public static void main(String[] args) {
		int[] t = new int[10];
		for(int i = 0; i < t.length; i++) {
			t[i] = i;
		}
		sum(t);
	}
}