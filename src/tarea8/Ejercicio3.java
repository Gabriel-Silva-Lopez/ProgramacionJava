package tarea8;

public class Ejercicio3 {

	public static int[] estadisticastabla (int[] tabla){
		int mayoresacero = 0;
		int menoresacero = 0;
		int totalceros = 0;
		int pares = 0;
		int impares = 0;
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]>0) {
				mayoresacero++;
			} else if (tabla[i]<0){
				menoresacero++;
			} else {
				totalceros++;
			}
			if(tabla[i]%2==0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("total ceros: " + totalceros + " Mayores a cero: " + mayoresacero +
							" Menores a cero " + menoresacero + "\n");
		System.out.println("Pares: " + pares + " Impares: " + impares);
	return tabla;
}

	public static void main(String[] args) {
		int[] t = {5, 6, -9, -23, -7, 14, 0};
		estadisticastabla(t);
	}
}
