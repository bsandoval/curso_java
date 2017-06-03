/**
 * 
 */
package py.com.una.java.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import py.com.una.java.objetos.Alumno;
import py.com.una.java.objetos.Persona;

/**
 * @author bsandoval
 *
 */
public class AppClase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Alumno vectorAlumnos[] = new Alumno[5];
		vectorAlumnos[0] = new Alumno("Alcides");
		vectorAlumnos[1] = new Alumno("Felipe");
		vectorAlumnos[2] = new Alumno("Bea");
		vectorAlumnos[3] = new Alumno("Nery");
		vectorAlumnos[4] = new Alumno("Daniel");
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		System.out.println("Vector de alumnos: ");
		for (int i = 0; i < vectorAlumnos.length; i++) {
			System.out.println(i + " - " + vectorAlumnos[i].getNombre());
			listaAlumnos.add(vectorAlumnos[i]);
		}
		
		System.out.println("Lista de alumnos: ");
		for (Iterator<Alumno> iterator = listaAlumnos.iterator(); iterator.hasNext();) {
			Alumno alumno = (Alumno) iterator.next();
			System.out.println("Alumno: "+alumno.getNombre());
		}
		
		System.out.println("Otra lista de alumnos: ");
		for (Alumno alumno : listaAlumnos) {
			System.out.println("Alumno: "+alumno.getNombre());
		}
		
		System.out.println("Mapa de alumnos: ");
		HashMap<String, Persona> mapaAlumnos = new HashMap<String, Persona>();
		mapaAlumnos.put("Bea", new Persona(23));
		mapaAlumnos.put("Felipe", new Persona(22));
		
		System.out.println("Alumno: Bea, Edad: "+mapaAlumnos.get("Bea").getEdad());
		
	}

}
