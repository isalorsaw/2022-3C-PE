/*
  Mostrar una Imagen Cualquiera en Java sobre un MessageDialog 
*/
package Paneles;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;
public class Ejemplo5
{
    public static void main(String args[])
    {
        UIManager UI=new UIManager();
         UI.put("OptionPane.background", new Color(153, 138, 135));
         UI.put("Panel.background", Color.red);

        JOptionPane.showMessageDialog(null,"Text","SetColor",JOptionPane.INFORMATION_MESSAGE);
 
        ImageIcon icono=new ImageIcon(Ejemplo5.class.getResource("imagenes/fondo2.jpg"));
        JOptionPane.showMessageDialog(null,"Informacion","Titulo de Arriba",JOptionPane.INFORMATION_MESSAGE,icono);
    }
}
