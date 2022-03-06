package arrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainejercicio1 {
	
	public static int calcularSuma(ArrayList<Integer> entsuma){
		int sum = 0;
		for(int i = 0; i < entsuma.size(); i++) {
			sum = sum + entsuma.get(i);
		}
		return sum;
	}
	
	public static int calcularMedia(ArrayList<Integer> entsuma, int longitud){
		int sum = 0;
		for(int i = 0; i < entsuma.size(); i++) {
			sum = sum + entsuma.get(i);
		}
		sum = sum/longitud;
		return sum;
	}
	
	public static void showMenu() {
		System.out.println("dime que operación deseas ejecutar");
		System.out.println("1. Sumar numeros de un Arraylist");
		System.out.println("2. Sacar la media Arimética de un Arraylist");
		System.out.println("3. Sacar los numeros que son  Capicua de un Arraylist");
	}

	public static void main(String[]args) {
		Scanner s = new Scanner (System.in);
		ArrayList<Integer> ent = new ArrayList<Integer>();
		showMenu();
		int operacion = s.nextInt();
		int longitud;
		if(operacion==1) {
			s.nextLine();
			System.out.println("escribe la cantidad de numeros que quieres:");
			longitud = s.nextInt();
			for(int i = 0; i < longitud; i++) {
				System.out.println("escribe el numero " + (i+1) + " para sumar:");
				int valorsuma=s.nextInt();
				ent.add(valorsuma);
			}
			int suma = calcularSuma(ent);
			System.out.println(suma);
		}
		else if(operacion==2) {
			System.out.println("escribe la cantidad de numeros que quieres:");
			longitud = s.nextInt();
			for(int i = 0; i < longitud; i++) {
				System.out.println("escribe el numero " + (i+1) + " para sumar:");
				int valorarimetica=s.nextInt();
				ent.add(valorarimetica);
			}
			int arimetica = calcularMedia(ent, longitud);
			System.out.println(arimetica);
		}
		else if(operacion==3) {
			
		} else {
		System.out.println("No existe tal funcion");
		s.next();	
		}
		s.close();
	}
}
