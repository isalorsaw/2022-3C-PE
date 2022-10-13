import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Ejemplo1
{
    public static void main(String args[])
    {
        //ImageIcon icono=new ImageIcon("Imagenes/fondo.jpg");
        ImageIcon icono=new ImageIcon("Imagenes/icono.png");
        JOptionPane.showMessageDialog(null,"Titulo","Informacion",JOptionPane.INFORMATION_MESSAGE,icono);
    }
}