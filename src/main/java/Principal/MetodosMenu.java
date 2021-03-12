package Principal;

import org.neodatis.odb.ODB;

import Modelos.Asignatura;
import Modelos.Centro;
import Modelos.Profesor;

public class MetodosMenu {
	// CASO 1
	public static void poblarBBDD(ODB odb) {
		Centro centro = Datos.iesItaca;
		Centro centro2 = Datos.ceforIzquierdo;

		Profesor profesor = Datos.profesorCefor1;
		Profesor profesor2 = Datos.profesorCefor2;
		Profesor profesor3 = Datos.profesorCefor3;
		Profesor profesor4 = Datos.profesorItaca1;
		Profesor profesor5 = Datos.profesorItaca2;
		Profesor profesor6 = Datos.profesorItaca3;

		Asignatura asignatura = Datos.pm;
		Asignatura asignatura2 = Datos.di;
		Asignatura asignatura3 = Datos.ad;
		Asignatura asignatura4 = Datos.psp;
		Asignatura asignatura5 = Datos.eie;
		Asignatura asignatura6 = Datos.sge;
		Asignatura asignatura7 = Datos.bbdd;
		Asignatura asignatura8 = Datos.ed;

		odb.store(centro);
		odb.store(centro2);

		odb.store(profesor);
		odb.store(profesor2);
		odb.store(profesor3);
		odb.store(profesor4);
		odb.store(profesor5);
		odb.store(profesor6);

		odb.store(asignatura);
		odb.store(asignatura2);
		odb.store(asignatura3);
		odb.store(asignatura4);
		odb.store(asignatura5);
		odb.store(asignatura6);
		odb.store(asignatura7);
		odb.store(asignatura8);
	}

	// CASO 2
	public static void listarTodosLosCentros(ODB odb) {

	}

	// CASO 3
	public static void listarTodosLosProfesores(ODB odb) {

	}
	
	// CASO 4
	public static void listarTodosLosProfesoresDeUnCentro(ODB odb) {

	}
	
	// CASO 5
	public static void listarTodosLosProfesoresDeUnCentroCuyaFechaDeNacimientoSeaInferiorA1993(ODB odb) {

	}
	
	// CASO 6
	public static void listarLosProfesoresConSexoMasculinoQueImpartanLaAsignaturaDeAccesoADatos(ODB odb) {

	}
	
	// CASO 7
	public static void comprobarQueUnProfesorYaExiste(ODB odb) {

	}
}