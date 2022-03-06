package ficherosextra;

public class Accidente {
	String tipo;
	String localizacion;
	String horario;
	
	public Accidente(String tipo, String localizacion, String horario) {
		this.tipo = tipo;
		this.localizacion = localizacion;
		this.horario = horario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}
