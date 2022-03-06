package Portaldatospublicos;

public class Usobici {
		
		private int cTotal;
		private int cCircular;
		private int cTraslado;

		/**
		 * Pre:-----------
		 * Post: Constructor de Usobici.java
		 */
		public Usobici (int cTotal, int cCircular, int cTraslado) {
			this.cTotal = cTotal;
			this.cCircular = cCircular;
			this.cTraslado = cTraslado;
		}
		
		//getters y setters
		public int getcTotal() {
			return cTotal;
		}

		public void setcTotal(int cTotal) {
			this.cTotal = cTotal;
		}

		public int getcCircular() {
			return cCircular;
		}

		public void setcCircular(int cCircular) {
			this.cCircular = cCircular;
		}

		public int getcTraslado() {
			return cTraslado;
		}

		public void setcTraslado(int cTraslado) {
			this.cTraslado = cTraslado;
		}
		
		
		/**
		 * Pre:-----------
		 * Post: Metodo toString que muestra por pantalla la cuenta de los diferentes
		 * usos que se le ha dado al sistema bizi [traslado o circular] y el total.
		 */
		@Override
		public String toString() {
			return "\nNumero total de usos: " + cTotal + 
					"\nNumero de usos circulares: " + cCircular + 
						"\nNumero de usos traslado: " + cTraslado + "\n";
		}
}
