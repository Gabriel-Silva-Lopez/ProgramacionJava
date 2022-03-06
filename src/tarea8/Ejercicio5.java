package tarea8;

public class Ejercicio5 {
	
	public static String[] mayorYmenor (String[] tabla){
		String almacen;
		for(int i = 0; i < tabla.length; i++) { 
			for (int j=i+1; j < tabla.length; j++) {
				if(tabla[i].length()>tabla[j].length()){
					almacen = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = almacen; 
				}
			}
		}
		return tabla;
	}

	public static void main(String[] args) {
		String[] t = {"Hola", "Adios", "que tal?", "Supercalifragilisticoespialidoso", "Hey"};
		System.out.print("De los Strings: \n");
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + "\n");
		}
		t=mayorYmenor(t);
		for(int j = 0; j < t.length; j++) {
			if (j==t.length-1) {
				System.out.print("\n\nel string más largo es: " + t[j] + " ");
			}
			if (j==0) {
				System.out.print("\nel string más corto es: " + t[j] + " ");
			}
		}
	}
}
