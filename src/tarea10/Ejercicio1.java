package tarea10;

public class Ejercicio1 {
	public static int[][] recorrido (int[][] salario, String[] personas){
		for (int i=0; i <salario.length; i++) {
			int suma= 0;
			System.out.print(personas[i] + " -> ");
	    	for (int j = 0; j<salario[i].length; j++) {
	    		suma = suma + salario[i][j];
	    		if (j == salario[i].length-1) {	
	    			System.out.print(salario[i][j] + " = " + suma + "€\n");
	    		} else {
	    			System.out.print(salario[i][j] + " + ");
	    		}
	    	}
	    }
		return salario;
	}

	public static void main(String[] args) {
		int[][] t = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} };
		String[] t2={"Javier María","Antonio Muñoz","Isabel Allende"};
		recorrido(t, t2);
	}
}
