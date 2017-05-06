package py.com.una.java.objetos;
/**
 * 
 * @author bsandoval
 *
 */
public class Alumno {
	private int edad;
	private String nombre;
	private boolean alumnoRegular;
	private boolean alumnoIntercambio;
	
	public Alumno() {
		//en el constructor indicamos valores por defecto
		this.alumnoRegular = false;
		this.alumnoIntercambio = false;
    }
	
	public Alumno(int edad) {
		this(); //indicamos que primero se debe llamar al constructor por defecto
		this.edad = edad;
	}
	
	/**
	 * <b><u><i>Retorna la cantidad de horas netas que estudiará el alumno</i></u></b>
	 * 
	 * @param horas
	 * @param netflix
	 * @return totalHoras
	 */
	public int estudiar(int horas, int netflix){
		int totalHoras = horas - netflix;
		System.out.println("Estudiaré "+ totalHoras +" horas");
		return totalHoras;
	}
	
	/*public void limpiarDatos(){
		System.out.println("Limpiando datos del alumno");
		this.edad = 0;
		this.nombre = null;
	}*/
	
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
	public boolean isAlumnoRegular() {
		return alumnoRegular;
	}
	public void setAlumnoRegular(boolean alumnoRegular) {
		this.alumnoRegular = alumnoRegular;
	}
	public boolean isAlumnoIntercambio() {
		return alumnoIntercambio;
	}
	public void setAlumnoIntercambio(boolean alumnoIntercambio) {
		this.alumnoIntercambio = alumnoIntercambio;
	}
	
}
