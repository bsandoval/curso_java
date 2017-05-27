package py.com.una.java.modificadores;

public class Encapsulamiento {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.nombre = "Beatriz";
		// Acccedemos al atributo de clase
		int contadorInterno = Persona.CONTADOR;
		
		// Accedemos al atributo de clase a 
		//traves del objeto,
		// aunque esto no es recomendado
		int c = p.CONTADOR;
	}
}
