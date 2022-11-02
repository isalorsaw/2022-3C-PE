package parcial2;
import javax.swing.JOptionPane;
public class FM
{
    public static int suma(int ar[])
    {
        int s=0;
        for(int i=0;i<ar.length;i++)
        {
            s+=ar[i];
        }
        return s;
    }
    public static void llenarAleatorio(int ar[], int desde, int hasta)
    {
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=generaAleatorio(desde,hasta);
        }
    }
    public static int generaAleatorio(int desde, int hasta)
    {
       return ((int)(Math.random()*(hasta-desde+1)+desde));
    }
    public static void imprimir(int ar[])
    {
        String c="Informacion del Arreglo\n";
        int i=0;
        while(i<ar.length)
        {
            //c=c+ar[i]+" ";//concatenar
            c=c+ar[i]+" ";
            i++;
        }
        mensaje(c);
    }
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
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