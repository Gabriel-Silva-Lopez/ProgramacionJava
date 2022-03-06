package entornos1;

public class Mul {

	/** Pre:
	 *  Post: Este metodo es el que realiza la funcion division de la calculadora,
	 *  coge los dos numeros enviados desde el main y realiza el codigo dentro
	 *  de el.
	 */
	
	public static double mul(double mul1, double mul2) {
		//creo una variable que almacene la multiplicacion de los numeros que metio el usuario
		double m;
		m = mul1 * mul2;
		//devuelvo la multiplicacion al metodo main
		return m;
	}
}
