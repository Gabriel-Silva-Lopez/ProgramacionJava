package ficherosJava;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Ejercicioescribirfichero1 {
	
	/**
	 * Pre: [nombre] almacena la ruta + nombre del fichero a crear/modificar
	 * 		[entrada] corresponde al Scanner que estamos utilizando en el programa.
	 * Post: Crea un fichero de texto denominado [nombre] y almacena en él todos los
	 * 		datos enteros y cadenas de caracteres escritas por el usuario.
	 * 		Finaliza cuando el usuario escribe la palabra "fin".
	 */
	private static void escribirDatos(String nombre, Scanner entrada) {
		try {
			/*
			 * Se crea un objeto [Formatter] al que se asocia un fichero deno-
			 * minado [nombre].
			 */
			Formatter salida = new Formatter(nombre);
			System.out.print("Introduzca lo que desea escribir: ");
			String datos = entrada.nextLine();
			/*
			 * Solicitamos al usuario datos hasta que este escriba la palabra
			 * fin
			 */
			while(!datos.equalsIgnoreCase("fin")) {
				/*
				 * Si contiene espacio significa que el usuario ha introducido varias
				 * palabras a la vez, y en el enunciado hemos dicho que únicamente
				 * se puede introducir una única palabra.
				 */
				if(!datos.contains(" ")) {
					/*
					 * Comprobamos si el dato introducido es un número entero
					 * o una cadena de caracteres
					 */
					if(isInteger(datos)) {
						salida.format("Número entero introducido por el usuario: " + datos + "\n");
						System.out.println("El numero entero " + datos + " se ha escrito correctamente " + 
								"en el fichero " + nombre);
					} else {
						salida.format("Cadena de caracteres introducida por el usuario: " + datos + "\n");
						System.out.println("La cadena de caracteres " + datos + " se ha escrito correctamente " + 
								"en el fichero " + nombre);
					}
					/*
					 * Escribimos la información del buffer en el fichero
					 */
					salida.flush();
				} else {
					System.out.println("ERR: ¡Has introducido varias palabras a la vez!");
				}
				System.out.print("Introduzca lo que desea escribir: ");
				datos = entrada.next();
			}
			/*
			 * Cerramos el fichero
			 */
			salida.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser creado.");
		}
	}
	
	/**
	 * Pre: [numero] almacena el String que queremos comprobar
	 * Post: Devuelve true si y solo si, [numero] es un número
	 * 		entero. En caso contrario, devuelve false.
	 */
	private static boolean isInteger(String numero){
	    try{
	    	/*
	    	 * Intento pasar la cadena de caracteres a entero, sin almacenarlo porque
	    	 * no lo quiero para nada. Si no se puede pasar a entero, me da una excepcion
	    	 * de tipo NumberFormatException y por lo tanto se que la cadena de caracteres
	    	 * no puede ser tratada como un int. 
	    	 */
	        Integer.parseInt(numero);
	        return true;
	    }catch(NumberFormatException e){
	        return false;
	    }
	}
	
	/**
	 * Pre: ---
	 * Post: Ejecuta el funcionamiento del programa. Solicita al usuario la ruta
	 * 		del fichero sobre el que queremos escribir.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Solicita al usuario el fichero para escribibr en él los datos
		 * sin formato.
		 */
		System.out.print("Dame la ruta + nombre del fichero: ");
		String nombreFichero = entrada.nextLine();
		escribirDatos(nombreFichero, entrada);
	}
}
