package py.com.una.java.objetos;

public class Persona {
	int edad;
	
	String nombre;

	String getNombre(){
		return this.nombre;
	}
	
	void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	int getEdad(){
		return this.edad;
	}
	
	void setEdad(int edad){
		this.edad=edad;
	}
}
