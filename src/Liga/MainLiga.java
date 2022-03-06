package Liga;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainLiga {
	
	/**
	 * Pre:  ---
	 * Post: Este metodo crear las ligas que uno desea tener
	 */
	public static Liga[] crearLigas() {
		// int con el numero de ligas que quiero
		int numdLigas = 1;
		//Creame una nueva liga o las nuevas ligas que quiero
		Liga[] l = new Liga[numdLigas];
		//Creo el string para dar nombre a la liga
		String nombreLiga;
		//bucle para recorrer todas las ligas que tengo y darles nombre y equipos con jugadores
		for(int i = 0; i < l.length;i++) {
			//String del nombre de la liga sera = al return del metodo NomLiga
			nombreLiga = nomLiga();
			//l[x] = "(Ponemos nombre a la liga x, llamar metodo crear la clasificacion/equipos());"
			l[i] = new Liga(nombreLiga,crearEquipos());
		}
		return l;
		
	}
	
	/**
	 * Pre:  ---
	 * Post: Este metodo crea los 15 equipos para cada liga
	 */
	public static Equipo[] crearEquipos() {
		//15 nuevos equipos
		Equipo[] e = new Equipo[15];
		//datos de los equipos > nombre, estadio, fundacion, partidos G, partidos P, partidos E, etc.
		String nombre;
		String estadio;
		int fundacion;
		int puntos;
		int partidosGanados;
		int partidosPerdidos;
		int partidosEmpatados;
		int equipoGoles = 0;
		//Nombre de los equipos
		String[] equipoNom = new String[] {"Real Madrid","Atletico de Madrid","Valencia Club",
				"Barcelona Club","Real Betis","Real Zaragoza","Rayo Vallecano","Sevilla Club",
				"Cadiz Club","PSG","Stade Brestois","Liverpool Club","Inter","Lens","Montpellier"};
		//Nombre de los estadios
		String[] estadioNom = new String[] {"Santiago Bernabéu","Wanda Metropolitano","Mestalla Valencia CF",
				"Camp Nou","Benito Villamarín","La Romadera","Vallecas","Ramón Sánchez-Pizjuán",
				"Nuevo Mirandilla","Parque de los Príncipes","Francis-Le Blé","Anfield","San Siro",
				"Bollaert-Delelis","Mosson"};
		//creo un bucle para meter datos a cada equipo y llamar al metodo Crearjugadores de cada equipo
		for(int i = 0; i < e.length; i++) {
			//Crear los jugadores del equipo i(numero del equipo)
			Jugador[] jugadores = crearJugadores(i);
			//Le asigno un nombre a cada equipo de la liga con equipoNom[i]
			nombre = equipoNom[i];
			//Le asigno un estadio a cada equipo de la liga con estadioNom[i]
			estadio = estadioNom[i];
			//Le doy un fecha de fundacion con math.random entre 1800-2000, incluyendo el 2000
			fundacion = (int)(Math.random()*(1800-2000+1)+2000);
			//puntos entre 1000 y 0
			puntos = (int)(Math.random()*1000);
			//Saco los partidos G, P y E con math.random
			//partidos ganados entre 10000-1000
			partidosGanados = (int)(Math.random()*10000+1000);
			//partidos perdidos entre los ganados y 1000
			partidosPerdidos = (int)(Math.random()*(partidosGanados-1000));
			//partidos empatados entre gandos y perdidos
			partidosEmpatados = (int)(Math.random()*(partidosGanados-partidosPerdidos));
			/*Le doy a los equipos sus goles correspondientes, sumando los goles de los jugadores
			 * de ese equipo
			 */
			for(int j = 0; j < jugadores.length; j++) {	
				equipoGoles = equipoGoles + jugadores[j].getGoles();
			}
			//Relleno los nuevo equipo creados con los datos obtenidos
			e[i] = new Equipo(nombre,estadio,fundacion,jugadores,puntos,partidosGanados,partidosPerdidos,
					partidosEmpatados, equipoGoles);
		}
		//devuelvo la tabla de equipos o la clasificacion
		return e;
	}
	
	/**
	 * Pre:  ---
	 * Post: Este metodo es para Crear los 11 jugadores para cada equipo
	 */
	public static Jugador[] crearJugadores(int nEquipo) {
		//11 jugador por equipo
		Jugador[] jugadores = new Jugador[11]; 
		//datos de los jugadores: Nombre, dorsal, goles tarjetas,etc...
		String nombre = "";
		int dorsal = 0;
		int goles = 0;
		int tarjetasrojas = 0;
		int tarjetasamarillas = 0;
		for(int i = 0; i < jugadores.length; i++) {
			//creo un nombre aleatorio para cada jugador llamando al metodo Nomjuga
			nombre = nomJuga() + " ";
			//Creo un dorsal para cada jugador con math random entre 0 y 99
			dorsal = (int)(Math.random()*99+1);
			/* El jugador con mas goles en la historia tiene 805 goles, por lo que creare
			 * para cada jugador un total de goles entre 0 y 805
			 */
			goles = (int)(Math.random()*805); 
			// El jugador con mas tarjetas rojas de la historia tiene 46 rojas
			tarjetasrojas = (int)(Math.random()*46);
			// El jugador con mas tarjetas amarillas de la historia tiene 187 amarillas
			tarjetasamarillas = (int)(Math.random()*187);
			//Le inserto los datos al jugador numero i
			jugadores[i] = new Jugador(nombre,dorsal,goles,tarjetasrojas,tarjetasamarillas);
		}
		//devuelvo los objetos jugadores a su equipo correspondiente
		return jugadores;
	}
	
	/**
	 * Pre:  ---
	 * Post: Este metodo le concede un nombre a una liga
	 */
	public static String nomLiga() {
		String nLigas = "";
		//Generador de nombres para ligas
		String[] LigasNom = new String[] {"Seria A","Pro league","Champion League","Eurocopa","Euroleague",
				"UCL","Copa del Rey","Copa America","Premier league","Bundesliga"};
		//solo genera un String por liga
		for(int i = 0; i < 1; i++) {
			//dame un String de la tabla LigasNom para darsela como nombre a la liga
			 nLigas  =  nLigas + LigasNom[(int) (Math.random()*LigasNom.length)];
		}
		//devuelvo el nombre a liga
		return nLigas;
	}
	
	/**
	 * Pre:  ---
	 * Post: Este metodo le concede un nombre a un jugador
	 */
	public static String nomJuga() {
		//Nombre jugadors
		String nJuga = "";
		//Generador de nombres jugadores
		String[] miembros = new String[] {"Alan","Jose","Martin","Luis","Carlos","Sergio","Daniel",
				"David","Pablo","Elias","Pedro","Camilo","Rafael","Alvaro","Erik","Gabriel","Gregorio",
				"Mateo","Oliver","Fernando","Lucas","Javier","Nacho","Adrian","Alejandro"};
		//Primer apellido
		String[] miembrosape = new String[] {"Gónzales","Gómez","Díaz","Rodríguez","Fernandez",
				"López","Muñoz","Garcia","Silva","Perez","Flores","Sanchez","Ruiz","Sosa","Cruz",
				"Benitez","Romero","Martinez","Hernández","Morales","Castro","Pizarro","Velázquez",
				"Ramirez","Castillos"};
		//Segundo Apellido
		String[] miembrosape2 = new String[] {"Pontes","Rivera","Bravo","Campos","Molina",
				"Sandoval","Alarcón","Cárdenas","Miranda","Ortiz","Yela","Salazar","Guzmán","Navarro",
				"Escobar","Palma","Morenos","Sáenz","Mendoza","Chillán","Jara","Jiménez","Aguilar",
				"Luna","Palacios"};
		//Entro a generar un nombre para el jugador
		for(int i = 0; i < 1; i++) {
			/*nombre jugador = String aleatorio de array miembros +
			 * String aleatorio de array miembrosapellidos1 + 
			 * String aleatorio de array miembrosapellidos2
			 */
	        nJuga  =  nJuga + miembros[(int) (Math.random()*miembros.length)]
	        		+ " " + miembrosape[(int) (Math.random()*miembrosape.length)] + 
	        		 " " + miembrosape2[(int) (Math.random()*miembrosape2.length)];
	    }
		//devuelvo nombre juga
		return nJuga;
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo el cual muestra una lista de jugadores ordenados en otro metodo
	 */
	public static void jugadoresPrint(Jugador[] j, int maximojuga) {
		//recorro los jugadres de la tabla con un bucle
		for(int i = 0; i < maximojuga; i++) {
			//imprimo a cada jugador y sus datos
			System.out.println("\n\n  jugador " + (i+1) + "\n");
			System.out.println("    Nombre: " + j[i].getNombre());
			System.out.println("    Dorsal: " + j[i].getDorsal());
			System.out.println("    Goles: " + j[i].getGoles());
			System.out.println("    Tarjetas Amarillas: " + j[i].getTarjetasamarillas());
			System.out.println("    Tarjetas Rojas: " + j[i].getTarjetasrojas());
		}
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo el cual muestra una tabla de equipos ordenada en otro metodo
	 */
	public static void equiposPrint(Equipo[] equiposPrint, int maximoEquipo) {
		//bucle para imprimir por pantalla al equipo y datos
		for(int i = 0; i < maximoEquipo; i++) {
			System.out.println("\n\n  Equipo " + (i+1) + "\n");
			System.out.println("    Nombre: " + equiposPrint[i].getNombre());
			System.out.println("    Estadio: " + equiposPrint[i].getEstadio());
			System.out.println("    Fundacion: " + equiposPrint[i].getFundacion());
			System.out.println("    Partidos Ganados: " + equiposPrint[i].getPartidosGanados());
			System.out.println("    Partidos Perdidos: " + equiposPrint[i].getPartidosPerdidos());
			System.out.println("    Partidos Empatados: " + equiposPrint[i].getPartidosEmpatados());
			System.out.println("    Puntos: " + equiposPrint[i].getPuntos());
			System.out.println("    Goles: " + equiposPrint[i].getEquipoGoles());
		}
		
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo el cual muestra una tabla de las ligas existentes completa.
	 */
	public static void ligaCompleta(Liga[] l) {
		System.out.println("================================================Ligas================================================");
		//imprimir por pantalla las ligas
		for(int i = 0; i < l.length; i++) {
			//Datos liga i
			System.out.println("\n" + l[i].getNombre());
			System.out.println("==========================================================");
			//Metemos a los equipos en la clasificacion de la liga
			Equipo[] e = l[i].getClasificacion();
			System.out.println("||                   ====Equipos====                    ||");
			//bucle para mostrar a los equipos por pantalla
			for(int j = 0; j < e.length; j++) {
				//datos equipo j
				System.out.println("==========================================================");
				System.out.println("\nEquipo " + (j+1) + "==================================================");
				System.out.println("    Nombre:" + e[j].getNombre());
				System.out.println("    Fundacion: " + e[j].getFundacion());
				System.out.println("    Estadio: " + e[j].getEstadio());
				System.out.println("      Partidos Ganados: " + e[j].getPartidosGanados());
				System.out.println("      Partidos Perdidos: " + e[j].getPartidosPerdidos());
				System.out.println("      Partidos Empatados: " + e[j].getPartidosEmpatados());
				System.out.println("      Puntos: " + e[j].getPuntos());
				System.out.println("      Goles: " + e[j].getEquipoGoles() + "\n");
				System.out.println("      ==========Jugadores==========      \n");
				//Meto a los jugadores dentro de un equipo
				Jugador[] jugadores = e[j].getJugadores();
				//bucle para mostrar a los jugadores por equipo
				for(int k = 0; k < jugadores.length; k++) {
					//datos jugador k
					System.out.println("        Jugador " + (k+1) + ":");
					System.out.println("           Nombre: " + jugadores[k].getNombre());
					System.out.println("           Dorsal: " + jugadores[k].getDorsal());
					System.out.println("           Goles: " + jugadores[k].getGoles());
					System.out.println("           Tarjetas rojas: " + jugadores[k].getTarjetasrojas());
					System.out.println("           Tarjetas amarillas: " + jugadores[k].getTarjetasamarillas() + "\n");
				}
				System.out.println("      =============================      \n");
			}
		}
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo el cual ordena a los equipos por goles
	 */
	public static Equipo[] equipoGoles(Liga[] l) {
		clasificacion(l);
		//almacen equipos goleadores
		int almacentemporal;
		Equipo[] almacen = null;
		//recorro a los jugadores de la clasificacion
		for(int i = 0; i < l.length; i++) {
			//11 equipos en total
			Equipo[] e = l[i].getClasificacion();
			//goles de todos los equipos
			Integer [] golesdeEQ = new Integer[e.length]; 
			for(int j = 0; j < e.length; j++) {
				//guardo los goles de todos los equipos de la liga
				golesdeEQ[j] = e[j].getEquipoGoles();
			}
			//Reorganizo los goles en el metodo ordenaDatos()
			golesdeEQ = ordenarDatos(golesdeEQ);
			//Reordenar tabla equipos por goles
			for(int j = 0; j < e.length; j++) {
				for(int k = j + 1; k < e.length; k++) {
					//Si Goles j tiene los mismos goles que el equipo k
					if(golesdeEQ[j] == e[k].getEquipoGoles()) {
						//almacena los goles del equipo j en almacentemporal
						almacentemporal = e[j].getEquipoGoles();
						//Cambio el orden
						//e[j] = e[k]
						e[j].setEquipoGoles(e[k].getEquipoGoles());
						//e[k] = almacentemporal
						e[k].setEquipoGoles(almacentemporal);
					}
				}
			}
			//clasificame los equipos de la liga por goles [equipo mejores goleadores = equipos]
			almacen = e;
		}
		//devuelveme la clasificacion
	return almacen;		
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo el cual le entrega a los equipos con mas puntos como mas goleadores
	 */
	public static Equipo[] equipoGoles2(Liga[] l) {
		//almacen equipos goleadores
		int almacentemporal;
		Equipo[] almacen = null;
		//recorro a los jugadores de la clasificacion
		for(int i = 0; i < l.length; i++) {
			//11 equipos en total
			Equipo[] e = l[i].getClasificacion();
			//goles de todos los equipos
			Integer [] golesdeEQ = new Integer[e.length]; 
			for(int j = 0; j < e.length; j++) {
				//guardo los goles de todos los equipos de la liga
				golesdeEQ[j] = e[j].getEquipoGoles();
			}
			//Reorganizo los goles en el metodo ordenaDatos()
			golesdeEQ = ordenarDatos(golesdeEQ);
			//Reordenar tabla equipos por goles
			for(int j = 0; j < e.length; j++) {
				for(int k = j + 1; k < e.length; k++) {
					//Si Goles j tiene los mismos goles que el equipo k
					if(golesdeEQ[j] == e[k].getEquipoGoles()) {
						//almacena los goles del equipo j en almacentemporal
						almacentemporal = e[j].getEquipoGoles();
						//Cambio el orden
						//e[j] = e[k]
						e[j].setEquipoGoles(e[k].getEquipoGoles());
						//e[k] = almacentemporal
						e[k].setEquipoGoles(almacentemporal);
					}
				}
			}
			//clasificame los equipos de la liga por goles [equipo mejores goleadores = equipos]
			almacen = e;
		}
		//devuelveme la clasificacion
	return almacen;		
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo que devuelve los 5 jugadores con mas expulsiones
	 */
	public static Jugador[] jugadoresExpulsiones(Liga[] l) {
		//almacen temporal
		int almacentemporal;
		int sumador = 0;
		//Creo 5 Objetos de tipo jugador para visualizar los 5 jugadores para almacenar los con mas expulsiones
		Jugador[] jugadoresExpulsiones = new Jugador[5];
		for(int i = 0; i < l.length; i++) {
			////Almaceno los equipos de la liga
			Equipo[] e = l[i].getClasificacion();
			//Creo un Almacen de jugadores totales por liga o equipos
			Jugador[] totalJugadores = new Jugador[(e.length*(e[i].getJugadores().length))];
			//recorro a los equipos con un bucle
			for(int j = 0; j < e.length; j++) {	
				//recorre a los jugadores de cada equipo
				for(int k = 0; k < e[j].getJugadores().length; k++) {
					//pido los jugadores de cada equipo
					Jugador[] almacenExpulsiones = e[j].getJugadores();
					//almaceno a cada jugador de todos los equipos
					totalJugadores[k + sumador] = almacenExpulsiones[k];
					if(k == ((e[j].getJugadores().length)-1)) {
						//sumador = tabla de jugadores
						sumador = sumador + e[j].getJugadores().length;
						//if para que no pete el programa
					}
				}
			}
			Integer [] expulsiones = new Integer[totalJugadores.length]; 
			for(int j = 0; j < totalJugadores.length; j++) {
				//Las tarjetas rojas significan la expulsion del jugador
				expulsiones[j] = totalJugadores[j].getTarjetasrojas();
			}
			//ordenar expulsiones
			expulsiones = ordenarDatos(expulsiones);
			//recorro todos los jugadores de la liga y expulsiones y las reorganizo
			for(int j = 0; j < totalJugadores.length; j++) {
				for(int k = j + 1; k < totalJugadores.length; k++) {
					//Si Goles j tiene los mismos goles que el jugador k
					if(expulsiones[j] == totalJugadores[k].getTarjetasrojas()) {
						//almacentemporal = jugador[j]
						almacentemporal = totalJugadores[j].getTarjetasrojas();
						//Jugador[j] = Jugador[k]
						totalJugadores[j].setTarjetasrojas(totalJugadores[k].getTarjetasrojas());
						//jugador[k] = almacentemporal
						totalJugadores[k].setTarjetasrojas(almacentemporal);
					}
				}
			}
			//clasificame los jugadores de la liga por expulsiones [jugadores con mas expuls = jugadores totales]
			jugadoresExpulsiones = totalJugadores;
		}
		System.out.println("\n==========================================================");
		System.out.println("||           ====Jugadores mas expulsados====           ||");
		System.out.println("==========================================================");
		//devuelveme una clasificacion de los jugadores mas expulsados
		return jugadoresExpulsiones;
	}
	
	/**
	 * Pre:  ---
	 * Post: Este metodo devuelve los 5 jugadores con mas goles
	 */
	public static Jugador[] jugadoresGolers(Liga[] l) {
		//almacen temporal
		int almacentemporal;
		int sumador = 0;
		//Creo 5 Objetos de tipo jugador para visualizar los 5 jugadores mas goleadores
		Jugador[] jugadoresGoleadores = new Jugador[5];
		for(int i = 0; i < l.length; i++) {
			//Almaceno los equipos de la liga
			Equipo[] e = l[i].getClasificacion();
			//Creo un Almacen de jugadores totales por liga o equipos
			Jugador[] totalJugadores = new Jugador[(e.length*(e[i].getJugadores().length))];
			//recorro a los equipos con un bucle
			for(int j = 0; j < e.length; j++) {	
				//recorre a los jugadores de cada equipo
				for(int k = 0; k < e[j].getJugadores().length; k++) {
					//pido los jugadores de cada equipo
					Jugador[] almacenjugadoresconsusgoles = e[j].getJugadores();
					//almaceno a cada jugador de todos los equipos o los recorro
					totalJugadores[k + sumador] = almacenjugadoresconsusgoles[k];
					if(k == ((e[j].getJugadores().length)-1)) {
						//sumador = tabla de jugadores
						sumador = sumador + e[j].getJugadores().length; 
						//if para que no pete el programa
					}
				}
			}
			//Creo un array para almacenar los goles de cada jugador
			Integer [] goles = new Integer[totalJugadores.length]; 
			//bucle para recorrer todos los jugadores de la liga
			for(int j = 0; j < totalJugadores.length; j++) {
				// array goles es igual a Conseguir los goles de cada jugador dentro del array totalJuga
				goles[j] = totalJugadores[j].getGoles();
			}
			//ordenar goles
			goles = ordenarDatos(goles);
			//recorro todos los jugadores de la liga y sus goles y los reorganizo
			for(int j = 0; j < totalJugadores.length; j++) {
				for(int k = j + 1; k < totalJugadores.length; k++) {
					//Si Goles j tiene los mismos goles que el jugador k
					if(goles[j] == totalJugadores[k].getGoles()) {
						//almacentemporal = jugador[j]
						almacentemporal = totalJugadores[j].getGoles();  
						//jugador[j] = jugador[k]
						totalJugadores[j].setGoles(totalJugadores[k].getGoles());
						//jugador[k] = almacentemporal
						totalJugadores[k].setGoles(almacentemporal);
					}
				}
			}
			//clasificame los jugadores de la liga por goles [jugadores mejores goleadores = jugadores totales]
			jugadoresGoleadores = totalJugadores;
		}
		System.out.println("\n==========================================================");
		System.out.println("||           ====Jugadores mas goleadores====           ||");
		System.out.println("==========================================================");
		//devuelveme una clasificacion de los jugadores mas goleadores
		return jugadoresGoleadores;
	}
	
	/**
	 * Pre:  ---
	 * Post: Dicho metodo muestra la clasificacion de los equipos
	 * 		 ordenados por puntos.
	 */
	public static Equipo[] clasificacion(Liga[] l) {
		//equipo con mas puntos tendran más goles
		equipoGoles2(l);
		//almacenes
		int almacentemporal;
		Equipo[] almacen = null;
		//recorro la liga
		for(int i = 0; i < l.length; i++) {
			//obtengo los equipos de la liga
			Equipo[] e = l[i].getClasificacion();
			//puntos es igual a nuevo Array de enteros del mismo tamaño que los equipos
			Integer [] puntos = new Integer[e.length]; 
			//recorro a los equipos
			for(int j = 0; j < e.length; j++) {
				//consigo los puntos de cada equipo y almaceno en puntos[]
				puntos[j] = e[j].getPuntos();
			}
			//ordeno los puntos
			puntos = ordenarDatos(puntos);
			//Reordenar tabla equipos por puntos
			for(int j = 0; j < e.length; j++) {
				for(int k = j + 1; k < e.length; k++) {
					//Si Puntos j tiene los mismos puntos que el equipo k
					if(puntos[j] == e[k].getPuntos()) {
						//almacena los puntos del equipo j en almacentemporal
						almacentemporal = e[j].getPuntos();
						//Cambio el orden
						//e[j] = e[k]
						e[j].setPuntos(e[k].getPuntos());
						//e[k] = almacentemporal
						e[k].setPuntos(almacentemporal);
					}
				}
			}
			almacen = e;
		}
		return almacen;		
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo el cual ordena una tabla de datos de enteros de forma reversa [desendiendo]
	 */
	public static Integer[] ordenarDatos(Integer t[]) {
		//Ordena los numeros en order reverso (forma descendiente)
		Arrays.sort(t, Comparator.reverseOrder());
		//devuelveme la tabla reordenada
		return t;
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo Main con un menu en que el usuario puede elegir que funcion desea ejecutar
	 * y esta sera llama en uno de los metodos de la clase
	 */
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		Liga[] l = crearLigas();
		int operacion;
		boolean bucle = true;
		while(bucle==true) {
			//imprimo menu
			 System.out.println("\n========================================================");
			 System.out.println("||                       MENU LIGA                    ||");
			 System.out.println("||                                                    ||");
			 System.out.println("||  ¿Qué desea hacer?                                 ||");
			 System.out.println("||                                                    ||");
			 System.out.println("||  1. Visualizar clasificación ordenada por puntos   ||");
			 System.out.println("||  2. Visualizar los 5 jugadores más goleadores      ||");
			 System.out.println("||  3. Visualizar los 5 jugadores con más expulsiones ||");
			 System.out.println("||  4. Visualizar los 3 equipos más goleadores        ||");
			 System.out.println("||  5. Visualización general                          ||");
			 System.out.println("||  6. Apagar el Programa                             ||");
			 System.out.println("||                                                    ||");
			 System.out.println("========================================================\n");
			 //si entrada es entero
			 if (s.hasNextInt()) {
				 //entro al if
	        	operacion = s.nextInt();
	        	// operacion = entrada
	        	//si operacion es menor a 1 y mayor a 6
	        	if(operacion>6 || operacion<1){
	        		//imprimo el siguiente mensaje
        			System.out.println("Ocurrio un error o hubo un problema con la funcion: '" + operacion
        					+ "'\n\nno se reconoce como una operación o dicho comando no existe."
        					+ "\nPor favor, vuelva a intentarlo y asegurece de que sea una funcion. ");
	        	}
	        	//mientras operacion mayor o igual a 1 y menor o igual 6
	        	while (operacion<=6 && operacion>=1) {
	        		//entro al if
	        		if(operacion==1) {
	        			//si operacion == 1 hago esto
	        			//imprimo
	        			System.out.println("==========================================================");
	        			System.out.println("||         ====Equipos de la clasificación====          ||");
	        			System.out.println("==========================================================");
	        			//Muestro una clasificacion de 15 equipos por liga
	        			equiposPrint(clasificacion(l), 15);
	        			break;
	        		}
	        		if(operacion==2) {
	        			//si operacion == 2 hago esto
	        			jugadoresPrint(jugadoresGolers(l), 5);
	        			//Muestro una clasificacion de 5 jugadores por goles
	        			break;
	        		}
	        		if(operacion==3) {
	        			//si operacion == 3 hago esto
	        			jugadoresPrint(jugadoresExpulsiones(l), 5);
	        			//Muestro una clasificacion de 5 jugadores por expulsiones
	        			break;
	        		}
	        		if(operacion==4) {
	        			//si operacion == 4 hago esto
	        			//imprimo
	        			System.out.println("==========================================================");
	        			System.out.println("||            ====Equipos con mas goles====             ||");
	        			System.out.println("==========================================================");
	        			equiposPrint(equipoGoles(l), 3);
	        			//Muestro una clasificacion de los 3 equipos con mas goles
	        			break;
	        		}
	        		if(operacion==5) {
	        			//si operacion == 5 hago esto
	        			ligaCompleta(l);
	        			//Muestrame todas las ligas y una informacion completa
	        			break;
	        		}
	        	
	        		if(operacion==6) {
						//Si, operacion es 6, deten todo el bucle y apaga el programa
						bucle = false;
						s.close();
						break;
					}
	        	}
			 } else {
		    		s.next();
					System.out.println("\nPor favor, use solamente numeros para llamar a una funcion");
			 }
		}
	}
}

