package examenProgramacion;

import java.util.Scanner;

public class Ejercicio3 {
	public static int[][] maxfila(int[][] t, int f) {
		//ordeno el salario de cada persona
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				for (int k = j + 1; k < t[i].length; k++) {
					if (t[i][j] > t[i][k]) {
						int almacentemporal = 0;
						almacentemporal = t[i][j];
						t[i][j] = t[i][k];
						t[i][k] = almacentemporal;
					}
				}
			}
			//y si i es igual a la fila que el usuario desea ver se la muestro
			if (i==f) {
					System.out.println("El salario mas elevado es: " + t[i-1][t[i-1].length-1]);
				} 
			//en caso de que ocurra el caso de que sea menor a f porque en la tabla seria la fila 3
			//pero en la perspectiva del usuario es la 4 ejecuto el if de abajo
			else if (f>i && i==t.length-1){
					System.out.println("El salario mas elevado es: " + t[i][t[i].length-1]);
					f++;
			}
		}
		
		return t;
	}
	
	/**
	 * Pre:---------
	 * Post:En este metodo se sacan los salarios y se pide al usuario de que fila desea
	 * obtener el salario mas elevado
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int salarios[][] = { {700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, 
				{1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100} };
		System.out.println("---------------------- SALARIOS ---------------------------\n");
		for (int i=0; i < salarios.length; i++) {
			System.out.print("persona " + (i+1) + " -> ");
			System.out.print(salarios[i][0] + " " + salarios[i][0+1]+
					" " + salarios[i][0+2] + " " +salarios[i][0+3]+ " " + 
					salarios[i][0+4] + " " + salarios[i][0+5] + "\n\n");
		}
		System.out.println("Dime de que persona/fila deseas ver el salario más alto:");
			int fila=s.nextInt();
			//una vez, el usuario tenga en claro de que persona quiere ver el salario mas elevado
			//lo envio al metodo maxfila para que ordene de menor a mayor el salario
			maxfila(salarios, fila);
			s.close();
		}
	}
