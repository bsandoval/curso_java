package py.com.una.java.composicion;

import java.util.ArrayList;

import py.com.una.java.objetos.Alumno;

public class AppCorregirExamenes {

	public static void main(String args[]){
		Profesor alcides = new Profesor("Alcides");
		
		Materia java = new Materia("Curso Java Extension");
		java.setProfesor(alcides);
		
		Alumno felipe = new Alumno();
		felipe.setNombre("Felipe");
		
		Alumno nery = new Alumno();
		nery.setNombre("Nery");
		
		java.setAlumnos(new ArrayList<Alumno>());
		java.getAlumnos().add(nery);
		java.getAlumnos().add(felipe);
		
		alcides.corregirExamenes(java.getAlumnos());
		
	}
}
