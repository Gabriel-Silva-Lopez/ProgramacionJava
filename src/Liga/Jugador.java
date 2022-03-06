package Liga;

public class Jugador {

	private String nombre;
	private int dorsal;
	private int goles;
	private int tarjetasrojas;
	private int tarjetasamarillas;
	
	/**
	 * Pre:  ---
	 * Post: Constructor de Jugador
	 */
	public Jugador(String nombre, int dorsal, int goles, int tarjetasrojas, int tarjetasamarillas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.tarjetasrojas = tarjetasrojas;
		this.tarjetasamarillas = tarjetasamarillas;
	}

	//Setters y getters de los jugadores
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getTarjetasrojas() {
		return tarjetasrojas;
	}

	public void setTarjetasrojas(int tarjetasrojas) {
		this.tarjetasrojas = tarjetasrojas;
	}

	public int getTarjetasamarillas() {
		return tarjetasamarillas;
	}

	public void setTarjetasamarillas(int tarjetasamarillas) {
		this.tarjetasamarillas = tarjetasamarillas;
	}
}
