package examenProgramacion;

public class Ejercicio2 {
	/**
	 * Enero:31 dias,Febrero:28 o 29 dias, marzo 31 dias, abril 30 dias, mayo 31 dias,
	 * junio 30 dias, julio 31 dias, agosto 31 dias, septiembre 30 dias, octubre 31, noviembre 30
	 * diciembre 31
	 * 
	 */
	
	/**
	 * Pre:---------
	 * Post:En este metodo me encargo de sacar los dias, meses y años
	 * como si fuera enteros
	 */
	
	public static void comprobarFechas(String[] t) {
		for(int i = 0; i < t.length; i++) {
			//creo un bucle para recorrer la tabla de strings
			/**remuevo lo que no me interesa de los strings con 
			 * strings replace y transformo los strings a ints
			 * 
			 */
			String dias = t[i].substring( 0, t[i].length() -8);
			//cuento la parte del string que solo me enseña los dias
			String meses=t[i].substring( 0, t[i].length() -5);
			//cojo la parte en la que me salen los meses
			String stringmeses1 = meses.replace("/","");
			//quito las / a los meses
			String stringmeses2 = stringmeses1.replace(dias, "");
			//quito los dias a los meses
			String fechames = stringmeses2;
			//ya tengo el mes en fechames
			String stringano3=t[i].substring( 0, t[i].length());
			//de ano quiero el principio y me toca coger todo el string
			String stringano4 = stringano3.replace(meses,"");
			//quito los meses al ano
			String stringano5 = stringano4.replace("/","");
			//quito las / y ya tendre el ano listo para transformar a Int
			String ano= stringano5;
			int diasmes = Integer.parseInt(dias);//transformo string dia a entero
			int mesesano = Integer.parseInt(fechames);//transformo fechames a entero
			int anos = Integer.parseInt(ano);//transformo ano a entero
			boolean cadena = esValido(diasmes, mesesano, anos);//envio la fecha y pido un boolean
			boolean bisiesto= esBisiesto(anos);//pido un boleann para comprobar si el año es bisiesto
			if (cadena==true) {
				//Si la fecha es posible envio OK
				//de lo contrario envio ERROR
				if (bisiesto==true) {
					System.out.println(t[i] + " --> OK Y el año es bisiesto ");
				} else {
					System.out.println(t[i] + " --> OK Y el año no es bisiesto ");
				}
			} else {
				System.out.println(t[i] + " -->ERROR ");
			}
		}
	}
	
	/**
	 * Pre:---------
	 * Post:En este metodo se sacan los meses y dias que son posibles y en caso
	 * de que sean posibles envio al boleano de comprobarfechas un true de lo
	 * contrario false
	 */
	

	private static boolean esValido(int dia, int mes, int ano) {
		//Me aseguro de que sea una fecha posible
		if (dia<=31 && mes<=12 && ano < 9999 && ano > 0000) {
			//si tiene mas de 31 dias el mes me aseguro que sea un mes de 31 dias
				if(dia==31) {
					if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
						return true;
					} else {
						return false;
					}
				}
				//si es febrero y tiene mas de 29 dias, eso no es posible y devuelvo false
				else if(mes==2 && dia>29){
					return false;
				} else {
					return true;
				}
			} else {
				return false;
			}
	}
	
	/**
	 * Pre: ---
	 * Post: devuelve [true] sí y solo sí el [ano] pasado como
	 * 		parámetro es bisiesto. En caso contrario, devuelve [false].
	 */
	private static boolean esBisiesto(int ano) {
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
			return true;
		else
			return false;
	}
	
	/**
	 * Pre:---------
	 * Post:Programa que me muestra los años en que pueden estar en nuestro calendario
	 * y metodo main se encarga de enviar los años que estan dentro de una tabla de string
	 */
	
	public static void main(String[] args) {
		String[] t = {"28/02/1995", "28/03/2010", 
				"32/12/1995", "02/01/2019", "29/02/2024"};
		comprobarFechas(t);
		//envio a comprobarfechas
	}
}
