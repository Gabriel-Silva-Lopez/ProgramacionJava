package arrayList;

public class Portatil {

	private String marca;
	private String modelo;
	private String procesador;
	private String grafica;
	private int ram;
	private int espaciodisk;
	
	public Portatil (String marca, String modelo, String procesador, String grafica, int ram, int espaciodisk) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.ram = ram;
		this.espaciodisk = espaciodisk;
		this.grafica = grafica;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getEspaciodisk() {
		return espaciodisk;
	}

	public void setEspaciodisk(int espaciodisk) {
		this.espaciodisk = espaciodisk;
	}
	
	@Override
	public String toString() {
		return marca + modelo + procesador + grafica + ram + "GB" + espaciodisk + "GB";
	}
	
}
