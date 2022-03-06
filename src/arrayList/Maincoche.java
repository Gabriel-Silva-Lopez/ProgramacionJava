package arrayList;

import java.util.ArrayList;

public class Maincoche {
	
	public static void main (String[]args) {
		ArrayList<Coche> c = new ArrayList<Coche>();
		
		Coche c1 = new Coche("9288404K", "Rojo", 4);
		Coche c2 = new Coche("2284928Y", "Verde", 2);
		Coche c3 = new Coche("34995893", "Plateado", 4);
		Coche c4 = new Coche("37088554", "Rojo", 4);
		//Añado los coches del array
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		//listo los coches
		for(int i = 0; i < c.size(); i++) {
			if(c.get(i).getColor().equalsIgnoreCase("Rojo") && c.get(i).getPuertas() == 4) {
				System.out.println(c.get(i).toString());
			}
		}
	}
}

