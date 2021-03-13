package Modelos;

public class Profesor {
	private int codigoProfesor;
	private String nombreProfesor;
	private String apellidosProfesor;
	private String sexoProfesor;
	private String fechaNacimientoProfesor;

	public Profesor() {

	}

	public Profesor(int codigoProfesor, String nombreProfesor, String apellidosProfesor, String sexoProfesor,
			String fechaNacimientoProfesor) {
		this.codigoProfesor = codigoProfesor;
		this.nombreProfesor = nombreProfesor;
		this.apellidosProfesor = apellidosProfesor;
		this.sexoProfesor = sexoProfesor;
		this.fechaNacimientoProfesor = fechaNacimientoProfesor;
	}

	public int getCodigoProfesor() {
		return codigoProfesor;
	}

	public void setCodigoProfesor(int codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public String getApellidosProfesor() {
		return apellidosProfesor;
	}

	public void setApellidosProfesor(String apellidosProfesor) {
		this.apellidosProfesor = apellidosProfesor;
	}

	public String getSexoProfesor() {
		return sexoProfesor;
	}

	public void setSexoProfesor(String sexoProfesor) {
		this.sexoProfesor = sexoProfesor;
	}

	public String getFechaNacimientoProfesor() {
		return fechaNacimientoProfesor;
	}

	public void setFechaNacimientoProfesor(String fechaNacimientoProfesor) {
		this.fechaNacimientoProfesor = fechaNacimientoProfesor;
	}

	@Override
	public String toString() {
		return "Profesor [codigoProfesor=" + codigoProfesor + ", nombreProfesor=" + nombreProfesor
				+ ", apellidosProfesor=" + apellidosProfesor + ", sexoProfesor=" + sexoProfesor
				+ ", fechaNacimientoProfesor=" + fechaNacimientoProfesor + "]";
	}
}