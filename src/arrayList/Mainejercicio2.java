package arrayList;
import java.util.ArrayList;

public class Mainejercicio2 {
	
	public static void main (String[]args) {
		ArrayList<String> t = new ArrayList<String>();
		
		//a�ado 10 textos
		for(int i = 1; i <= 10; i++) {
			t.add("Texto" + i);
		}
		
		t.add(0, "Texto" + 0);
		
		// mostrar textos
		for(String texto : t) {
			System.out.println(texto);
			}
		
	}

}
