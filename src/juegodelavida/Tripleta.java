package juegodelavida;

public class Tripleta {
	private int iteracion;
	private int vivas;
	private int vivascomparada;
	
	/**
	 * Pre:  ---
	 * Post: constructor de las tripletas
	 */
	
	public Tripleta(int iteracion, int vivas, int vivascomparada) {
		this.iteracion = iteracion;
		this.vivas = vivas;
		this.vivascomparada = vivascomparada;
	}
	
	//getters y setters
	public int getIteracion() {
		return iteracion;
	}

	public void setIteracion(int iteracion) {
		this.iteracion = iteracion;
	}

	public int getVivas() {
		return vivas;
	}

	public void setVivas(int vivas) {
		this.vivas = vivas;
	}

	public int getVivascomparada() {
		return vivascomparada;
	}

	public void setVivascomparada(int vivascomparada) {
		this.vivascomparada = vivascomparada;
	}
}
