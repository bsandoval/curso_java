package py.com.una.java.composicion;

import java.util.List;

import py.com.una.java.objetos.Alumno;
import py.com.una.java.objetos.Persona;

public class Profesor extends Persona {
	private int carnet;
	
	public Profesor(String nombre){
		super(nombre);
	}

	public void corregirExamenes(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			System.out.printf("\nAlumno: %s, Nota: %d", alumno.getNombre(),
					( (int)(Math.random() * 5) + 1));
		}
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
}
