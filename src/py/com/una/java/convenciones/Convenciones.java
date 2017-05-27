package py.com.una.java.convenciones;

import py.com.una.java.objetos.Persona;


/**
 * Tiene como proposito exponer el uso de
 * las siguientes sentencias de control de flujo:
 * <ol>
 * 	<li>if/else</li>
 * 	<li>switch/case</li>
 * 	<li>while</li>
 * 	<li>do/while</li>
 * 	<li>for/each</li>
 * </ol>
 * @author bsandoval
 *
 */
public class Convenciones {

	public static void main(String[] args) {
		Persona p = new Persona(23);
		
		//if-else sentence
		if(p.getEdad() <= 17){
			System.out.println("Es una persona menor");
		}else if(p.getEdad() >= 18 && p.getEdad() <= 25){
			System.out.println("Es una persona joven");
		}else{
			System.out.println("Es una persona adulta");
		}
		
		//switch-case sentence
		switch (p.getEdad()) {
		case 17:
			System.out.println("Es una persona menor");
			break;
		case 23:
			System.out.println("Es una persona joven");
			break;
		default:
			System.out.println("Es una persona adulta");
			break;
		}
		
		//while sentence
		int x = 0;
		while(x <= 20){
			//esto solo se ejecuta si cumple la condicion
			if(x % 2 == 0){
				System.out.println(x);
			}
			x++;//asegurarse de incrementar la variable que condiciona el loop
		}
		
		//do-while sentence
		x = 0;
		do{
			//esto se ejecuta al menos una vez
			if(x % 2 == 0){
				System.out.println(x);
			}
			x++;
		}while(x <= 20);
		
		//for-each sentence
		for (int i = 0; i <= 20; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		
	}

}
