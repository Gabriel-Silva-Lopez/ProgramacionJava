package tarea4;

public class Ejercicio5 {

	/** Pre:
	 *  Post: programa Java que escribe los numeros pares entre 0 y 100
	 */
	
	public static void main(String[] argumentos) {
		for (int valor = 0;valor <= 100; valor++) {
			if (valor % 2 == 0) {
				System.out.println(valor);
			}
		}
	}
	
}
