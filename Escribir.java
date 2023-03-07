
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Escribir extends Thread {
    
    	public List<String> Frases;
    
    	public List<String> ImprimirFrases;
    
    	private String Usuario;
    
    	public Random Aleatorio;
    
    	public void run() {
        	EscribirFuncion(10, 10);
    	}
    
    	public Escribir(){
        	Frases = new ArrayList<>();
        	Aleatorio = new Random();
        	Usuario = System.getProperty("user.name");
    	}
    
    	public void EscribirFuncion(int a, int b) {
        	try {
            		if (a > 0) {
                		ImprimirFrases();
                		Thread.sleep(5000);
                		EscribirFuncion(a - 1, b);
            		} else {
                		System.out.println("Finalizado.");
            		}
        	} catch (InterruptedException ex) {
            		System.out.println("Error intente de nuevo mas tarde.");
        	}
    	}
    
	public List<String> IndicarFrases(){
		Frases.add("Facil verdad?");
        	Frases.add("Pregunta regalada.");
        	Frases.add("Hmm...");
        	Frases.add("Hola " + Usuario);
        	Frases.add("Sera una puntuacion perfecta...?");
        	Frases.add("Toma mucha agua. :)");
        
        	return Frases;
    	}
    
    	public void ImprimirFrases(){
        	ImprimirFrases = IndicarFrases();
        	int index = Aleatorio.nextInt(ImprimirFrases.size());
        	System.out.println(" ----------------------------- ");
        	System.out.println("| " + ImprimirFrases.get(index));
        	System.out.println(" ----------------------------- ");
    	} 
}
