package py.com.una.java.composicion;

import java.util.List;

import py.com.una.java.objetos.Alumno;


public class Materia {
	private String nombre;
	private Profesor profesor;
	private List<Alumno> alumnos;
	
	public Materia(String nombre){
		System.out.println("Materia: "+ nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
}
