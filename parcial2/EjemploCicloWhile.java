package parcial2;
/*
   Leer y validar un rango de números, Desde y Hasta y que muestre 
   cuantos y cuales son múltiplos de 3 hay en ese rango.
*/
import javax.swing.JOptionPane;
public class EjemploCicloWhile
{
    public static void main(String args[])
    {
        //Declaracion e Inicializacion de Variables
        int desde=0;
        int hasta=0;
        boolean seguir=true;
        //Ciclo Do While
        do
        {
            try
            {
                String d=JOptionPane.showInputDialog("Ingrese un Rango. Ingrese desde donde valor a partir");
                desde=Integer.parseInt(d);
                String h=JOptionPane.showInputDialog("Ingrese hasta donde vamos a llegar");
                hasta=Integer.parseInt(h);
                
                if(desde<hasta)seguir=false;
                else seguir=true;
                
                //seguir=(desde<hasta)?false:true;

            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,"Error "+exp);
            }
        }while(seguir);
        
        //Inicializacion y Declaracion de Variables
        int contar=0;
        String s="";
        
        //Correr desde Desde - Hasta
        int i=desde;
        while(i<=hasta)
        {
            if(i%3==0)
            {
                contar++;//contar=contar+1
                s=s+" "+i;//s+=" "+i
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,"Hay "+contar+" Multiplos de 3\nQue fueron "+s);
    }
}