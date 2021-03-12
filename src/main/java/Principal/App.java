package Principal;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import utilidades.Leer;

public class App {

	public static void main(String[] args) {

		// INICIAMOS LA CONEXION A LA BBDD
		ODB odb = ODBFactory.open("src/main/resources/database.txt");

		// VARIABLE QUE UTILIZAREMOS PARA ELEGIR LA FUNCION DEL MENU
		int opcion = 0;
		do {
			// IMPRIMIMOS MENU
			System.out.println("1.- Poblar la BBOO");
			System.out.println("2.- Listar todos los centros");
			System.out.println("3.- Listar todos los profesores");
			System.out.println("4.- Listar todos los profesores de un centro");
			System.out.println("5.- Listar todos los profesores de un centro cuya fecha de nacimiento sea anterior a 1993");
			System.out.println("6.- Listar los profesores con sexo masculino que impartan la asignatura de 'Acceso a datos'.");
			System.out.println("7.- Comprobar que un profesor ya existe");
			System.out.println("0.- Salir del programa");

			// PEDIMOS QUE ES LO QUE QUIERE EL USUARIO
			opcion = Leer.pedirEnteroValidar();

			// SEGUN LO QUE HA ELEGIDO EJECUTAREMOS LA FUNCION CORRESPONDIENTE
			switch (opcion) {
			case 1:
				MetodosMenu.poblarBBDD(odb);
				break;
			case 2:
				MetodosMenu.listarTodosLosCentros(odb);
				break;
			case 3:
				MetodosMenu.listarTodosLosProfesores(odb);
				break;
			case 4:
				MetodosMenu.listarTodosLosProfesoresDeUnCentro(odb);
				break;
			case 5:
				MetodosMenu.listarTodosLosProfesoresDeUnCentroCuyaFechaDeNacimientoSeaInferiorA1993(odb);
				break;
			case 6:
				MetodosMenu.listarLosProfesoresConSexoMasculinoQueImpartanLaAsignaturaDeAccesoADatos(odb);
				break;
			case 7:
				MetodosMenu.comprobarQueUnProfesorYaExiste(odb);
				break;
			}
		} while (opcion != 0);
		odb.close();
	}
}