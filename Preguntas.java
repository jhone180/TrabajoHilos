
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Preguntas extends Thread {
    
    	public List<String> respuestasUsuario;
    
    	private List<String> preguntas;
    
    	private List<String> respuestas;
    
    	public Scanner lectura;
    
    	public int contador;
    
    	public int puntuacion;
    
    
    	public Preguntas(){
        	respuestasUsuario = new ArrayList<>();
        	preguntas = new ArrayList<>();
        	respuestas = new ArrayList<>();
        	lectura = new Scanner(System.in);
    	}
    
    	public void run(){
            	PreguntasRespuestas();
    	}
    
    	public void PreguntasRespuestas() {

        	preguntas.add("Cual es la capital de Colombia?");
        	preguntas.add("En que ano finalizo la segunda guerra mundial?");
        	preguntas.add("En que pais se encuentra la torre de Pisa?");
        	preguntas.add("Quien invento la bombilla?");
        	preguntas.add("Cual es el oceano mas grande del mundo?");

        	respuestas.add("Bogota");
        	respuestas.add("1945");
        	respuestas.add("Italia");
        	respuestas.add("Thomas Edison");
        	respuestas.add("Oceano Pacifico");

        	respuestasUsuario = registroRespuestas(preguntas);

        	puntuacion = comparativaRespuestas(respuestas, respuestasUsuario);

        	System.out.println("TU PUNTUACION ES " + contador);
    	}

    	public List<String> registroRespuestas(List<String> preguntas) {
        	for (String pregunta : preguntas) {
            	System.out.println("\n" + pregunta);
            	respuestasUsuario.add(lectura.nextLine());
        	}
        	return respuestasUsuario;
    	}

    	public int comparativaRespuestas(List<String> Respuestas, List<String> RespuestasUsuario) {
        	contador = 0;
        	for (String respuesta : Respuestas) {
            		if (RespuestasUsuario.contains(respuesta)) {
                	contador++;
            		}
        	}
        	return contador;
    	}
}
