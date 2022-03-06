package Portaldatospublicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
	
	/**
	 * Pre:-----------
	 * Post: Metodo que crea los ficheros de tipo prueba con los que podremos trabajar
	 * mas adelante y nos seran necesarios para comprobar de que el programa funciona
	 */
	public static void datosDePrueba(Scanner s) {
		String ruta10csv = ("C:\\ficherosdebizi\\pruebas-10.csv");
		String ruta16csv = ("C:\\ficherosdebizi\\usos-16.csv");
		String ruta2000csv = ("C:\\ficherosdebizi\\pruebas-2000.csv");
		String ruta17csv = ("C:\\ficherosdebizi\\usos-17.csv");
		try {
			Scanner entradatos16csv = new Scanner(new File(ruta16csv));
			Formatter salida10csv = new Formatter(new File(ruta10csv));
			Scanner entradatos17csv = new Scanner(new File(ruta17csv));
			Formatter salida2000csv = new Formatter(new File (ruta2000csv));
			for(int i = 0; i < 10; i++) {
				if(entradatos16csv.hasNextLine()){
					salida10csv.format(entradatos16csv.nextLine() + "\n");
				}
			}
			for(int i = 0; i < 2000; i++) {
				if(entradatos17csv.hasNextLine()){
					salida2000csv.format(entradatos17csv.nextLine() + "\n");
				}
			}
			salida10csv.close();
			entradatos16csv.close();
			salida2000csv.close();
			entradatos17csv.close();
			System.out.println("\nArchivos pruebas-10.csv y pruebas-2000.csv creados exitosamente");
		} catch (FileNotFoundException e) {
			System.out.println("Hubo un problema con los ficheros y no han podido ser abierto.");
		}
	}
	
	/**
	 * Pre:-----------
	 * Post: Metodo que añade y cuenta a los usos del sistema bizi del csv que
	 * el usuario haya ingresado para realizar el metodo
	 */
	
	public static void contarUso(Scanner s) {
		System.out.print("\nDame el nombre con la extension del fichero: ");
		String nombre = s.next();
		String ruta = ("C:\\ficherosdebizi\\" + nombre);
		File filecsv = new File(ruta);
		boolean primera = false;
		int contador = 0;
		int contadorTraslados = 0;
		int contadorCircular = 0;
		try {
			Scanner f = new Scanner(filecsv);
			while(f.hasNextLine()){
				String parrafo = f.nextLine();
				if(primera==true) {
					String[] linea = parrafo.split(";");
					contador++;
					if(linea[2].trim().equalsIgnoreCase(linea[4].trim())) {
						contadorCircular++;
					} else {
						contadorTraslados++;
					}
				} else {
					primera = true;
				}
			}
			Usobici uso = new Usobici(contador, contadorCircular, contadorTraslados);
			System.out.println(uso.toString());
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto.");
		}
	}
	
	
	/**
	 * Pre:-----------
	 * Post: Metodo que añade y cuenta a los usuarios del sistema bizi del csv que
	 * el usuario haya especificado y ingresado
	 */
	
	public static void contarUsuarios(Scanner s) {
		System.out.print("\nDame el nombre con la extension del fichero: ");
		String nombre = s.next();
		String ruta = ("C:\\ficherosdebizi\\" + nombre);
		ArrayList<Usuariobici> usuario = new ArrayList <Usuariobici>();
		Usuariobici almacen = new Usuariobici(0,0,0,0);
		File filecsv = new File(ruta);
		boolean primera = false;
		boolean añadido = false;
		int contadorTraslados = 0;
		int contadorCircular = 0;
		int vector = -1;
		try {
			Scanner f = new Scanner(filecsv);
			while(f.hasNextLine()){
				String parrafo = f.nextLine();
				if(primera==true) {
					String[] linea = parrafo.split(";");
					añadido = false;
					for(int i = 0; i < usuario.size(); i++) {
						if(Integer.parseInt(linea[0].trim()) == usuario.get(i).getUsuario()) {
							añadido = true;
							vector = i;
						}
					}
					if(añadido == true) {
						if(linea[2].trim().equalsIgnoreCase(linea[4].trim())) {
							usuario.get(vector).sumCircular();
						} else {
							usuario.get(vector).sumTraslado();
						}
						usuario.get(vector).sumTotal();

					} else {
						contadorTraslados = 0;
						contadorCircular = 0;
						if(linea[2].trim().equalsIgnoreCase(linea[4].trim())) {
							contadorCircular++;
						} else {
							contadorTraslados++;
						}
						usuario.add(new Usuariobici(Integer.parseInt(linea[0].trim()),contadorTraslados,contadorCircular,1));
					}
				} else {
					primera = true;
				}
			}
			ordenarContenido(usuario, almacen);
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero no ha podido ser abierto.");
		}
	}
	
	/**
	 * Pre:-----------
	 * Post: Metodo que reorganiza a la Usuariosbici del sistema, despues de que estos hayan
	 * sido leidos y añadidos al sistema. 
	 */
	
	public static void ordenarContenido(ArrayList<Usuariobici> usuario, Usuariobici almacen){
		for(int i = 0; i < usuario.size();i++) {
			for(int j = i; j < usuario.size(); j++) {
				if(usuario.get(i).getTotal() < usuario.get(j).getTotal()) {
					almacen.UsuarioBici(usuario.get(i).getUsuario(), usuario.get(i).getTraslado(),
							usuario.get(i).getCircular(), usuario.get(i).getTotal());
					
					usuario.get(i).UsuarioBici(usuario.get(j).getUsuario(),usuario.get(j).getTraslado(),
							usuario.get(j).getCircular(), usuario.get(j).getTotal());
					
					usuario.get(j).UsuarioBici(almacen.getUsuario(), almacen.getTraslado(),
							almacen.getCircular(), almacen.getTotal());
				}
			}
		}
		obtenerUsoPorUsuario(usuario, 15);
	}
	
	/**
	 * Pre:-----------
	 * Post: Metodo el cual imprime por pantalla los 15 usuarios con mas uso del sistema
	 */
	
	public static void obtenerUsoPorUsuario (ArrayList<Usuariobici> u, int longitud) {
		if(u.size() < longitud) {
			longitud = u.size();
		}
		System.out.println("\nNumero de usuarios distintos: " + u.size() +"\n");
		System.out.println("Usuarios     Traslados     Circular    Total");
		System.out.println("========     =========     =======     =====");
		for(int i = 0; i < longitud; i++) {
			System.out.println(u.get(i).getUsuario() +
					"            " + u.get(i).getTraslado() + "            "
					+ u.get(i).getCircular() + "          " + u.get(i).getTotal());
		}
		
	}
	
	/**
	 * Pre:-----------
	 * Post: Metodo el cual imprime un menu en el que el usuario puede visualizar 
	 * las diferentes opciones
	 */
	
	public static void menu() {
		 System.out.println("\n========================================================");
		 System.out.println("||                 MENU BIZI ZARAGOZA                 ||");
		 System.out.println("||====================================================||");
		 System.out.println("||                                                    ||");
		 System.out.println("|| ¿Que desea hacer?                                  ||");
		 System.out.println("||                                                    ||");
		 System.out.println("||        1. Probar ficheros                          ||");
		 System.out.println("||        2. Contar uso                               ||");
		 System.out.println("||        3. Mostrar los 15 usuarios más activos      ||");
		 System.out.println("||        4. Apagar el Programa                       ||");
		 System.out.println("||                                                    ||");
		 System.out.println("========================================================\n");
	}
	
	/**
	 * Pre:-----------
	 * Post: Metodo main en el que se inicializan los metodos que el usuario haya elegido
	 * mediante un menu que le enseñara las opciones que este puede realizar, mienstras 
	 * este lo procesa
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		new File("C:\\ficherosdebizi").mkdirs(); //creo la carpeta ficherosbizi
		System.out.println("recuerda poner los ficheros en la carpeta 'ficherosdebizi'");
		while(true) {
			menu();
			int operacion;
			if(s.hasNextInt()) {
				operacion = s.nextInt();
				if(operacion==1) {
					datosDePrueba(s);
				}
				else if(operacion==2){
					contarUso(s);
				}
				else if(operacion==3) {
					contarUsuarios(s);
				}
				else if(operacion==4) {
					s.close();
					break;
				} else {
					System.out.println("Ha ingresado mal los datos, vuelva a intentarlo");
					s.next();
				}
			}
		}
	}
}
