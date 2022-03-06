package tarea2;

public class Ejercicio3 {
	
	/** Pre: ----
	 *  Post: muestra la suma de los numeros entre 50 y 100"
	 */
	
	public static void main(String[] argumentos) {
		int i= 50;
		int suma = 0;
		while(i <= 100) {
			suma = suma + i;
			i++;
		} System.out.println("Suma = " + suma);
	}
}
