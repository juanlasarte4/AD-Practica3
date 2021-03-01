package Modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profesor {
	private Integer codigo;
	private String nombre;
	private String apellidos;
	private String sexo;
	private String fechaNacimiento;

	public Profesor(Integer codigo, String nombre, String apellidos, String sexo, String fechaNacimiento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}
}