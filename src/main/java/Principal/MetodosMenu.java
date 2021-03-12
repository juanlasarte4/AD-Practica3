package Principal;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import Modelos.Asignatura;
import Modelos.Centro;
import Modelos.Profesor;
import utilidades.Leer;

public class MetodosMenu {

	// CASO 1
	public static void poblarBBDD(ODB odb) {
		for (Asignatura lasAsignaturas : Datos.getAsignaturas()) {
			odb.store(lasAsignaturas);
		}

		for (Centro losCentro : Datos.getCentros()) {
			odb.store(losCentro);
		}
		for (Profesor losProfesores : Datos.getProfesores()) {
			odb.store(losProfesores);
		}
		odb.commit();
	}

	// CASO 2
	public static void listarTodosLosCentros(ODB odb) {
		Objects<Centro> misCentros = odb.getObjects(new CriteriaQuery(Centro.class));
		misCentros.forEach(elCentro -> System.out.println(elCentro));
	}

	// CASO 3
	public static void listarTodosLosProfesores(ODB odb) {
		Objects<Profesor> misProfesores = odb.getObjects(new CriteriaQuery(Profesor.class));
		misProfesores.forEach(elProfesor -> System.out.println(elProfesor));
	}

	// CASO 4
	public static void listarTodosLosProfesoresDeUnCentro(ODB odb) {
		System.out.println("Dime un centro para listar los profesores");
		String centroABuscar = Leer.pedirCadena();
		Objects<Centro> misCentros = odb
				.getObjects(new CriteriaQuery(Centro.class, Where.equal("nombreCentro", centroABuscar)));

		if (misCentros.size() < 1) {
			System.out.println("No hay ningún centro con ese nombre");
			return;
		}

		Centro miCentro = misCentros.getFirst();
		for (Profesor miProfesor : miCentro.getLosProfesores()) {
			System.out.println(miProfesor);
		}
	}

	// CASO 5
	public static void listarTodosLosProfesoresDeUnCentroCuyaFechaDeNacimientoSeaInferiorA1993(ODB odb) {
		System.out.println("Dime un centro para listar los profesores cuya fecha de nacimiento sea inferior a 1993");
		String centroABuscar = Leer.pedirCadena();
		Objects<Centro> misCentros = odb
				.getObjects(new CriteriaQuery(Centro.class, Where.equal("nombreCentro", centroABuscar)));

		if (misCentros.size() < 1) {
			System.out.println("No hay ningún centro con ese nombre");
			return;
		}
		Centro miCentro = misCentros.getFirst();

		for (Profesor miProfesor : miCentro.getLosProfesores()) {
			try {
				String[] separador = miProfesor.getFechaNacimientoProfesor().split("-");

				if (Integer.parseInt(separador[separador.length - 1]) < 1993) {
					System.out.println(miProfesor);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// CASO 6
	public static void listarLosProfesoresConSexoMasculinoQueImpartanLaAsignaturaDeAccesoADatos(ODB odb) {
		Asignatura miAsignaturaDeAD = (Asignatura) odb.getObjects(new CriteriaQuery(Asignatura.class, Where.and()
				.add(Where.isNotNull("codigoAsignatura")).add(Where.equal("nombreAsignatura", "Acceso a Datos"))))
				.getFirst();
		Objects<Profesor> misProfesores = odb
				.getObjects(new CriteriaQuery(Profesor.class, Where.equal("sexoProfesor", "M")));

		for (Profesor miProfesor : misProfesores) {
			if (miAsignaturaDeAD.getProfesoresQueLaImparten().contains(miProfesor)) {
				System.out.println(miProfesor);
			}
		}
	}

	// CASO 7
	public static void comprobarQueUnProfesorYaExiste(ODB odb) {
		System.out.println("Introduce un codigo para comprobar que existe el profesor");
		int codigoProfesorAComprobar = Leer.pedirEnteroValidar();
		Objects<Profesor> misProfesores = odb
				.getObjects(new CriteriaQuery(Profesor.class, Where.equal("codigoProfesor", codigoProfesorAComprobar)));

		if (misProfesores.size() <= 0) {
			System.out.println("No hay profesores con ese identificador");
		} else if (misProfesores.size() == 1) {
			for (Profesor profesor : misProfesores) {
				System.out.println(profesor);
			}
		} else if (misProfesores.size() > 1) {
			System.out.println("Hay varios profesores con este identificador: " + codigoProfesorAComprobar);
		}
	}
}