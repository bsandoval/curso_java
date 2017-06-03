package py.com.una.java.objetos;

import py.com.una.java.interfaces.Luchador;
import py.com.una.java.interfaces.Volador;

public class MujerMaravilla extends Persona implements Volador, Luchador {
	// Método implementado de la interfaz 'Volador'
	public void volar() {
		System.out.println("Mujer maravilla vuela");
	}

	// Método implementado de la interfaz 'Luchador'
	public void luchar() {
		System.out.println("Mujer maravilla lucha");
	}

	@Override
	public void volarMasAlto() {
		System.out.println("Mujer maravilla vuela mas alto");
		
	}
	
}