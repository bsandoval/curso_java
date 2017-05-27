package py.com.una.java.objetos;

public class Caniche extends Perro{

	@Override
	public void ladrar(){
		   System.out.println("-- Método 'Ladrar' de la clase Caniche---");
	       System.out.println("Emitiendo ladrido con frecuencia: "+ getFrecuenciaLadrido());
	}
}
