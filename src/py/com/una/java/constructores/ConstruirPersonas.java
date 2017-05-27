package py.com.una.java.constructores;

import py.com.una.java.objetos.Persona;

public class ConstruirPersonas {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		System.out.println(p1);
		
        Persona p2 = new Persona(23);
        System.out.println(p2);
        
        Persona p3 = new Persona("Roberto");
        System.out.println(p3);
        
        Persona p4 = new Persona(25, "Humberto");
        System.out.println(p4);
	}

}
