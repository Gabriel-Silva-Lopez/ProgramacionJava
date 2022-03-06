package tarea4;

public class Ejercicio3 {
	
	/** Pre: ----
	 *  Post: muestra la suma de los numeros entre 50 y 100"
	 */
	
	public static void main(String[] argumentos) {
		int suma = 0;
		for (int i = 50; i <= 100; i++) {
			suma = suma + i;
		} 
		System.out.println("Suma=" + suma);
	}
}
