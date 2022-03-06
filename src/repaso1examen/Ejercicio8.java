package repaso1examen;

public class Ejercicio8 {

	public static void main(String[] args) {
	    int decimalInicial = 8;
	    // de decimal a binario
	    String binario = Integer.toBinaryString(decimalInicial);
	    // de binario a decimal
	    int decimalConvertido = Integer.parseInt(binario, 2);
	    
	    System.out.println("el decimal de " + binario + " es " + decimalConvertido); // 8
	    System.out.println("\nel binario de " + decimalConvertido + " es " + binario); // 1000
	}
}
