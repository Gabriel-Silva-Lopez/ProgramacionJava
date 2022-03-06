package Portaldatospublicos;

public class Usuariobici {
		
		private int usuario;
		private int traslado;
		private int circular;
		private int total;
		
		/**
		 * Pre:-----------
		 * Post: Constructor
		 */
		public Usuariobici(int usuario, int traslado, int circular, int total) {
			this.usuario = usuario;
			this.traslado = traslado;
			this.circular = circular;
			this.total = total;
		}
		
		/**
		 * Pre:-----------
		 * Post: Este Metodo mantendra los datos mientras son reorganizados en el
		 * y cambiados de posicion en el main.ordenarContenido().
		 * @return 
		 */
		
		public void UsuarioBici(int usuario, int traslado, int circular, int total) {
			this.usuario = usuario;
			this.traslado = traslado;
			this.circular = circular;
			this.total = total;
		}
		
		//Getters y setters
		public int getUsuario() {
			return usuario;
		}

		public void setUsuario(int usuario) {
			this.usuario = usuario;
		}

		public int getTraslado() {
			return traslado;
		}

		public void setTraslado(int traslado) {
			this.traslado = traslado;
		}

		public int getCircular() {
			return circular;
		}

		public void setCircular(int circular) {
			this.circular = circular;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}
		
		/**
		 * Pre:-----------
		 * Post: Metodo que incrementa el valor cada vez que es llamado, para
		 * contar el total de traslados de un usuario
		 */
		
		public void sumTraslado() {
			this.traslado++;
		}
		
		/**
		 * Pre:-----------
		 * Post: Metodo que incrementa el valor cada vez que es llamado, para
		 * contar el total de circulaciones de un usuario
		 */
		
		public void sumCircular() {
			this.circular++;
		}
		
		/**
		 * Pre:-----------
		 * Post:Metodo que incrementa el valor cada vez que es llamado, para
		 * contar el total
		 */
		
		public void sumTotal() {
			this.total++;
		}
}
