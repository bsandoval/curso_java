package py.com.una.java.objetos;

/**
 * 
 * @author felipehermosilla
 *
 */
public class InstrumentoViento extends Instrumento {
    // Redefine interface method:
    public void sonar(Integer codNota) {
        System.out.println("InstrumentoViento.sonar() " + codNota);
    }
}
