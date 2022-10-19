/*
  Mostrar una Imagen Cualquiera en Java sobre un MessageDialog 
*/
package Paneles;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Ejemplo1
{
    public static void main(String args[])
    {
        ImageIcon icono=new ImageIcon(Ejemplo1.class.getResource("imagenes/1.jpg"));
        JOptionPane.showMessageDialog(null,"Informacion","Titulo de Arriba",JOptionPane.INFORMATION_MESSAGE,icono);
    }
}