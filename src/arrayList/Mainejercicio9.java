package arrayList;

import java.util.ArrayList;

public class Mainejercicio9 {
	public static void main (String[]args) {
		
		ArrayList<String> s = new ArrayList<String>();
		System.out.println("¿tiene datos la lista?\n " + s.isEmpty() + "\n");
		
		//añado 10 textos
		for(int i = 1; i <= 10; i++) {
			s.add("String"+i);
		}
		
		ArrayList<String> s2 = new ArrayList<String>();
		for(int i = 1; i <= 10; i++) {
			if(i<5) {
				s2.add("String"+i);
			} else {
				s2.add("str"+i);
			}
		}
		//muestro por pantalla
		for(int i = 0; i < s.size(); i++) {
			if(s.get(i).contains(s2.get(i))) {
				System.out.println(s.get(i) + " y " + s2.get(i) + ": " + true);
			} else {
				System.out.println(s.get(i) + " y " + s2.get(i) + ": " + false);
			}
		}
	}
}
