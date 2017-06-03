package py.com.una.java.abstraccion;

import java.util.List;

import py.com.una.java.objetos.Alumno;
import py.com.una.java.objetos.Persona;

public abstract class Profesor extends Persona {
	private int carnet;
	
	public abstract void corregirExamenes(List<Alumno> alumnos);
	
	public int getCarnet() {
		return carnet;
	}
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
}
