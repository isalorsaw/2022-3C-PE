package Paneles;
import javax.swing.*;
public class Ejemplo2
{
    public static void main(String args[])
    {
        String imagenes[]={"1.jpg","2.jpg","3.jpg"};//Arreglo
        
        int aleatorio=2;
        ImageIcon icono=new ImageIcon(Ejemplo2.class.getResource("imagenes/1.jpg"));
        int seleccion = JOptionPane.showOptionDialog(null,
                       "Informacion", 
                       "Titulo",
                       JOptionPane.YES_NO_CANCEL_OPTION,
                       JOptionPane.QUESTION_MESSAGE,
                       icono,
                       new Object[] { "Perro", "Gato", 
                       "Elefante" },   // null para YES, NO y CANCEL
                       "Perro");
 
        if (seleccion != -1)
        {
            if(seleccion==0)
            {  
                JOptionPane.showMessageDialog(null,"Primera Opcion");
            }
            if(seleccion==1)
            {
                 JOptionPane.showMessageDialog(null,"DOS");
            }
            if(seleccion==2)
            {
                 JOptionPane.showMessageDialog(null,"TRES");
            }
        }
        
    }
}
