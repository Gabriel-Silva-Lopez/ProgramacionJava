package tarea8;

public class Ejercicio4 {
	public static String[] estadisticastabla (String[] tabla){
		System.out.print("\nOrden inverso: ");
		for (int j = tabla.length-1; j >= 0; j--) {
			System.out.print(tabla[j] + " ");
		}
	return tabla;
}

	public static void main(String[] args) {
		String[] t = {"A", "B", "C", "D", "E"};
		System.out.print("Orden normal: ");
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
		estadisticastabla(t);
	}
}
