package ficherosJavaPractica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void mostrarInformacionFichero(String nombre) {

		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()){
			String parrafo = f.nextLine();
			String trimparrafo = parrafo.trim();
				String reemplazo = trimparrafo.replaceAll(",","").replaceAll("\\.", "").replaceAll("¿", "").replaceAll("\\?", "");
				String[] linea = reemplazo.split(" ");
				for(int i = 0; i < linea.length; i++) {
					System.out.println(linea[i]);
				}
			}
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero: ");
		String nombreFichero = entrada.nextLine();
		mostrarInformacionFichero(nombreFichero);
		entrada.close();
	}
}
