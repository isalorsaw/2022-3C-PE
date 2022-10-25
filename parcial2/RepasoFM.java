package parcial2;
import javax.swing.JOptionPane;
public class RepasoFM
{
    //Main
    public static void main(String args[])
    {
        /*String m="Hola Mundo";
        mensaje(m);//llamado a un metodo
        mError(m,"Titulo Arriba");
        mInformacion(m,"Mensaje");
        mAdvertencia(m,"Mensaje Arriba");*/
        
        /*int n1=0;
        int n2=0;
        int s=n1+n2;
        mensaje(n1+" + "+n2+" = "+s);*/
        
        /*String nombre=pedirCadena("Ingrese un Nombre");
        String apellido=pedirCadena("Ingrese un Apellido");
        int edad=pedirNumero("Ingrese la Edad");
        mensaje("Mi nombre es "+nombre+" "+apellido+" y tengo "+edad+" anios");*/
        int n1=0;
        String concat="";
        
        for(int i=0;i<5;i++)
        {
            n1=pedirNumero("Ingrese un Numero");
            concat=concat+n1+" ";
        }
        mensaje("Los numeros ingresados fueron "+concat);
        
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
    //Metodo
    public static void mensaje(String m)//Un parametro un string
    {
        JOptionPane.showMessageDialog(null,m);
    }
    public static void mError(String m, String t)
    {
        JOptionPane.showMessageDialog(null,m,t,0);
    }
    public static void mInformacion(String m, String t)
    {
        JOptionPane.showMessageDialog(null,m,t,1);
    }
    public static void mAdvertencia(String m, String t)
    {
        JOptionPane.showMessageDialog(null,m,t,2);
    }
    public static void mostrarImagen(String info, String titulo, String ruta)
    {
        //Manana 25
    }
}