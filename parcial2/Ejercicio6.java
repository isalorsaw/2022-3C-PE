package parcial2;
/*
   Crea una aplicación que permita adivinar un número. La aplicación genera un número 
   aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a 
   adivinar es mayor o menor que el introducido, además de los intentos que te quedan 
   (tienes 10 intentos para acertarlo).
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), 
si se llega al límite de intentos te muestra el número que había generado.*/
import javax.swing.JOptionPane;
//import MisFunciones
public class Ejercicio6
{
    public static void main(String args[])
    {
         int r=FM.generaAleatorio(1,100);   
         System.out.println(r+" Este es el random");
         int num=0;
         int i=1;
         while(i<=10)
         {
             num=FM.pedirNumero("Ingrese un Numero");
             if(r<num)FM.mensaje("El Numero random es Menor");//JOptionPane.showMessageDialog(null,"El Numero random es Menor");
             else if(r>num)FM.mensaje("El Numero random es Mayor");//JOptionPane.showMessageDialog(null,"El Numero random es Mayor");
             else 
             {
              FM.mensaje("Adivino el Numero. Lo hizo en "+i+" Intentos");
              //JOptionPane.showMessageDialog(null,"El Numero random Lo adivino. Lo hizo en "+i+" Veces");
              i=10;
             }
             i++;
         }
    }
}