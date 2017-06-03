package py.com.una.java.casting;

import py.com.una.java.objetos.Caniche;
import py.com.una.java.objetos.MujerMaravilla;
import py.com.una.java.objetos.OvejeroAleman;
import py.com.una.java.objetos.Perro;
import py.com.una.java.objetos.Superman;

/**
 * 
 * @author felipehermosilla
 *
 */
public class AppCasting {

	public static void main(String[] args) {
		Perro p;
		p = new Caniche(); // Upcasting
		p.ladrar();
		
		Caniche c;
		c = (Caniche) p; // Downcasting Correcto
		c.ladrar();
		
//		OvejeroAleman o;
//		o = (OvejeroAleman) p; // Downcasting Incorrecto (p es un caniche)
		
		Superman superMan = new Superman();
		superMan.volar();
		superMan.luchar();
		superMan.volarMasAlto();
		
		MujerMaravilla mujerMaravilla = new MujerMaravilla();
		mujerMaravilla.volar();
		mujerMaravilla.luchar();
		mujerMaravilla.volarMasAlto();
		
		
	}

}
