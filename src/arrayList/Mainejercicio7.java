package arrayList;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

public class Mainejercicio7 {

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
		for(int i = t.size()-1; i < t.size(); i--) {
			//muestro por pantalla
			System.out.println(t.get(i));
			if(i<1) {
				break;
			}
		}
	}
}
