package Paneles;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Ejemplo1
{
    public static void main(String args[])
    {
        ImageIcon icono=new ImageIcon("fondo.jpg");
        JOptionPane.showMessageDialog(null,"","Titulo de Arriba",JOptionPane.INFORMATION_MESSAGE,icono);
    }
}