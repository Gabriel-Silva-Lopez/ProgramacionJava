package arrayList;

import java.util.ArrayList;

public class Ejem1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> listaenteros = new ArrayList<Integer>();
		for(int i = 1; i <= 900; i++) {
			listaenteros.add(i);
		}
		
		for(int i=0; i < listaenteros.size(); i++) {
			System.out.println(listaenteros.get(i));
		}
		
		System.out.println("-------------");
		for(int num : listaenteros) {
			System.out.println(num);
		}
	}
}
