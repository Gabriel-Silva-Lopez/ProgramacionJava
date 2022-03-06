package tarea4;

public class Ejercicio6 {

	/** Pre:
	 *  Post: programa Java que escribe los numeros impares entre 0 y 100
	 */
	
	public static void main(String[] argumentos) {
		for (int valor = 0;valor <= 100;) {
			if (valor % 2 != 0) {
				System.out.println(valor);
			}
			valor++;
		}
	}	
}
