package tarea10;

public class Ejercicio4 {
	public static int[][] recorrido (int[][] kil, String[] f, int[] p){
		for (int i = 0; i < kil.length; i++) {
			int suma = 0;
			System.out.print(f[i] + " -> ");
			for (int j = 0; j < kil[i].length; j++) {
				suma += kil[i][j];
			}
			System.out.print(suma + " kg x " + p[i] + " = " + (suma*p[i]) + "€\n");
		}
		return kil;
	}

	public static void main(String[] args) {
		int[][] kilos = { {5, 6, 9, 23, 7, 14, 0} , {16, 8, 4, 33, 15, 21, 2} };
		String[] frutas = {"Manzanas","Peras"};
		int[] precio = { 6 , 7 };
		recorrido(kilos, frutas, precio);
	}
}