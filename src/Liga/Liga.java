package Liga;

public class Liga {
	private String nombre;
	private Equipo[] clasificacion;
	
	/**
	 * Pre:  ---
	 * Post: Constructor de Liga de futbol
	 */
	public Liga(String nombre, Equipo[] clasificacion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}
	
	//Setters y getters de la Liga

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo[] getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Equipo[] clasificacion) {
		this.clasificacion = clasificacion;
	}
}
