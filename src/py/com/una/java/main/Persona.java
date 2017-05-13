/**
 * 
 */
package py.com.una.java.main;

/**
 * @author bsandoval
 *
 */
public class Persona {
	{
	    contadorPersona = 10;
	}
	static {
	    contadorPersona = 20;
	}
	private static int contadorPersona = 1000;
	{
	    contadorPersona = 30;
	}
	static {
	    contadorPersona = 40;
	}
	public static void main(String[] args) {
	   System.out.println(Persona.contadorPersona);
	   Persona p = new Persona();
	   System.out.println(Persona.contadorPersona);
	   Persona.contadorPersona = 100;
	   p = new Persona();
	   System.out.println(Persona.contadorPersona);
	}

}
