package tarea6;

public class Ejercicio2 {

	public static void main(String [] args) {
		String coza = "Coza";
		String loza = "Loza";
		String woza = "Woza";
		for(int x = 1; x < 111; x++) {
			
			if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
				x++;
				System.out.print(coza + loza + woza + " ");
			}
			else if (x % 3 == 0 && x % 5 == 0) {
				x++;
				System.out.print(coza + loza + " ");
			}
			else if (x % 3 == 0 && x % 7 == 0) {
				x++;
				System.out.print(coza + woza + " ");
			}
			else if (x % 3 == 0) {
				x++;
				System.out.print(coza + " ");
			}
			else if (x % 5 == 0) {
				x++;
				System.out.print(loza + " ");
			}
			else if (x % 7 == 0) {
				x++;
				System.out.print(woza + " ");
			}else {
				System.out.print(x + " ");
			}
		}
	}
}
