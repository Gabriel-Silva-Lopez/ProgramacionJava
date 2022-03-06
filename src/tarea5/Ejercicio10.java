package tarea5;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int suma = 0;
        while (num > 0) {
            suma = suma + num % 10;
            num = num / 10;
        }
        System.out.println(suma); 
        s.close();
	}
}
