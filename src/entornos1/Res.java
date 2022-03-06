package entornos1;

public class Res {

	/** Pre:
	 *  Post: Este metodo es el que realiza la funcion resta de la calculadora,
	 *  coge los dos numeros enviados desde el main y realiza el codigo dentro
	 *  de el.
	 */
	
	public static double res(double res1, double res2) {
		//creo una variable que almacene la resta de los numeros que metio el usuario
		double r;
		r = res1 - res2;
		//devuelvo la resta al metodo main
		return r;
	}
}
