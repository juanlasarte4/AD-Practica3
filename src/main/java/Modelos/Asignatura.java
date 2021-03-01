package Modelos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asignatura {
	private Integer codigo;
	private String nombre;
	private List<Profesor> profesoresQueLaImparten;

	public Asignatura(Integer codigo, String nombre, List<Profesor> profesoresQueLaImparten) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.profesoresQueLaImparten = profesoresQueLaImparten;
	}
}