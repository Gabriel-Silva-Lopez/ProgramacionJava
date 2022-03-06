package exameneedd;

public class Main {
	/**
	 * Pre:-----------
	 * Post:inicializa el código Java que se encarga de visualizar una matriz de 5x5
	 * y mostrar su diagonal principal y secundaria.
	 */
	public static void main (String[] args) {
		int[][] matriz = new int[5][5];
		OperacionesArrays.inicializar(matriz);
		OperacionesArrays.visualizarmatriz(matriz);
		int[] DiagoPrincipal = new int[matriz.length];
		int[] DiagoSecundaria = new int[matriz.length];
		// Rellenamos la matriz de 5x5
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(i==j) {
					DiagoPrincipal[i] = matriz[i][j];
				}
				if(i+j == matriz.length-1) {
					DiagoSecundaria[i] = matriz[i][j];
				}
	        }
		}
	    // Mostramos la diagonal principal y secundaria de la matriz 5x5
		System.out.println("\nDiagonal Principal");
		OperacionesArrays.visualizararray(DiagoPrincipal); 
		System.out.println("\n\nDiagonal Secundaria");
		OperacionesArrays.visualizararray(DiagoSecundaria);
		System.out.println("\n\n");
	}
}
