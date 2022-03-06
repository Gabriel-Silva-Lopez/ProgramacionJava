package arrayList;
import java.util.ArrayList;

public class Mainejercicio1 {
	
	public static void main (String[]args) {
		
		ArrayList<Color> c = new ArrayList<Color>();
		
		Color c1 = new Color(0,"Rojo");
		Color c2 = new Color(1,"Naranja");
		Color c3 = new Color(2,"Amarillo");
		Color c4 = new Color(3,"Verde");
		Color c5 = new Color(4,"Azul");
		Color c6 = new Color(5,"Morado");
		Color c7 = new Color(6,"Negro");
		Color c8 = new Color(7,"Blanco");
		Color c9 = new Color(8,"Violeta");
		Color c10 = new Color(9,"Celeste");
		Color c11 = new Color(10,"Plateado");
		Color c12 = new Color(11,"Dorado");
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		c.add(c10);
		c.add(c11);
		c.add(c12);
		
		for(int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i).toString());
		}
		
		System.out.println("-------------\n\n");
		for(int i = 0; i < c.size(); i++) {
			if(i==c.size()-1) {
				System.out.println("La lista mide: " + i);	
			}
		}
	}

}
