/**
 * 
 */
package py.com.una.java.objetos;

/**
 * @author bsandoval
 *
 */
public class CuentaBancaria {

	double balance = 2000000;//Variable de instancia
	
	public void retirar(double monto){//Variable local
		balance = balance - monto;
	}
}
