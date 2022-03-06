package arrayList3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static Persona crearPersona(String d, String n) {
		Persona persona = new Persona(d, n);
		return persona;
	}
	
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		int operacion;
		boolean bucle = true;
		ArrayList<Persona> listpersonas = new ArrayList<Persona>();
		
		while(bucle==true) {
			//imprimo menu
			 System.out.println("\n========================================================");
			 System.out.println("||                     MENU FRONTERA                  ||");
			 System.out.println("||                                                    ||");
			 System.out.println("||  ¿Qué desea hacer?                                 ||");
			 System.out.println("||                                                    ||");
			 System.out.println("||  1. Añadir nueva persona al paso de frontera       ||");
			 System.out.println("||  2. Mostrar todas las personas que han pasado      ||");
			 System.out.println("||  3. Busqueda de persona por nombre                 ||");
			 System.out.println("||  4. Busqueda de personas por DNI                   ||");
			 System.out.println("||  5. Apagar el Programa                             ||");
			 System.out.println("||                                                    ||");
			 System.out.println("========================================================\n");
			 if (s.hasNextInt()) {
				 operacion = s.nextInt();
				 if(operacion>5 || operacion<1){
	        			System.out.println("Ocurrio un error o hubo un problema con la funcion: '" + operacion
	        					+ "'\n\nno se reconoce como una operación o dicho comando no existe."
	        					+ "\nPor favor, vuelva a intentarlo y asegurece de que sea una funcion. ");
				 }
				 else if (operacion<=5 && operacion>=1) {
		        	if(operacion==1) {
		        		s.nextLine();
	        			System.out.println("Escribe el dni de la persona");
		        		if(s.hasNextLine()) {
			                String dni = s.nextLine();
			                System.out.println("Escribe el nombre de la persona");
			                String nombre = s.nextLine();
			        		Persona p = crearPersona(dni, nombre);
			        		System.out.println("Se ha creado la persona " + p.getNombre() + 
			        				" Con dni " + p.getDni());
			        		listpersonas.add(p);
		        		} else {
		        			s.next();
		        		}
		        	}
		        	if(operacion==2) {
		        		System.out.println("========================Personas========================");
		        		for(int i = 0; i < listpersonas.size(); i++) {
		        			System.out.println("\n       Persona " + (i+1) + ":");
		        			System.out.println("                   " + listpersonas.get(i).getNombre());
		        			System.out.println("                   " + listpersonas.get(i).getDni());
		        		}
		        	}
		        	if(operacion==3) {
		        		s.nextLine();
		        		System.out.println("Dime un nombre para mostrar a las personas con ese nombre: ");
		        		String busnombre = s.nextLine();
		        		System.out.println("Personas con este nombre: ");
		        		for(int i = 0; i < listpersonas.size(); i++) {
		        			if(listpersonas.get(i).getNombre().equals(busnombre)) {
			        			System.out.println("\n       Persona " + (i+1) + ":");
			        			System.out.println("                   " + listpersonas.get(i).getNombre());
			        			System.out.println("                   " + listpersonas.get(i).getDni());
		        			}
		        		}
		        	}
		        	if(operacion==4) {
		        		s.nextLine();
		        		System.out.println("Dime el DNI para encontrar a esa persona: ");
		        		String busdni = s.nextLine();
		        		System.out.println("Persona con ese DNI: ");
		        		for(int i = 0; i < listpersonas.size(); i++) {
		        			if(listpersonas.get(i).getDni().equals(busdni)) {
			        			System.out.println("\n       Persona " + (i+1) + ":");
			        			System.out.println("                   " + listpersonas.get(i).getNombre());
			        			System.out.println("                   " + listpersonas.get(i).getDni());
		        			}
		        		}
		        	}
		        	if(operacion==5) {
						bucle = false;
						s.close();
						break;
					}
				 }
			 } else {
				 s.next();
				System.out.println("\nPor favor, use solamente numeros para llamar a una funcion");
			 }
		}
	}
}
