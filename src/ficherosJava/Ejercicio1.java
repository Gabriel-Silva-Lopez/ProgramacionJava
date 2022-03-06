package ficherosJava;

import java.io.File;
import java.util.Scanner;

/**
 * Esta clase presenta un programa de prueba que ilustra como trabajar con ficheros haciendo
 * uso de los recursos que ofrece la clase java.io.File
 * 
 * @Author: Alvaro Juan Ciriaco
 */

public class Ejercicio1 {
	
	/**
	 * Pre: ---
	 * Post: Metodo el cual borra el fichero seleccionado por el usuario en el main
	 * 
	 */
	public static void borrarFile(File f) {
		if(f.isFile()) {
			System.out.println("| el fichero ha sido borrado con exito:" + f.getAbsolutePath());
			f.delete();
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Metodo el cual renombra el fichero al nombre que el usuario haya metido en el main
	 * 
	 */
	public static void renombrarFile(File f, File f2) {
		f.renameTo(f2);
	}
	
	/**
	 * Pre: ---
	 * Post: Si existe un fichero cuyo nombre es igual al asociado al objeto [f], entonces
	 * 		 informa por pantalla de los atributos y principales caracterÃ­sticas del fichero.
	 * 		 En caso contrario no produce ningÃºn resultado.
	 */
	public static void mostrarInformacion(File f) {
		if(f.isFile()) {
			System.out.println();
			System.out.println(" ---------------------");
			System.out.println("| INFORMACION DE FILE |");
			System.out.println(" ---------------------");
			System.out.println("| Nombre del fichero:                             " + f.getName());
			System.out.println("| Ruta relativa del directorio del fichero:       " + f.getParent());
			System.out.println("| Nombre del fichero (ruta relativa):             " + f.getPath());
			System.out.println("| Nombre del fichero (ruta absoluta):             " + f.getAbsolutePath());
			System.out.println("| Tamaño del fichero (en bytes):                  " + f.length());
			System.out.println("| Puede ser leido:                                " + f.canRead());
			System.out.println("| Puede ser escrito:                              " + f.canWrite());
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Muestra por pantalla el menu de la aplicaciÃ³n.
	 */
	public static void mostrarMenu() {
		System.out.println("Selecciona una opcion: ");
		System.out.println("  1) Crear File usando ruta");
		System.out.println("  2) Crear File usando ruta + nombre");
		System.out.println("  3) Cambiar nombre a File usando ruta + nombre");
		System.out.println("  4) Borrar File usando ruta ");
		System.out.println("  5) Apagar ");
		System.out.print("Opcion seleccionada (0 para finalizar): ");
	}
	
	/**
	 * Pre: ---
	 * Post: Presenta informaciÃ³n por pantalla del fichero [nombre] ubicado en [ruta], le cambia
	 * 		 su nombre y, finalmente, lo elimina.
	 */
	public static void main(String[] args) {
		/*
		 * Crea objeto de clase [Scanner] y presenta por pantalla el menu de la aplicaciÃ³n.
		 */
		Scanner entrada = new Scanner(System.in);
		mostrarMenu();
		int opcion = entrada.nextInt();
		while(opcion != 0) {
			File f;
			/*
			 * Si el usuario selecciona la opciÃ³n 1 el objeto [File] se crea llamando
			 * a su constructor public File(String ruta_y_nombre), si selecciona la opciÃ³n
			 * 2 el objeto [File] se crea llamando al constructor public File(String ruta, nombre).
			 */
			if(opcion == 1 || opcion == 2) {
				if(opcion == 1) {
					System.out.print("Escriba la ruta para File: ");
					String rutaFinal = entrada.next();
					f = new File(rutaFinal);
				} else {
					System.out.print("Escriba la ruta para File (sin nombre): ");
					String ruta = entrada.next();
					System.out.print("Escriba el nombre para File: ");
					String nombre = entrada.next();
					f = new File(ruta, nombre);
				}
				/*
				 * Muestra informacion relevante del fichero
				 */
				mostrarInformacion(f);
			} else if (opcion == 3) {
				System.out.print("Dame el nombre del File:");
				String nombre = entrada.next();
				System.out.print("Dame la ruta del File:");
				String ruta = entrada.next();
				f = new File(ruta, nombre);
				System.out.print("Renombra el nombre del File: ");
				String nombre2 = entrada.next();
				File f2 = new File(ruta, nombre2);
				System.out.println(f.getAbsolutePath());
				renombrarFile(f, f2);
			}
			else if (opcion == 4) {
				System.out.print("Escriba la ruta para File con su nombre y formato ");
				String rutaFinal = entrada.next();
				f = new File(rutaFinal);
				borrarFile(f);
			}else if(opcion == 5) {
				entrada.close();
				break;
			}else {
				System.out.println("¡Opcion incorrecta. Indique un numero valido!");
			}
			/*
			 * SeparaciÃ³n estÃ©tica para la aplicaciÃ³n.
			 */
			System.out.println();
			System.out.println("==================================================");
			System.out.println();
			/*
			 * Presenta por pantalla el menu y pregunta al usuario por una nueva opciÃ³n.
			 * Esto se repite hasta que el usuario selecciona la opciÃ³n 0 (finalizar).
			 */
			mostrarMenu();
			opcion = entrada.nextInt();
		}
	}
}
