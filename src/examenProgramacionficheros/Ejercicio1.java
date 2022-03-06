package examenProgramacionficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {
	
	/** Pre:
	 *  Post: Metodo en el una vez que el usuario haya ingresado la direccion
	 *  del titanic.csv see lee el contenido este y se saca la cantidad de 
	 *  pasajeros, num de hombres y de mujeres, num hombres y mujeres fallecidos
	 *  y el porcentaje de los fallecido por genero
	 */
	public static void mostrarInformacionFichero(String nombre, Scanner s) {
		File file = new File(nombre);
		int numPasajeros = 0;
		int numMujeres = 0;
		int numHombres = 0;
		int numHombresfalle = 0;
		int numMujeresfalle = 0;
		try {
			Scanner f = new Scanner(file);	
			for(int i = 0; f.hasNextLine(); i++) {
				String linea = f.nextLine().replaceAll(" ","").replaceAll(",,",",");
					if(i>0) {
					String divisor = linea;
					String[] separador = divisor.split(",");
					numPasajeros++;
					for(int j = 0; j < separador.length; j++) {
						if(separador[j].equalsIgnoreCase("male")) {
							numHombres++;
							if(separador[j-4].equalsIgnoreCase("0")) {
								numHombresfalle++;
							}
						} 
						else if(separador[j].equalsIgnoreCase("female")) {
							numMujeres++;
							if(separador[j-4].equalsIgnoreCase("0")) {
								numMujeresfalle++;
							}
						}
					}
				}
			}
			float porcentajeHombres = ((numHombresfalle*100)/numHombres);
			float porcentajeMujeres = ((numMujeresfalle*100)/numMujeres);
			System.out.println("\nNumero total de pasajeros: " + (numPasajeros));
			System.out.println("Numero de Hombres: " + numHombres);
			System.out.println("Numero de Hombres fallecidos: " + numHombresfalle);
			System.out.print("Porcentaje de hombres fallecidos: ");
			System.out.printf("%.2f", porcentajeHombres); //saco 2 decimales
			System.out.println("%"+ "\nNumero de Mujeres: " + numMujeres);
			System.out.println("Numero de Mujeres fallecidas: " + numMujeresfalle);
			System.out.print("Porcentaje de Mujeres fallecidas: ");
			System.out.printf("%.2f", porcentajeMujeres); //saco 2 decimales
			System.out.println("%"+ "\n");
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}	
	
	/** Pre:
	 *  Post: Metodo en el que el usuario ingresa la direccion del fichero titanic y dicha
	 *  dirección sera enviada a mostrarInformacionFichero para leer y tratar la información
	 *  del titanic.csv
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero ");
		String nombreFichero = s.nextLine();
		mostrarInformacionFichero(nombreFichero, s);
		s.close();
	}
}