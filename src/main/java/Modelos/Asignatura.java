package Modelos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asignatura {
	private int codigo;
	private String nombre;
	private List<Profesor> profesoresQueLaImparten;

	public Asignatura(int codigo, String nombre, List<Profesor> profesoresQueLaImparten) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.profesoresQueLaImparten = profesoresQueLaImparten;
	}
}