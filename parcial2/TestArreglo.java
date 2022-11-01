package parcial2;
import javax.swing.JOptionPane;
public class TestArreglo
{
    public static void main(String args[])
    {
        int arreglo[]=new int[10];
        llenarAleatorio(arreglo,1,100);//Llenar de Forma Aleatoria
        //llenar(arreglo);//Llenar por Ingreso de Usuario
        imprimir(arreglo);
        int s=suma(arreglo);
        mensaje("La suma de todos los numeros es "+s);
        
        int a[]={10,20,30,40,50};//Llenar de forma Predeterminada(Manual)
        imprimir(a);
        
        String imagenes[]={"imagen1.jpg","imagen2.jpg","imagen3.png"};
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
    public static int suma(int ar[])
    {
        int suma=0;
        for(int i=0;i<ar.length;i++)
        {
            suma=suma+ar[i];
        }
        return suma;
    }
    public static void llenar(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=pedirNumero("Favor Ingrese un Numero");
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
                mensaje(exp+"");
            }
        }while(seguir);
        return n;
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
    public static void mensaje(String c)
    {
        JOptionPane.showMessageDialog(null,c);
    }
}