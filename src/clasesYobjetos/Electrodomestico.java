package clasesYobjetos;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected String consumo;
	protected double peso;
	
	protected double precioFinal;
	
	public Electrodomestico(double precioBase, String color, 
			String consumo, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumo(consumo);
		this.peso = peso;
		precioFinal();
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = "Blanco";
		this.consumo = "F";
		precioFinal();
	}
	
	public Electrodomestico() {
		this.precioBase = 100;
		this.peso = 5;
		this.color = "Blanco";
		this.consumo = "F";
		precioFinal();
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void precioFinal() {
		// Refresco para calcular bien su valor
		precioFinal = precioBase;
		// Aumentamos precio por consumo
		if(consumo.equalsIgnoreCase("A")) {
			precioFinal += 100;
		} else if(consumo.equalsIgnoreCase("B")) {
			precioFinal += 80;
		} else if(consumo.equalsIgnoreCase("C")) {
			precioFinal += 60;
		} else if(consumo.equalsIgnoreCase("D")) {
			precioFinal += 50;
		} else if(consumo.equalsIgnoreCase("E")) {
			precioFinal += 30;
		} else if(consumo.equalsIgnoreCase("F")) {
			precioFinal += 10;
		} 
		// Aumentamos peso por 
		if(peso >= 0 && peso <= 19) {
			precioFinal += 10;
		} else if(peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if(peso >= 50 && peso <= 79) { 
			precioFinal += 80;
		} else if(peso >= 80) {
			precioFinal += 100;
		}
	}
	
	@Override
	public String toString() {
		return "Electrodomestico -> [color = " + color + 
				", consumo = " + consumo + ", peso = " + peso + 
				", precioBase = " + precioBase + ", precioFinal = " + 
				precioFinal + "]";
		
	}
	
	private void comprobarConsumo(String letra) {
		if(!letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("B") && 
				!letra.equalsIgnoreCase("C") && !letra.equalsIgnoreCase("D")
				&& !letra.equalsIgnoreCase("E") && !letra.equalsIgnoreCase("F")) {
			this.consumo = "F";
		}  else {
			this.consumo = letra;
		}
	}
	
	private void comprobarColor(String color) {
		if(!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && 
				!color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul")
				&& !color.equalsIgnoreCase("gris")) {
			this.color = "Blanco";
		}  else {
			this.color = color;
		}
	}
}