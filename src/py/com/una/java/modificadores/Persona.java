package py.com.una.java.modificadores;

public class Persona {
	protected int edad;
	public String nombre;
	private String cedula;
	String apellido;
	
	public static int CONTADOR = 0;
	
	public Persona() {
		super();
		System.out.println("Una persona");
	}
	
	public Persona(int edad) {
       this.edad = edad;
       System.out.println("Una persona con edad: "+ edad);
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
