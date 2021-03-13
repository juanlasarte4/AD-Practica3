package Modelos;

import java.util.List;

public class Centro {
	private int codigoCentro;
	private String nombreCentro;
	private Profesor directorCentro;
	private String direccionCentro;
	private String localidadCentro;
	private String provinciaCentro;
	private List<Profesor> losProfesores;

	public Centro() {

	}

	public Centro(int codigoCentro, String nombreCentro, Profesor directorCentro, String direccionCentro,
			String localidadCentro, String provinciaCentro, List<Profesor> losProfesores) {
		this.codigoCentro = codigoCentro;
		this.nombreCentro = nombreCentro;
		this.directorCentro = directorCentro;
		this.direccionCentro = direccionCentro;
		this.localidadCentro = localidadCentro;
		this.provinciaCentro = provinciaCentro;
		this.losProfesores = losProfesores;
	}

	public int getCodigoCentro() {
		return codigoCentro;
	}

	public void setCodigoCentro(int codigoCentro) {
		this.codigoCentro = codigoCentro;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public Profesor getDirectorCentro() {
		return directorCentro;
	}

	public void setDirectorCentro(Profesor directorCentro) {
		this.directorCentro = directorCentro;
	}

	public String getDireccionCentro() {
		return direccionCentro;
	}

	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}

	public String getLocalidadCentro() {
		return localidadCentro;
	}

	public void setLocalidadCentro(String localidadCentro) {
		this.localidadCentro = localidadCentro;
	}

	public String getProvinciaCentro() {
		return provinciaCentro;
	}

	public void setProvinciaCentro(String provinciaCentro) {
		this.provinciaCentro = provinciaCentro;
	}

	public List<Profesor> getLosProfesores() {
		return losProfesores;
	}

	public void setLosProfesores(List<Profesor> losProfesores) {
		this.losProfesores = losProfesores;
	}

	@Override
	public String toString() {
		return "Centro [codigoCentro=" + codigoCentro + ", nombreCentro=" + nombreCentro + ", directorCentro="
				+ directorCentro + ", direccionCentro=" + direccionCentro + ", localidadCentro=" + localidadCentro
				+ ", provinciaCentro=" + provinciaCentro + ", losProfesores=" + losProfesores + "]";
	}
}