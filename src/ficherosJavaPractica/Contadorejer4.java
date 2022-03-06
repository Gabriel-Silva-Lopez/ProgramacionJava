package ficherosJavaPractica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Contadorejer4 {
	
	public static void mostrarInformacionFichero(String nombre, int c, Palabra[] p) {
		File file = new File(nombre);
		int contador = 0;
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()){
			String parrafo = f.nextLine();
			String trimparrafo = parrafo.trim();
				String reemplazo = trimparrafo.replaceAll(",","").replaceAll("\\.", "").replaceAll("¿", "").replaceAll("\\?", "").replaceAll("«", "").replaceAll("»", "");
				String[] linea = reemplazo.split(" ");
				for(int i = 0; i <= c; i++) {
					String palabra = p[i].getPalabra();
					for(int j = 0; j < linea.length; j++) {
						System.out.println(linea[j]);
						if(linea[j].equalsIgnoreCase(palabra)) {
							contador++;
						}
					}
					System.out.println("La Palabra: " + p[i].getPalabra() + " Se repite: " + contador);
					contador = 0;
				}
				break;
			}
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
}
