package tarea7;

public class Ejercicio5 {

	public static int[] copyArray (int[] tabla, int[] nuevatabla) {
		for(int i = 0; i < tabla.length; i++) {
			 nuevatabla = (int[])tabla.clone();
			System.out.println("columna " + i + " de nueva tabla " + "es igual a = " + nuevatabla[i]);
		}
		return nuevatabla;
	}
	
	public static void main(String[] args) {
		int[] t1 = new int[11];
		int[] t2 = new int[11];
		for(int i = 0; i < t1.length; i++) {
				t1[i] = i;
		}
		copyArray(t1, t2);
	}
}
