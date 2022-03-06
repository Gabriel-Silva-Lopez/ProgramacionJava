package tarea7;

public class Ejercicio2 {
	
	public static double[] avarange (double[] tabla) {
		double media= 0;
		for(int i = 0; i < tabla.length; i++) {
			media = media + tabla[i];
		}
		media = media / tabla.length;
		System.out.println("La media es: " + media);
		return tabla;
	}
	
	public static void main(String[] args) {
		double[] t = new double[10];
		for(int i = 0; i < t.length; i++) {
			t[i] = i;
			System.out.println(t[i]);
		}
		avarange(t);
	}
}
