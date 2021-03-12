package Principal;

import java.util.Arrays;
import java.util.List;

import Modelos.Asignatura;
import Modelos.Centro;
import Modelos.Profesor;

public class Datos {

	public static Profesor profesorItaca1 = new Profesor(0, "Profesor", "1", "M", "19-3-1965");
	public static Profesor profesorItaca2 = new Profesor(1, "Profesor", "2", "F", "12-7-1995");
	public static Profesor profesorItaca3 = new Profesor(2, "Profesor", "3", "M", "4-2-1976");
	public static Profesor profesorCefor1 = new Profesor(3, "Profesor", "4", "M", "2-5-1998");
	public static Profesor profesorCefor2 = new Profesor(4, "Profesor", "5", "F", "24-12-1987");
	public static Profesor profesorCefor3 = new Profesor(5, "Profesor", "6", "F", "8-4-1965");
	public static Profesor directorItaca = new Profesor(6, "Profesor", "7", "M", "3-1978");
	public static Profesor directorCefor = new Profesor(7, "Profesor", "8", "M", "29-10-1994");
	
	public static Centro iesItaca = new Centro(0, "IES Itaca", directorItaca, "Avda Estudiantes 1", "Zaragoza","Zaragoza", Arrays.asList(profesorItaca1, profesorItaca2, profesorItaca3));
	public static Centro ceforIzquierdo = new Centro(1, "Cefor Izquierdo", directorCefor, "Avda Tenor Fleta 17", "Zaragoza", "Zaragoza", Arrays.asList(profesorCefor1, profesorCefor2, profesorCefor3));
	
	public static Asignatura pm = new Asignatura(0, "Programación Multimedia",Arrays.asList(profesorItaca1, profesorCefor1));
	public static Asignatura di = new Asignatura(1, "Desarrollo de Interfaces",Arrays.asList(profesorItaca2, profesorCefor2));
	public static Asignatura ad = new Asignatura(2, "Acceso a Datos",Arrays.asList(profesorItaca3, profesorCefor3));
	public static Asignatura psp = new Asignatura(3, "Programación de Servicios y Procesos",Arrays.asList(profesorItaca1, profesorCefor1));
	public static Asignatura eie = new Asignatura(4, "Empresa e Iniciativa Emprendedora",Arrays.asList(profesorItaca2, profesorCefor2));
	public static Asignatura sge = new Asignatura(5, "Sistemas de Gestión Empresarial",Arrays.asList(profesorItaca1, profesorCefor1));
	public static Asignatura bbdd = new Asignatura(6, "Bases de Datos",Arrays.asList(profesorItaca2, profesorCefor3));
	public static Asignatura ed = new Asignatura(7, "Entornos de Desarrollo",Arrays.asList(profesorItaca3, profesorCefor2));

	public static List<Centro> getCentros() {
		return Arrays.asList(iesItaca, ceforIzquierdo);
	}

	public static List<Profesor> getProfesores() {
		return Arrays.asList(profesorItaca1, profesorItaca2, profesorItaca3, profesorCefor1, profesorCefor2, profesorCefor3,
				directorItaca, directorCefor);
	}

	public static List<Asignatura> getAsignaturas() {
		return Arrays.asList(pm, di, ad, psp, eie, sge, bbdd, ed);
	}
}