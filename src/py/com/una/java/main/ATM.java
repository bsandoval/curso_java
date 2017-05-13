/**
 * 
 */
package py.com.una.java.main;

import py.com.una.java.objetos.CuentaBancaria;

/**
 * @author bsandoval
 *
 */
public class ATM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();
		double monto = 20000;
		cuenta.retirar(monto);
		System.out.println("Retire su dinero!");
	}

}
