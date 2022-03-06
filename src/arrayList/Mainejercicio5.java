package arrayList;

import java.util.ArrayList;

public class Mainejercicio5 {

	public static void main (String[]args) {
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		System.out.println(n.isEmpty() + "\n");
		
		//añado 10 textos
		for(int i = 1; i <= 10; i++) {
			n.add(i);
		}
		//quito la linea 3
		n.remove(3);
		//muestro por pantalla
		for(int j = 0; j < n.size(); j++) {
			System.out.println(n.get(j));
		}
	}
}

