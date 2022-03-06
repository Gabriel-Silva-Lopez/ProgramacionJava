package entornos1;

public class Div {

	/** Pre:
	 *  Post: Este metodo es el que realiza la funcion suma de la calculadora,
	 *  coge los dos numeros enviados desde el main y realiza el codigo dentro
	 *  de el.
	 */
	
	public static double div(double div1, double div2) {
		//creo una variable que almacene la multiplicacion de los numeros que metio el usuario
		double d;
		d = div1 / div2;
		//devuelvo la multiplicacion al metodo main
		return d;
	}
}
