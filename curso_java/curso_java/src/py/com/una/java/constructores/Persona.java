package py.com.una.java.constructores;
/**
 * 
 * @author bsandoval
 *
 */
public class Persona {
	
	private int edad;
	
	private String nombre;

	public Persona() {
        System.out.println("Una persona genérica");
    }

    public Persona(int edad) {
       this.edad = edad;
       System.out.println("Una persona con edad: "+ edad);
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("Una persona de nombre: "+ nombre);
    }

    public Persona(int edad, String nombre) {
       this.edad = edad;
       this.nombre = nombre;
       System.out.println("Una persona con edad: "+ edad + " y nombre: "+ nombre);
    }

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
