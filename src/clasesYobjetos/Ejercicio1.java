package clasesYobjetos;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cuenta cliente = new Cuenta("Alvaro", 20000);
		Cuenta cliente2 = new Cuenta("Luis", 24000);
		Cuenta cliente3 = new Cuenta("Jose", 10000);
		System.out.println("¿que desea hacer?");
		System.out.println("\n1. Ingresar");
		System.out.println("2.retirar");
		System.out.println("3.Crear nueva cuenta");
		int accion = entrada.nextInt();
		if(accion==1) {
			System.out.println("¡Ingrese el titular!");
			System.out.print("\nDame el nombre:\n ");
			String titular = entrada.next();
			if(titular.contains("Luis") || titular.contains("luis")) {
				System.out.println(cliente2.toString());
				System.out.print("\nDame la cantidad:\n ");
				double cantidad = entrada.nextDouble();
				cliente2.ingresar(cantidad);
				System.out.println(cliente2.toString());
				entrada.close();	
			}
			else if(titular.contains("Alvaro") || titular.contains("alvaro")){
				System.out.println(cliente.toString());
				System.out.print("\nDame la cantidad:\n ");
				double cantidad = entrada.nextDouble();
				cliente.ingresar(cantidad);
				System.out.println(cliente.toString());
				entrada.close();	
			}
			else if(titular.contains("Jose") || titular.contains("jose")){
				System.out.println(cliente3.toString());
				System.out.print("\nDame la cantidad:\n ");
				double cantidad = entrada.nextDouble();
				cliente3.ingresar(cantidad);
				System.out.println(cliente3.toString());
				entrada.close();
			}
		} 
		else if(accion==2) {
			System.out.println("¡Ingrese el titular!");
			System.out.print("\nDame el nombre:\n ");
			String titular = entrada.next();
			if(titular.contains("Luis") || titular.contains("luis")) {
				System.out.println(cliente.toString());
				System.out.print("\nDame la cantidad:\n ");
				double cantidad = entrada.nextDouble();
				cliente.retirar(cantidad);
				System.out.println(cliente.toString());
				entrada.close();	
			}
			else if(titular.contains("Alvaro") || titular.contains("alvaro")){
				System.out.println(cliente2.toString());
				System.out.print("\nDame la cantidad:\n ");
				double cantidad = entrada.nextDouble();
				cliente2.retirar(cantidad);
				System.out.println(cliente2.toString());
				entrada.close();
			}
			else if(titular.contains("Jose") || titular.contains("jose")){
				System.out.println(cliente3.toString());
				System.out.print("\nDame la cantidad:\n ");
				double cantidad = entrada.nextDouble();
				cliente3.retirar(cantidad);
				System.out.println(cliente3.toString());
				entrada.close();
			}
		}
		else if(accion==3) {
			System.out.println("¡Ingrese el nombre del titular para su nueva cuenta!");
			String titular = entrada.next();
			Cuenta cliente4 = new Cuenta(titular);
			System.out.println("\n" + cliente4.toString());
			System.out.println("\n¿Desea depositar una cantidad?");
			System.out.println("\n1.Si");
			System.out.println("2.No");
			int depositar = entrada.nextInt();
			if(depositar==0) {
				entrada.close();
			}
			else if(depositar==1) {
				System.out.print("\nDame la cantidad:\n ");
				double cantidad = entrada.nextDouble();
				cliente4.ingresar(cantidad);
				System.out.println("\n" + cliente4.toString());
				entrada.close();
			}
		}
	}
}
