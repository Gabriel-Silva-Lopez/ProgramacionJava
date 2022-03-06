package repaso1examen;

public class Ejercicio16 {
	//Escribe un programa Java que encuentre todos los pares de
	//elementos enteros de un array que suman el valor escrito por el usuario.
	
	public static int[]encontrarpares (int[] tabla){
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i]%2==0) {
				System.out.print(tabla[i] + " par " + " y se localiza en la celda " 
						+ (i+1) + " de la tabla \n");
			}
		}
		return tabla;
	}
	
	public static void main(String[] args) {
		int[]t={5, 6, 9, 23, 7, 14, 0, 3, 34, 39, 88};
		encontrarpares(t);
	}

}
