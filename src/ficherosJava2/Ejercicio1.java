package ficherosJava2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void mostrarInformacionFichero(String nombre, Scanner s) {
		File file = new File(nombre);
		System.out.println("Dime la ruta del fichero de salida");
		String ruta= s.nextLine();
		try {
			Formatter salida = new Formatter(ruta);
			Scanner f = new Scanner(file);
			while(f.hasNextLine()){
				String parrafo = f.nextLine();
				String reemplazo = parrafo.replaceAll("\\.", "");
				String dni = reemplazo.substring( 0, 9);
				String[] linea = reemplazo.split(" ");
				for(int i = 0; i < linea.length; i++) {
					if(linea[i].contains(",")) {
						String apellidos = linea[i-1]+" "+linea[i];
						System.out.println(apellidos + dni);
					}
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero para mostrar sus lineas y num caracteres: ");
		String nombreFichero = s.nextLine();
		mostrarInformacionFichero(nombreFichero, s);
		s.close();
	}
}
