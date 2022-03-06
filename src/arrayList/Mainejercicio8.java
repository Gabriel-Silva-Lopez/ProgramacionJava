package arrayList;

import java.util.ArrayList;

public class Mainejercicio8 {

	public static void main (String[]args) {
		
		ArrayList<String> t = new ArrayList<String>();
		System.out.println("¿tiene datos la lista?\n " + t.isEmpty() + "\n");
		
		//añado 10 textos
		for(int i = 1; i <= 9; i++) {
			t.add("texto"+i);
		}
		//invierto el arrayList
		/**otra forma posible seria:
		 *  Collections.sort(n, Comparator.reverseOrder());  
		 */
		for (int i = 0; i < 5; i++) {
				t.remove(0);
		}
		for(int j = 0; j < t.size(); j++) {
			System.out.println(t.get(j));
		}
	}
}
