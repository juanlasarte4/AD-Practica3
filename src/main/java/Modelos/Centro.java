package Modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Centro {
	private int codigoCentro;
	private String nombreCentro;
	private Profesor director;
	private String direccionCentro;
	private String localidadCentro;
	private String provinciaCentro;

	public Centro(int codigoCentro, String nombreCentro, Profesor director, String direccionCentro,
			String localidadCentro, String provinciaCentro) {
		this.codigoCentro = codigoCentro;
		this.nombreCentro = nombreCentro;
		this.director = director;
		this.direccionCentro = direccionCentro;
		this.localidadCentro = localidadCentro;
		this.provinciaCentro = provinciaCentro;
	}
}