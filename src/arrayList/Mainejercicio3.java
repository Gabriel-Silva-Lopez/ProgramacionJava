package arrayList;

import java.util.ArrayList;

public class Mainejercicio3 {
	
	public static void main (String[]args) {
	
		ArrayList<Integer> n = new ArrayList<Integer>();
		System.out.println(n.isEmpty() + "\n");
		
		//añado 10 textos
		for(int i = 1; i <= 10; i++) {
			n.add(i);
		}
			System.out.println(n.get(7));
	}
}
