package ficherosextra;

public class Tupla implements Comparable<Tupla>{
	private String contenido;
	private int ocurrencias;
	
	public Tupla(String contenido, int ocurrencias) {
		this.contenido = contenido;
		this.ocurrencias = ocurrencias;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getOcurrencias() {
		return ocurrencias;
	}

	public void setOcurrencias(int ocurrencias) {
		this.ocurrencias = ocurrencias;
	}

	@Override
	public int compareTo(Tupla o) {
		if(this.ocurrencias < o.getOcurrencias()) return 1;
		else if(this.ocurrencias > o.getOcurrencias()) return -1;
		else return 0;
	}
}
