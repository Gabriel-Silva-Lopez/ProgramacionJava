package tarea2;

public class Ejercicio5 {
	
	/** Pre:
	 *  Post: programa Java que escribe los numeros pares entre 0 y 100
	 */
	
	public static void main(String[] argumentos) {
		int valor = 0;
		while (valor <= 100) {
			if (valor % 2 == 0) {
				System.out.println(valor);
			}
			valor++;
		}
	}

}
