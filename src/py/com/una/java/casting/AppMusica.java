package py.com.una.java.casting;

import py.com.una.java.objetos.Instrumento;
import py.com.una.java.objetos.InstrumentoCuerda;
import py.com.una.java.objetos.InstrumentoViento;

public class AppMusica {
	
    public static void tune(Instrumento i){
        i.sonar(3848);
    }
    
    public static void main(String[] args) {
        InstrumentoViento flauta = new InstrumentoViento();
        tune(flauta); // Upcasting
        
        InstrumentoCuerda guitarra = new InstrumentoCuerda();
        tune(guitarra);// Upcasting
    }
}
