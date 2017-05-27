package py.com.una.java.objetos;

/**
 * 
 * @author felipehermosilla
 *
 */
public class OvejeroAleman extends Perro {

	@Override
	public void ladrar(){
		   System.out.println("-- Método 'Ladrar' de la clase OvejeroAleman---");
	       System.out.println("Emitiendo ladrido con frecuencia: "+ getFrecuenciaLadrido());
	}
}
