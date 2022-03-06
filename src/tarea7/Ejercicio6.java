package tarea7;

import java.util.Scanner;

public class Ejercicio6 {

	public static int[] insertElement(int[] tabla, int num, int index){
		for(int i = 0; i < tabla.length; i++) {
			if(i==index) {
				tabla[i+1]=tabla[i];
			}
			else if (i-1>index) {
				tabla[i]=tabla[i]-1;
			}
		}
		tabla[index] = num;
		return tabla;
	}
		
		public static void main(String[] args) {
			Scanner s = new Scanner (System.in);
			int[] t = new int[11];
			System.out.println("Inserte el numero que quiere introducir");
			int numero = s.nextInt();
			System.out.println("Inserte en que posicion de la tabla lo quiere introducir");
			int indice =s.nextInt();
			if (indice>= 0 && indice <=11) {
				for(int i = 0; i < t.length; i++) {
					t[i] = i;
				}
				insertElement(t, numero, indice);
				for (int i = 0; i < t.length; i++) {
					System.out.println(t[i]);
				}
				s.close();
			}
		}
	}