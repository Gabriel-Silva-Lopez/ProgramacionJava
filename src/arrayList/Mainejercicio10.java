package arrayList;

import java.util.ArrayList;

public class Mainejercicio10 {
	public static void main (String[]args) {
		
		ArrayList<String> s = new ArrayList<String>();
		System.out.println("¿tiene datos la lista?\n " + s.isEmpty() + "\n");
		
		//añado 10 textos
		for(int i = 1; i <= 10; i++) {
			s.add("String"+i);
		}
		
		ArrayList<String> s2 = new ArrayList<String>();
		for(int i = 1; i <= 10; i++) {
				s2.add("2String"+i);
		}
		//muestro por pantalla
		for(int i = 0; i < s.size(); i++) {
				System.out.println(s.get(i) + s2.get(i));
		}
	}
}
