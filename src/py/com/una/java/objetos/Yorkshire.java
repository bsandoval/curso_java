package py.com.una.java.objetos;

/**
 * Subclase de la clase 'Perro'
 * @author felipehermosilla
 *
 */
public class Yorkshire extends Perro {
	// Aquí se sobreescribe el método ‘ladrar’ de la clase padre ‘Perro’
	@Override
	public void ladrar() {
		setFrecuenciaLadrido(Perro.FRECUENCIA_ALTA);
		// ‘super’ llama al método ‘ladrar’ de la clase padre.
		super.ladrar();
	}
}
