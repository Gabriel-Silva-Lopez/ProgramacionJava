package ficherosJavaPractica;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void menu() {
		System.out.println("\n======================");
		System.out.println("|CONTAR CONCURRENCIAS|");
		System.out.println("|====================|");
		System.out.println("| 1. Ejecutar        |");
		System.out.println("| 2. Salir           |");
		System.out.println("======================");

	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			while(true) {
				menu();
				int orden = entrada.nextInt();
				if(orden==1) {
					System.out.print("\nDame la ruta + nombre del fichero: ");
					String nombreFichero = entrada.next();
					System.out.print("Dame la cantidad de palabras que deseas buscar: ");
					int cantidad = entrada.nextInt();
					Palabra[] p = new Palabra[cantidad+1];
					for(int i = 0; i <= cantidad; i++) {
						String nombre = entrada.nextLine();
						p[i] = new Palabra(i, nombre);
					}
					Contadorejer4.mostrarInformacionFichero(nombreFichero, cantidad, p);
				} 
				else if (orden==2) {
					entrada.close();
					break;	
				} else {
					System.out.print("Elige una de las dos opciones disponibles ");
				}
			}
		} catch(Exception e) {
			System.out.print("\nError");
		}
	}
}

