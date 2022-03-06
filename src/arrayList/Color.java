package arrayList;

//Constructor ejercicio 1
public class Color{
		
		private int cod;
		private String color;
		
		public Color (int cod, String color) {
			this.cod = cod;
			this.color = color;
			
		}

		public int getCod() {
			return cod;
		}

		public void setCod(int cod) {
			this.cod = cod;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		@Override
		public String toString() {
			return "$ = " + "{ codigo: " + cod + ", Nombre: " + color + "}";
		}
}
	
