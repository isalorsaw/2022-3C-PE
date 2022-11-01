package parcial2;
/*
   Crea una aplicación que permita adivinar un número. La aplicación genera un número 
   aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a 
   adivinar es mayor o menor que el introducido, además de los intentos que te quedan 
   (tienes 10 intentos para acertarlo).
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), 
si se llega al límite de intentos te muestra el número que había generado.*/
import javax.swing.JOptionPane;
public class Ejercicio6
{
    public static void main(String args[])
    {
         int r=((int)(Math.random()*(100-1+1)+1));   
         System.out.println(r+" Este es el random");
         int num=0;
         int i=1;
         while(i<=10)
         {
             num=pedirNumero("Ingrese un Numero");
             if(r<num)JOptionPane.showMessageDialog(null,"El Numero random es Menor");
             else if(r>num)JOptionPane.showMessageDialog(null,"El Numero random es Mayor");
             else 
             {
              JOptionPane.showMessageDialog(null,"El Numero random Lo adivino. Lo hizo en "+i+" Veces");
              i=10;
             }
             i++;
         }
    }
    public static String pedirCadena(String msg)
    {
        boolean seguir=true;
        String cadena="";
        do
        {
            try
            {
                cadena=JOptionPane.showInputDialog(msg);  
                if(cadena.length()>0)seguir=false;                
            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,exp);
            }

        }while(seguir);
        return cadena;
    }
    public static int pedirNumero(String msg)
    {
        int n=0;
        boolean seguir=true;
        do
        {
            try
            {
                String m=pedirCadena(msg);
                n=Integer.parseInt(m);
                seguir=false;   
            }
            catch(Exception exp)
            {
                //mensaje(exp+"");
            }
        }while(seguir);
        return n;
    }
}