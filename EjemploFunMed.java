/*
 * Ejemplo Introductorio a Funciones y Metodos.
 */
import javax.swing.JOptionPane;
public class EjemploFunMed
{
    public static void main(String args[])
    {
        /*int n1=pedirNumero("Favor Ingrese el Primer Numero");
        int n2=pedirNumero("Favor INgrese el 2do Numero");
        int s=suma(n1,n2);
        mensaje("La suma de "+n1+"+"+n2+"="+s);*/
        
        /*double n1=pedirDouble("Favor Ingrese el Primer Numero");
        double n2=pedirDouble("Favor INgrese el 2do Numero");
        double s=suma(n1,n2);
        mensaje("La suma de "+n1+"+"+n2+"="+s);*/
        
        //String cadena=pedirCadena("Favor Ingrese una Palabra");
        
        int opcion=pedirNumero("Menu.\n1. Mostrar tamaño \n2. Mostrar la Ultima Letra "+
            "\n3. Mostrar la Primera Letra\n4 Convertir a Mayusculas\n5 Convertir a Minusculas\n0 Salir"+
            "\n\nINGRESE UNA OPCION");
    
    }
    //Metodo para mostrar un mensaje
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
    //Funcion que sume dos enteros y retorne un entero
    public static int suma(int n1, int n2)
    {
        int suma=n1+n2;
        return suma;
    }
    //Funcion que sume dos double y que retorne un double
    public static double suma(double n1, double n2)
    {
        return n1+n2;
    }
    //Funcion que pida un entero
    public static int pedirNumero(String msg)
    {
        boolean seguir=true;
        String entrada="";
        int n=0;
        
        do{
            try
            {
                entrada=JOptionPane.showInputDialog(msg);
                n=Integer.parseInt(entrada);    
                seguir=false;
            }
            catch(Exception exp)
            {
                mensaje("Ingreso un Caracter Invalido");
            }
        }while(seguir==true);
       return n;
    }
    //Funcion que pida un double
    public static double pedirDouble(String msg)
    {
        boolean seguir=true;
        String entrada="";
        double n=0;
        
        do{
            try
            {
                entrada=JOptionPane.showInputDialog(msg);
                n=Double.parseDouble(entrada);    
                seguir=false;
            }
            catch(Exception exp)
            {
                mensaje("Ingreso un Caracter Invalido");
            }
        }while(seguir==true);
       return n;
    }
    //Funcion que pida una cadena y que lo retorna
    /*public static String pedirCadena(String msg)
    {
        boolean seguir=true;
        String cadena="";
        
        do
        {
            cadena=JOptionPane.showInputDialog(msg);
            if(cadena.length()>0)seguir=false;
        }while(seguir);
        return cadena;
    }*/
}