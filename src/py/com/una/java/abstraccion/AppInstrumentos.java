/**
 * 
 */
package py.com.una.java.abstraccion;

import py.com.una.java.objetos.Instrumento;
import py.com.una.java.objetos.InstrumentoCuerda;
import py.com.una.java.objetos.InstrumentoViento;

/**
 * @author bsandoval
 *
 */
public class AppInstrumentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InstrumentoViento flauta = new InstrumentoViento();
		InstrumentoCuerda guitarra = new InstrumentoCuerda();
		
		//casting
		Instrumento violin = new InstrumentoCuerda();
		
		//clase abstracta, no se puede instanciar
		//Instrumento violin = new Instrumento();
		
		ejecutarInstrumento(flauta);
		ejecutarInstrumento(guitarra);
		ejecutarInstrumento(violin);
	}
	
	public static void ejecutarInstrumento(Instrumento instrumento){
		instrumento.sonar(5);
	}

}
