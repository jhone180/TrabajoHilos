
import java.io.*;
import javax.sound.sampled.*;

public class ReproducirMusica extends Thread {

    	public void run() {
        	try {

            		String rutaArchivo = new File("").getAbsolutePath() + File.separator + "cancion.wav";

            		File archivo = new File(rutaArchivo);
            		AudioInputStream audioIn = AudioSystem.getAudioInputStream(archivo);

            		Clip clip = AudioSystem.getClip();
            		clip.open(audioIn);

            		clip.start();

            		Thread.sleep(10000);
        	} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            		e.printStackTrace();
        	}
    	}
}
