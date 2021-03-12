package Modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Centro {
	private int codigoCentro;
	private String nombreCentro;
	private Profesor directorCentro;
	private String direccionCentro;
	private String localidadCentro;
	private String provinciaCentro;

	public Centro() {

	}

	public Centro(int codigoCentro, String nombreCentro, Profesor directorCentro, String direccionCentro,
			String localidadCentro, String provinciaCentro) {
		this.codigoCentro = codigoCentro;
		this.nombreCentro = nombreCentro;
		this.directorCentro = directorCentro;
		this.direccionCentro = direccionCentro;
		this.localidadCentro = localidadCentro;
		this.provinciaCentro = provinciaCentro;
	}
}