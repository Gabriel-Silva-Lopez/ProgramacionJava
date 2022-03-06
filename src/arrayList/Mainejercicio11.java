package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Mainejercicio11 {
	
	public static void main (String[]args) {
		ArrayList<Character> t = new ArrayList<Character>();
		t.add('q');
		t.add('w');
		t.add('e');
		t.add('r');
		t.add('t');
		t.add('y');
		t.add('u');
		t.add('i');
		t.add('o');
		t.add('p');
		t.add('a');
		t.add('s');
		t.add('d');
		t.add('f');
		t.add('g');
		t.add('h');
		t.add('j');
		t.add('k');
		t.add('l');
		t.add('z');
		t.add('x');
		t.add('c');
		t.add('v');
		t.add('b');
		t.add('n');
		t.add('m');
		//ordeno alfabeticamente
		Collections.sort(t);
		for(int i = 0; i < t.size(); i++) {
			System.out.print(t.get(i) + " ");
		}
	}
}
