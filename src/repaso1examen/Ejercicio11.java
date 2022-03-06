package repaso1examen;

public class Ejercicio11 {

	public static String[] ordenar(String[] t) {
		String almacen;
		for(int i = 0; i < t.length; i++) { 
			for (int j=i+1; j < t.length; j++) {
				if(t[i].length()>t[j].length()){
					almacen = t[i];
					t[i] = t[j];
					t[j] = almacen; 
				}
			}
		}
		return t;
	}
	
	public static void main(String[] args) {
		String[] nombres = {"Pepe","Juan","María","Antonio","Luisa","Alvaro","Rafael"};
		nombres = ordenar(nombres);
		for(int i = 0; i < nombres.length; i++) {
				if (i==nombres.length-2) {
					System.out.print("el segundo string más largo es: " + nombres[i] + " ");
				}
		}
	}
}
