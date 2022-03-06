package juegodelavida;
import java.util.Scanner;

public class Juegovida {
	
	/**
	 * Pre:-----------
	 * Post:Metodo que contiene las tablas de pruebas para trabajar con ellas
	 */
	public static void tablasPruebas (int met) {
		int generaciones=30;
		if(met==1) {
			int sobrevivientes=4;
			String[][] t = new String [4][4];
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					if(i==1 && j==1) {
						t[i][j] = "*";
					}
					else if(i==1 && j==2) {
						t[i][j] = "*";
					}
					else if(i==2 && j==1) {
						t[i][j] = "*";
					}
					else if(i==2 && j==2) {
						t[i][j] = "*";
					} else {
						t[i][j] = " ";
					}
				}
			}
			System.out.println("\nGeneración:0" + "  Sobrevivientes:"+sobrevivientes);
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					System.out.print("████");
				}
				System.out.print("█");
				System.out.println("");
				System.out.print("█");
				for (int j = 0; j < t[i].length; j++) {
					if (j != t[i].length -1) {
						System.out.print(" "+t[i][j]+" █");
					} else {
						System.out.print(" "+t[i][j]+" ");
					}
				}
				System.out.print("█");
				System.out.println("");
				if(i==t.length-1) {
					for (int j = 0; j < t[i].length; j++) {
						System.out.print("████");
					}
					System.out.print("█");
					System.out.println("");	
				}
			}
			chequeoGencelulas(t, generaciones, sobrevivientes);
		}
		else if(met==2) {
			int sobrevivientes=3;
			String[][] t = new String [5][5];
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					if(i==2 && j==1) {
						t[i][j] = "*";
					}
					else if(i==2 && j==2) {
						t[i][j] = "*";
					}
					else if(i==2 && j==3) {
						t[i][j] = "*";
					} else {
						t[i][j] = " ";
					}
				}
			}
			System.out.println("\nGeneración:0" + "  Sobrevivientes:"+sobrevivientes);
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					System.out.print("████");
				}
				System.out.print("█");
				System.out.println("");
				System.out.print("█");
				for (int j = 0; j < t[i].length; j++) {
					if (j != t[i].length -1) {
						System.out.print(" "+t[i][j]+" █");
					} else {
						System.out.print(" "+t[i][j]+" ");
					}
				}
				System.out.print("█");
				System.out.println("");
				if(i==t.length-1) {
					for (int j = 0; j < t[i].length; j++) {
						System.out.print("████");
					}
					System.out.print("█");
					System.out.println("");	
				}
			}
			chequeoGencelulas(t, generaciones, sobrevivientes);
		} else {
			int sobrevivientes=8;
			String[][] t = new String [6][6];
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					if(i==1 && j==1) {
						t[i][j] = "*";
					}
					else if(i==1 && j==2) {
						t[i][j] = "*";
					}
					else if(i==2 && j==1) {
						t[i][j] = "*";
					}
					else if(i==2 && j==2) {
						t[i][j] = "*";
					} 
					else if(i==3 && j==3){
						t[i][j] = "*";	
					}
					else if(i==3 && j==4){
						t[i][j] = "*";
					}
					else if(i==4 && j==3){
						t[i][j] = "*";
					}
					else if(i==4 && j==4){
						t[i][j] = "*";
					} else {
						t[i][j] = " ";
					}
				}
			}
			System.out.println("\nGeneración:0" + "  Sobrevivientes:"+sobrevivientes);
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					System.out.print("████");
				}
				System.out.print("█");
				System.out.println("");
				System.out.print("█");
				for (int j = 0; j < t[i].length; j++) {
					if (j != t[i].length -1) {
						System.out.print(" "+t[i][j]+" █");
					} else {
						System.out.print(" "+t[i][j]+" ");
					}
				}
				System.out.print("█");
				System.out.println("");
				if(i==t.length-1) {
					for (int j = 0; j < t[i].length; j++) {
						System.out.print("████");
					}
					System.out.print("█");
					System.out.println("");	
				}
			}
			chequeoGencelulas(t, generaciones, sobrevivientes);
		}
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo Imprime por pantalla a las diferentes generaciones a lo largo
	 * de la vida de las celulas y realiza el algoritmo de chequeo de casillas
	 */
	public static void chequeoGencelulas (String[][] gen, int g, int s) {
		for(int k = 0; k < g; k++) {
			int[][] alrededorvivas = new int [gen.length][gen[0].length];
			int contador=0;
			if(gen[0][0].equals("*") || gen[0][0].equals(" ")) {
				if(gen[0][1].equals("*")) {
					contador++;
				}
				if(gen[1][0].equals("*")) {
					contador++;
				}
				if(gen[1][1].equals("*")) {
					contador++;
				}
				alrededorvivas[0][0]=contador;
				contador=0;
			} 
			if(gen[0][gen[0].length-1].equals("*") || gen[0][gen[0].length-1].equals(" ")) {
				if(gen[0][gen[0].length-2].equals("*")) {
					contador++;
				}
				if(gen[1][gen[1].length-2].equals("*")) {
					contador++;
				}
				if(gen[1][gen[0].length-1].equals("*")) {
					contador++;
				}
				alrededorvivas[0][alrededorvivas[0].length-1]=contador;
				contador=0;
			}
			if(gen[gen.length-1][0].equals("*") || gen[gen.length-1][0].equals(" ")) {
				if(gen[gen.length-2][0].equals("*")) {
					contador++;
				}
				if(gen[gen.length-2][1].equals("*")) {
					contador++;
				}
				if(gen[gen.length-1][1].equals("*")) {
					contador++;
				}
				alrededorvivas[alrededorvivas.length-1][0]=contador;
				contador=0;
			}
			if(gen[gen.length-1][gen[0].length-1].equals("*") || gen[gen.length-1][gen[0].length-1].equals(" ")) {
				if(gen[gen.length-1][gen[0].length-2].equals("*")) {
					contador++;
				}
				if(gen[gen.length-2][gen[0].length-2].equals("*")) {
					contador++;
				}
				if(gen[gen.length-2][gen[0].length-1].equals("*")) {
					contador++;
				}
				alrededorvivas[alrededorvivas.length-1][alrededorvivas[0].length-1]=contador;
				contador=0;
			}
			for (int i = 0; i < gen.length; i++) {
				for (int j = 0; j < gen[i].length; j++) {
					if(i == 0  && j > 0 && j < gen[i].length -1) {
						if(gen[i][j+1].equals("*")) {
							contador++;	
						}
						if(gen[i][j-1].equals("*")) {
							contador++;
						}
						if(gen[i+1][j-1].equals("*")) {
							contador++;
						}
						if(gen[i+1][j].equals("*")) {
							contador++;
						}
						if(gen[i+1][j+1].equals("*")) {
							contador++;
						}
						alrededorvivas[i][j]=contador;
						contador=0;
					} 
					else if(i > 0 && i < gen.length -1 && j == 0 ){
						if(gen[i-1][j].equals("*")) {
							contador++;
						}
						if(gen[i-1][j+1].equals("*")) {
							contador++;
						}
						if(gen[i][j+1].equals("*")) {
							contador++;
						}
						if(gen[i+1][j].equals("*")) {
							contador++;
						}
						if(gen[i+1][j+1].equals("*")) {
							contador++;
						}
						alrededorvivas[i][j]=contador;
						contador=0;
					}
					else if(i > 0 && i < gen.length-1 && j == gen[i].length-1) {
						if(gen[i-1][j].equals("*")) {
							contador++;
						}
						if(gen[i-1][j-1].equals("*")) {
							contador++;
						}
						if(gen[i][j-1].equals("*")) {
							contador++;
						}
						if(gen[i+1][j].equals("*")) {
							contador++;
						}
						if(gen[i+1][j-1].equals("*")) {
							contador++;
						}
						alrededorvivas[i][j]=contador;
						contador=0;
					}
					else if(i == gen.length-1  && j > 0 && j < gen[i].length -1) {
						if(gen[i][j-1].equals("*")) {
							contador++;
						}
						if(gen[i-1][j-1].equals("*")) {
							contador++;	
						}
						if(gen[i-1][j].equals("*")) {
							contador++;	
						}
						if(gen[i-1][j+1].equals("*")) {
							contador++;	
						}
						if(gen[i][j+1].equals("*")) {
							contador++;	
						}
						alrededorvivas[i][j]=contador;
						contador=0;
					}
					else if (i > 0 && j > 0 && i < gen.length-1 && j < gen[i].length-1) {
						if(gen[i-1][j-1].equals("*")) {
							contador++;
						}
						if(gen[i-1][j].equals("*")) {
							contador++;	
						}
						if(gen[i-1][j+1].equals("*")) {
							contador++;	
						}
						if(gen[i][j-1].equals("*")) {
							contador++;	
						}
						if(gen[i][j+1].equals("*")) {
							contador++;	
						}
						if(gen[i+1][j-1].equals("*")) {
							contador++;	
						}
						if(gen[i+1][j].equals("*")) {
							contador++;	
						}
						if(gen[i+1][j+1].equals("*")) {
							contador++;	
						}
						alrededorvivas[i][j]=contador;
						contador=0;
					}
				}
			}
			for (int i = 0; i < alrededorvivas.length; i++) {
				for (int j = 0; j < alrededorvivas[i].length; j++) {
					if(gen[i][j].equals("*")) {
						if(alrededorvivas[i][j]<=1) {
							gen[i][j]=(" ");
						}
						else if(alrededorvivas[i][j]>=4) {
							gen[i][j]=(" ");
						}
					} 
					else if(gen[i][j].equals(" ")){
						if(alrededorvivas[i][j]==3) {
							gen[i][j]=("*");
						} else {
							gen[i][j]=(" ");
						}
					}
				}
			}
			int sobrevivientes = 0;
			for (int i = 0; i < gen.length; i++) {
				for (int j = 0; j<gen[i].length; j++) {
					if(gen[i][j].equals("*")) {
						sobrevivientes++;
					}
				}
				if(sobrevivientes>0 && i==gen.length-1) {
					Tripleta tripleta = new Tripleta(k, sobrevivientes, s);
					System.out.println("\nGeneración:" + (tripleta.getIteracion()+1) + "  "
							+ "Sobrevivientes:" + tripleta.getVivas() + "  Comparada con la anterior:" + (sobrevivientes-tripleta.getVivascomparada()));
					s = sobrevivientes;
					for (int o = 0; o < gen.length; o++) {
						for (int p = 0; p < gen[o].length; p++) {
							System.out.print("████");
						}
						System.out.print("█");
						System.out.println("");
						System.out.print("█");
						for (int j = 0; j < gen[o].length; j++) {
							if (j != gen[o].length -1) {
								System.out.print(" "+gen[o][j]+" █");
							} else {
								System.out.print(" "+gen[o][j]+" ");
							}
						}
						System.out.print("█");
						System.out.println("");
						if(o==gen.length-1) {
							for (int j = 0; j < gen[o].length; j++) {
								System.out.print("████");
							}
							System.out.print("█");
							System.out.println("");	
						}
					}
				} 
				else if(sobrevivientes<=0 && i==gen.length-1) {
				System.out.println("¡¡Colonia extinguida!!");
				}
			}
		}
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo que genera las celulas de la primera generacion con math randoms
	 */
	public static void generadorTablero (int c, int f, int g) {
		String[][] t = new String [f][c];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = "" + (int)(Math.random()*(10));
				if(Integer.parseInt(t[i][j])<=2) {
					t[i][j] = "*";
				}
				else if (Integer.parseInt(t[i][j])>2){
					t[i][j] = " ";
				}
			}
		}
		generadorGeneraciones(t, g);
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo que crea una tabla en la que el usuario a elegido el porcentaje
	 * celulas en la primera generacion
	 */
	public static void generadorPorporcentaje (int c, int f, int g, int p) {
		String[][] t = new String [f][c];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = "" + (int)(Math.random()*(10));
				if(Integer.parseInt(t[i][j])<=p) {
					t[i][j] = "*";
				}
				else if (Integer.parseInt(t[i][j])>p){
					t[i][j] = " ";
				}
			}
		}
		generadorGeneraciones(t, g);
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo que almacena la primera tabla de String celulas y cuenta sus supervivientes
	 */
	public static void generadorGeneraciones(String[][] t, int g) {
			String[][] nuevageneracion = new String[t.length][t[0].length];
			int sobrevivientes=0;
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j<t[i].length; j++) {
					if(t[i][j].equals("*")) {
						nuevageneracion[i][j] = "*";
						sobrevivientes++;
					}
					else if (t[i][j].equals(" ")){
						nuevageneracion[i][j] = " ";
					}
				}
				if(sobrevivientes>0 && i==t.length-1) {
					System.out.println("\nGeneración:0" + "  Sobrevivientes:"+sobrevivientes);
					for (int k = 0; k < t.length; k++) {
						for (int l = 0; l < t[k].length; l++) {
							System.out.print("████");
						}
						System.out.print("█");
						System.out.println("");
						System.out.print("█");
						for (int j = 0; j < t[k].length; j++) {
							if (j != t[k].length -1) {
								System.out.print(" "+t[k][j]+" █");
							} else {
								System.out.print(" "+t[k][j]+" ");
							}
						}
						System.out.print("█");
						System.out.println("");
						if(k==t.length-1) {
							for (int j = 0; j < t[k].length; j++) {
								System.out.print("████");
							}
							System.out.print("█");
							System.out.println("");	
						}
					}
						chequeoGencelulas(nuevageneracion, g, sobrevivientes);	
				} 
				else if(sobrevivientes<0 && i==t.length-1) {
					System.out.println("¡¡Colonia extinguida!!");
				}
			}
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo que contiene el menu los diferentes porcentajes 
	 */
	public static void menuPorcentajes () {
		System.out.println("\n==================================");
		System.out.println("||         %Porcentajes%        ||");
		System.out.println("==================================");
		System.out.println("||  1. 10% de la tabla          ||");
		System.out.println("||  2. 20% de la tabla          ||");
		System.out.println("||  3. 30% de la tabla          ||");
		System.out.println("||  4. 40% de la tabla          ||");
		System.out.println("||  5. 50% de la tabla          ||");
		System.out.println("||  6. 60% de la tabla          ||");
		System.out.println("||  7. 70% de la tabla          ||");
		System.out.println("||  8. 80% de la tabla          ||");
		System.out.println("||  9. 90% de la tabla          ||");
		System.out.println("==================================");
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo que contiene el menu del sector de pruebas 
	 */
	public static void menuPruebas () {
		System.out.println("\n==================================");
		System.out.println("||       Sector de pruebas      ||");
		System.out.println("==================================");
		System.out.println("||  1. Tabla de prueba 1        ||");
		System.out.println("||  2. Tabla de prueba 2        ||");
		System.out.println("||  3. Tabla de prueba 3        ||");
		System.out.println("||  4. Volver                   ||");
		System.out.println("==================================");
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo que contiene el menu principal del juego de la vida 
	 */
	public static void menuJuegovida () {
		System.out.println("\n==================================");
		System.out.println("||       Juego de la vida       ||");
		System.out.println("==================================");
		System.out.println("||  1. Vamo a jugar             ||");
		System.out.println("||  2. Sector de pruebas        ||");
		System.out.println("||  3. Por porcentajes %        ||");
		System.out.println("||  4. Salir                    ||");
		System.out.println("==================================");
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo en caso de que el usuario meta una entrada invalida al objeto scanner
	 * le volvera a pedir una
	 */
	public static String entradaErronea (Scanner s) {
		System.out.println("Dame un valor numerico mayor a 2");
		return s.next();
	}
	
	/**
	 * Pre:-----------
	 * Post:Metodo main en el cual se llaman a los otros metodos para presentarle al usuario 
	 * las diferentes opciones que permite realizar el programa y 
	 */
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			menuJuegovida();
			int entradamenu;
			if(s.hasNextInt()){
				entradamenu = s.nextInt();
				if(entradamenu == 1) {
					System.out.println("\nDame las filas que quieres para jugar el juego de la vida:");
					int filas;
					if(s.hasNextInt()){
						filas = s.nextInt();
						if(filas >= 2) {
							System.out.println("\nDame las columnas que quieres para jugar el juego de la vida:");
							int columnas;
							if(s.hasNextInt()){
								columnas = s.nextInt();
								if(columnas >= 2) {
									System.out.println("\nDame las generaciones que quieres ver del juego:");
									int generaciones;
									if(s.hasNextInt()) {
										generaciones = s.nextInt();
										if(generaciones >= 0) {
												generadorTablero(columnas, filas, generaciones);	
										} else {
											entradaErronea(s);
										}
									} else {
										entradaErronea(s);
									}
								} else {
									entradaErronea(s);
								}
							} else {
								entradaErronea(s);
							}	
						} else {
							entradaErronea(s);
						}
					} else {
						entradaErronea(s);
					}
				} else if(entradamenu==2) {
					System.out.println("Introduzca que prueba desea hacer");
					menuPruebas();
					int menuprueba;
					if(s.hasNextInt()){
						menuprueba = s.nextInt();
						if(menuprueba == 1) {
								tablasPruebas(menuprueba);
							}
							else if (menuprueba == 2) {
								tablasPruebas(menuprueba);
							}
							else if (menuprueba == 3) {
								tablasPruebas(menuprueba);
							} else {
								if(menuprueba == 4) {
									System.out.println();
								} else {
									System.out.println("ocurrio un error, intruzca un dato valido");
								}
							}	
						}
				} else if(entradamenu==3) {
					System.out.println("\nDame las filas que quieres para jugar el juego de la vida:");
					int filas;
					if(s.hasNextInt()){
						filas = s.nextInt();
						if(filas >= 1) {
							System.out.println("\nDame las columnas que quieres para jugar el juego de la vida:");
							int columnas;
							if(s.hasNextInt()){
								columnas = s.nextInt();
								if(columnas >= 1) {
									System.out.println("\nDame las generaciones que quieres ver del juego:");
									int generaciones;
									if(s.hasNextInt()) {
										generaciones = s.nextInt();
										if(generaciones >= 0) {
											menuPorcentajes();
											int porcentaje;
											if(s.hasNextInt()) {
												porcentaje=s.nextInt();
												if(porcentaje >= 1 && porcentaje <= 9) {
													generadorPorporcentaje(columnas, filas, generaciones, porcentaje);
												} else {
													System.out.println("Dame un numero entre 0 y 9");	
												}
											}
												generadorTablero(columnas, filas, generaciones);	
										} else {
											entradaErronea(s);
										}
									} else {
										entradaErronea(s);
									}
								} else {
									entradaErronea(s);
								}
							} else {
								entradaErronea(s);
							}	
						} else {
							entradaErronea(s);
						}
					} else {
						entradaErronea(s);
					}
				}else if(entradamenu==4) {
					break;
				} else {
					System.out.println("ocurrio un error, intruzca un dato valido");
				}
			}
		}
	}
}
