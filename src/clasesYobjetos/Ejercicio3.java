package clasesYobjetos;

public class Ejercicio3 {
		public static void main(String[] args) {
			Electrodomestico e = new Electrodomestico();
			System.out.println(e.toString());
			
			Lavadora l = new Lavadora();
			l.setCarga(40);
			l.precioFinal();
			System.out.println(l.toString());
			
			Television t = new Television();
			t.setSintonizador(true);
			t.setResolucion(80);
			t.precioFinal();
			System.out.println(t.toString());
		}
}
