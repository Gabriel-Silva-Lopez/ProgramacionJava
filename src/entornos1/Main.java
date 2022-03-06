package entornos1;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		//Abro un scanner
    	Scanner s = new Scanner (System.in);
    	//Bucle infinito para que el programa nunca acaba hasta que el usuario sea quien quiera acabarlo
        boolean bucle = true;
        while (bucle) {
        	//le escribo o explico al usuario que puede hacer con varias opciones con un println
        	System.out.println("------------------------------\n");
        	System.out.println("¿Qué desea realizar?\n");
        	System.out.println("1: Sumar \n2: Restar \n3: Multiplicar \n4: Dividir \n5: Apagar\n");
        	System.out.println("------------------------------\n");
        	int operacion;
        	/**Si scanner (entrada_del_programa) es igual o esta 
        	 * disponible como un entero vamos dentro de los if,
        	 * en caso contrario, le vuelvo a pedir al usuario una entrada
        	 */
        	if (s.hasNextInt()) {
        		operacion = s.nextInt();
        		/**almaceno la entrada del usuario como el numero de operacion
        		 * o el comando a ejecutar
        		 */
        		if(operacion>5 || operacion<1){
        			System.out.println("\nLa calculadora no dispone"
        					+ " de una funcion llamada = " + operacion + ", vuelve a intentarlo. \n");
            		/**Si, operacion es mayor a 5 o es menor a 1
            		 * no me lo almacenes, le vuelvo a pedir al usuario
            		 * una entrada que sea valida o una entrada que contenga
            		 * comandos/tareas que pueda realizar la calculadora
            		 */
    			}
        		while (operacion<=5 && operacion>=1) {
            		/**Si, operacion es menor a 5 o igual a 5, y ademas, es
            		 * mayor a 1 o igual a 1, almacena la entrada del usuario
            		 * como comando o funcion de la calculadora y ademas creo
            		 * dos variables doble  y se las pido al usuario dentro de 
            		 * los if(s.hasNextDouble)) para realizar la suma, resta,
            		 * division, etc.
            		 */
					if(operacion==5) {
						//Si, operacion es 5, deten todo el bucle y apaga la calculadora 
						bucle = false;
						s.close();
						break;
					}
        			System.out.println("\nIntroduzca los dos numeros para realizar la operación.\n");
        			System.out.println("\nIntroduzca el primer numero:");
        			double num1;
        			double num2;
        			if(s.hasNextDouble()) {
        				/**si num1 es un double o un int entro al if, 
        				 * de lo contrario vuelvo al comienzo y pido
        				 *  al usuario nuevamente que me diga la funcion
        				 *  que quiere que haga
        				 */
        				num1 = s.nextDouble();
    					System.out.println("\nIntroduzca el segundo numero:");
        				if(s.hasNextDouble()) {
            				/**si num2 es un double o un int entro al if, 
            				 * de lo contrario vuelvo al comienzo y pido
            				 *  al usuario nuevamente que me diga la funcion
            				 *  que quiere que haga
            				 */
        					num2 =s.nextDouble();
        					/**tomado los dos doubles, tomo el codigo/numero de que operacion
        					 * debo realizar a punta de if y else if, ejem: si operacion es
        					 * 1 quiero que ejecute el metodo sum
        					 */
        					if(operacion==1) {
        						// si operacion/funcion es 1 ejecute el metodo sum
        						double sumar = Sum.sum(num1, num2);
        						// envio los factores introducidos por el usuario al metodo sum
        						System.out.println("\nla suma es: " + sumar + "\n");
        					}
        					else if(operacion==2) {
        						// si operacion/funcion es 2 ejecute el metodo res
        						double restar = Res.res(num1, num2);
        						// envio los factores introducidos por el usuario al metodo res
        						System.out.println("\nla resta es: " + restar + "\n");
        					}
        					else if(operacion==3) {
        						// si operacion/funcion es  ejecute el metodo mul
        						double multiplicar = Mul.mul(num1, num2);
        						// envio los factores introducidos por el usuario al metodo mul
        						System.out.println("\nla multiplicacion es: " + multiplicar + "\n");
        					}
        					else if(operacion==4) {
        						// si operacion/funcion es 4 ejecute el metodo div
        						double dividir = Div.div(num1, num2);
        						// envio los factores introducidos por el usuario al metodo div
        						System.out.println("\nla division es: " + dividir + "\n");
        					}
        				} else {
        						/**Si el usuario no me mete un num2 decimal o entero para realizar operacion
        						 * le digo que solo se adminten los numeros reales que sean decimales o
        						 * enteros
        						 */
            					s.next();
        						System.out.println("\nSolo se admiten numeros enteros o decimales.\n");
        					}
        			} else {
						/**Si el usuario no me mete un num1 decimal o entero para realizar operacion
						 * le digo que solo se adminten los numeros reales que sean decimales o
						 * enteros
						 */
        					s.next();
        					System.out.println("\nSolo se admiten numeros enteros o decimales.\n");
        				}
        			//rompo el bucle while (operacion<=5 && operacion>=1) para volver a comenzar
        			//volvera a comenzar si se ingresa una letra, simbolo o caracter extraño.
        			break;
        			}
        	} else {
        		/**Si el usuario no me mete un simbolo o letra en la operacion
        		 * le devuelve el siguiente mensaje por pantalla y le pido un
        		 * nuevo valor de entrada que sea un entero
        		 * 
        		 */
        		s.next();
				System.out.println("\nSolo se admiten las funciones nombradas. \n");
        	}
        }
	}
}
