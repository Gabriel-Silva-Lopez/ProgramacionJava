package ficherosJavaPractica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void mostrarInformacionFichero(String nombre, String p) {

		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			int contador = 0;
			while(f.hasNextLine()){
			String parrafo = f.nextLine();
				String reemplazo = parrafo.replaceAll(",","").replaceAll("\\.", "");
				String[] linea = reemplazo.split(" ");
				for(int i = 0; i < linea.length; i++) {
					if(linea[i].equalsIgnoreCase(p)) {
						contador++;
					}
				}
			}
			System.out.println(p + " se repite: " + contador + " veces ");
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero: ");
		String nombreFichero = entrada.nextLine();
		String buscarpalabra = entrada.nextLine();
		mostrarInformacionFichero(nombreFichero, buscarpalabra);
		entrada.close();
	}
}
