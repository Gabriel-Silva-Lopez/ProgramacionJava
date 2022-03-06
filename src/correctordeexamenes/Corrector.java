package correctordeexamenes;

import java.util.Scanner;

public class Corrector {
	
	/** Pre:
	 *  Post: Con las comparaciones ya hechas del examen del alumno y el examen con
	 *  las respuestas correctas, le doy las respuestas correctas y el porjentaje
	 *   de respuestas correctas en este metodo del examen
	 */
	
	public static int[] sacarmedia (int[] tabla, int l){
		int aciertos = 0;
		//creo la variable aciertos
		for(int i = 0; i < tabla.length; i++) {
			//recorro la tabla con un bucle for
			if (tabla[i]==1) {
				//incremento el valor de aciertos si es igual a 1 el campo de la tabla
				aciertos++;
			}
		}
		float calculo = (aciertos * 100);
		//creo la cantidad que tiene que dividirse para sacar el porcentaje
			System.out.println("se ha acertado " + aciertos + " de " + l + " preguntas." +
					"\n El porcentaje de aciertos del alumno es " + (calculo/l) + "%\n");
			/** Muestro por pantalla los aciertos del usuario y el porcentaje del total de
			 * respuestas correctas que tiene en el examen
			 */
		return tabla;
	}
	
	/** Pre:
	 *  Post: Metodo que me comparar las respuestas del examen del alumno y el correcto
	 *  para sacar las respuestas correctas que tiene el alumno y despues enviarlas al 
	 *  metodo sacarmedia
	 */
			
	public static int[] comparar (int[]tabla, int[]tabla2, int l) {
		/**
		 * creo una tabla de resultado para comparar la tabla del alumno y
		 * la de respuestas correctas
		 */
		int[] resultado = new int [l];
		/**recorro las tablas con un bucle for y pregunto si la respuesta
		 * del campo i de una es igual a la otra
		 */
		for(int i = 0; i < l; i++) {
			if(tabla[i]==tabla2[i]) {
				/**si respuesta i de tabla alumnos es igual a respuesta i de tabla correctas
				 * almaceno dentro de la tabla resultados 1 punto.
				 */
				resultado[i] = 1;
			} else {
				/**En caso de que respuesta i de la tabla alumnos no sea igual a la respuesta i de tabla
				 * correctas almaceno dentro de la tabla resultado 0 puntos.
				 */
				resultado[i] = 0;
			}
		}
		/**Envio el resultado y la longitud de la del examen del alumno al metodo
		 * que me sacara la media del examen y las respuestas correctas del alumno
		 */
		sacarmedia(resultado, l);
		return resultado;
	}
	
	/** Pre:
	 *  Post: Metodo que me pide las respuestas del alumno en un examen
	 *  y toma de referencia la tabla de respuestas correctas y su
	 *  longitud para funcionar correctamente
	 */
	
	public static int respuestasalumno (int[] tabla, int longi, int m, int contador) {
		Scanner s = new Scanner (System.in);
		/**creo un bucle infinito para que el programa no se acabe
		 * en caso de que el usuario inserte un valor que no es
		 * compatible con las entradas que pide el programa
		 */	
        boolean bucle2 = true;
        	while (bucle2) {
        		/**creo una nueva tabla para almacenar
        		 * las respuestas del examen del estudiante
        		 */
                		int[] t2 =  new int [longi];
                		/**creo un bucle for para dar valor a las
                		 * respuestas hechas por el alumno 1 por 1
                		 */
                		for(int i = 0; i < t2.length; i++) {
                			System.out.println("\nIntroduzca la respuesta hecha a la pregunta "
                					+ (i+1) + ":");
                			//Creo la variable valor y le dare valor despues del if
                			int valor;
            				if(s.hasNextInt()) {
                        		/** si la entrada es igual a un entero
                        		 * entro al if y ejecuto el codigo
                        		 */
            					valor = s.nextInt();
            					t2[i]= valor;
            				} else {
                    			/** si valor no es igual a un entero
                    			 * vuelvo a pedir la respuesta hecha
                    			 * en el examen y le digo al bucle for
                    			 * que no se vaya a la siguiente pregunta
                    			 */
            					i--;
            		    		s.next();
            					System.out.println("\nSolo se admiten numeros enteros");
            				}
                		}
                		comparar(tabla, t2, longi);
                		/**creo una variable de tipo char para pedir al
                		 * usuario un caracter ( Y o N).
                		 */
                		char solicitud;
                		System.out.println("\ndesea corregir otro examen despues de este? \nResponda: [Y/N]");
                		/**le digo al programa que el char es igual a la
                		 * entrada del usuario, si no es un char o el valor
                		 * del char no es Y para si, o N para no, le volvera
                		 * a preguntar que si corregira otro examen o no
                		 */
                		if (s.hasNextLine()) {
                			solicitud=s.next().charAt(0);
                			/**Si el char del usuario es igual a y o Y,
                			 * entro al if y ejecutame el codigo
                			 */
                			if (solicitud=='y' || solicitud=='Y') {
                				bucle2 = true;
                			}
        			/**en caso de que el char del usuario es igual
        			 * a n o N, entro al else if y ejecutame el codigo
        			 */
                			else if(solicitud=='n'|| solicitud=='N') {
                				bucle2 = false;
                				s.close();
                				break;
                			} 
                	} else {
                		s.nextLine().charAt(0);
                		System.out.println("\nResponda: [Y/N]");
   		    		
    			}
        	}
        	return m;
	}
	
	/** Pre:
	 *  Post: Este metodo es el main y es el que se carga al inciar el programa,
	 *  primero lo que hace es pedir al usuario la cantidad de preguntas que
	 *  tiene el examen, despues le pedira la respuesta correctas en numero
	 *  para enviarla al metodo que contiene la respuestas de los alumnos y
	 *  compararlas
	 */
		
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		/**creo un bucle infinito para que el programa no se acabe
		 * en caso de que el usuario inserte un valor que no es
		 * compatible con las entradas que pide el programa
		 */
        boolean bucle = true;
        while (bucle) {
		 System.out.println("\nIntroduzca la cantidad de preguntas que tiene el examen");
		 int longitud;
		/**Creo una variable que se almacenara como entero
		 * dentro del if que sigue y pido al usuario una
		 * entrada para saber la cantidad de preguntas que
		 * tiene el examen
		 * 
		 */
		 if(s.hasNextInt()) {
			longitud =s.nextInt();
			/**
			 * creo la tabla 1, que sera la que contenga las
			 * respuestas correctas del examen
			 */
			int[] t =  new int [longitud];
			/**
			 * creo un bucle for para que el usuario vaya
			 * introduciendo las respuestas correctas de cada
			 * pregunta en numero entero
			 */
			int mediaclase = 0;
			int contadordeexamenes=1;
			for(int i = 0; i < t.length; i++) {
				System.out.println("\nIntroduzca la respuesta correctas a la pregunta " + (i+1) + ":");
				int valorcorrec;
				/**creo una variable valor de las correctas
				 * y en el if siguiente pido que el examen
				 * tipo test tiene que las respuestas tienen
				 * que ser en numero entero
				 */
				if(s.hasNextInt()) {
					valorcorrec = s.nextInt();
					//columna i de la tabla es igual a entrada del usuario.
					t[i]= valorcorrec;
				} else {
					/** en caso de que las respuestas no
					 * sean en numeros enteros vuelvo a
					 * pedir al usuario una entrada y i--
					 * para que el bucle no avance a la
					 * siguiente pregunta
					 */
		    		s.next();
		    		i--;
					System.out.println("\nSolo se admiten numeros enteros");
				}
			}
			/**
			 * envio las respuestas del examen y su longitud
			 * al metodo respuestas almnos para que este las
			 * compare y vea las respuestas correctas del
			 * alumno
			 */
		respuestasalumno(t, longitud, mediaclase, contadordeexamenes);
		s.close();
		//ciero las entradas, ya  que no se volveran a pedir en este metodo
		} else {
			/**
			 * La cantidad de preguntas en un examen tiene que
			 * ser si o si en numeros, por lo que,  si el usuario
			 * inserta un dato que no sea numero en la longitud
			 * que tiene el examen, este le volvera a pedir una
			 * entrada
			 */
    		s.next();
			System.out.println("\nSolo se admiten numeros enteros");
		}
			/**cierro el bucle porque ya no lo necesito,
			 * debido a que el usuario ya ha de haber insertado
			 * todas las respuestas y el bucle estorba.
			 */
		 break;
		}
	}
}

