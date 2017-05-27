package py.com.una.java.objetos;

import py.com.una.java.interfaces.Luchador;
import py.com.una.java.interfaces.Volador;

/**
 * 
 * @author felipehermosilla
 *
 */
public class Superman extends Persona implements Volador, Luchador {
	// Método implementado de la interfaz 'Volador'
	public void volar() {
		System.out.println("Superman vuela");
	}

	// Método implementado de la interfaz 'Luchador'
	public void luchar() {
		System.out.println("Superman lucha");
	}
}
