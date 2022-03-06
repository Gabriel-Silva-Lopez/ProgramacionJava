package entornos1;

public class Sum {

	/** Pre:
	 *  Post: Este metodo es el que realiza la funcion suma de la calculadora,
	 *  coge los dos numeros enviados desde el main y realiza el codigo dentro
	 *  de el.
	 */
	
	public static double sum(double sum1, double sum2) {
		//creo una variable que almacene la suma de los numeros que metio el usuario
		double s;
		s = sum1 + sum2;
		//devuelvo la suma al metodo main
		return s;
	}
}
