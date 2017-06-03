package py.com.una.java.excepciones;

import py.com.una.java.objetos.Persona;

public class AppCine {

	public static void main(String[] args) {
		Persona p = new Persona(16);
		Persona p2 = new Persona(21);
		
		try {
			verPelicula(p);
		} catch (MenorDeEdadException e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("Esto se ejecuta siempre");
		}
		
		try {
			verPelicula(p2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("Esto se ejecuta siempre");
		}
		
	}
	
	public static void verPelicula(Persona p) throws MenorDeEdadException{
		if(p.getEdad() < 18){
			throw new MenorDeEdadException();
		}
		
		//si se lanzo la excepcion, este bloque no se ejecuta
		System.out.println("Viendo pelicula ...");
	}

}
