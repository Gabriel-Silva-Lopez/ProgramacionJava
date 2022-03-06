package ejerInterfaces;

public class Coche {
	private int nombre;
	private String color;
	private int velocidad;
	
	public Coche(int nombre, String color, int velocidad) {
		this.nombre = nombre;
		this.color = color;
		this.velocidad = velocidad;
	}
	
	public int getNombre() {
		return nombre;
	}


	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public String metodoFrenar (int velocidad) {
		String frenar="";
		velocidad=Integer.parseInt(frenar);
		return frenar;
	}
}
