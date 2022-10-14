package Paneles;
/*
Mostrar Imagenes con un Listado de Opciones
   */
import javax.swing.*;

public class Ejemplo4
{
    public static void main(String args[])
    {
        ImageIcon icono=new ImageIcon(Ejemplo1.class.getResource("imagenes/1.jpg"));
        Object seleccion = JOptionPane.showInputDialog(
                           null,
                           "Seleccion Respuesta Correcta",
                           "Preguntas",
                           JOptionPane.QUESTION_MESSAGE,
                           icono,
                           new Object[] { "opcion 1", "opcion 2", "opcion 3","opcion 4" }, 
                           "opcion 3");
                        
       if(seleccion.equals("opcion 1"))
       {
        JOptionPane.showMessageDialog(null,"OPCION SELECCIONADA: "+seleccion,"",JOptionPane.INFORMATION_MESSAGE,
        new ImageIcon("imagenes/img1.png"));
       }
       
    }
}