package ficherosextra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Airplane {
	private static void aviones(String fichero) {
		ArrayList<Accidente> accidentes = new ArrayList<Accidente>();
		try {
			Scanner f = new Scanner(new File(fichero));
			//int nLinea = 1;
			while(f.hasNextLine()) {
				/*
				 * Creo un arraylist para almacenar las lineas parseadas,
				 * eliminado los problemas de las ". Lo que hago es
				 * detectar donde empieza una " y juntar todos los strings
				 * hasta que detecto el cierre de la " para todos los valores
				 * de las lineas. La longitud de una linea tiene que ser 13 siempre
				 * segun los datos del fichero.
				 */
				ArrayList<String> l = new ArrayList<String>();
				String linea = f.nextLine();
				String[] lSep = linea.split(",");
				String pegado = "";
				boolean empiezo = false;
				for(String dato : lSep) {
					if(empiezo) {
						pegado = pegado + dato;
						//System.out.println("Dato = " + dato);
						if(!dato.equals("") && Character.toString(dato.charAt(dato.length() - 1)).
								equalsIgnoreCase("\"")) {
							empiezo = false;
							l.add(pegado);
							pegado = "";
						}
					} else {
						if(!dato.equals("") && !Character.toString(dato.charAt(dato.length() - 1)).
								equalsIgnoreCase("\"") &&
								Character.toString(dato.charAt(0)).equalsIgnoreCase("\"")) {
							empiezo = true;
							pegado = dato;
						} else {
							l.add(dato);
						}
					}
				}
				/*
				 * Hay lineas que su longitud es 12 porque el uttimo dato de la linea esta
				 * vacio, por lo tanto añado yo el ultimo valor manualmente.
				 */
				if(l.size() == 12) l.add("");
				String hora = l.get(1);
				String localizacion = l.get(2);
				String avion = l.get(6);
				//System.out.println(hora + " - " + localizacion  + " - " + avion + " - " + nLinea);
				accidentes.add(new Accidente(avion.trim(), localizacion.trim().replaceAll("\"", ""), hora));
				//nLinea++;
			}
			mostrarAccidentesPorAvion(accidentes);
			System.out.println(); System.out.println();
			mostrarAccidentesPorLocalizacion(accidentes);
			System.out.println(); System.out.println();
			mostrarAccidentesPorHora(accidentes);
		} catch(FileNotFoundException e) {
			System.out.println("Error en contarUsosGeneral para " + fichero);
			System.out.println(e.toString());
		}
	}
	
	private static void mostrarAccidentesPorAvion(ArrayList<Accidente> accidentes) {
		ArrayList<Tupla> porAvion = new ArrayList<Tupla>();
		for(Accidente a : accidentes) {
			// Miramos si contiene este avion
			boolean encontrado = false;
			for(Tupla t : porAvion) {
				if(t.getContenido().equalsIgnoreCase(a.getTipo())) {
					t.setOcurrencias(t.getOcurrencias() + 1);
					encontrado = true;
					break;
				}
			}
			if(!encontrado) porAvion.add(new Tupla(a.getTipo(), 1));
		}
		Collections.sort(porAvion);
		System.out.println("######### TOP 10 AVIONES MÁS ACCIDENTADOS #########");
		for(int i = 0; i < 10; i ++) {
			System.out.println("Avion: " + porAvion.get(i).getContenido() + 
					" - " + porAvion.get(i).getOcurrencias() + " accidentes");
		}
	}
	
	private static void mostrarAccidentesPorLocalizacion(ArrayList<Accidente> accidentes) {
		ArrayList<Tupla> porLocalizacion = new ArrayList<Tupla>();
		for(Accidente a : accidentes) {
			// Miramos si contiene este avion
			boolean encontrado = false;
			for(Tupla t : porLocalizacion) {
				if(t.getContenido().equalsIgnoreCase(a.getLocalizacion())) {
					t.setOcurrencias(t.getOcurrencias() + 1);
					encontrado = true;
					break;
				}
			}
			if(!encontrado) porLocalizacion.add(new Tupla(a.getLocalizacion(), 1));
		}
		Collections.sort(porLocalizacion);
		System.out.println("######### TOP 10 LOCALIZACIONES MÁS ACCIDENTADAS #########");
		for(int i = 0; i < 10; i ++) {
			System.out.println("Avion: " + porLocalizacion.get(i).getContenido() + 
					" - " + porLocalizacion.get(i).getOcurrencias() + " accidentes");
		}
	}
	
	private static void mostrarAccidentesPorHora(ArrayList<Accidente> accidentes) {
		ArrayList<Tupla> porHora = new ArrayList<Tupla>();
		porHora.add(new Tupla("Mañanas", 0));
		porHora.add(new Tupla("Tardes", 0));
		porHora.add(new Tupla("Noches", 0));
		int sinHora = 0;
		for(Accidente a : accidentes) {
			//System.out.println(a.getHorario());
			String[] hSplit = a.getHorario().split(":");
			if(a.getHorario().length() <= 5 &&  hSplit.length == 2) {
				if(Integer.parseInt(hSplit[0]) >= 6 && Integer.parseInt(hSplit[0]) <= 13) {
					porHora.get(0).setOcurrencias(porHora.get(0).getOcurrencias() + 1);
				} else if(Integer.parseInt(hSplit[0]) > 13 && Integer.parseInt(hSplit[0]) <= 20) {
					porHora.get(1).setOcurrencias(porHora.get(1).getOcurrencias() + 1);
				} else {
					porHora.get(2).setOcurrencias(porHora.get(2).getOcurrencias() + 1);
				}
			} else {
				sinHora++;
			}
		}
		Collections.sort(porHora);
		System.out.println("######### ACCIDENTES POR HORAS #########");
		for(Tupla t : porHora) {
			System.out.println("Horario: " + t.getContenido() + 
					" - " + t.getOcurrencias() + " accidentes");
		} System.out.println("Sin hora = " + sinHora);
	}
	
	public static void main(String[] args) {
		String fichero = "/Users/alvaro/Desktop/airplane.csv";
		aviones(fichero);
	}
}
