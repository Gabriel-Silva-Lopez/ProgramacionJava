package clasesYobjetos;

public class Television extends Electrodomestico {
	private double resolucion;
	private boolean sintonizador;
	
	public Television(double precioBase, String color, 
			String consumo, double peso, double resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizador = false;
	}
	
	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
	}
	
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if(resolucion > 40) {
			this.precioFinal += (precioFinal * 30)/100;
		}
		if(sintonizador) {
			this.precioFinal += 50;
		}
	}
	
	@Override
	public String toString() {
		return "Television -> [color = " + color + 
				", consumo = " + consumo + ", peso = " + peso + 
				", resolucion = " + resolucion + ", sintonizador = " + 
				sintonizador + ", precioBase = " + 
				precioBase + ", precioFinal = " + precioFinal + "]";
		
	}
}
