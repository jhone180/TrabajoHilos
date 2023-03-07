
import java.util.Scanner;

public class Main extends Thread{
    
	public static void main(String [] args){
        
		Scanner Lectura = new Scanner(System.in);
        
        	ReproducirMusica Cancion = new ReproducirMusica();
        	Cancion.start();
        
        	Bienvenida();
        
        	Lectura.nextLine();
        
        	Escribir CuentaRegresiva = new Escribir();
        	Preguntas Cuestionario = new Preguntas();
        
        	Cuestionario.start();
        	CuentaRegresiva.start();
    }
    
    	public static void Bienvenida(){
        	System.out.println(" ---------------------------------------------------------------");
        	System.out.println("| Bienvenido al cuestionario de 5 preguntas de cultura general. |");
        	System.out.println("| Cada palabra de la respuesta debe comenzar con mayuscula.     |");
        	System.out.println("| Cada respuesta correcta suma 1 punto.                         |");
        	System.out.println("| Presiona enter para comenzar!                                 |");
        	System.out.println(" ---------------------------------------------------------------");
    }
}
