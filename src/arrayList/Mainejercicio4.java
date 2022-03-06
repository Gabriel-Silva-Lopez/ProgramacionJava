package arrayList;

import java.util.ArrayList;

public class Mainejercicio4 {

	public static void main (String[]args) {
		
		ArrayList<String> te = new ArrayList<String>();
		System.out.println(te.isEmpty() + "\n");
		
		//añado 10 textos
		for(int i = 1; i <= 10; i++) {
			te.add("texto_sin_modificar " + i);
		}
		
		for(int i = 0; i < te.size(); i++) {
			if(i==6) {
				te.set(i, "texto_modificado 7");
			}
			
			System.out.println(te.get(i));
		}
	}
}
