package Modelos;

import java.util.List;

public class Asignatura {
	private int codigoAsignatura;
	private String nombreAsignatura;
	private List<Profesor> profesoresQueLaImparten;
	
	public Asignatura() {

	}

	public Asignatura(int codigoAsignatura, String nombreAsignatura, List<Profesor> profesoresQueLaImparten) {
		this.codigoAsignatura = codigoAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.profesoresQueLaImparten = profesoresQueLaImparten;
	}

	public int getCodigo() {
		return codigoAsignatura;
	}

	public void setCodigo(int codigo) {
		this.codigoAsignatura = codigo;
	}

	public String getNombre() {
		return nombreAsignatura;
	}

	public void setNombre(String nombre) {
		this.nombreAsignatura = nombre;
	}

	public List<Profesor> getProfesoresQueLaImparten() {
		return profesoresQueLaImparten;
	}

	public void setProfesoresQueLaImparten(List<Profesor> profesoresQueLaImparten) {
		this.profesoresQueLaImparten = profesoresQueLaImparten;
	}

	@Override
	public String toString() {
		return "Asignatura [codigoAsignatura=" + codigoAsignatura + ", nombreAsignatura=" + nombreAsignatura
				+ ", profesoresQueLaImparten=" + profesoresQueLaImparten + "]";
	}
}