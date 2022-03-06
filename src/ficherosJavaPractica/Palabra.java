package ficherosJavaPractica;

public class Palabra {
	private int num;
	private String palabra;
	
	public Palabra(int num, String palabra) {
		this.num = num;
		this.palabra = palabra;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public String toString() {
		return "Titular = " + palabra;
	}
}
