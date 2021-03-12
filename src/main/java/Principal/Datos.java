package Principal;

import java.util.Arrays;
import java.util.List;

import Modelos.Asignatura;
import Modelos.Centro;
import Modelos.Profesor;

public class Datos {

	public static Profesor profesorItaca1 = new Profesor(0, "Profesor", "Gorallez", "M", "19-3-2993");
	public static Profesor profesorItaca2 = new Profesor(1, "Marianosa", "Capote", "F", "38-7-1990");
	public static Profesor profesorItaca3 = new Profesor(2, "Achoroque", "Gonzalsio", "M", "5-21-1746");
	public static Profesor profesorCefor1 = new Profesor(3, "Elni", "Casio", "M", "22-5-1998");
	public static Profesor profesorCefor2 = new Profesor(4, "Rolevilla", "Hinasia", "F", "4-12-3821");
	public static Profesor profesorCefor3 = new Profesor(5, "Higuchumbu", "Zoforeos", "?", "38-4-1997");
	public static Profesor directorItaca = new Profesor(6, "José Antonio", "Guallar", "M", "348-231");
	public static Profesor directorCefor = new Profesor(7, "Pepe", "Notas", "M", "9-23-1234");
	
	public static Centro iesItaca = new Centro(1, "IES Itaca", directorItaca, "Avda Estudiantes 1", "Zaragoza","Zaragoza");
	public static Centro ceforIzquierdo = new Centro(2, "Cefor Izquierdo", directorCefor, "Avda Tenor Fleta 17", "Zaragoza", "Zaragoza");
	
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