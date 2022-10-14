/*
 * Mostrar un listado de Imagenes
*/
package Paneles;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Ejemplo3
{
    public static void main(String args[])
    {
        String imagenes[]={"1.jpg","2.jpg","3.jpg","fondo.jpg","icono.png","img1.png","img2.png"};
        ImageIcon icono;
         
        for(int i=0;i<imagenes.length;i++)
        {
            icono=new ImageIcon(Ejemplo1.class.getResource("imagenes/"+imagenes[i]));
            JOptionPane.showMessageDialog(null,"","Titulo de Arriba",JOptionPane.INFORMATION_MESSAGE,icono);
        }
    }
}
