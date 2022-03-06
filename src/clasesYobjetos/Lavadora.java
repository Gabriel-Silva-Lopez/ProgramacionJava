package clasesYobjetos;

public class Lavadora extends Electrodomestico {
	private double carga;
	
	public Lavadora() {
		super();
		this.carga = 5;
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = 5;
	}
	
	public Lavadora(double precioBase, String color, 
			String consumo, double peso, double carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}
	
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public double getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if(carga > 30) {
			this.precioFinal += 50;
		}
	}
	
	@Override
	public String toString() {
		return "Lavadora -> [color = " + color + 
				", consumo = " + consumo + ", peso = " + peso + 
				", carga = " + carga + ", precioBase = " + 
				precioBase + ", precioFinal = " + precioFinal + "]";
		
	}
}