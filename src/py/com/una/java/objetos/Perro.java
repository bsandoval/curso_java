package py.com.una.java.objetos;

/**
 * 
 * @author felipehermosilla
 *
 */
public class Perro {
	static final Integer FRECUENCIA_NORMAL = new Integer(51);
	static final Integer FRECUENCIA_ALTA = 11000;
	private Integer frecuenciaLadrido;

	public void setFrecuenciaLadrido(Integer frecuenciaLadrido) {
		this.frecuenciaLadrido = frecuenciaLadrido;
	}

	public Integer getFrecuenciaLadrido() {
		if (this.frecuenciaLadrido == null) {
			inicializarFrecuencia();
		}
		return this.frecuenciaLadrido;
	}

	private void inicializarFrecuencia() {
		this.setFrecuenciaLadrido(Perro.FRECUENCIA_NORMAL);
	}

	public void ladrar(){
		   System.out.println("-- Método 'Ladrar' de la clase Perro---");
	       System.out.println("Emitiendo ladrido con frecuencia: "+ getFrecuenciaLadrido());
	}

}
