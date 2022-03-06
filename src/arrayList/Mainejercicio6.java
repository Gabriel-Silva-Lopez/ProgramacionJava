package arrayList;

import java.util.ArrayList;

public interface Mainejercicio6 {

	public static void main (String[]args) {
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		System.out.println("¿tiene datos la lista?\n " + n.isEmpty() + "\n");
		
		//añado 10 textos
		for(int i = 1; i <= 10; i++) {
			n.add(i);
		}
		//clono el arrayList
		ArrayList<Integer> n2 = n;
		//muestro por pantalla
		for(int j = 0; j < n2.size(); j++) {
			System.out.println(n2.get(j));
		}
	}
}
