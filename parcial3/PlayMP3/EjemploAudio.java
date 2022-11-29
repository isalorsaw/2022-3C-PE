package parcial3.PlayMP3;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
public class EjemploAudio 
{
    public static void main(String[] args) 
    {
       /* String filename = "mariobros.mp3";//Inicializamos la Ruta
        MP3Player mp3Player = new MP3Player(filename);//Inicializamos MP3Player
        mp3Player.play();//Reproducimos*/
        
        File file=new File("parcial3/PlayMp3/mp3/mariobros.mp3");
        String filename=file.getAbsolutePath();
        System.out.println(filename);
        
        MP3Player mp3Player = new MP3Player(filename);//Inicializamos MP3Player
        mp3Player.play();//Reproducimos

        Scanner sc = new Scanner(System.in);
        System.out.println("Write stop to stop the music: ");

        if (sc.nextLine().equalsIgnoreCase("stop")) {
            mp3Player.close();
        }

    }
}