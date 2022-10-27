package parcial2;
import javax.swing.JOptionPane;
public class EjercicioClaseFM
{
    public static void main(String args[])
    {
        String c=pedirCadena("Ingrese una Cadena");//Pedir Cadena
        char pl=primLetra(c);//Retorna primera letra
        char ul=ultLetra(c);//Retorna ultima letra
        String inv=invertir(c);//Invertir
        mensaje("La cadena es "+c+"\nPrimera Letra es "+pl+"\nUltima Letra es "+ul+
        "\nA la inversa es "+inv);
        mostrarLetraXLetra(c);
        invertirM(c);
    }
    public static void mostrarLetraXLetra(String c)
    {
        String lxl="";
        int i=0;
        while(i<=c.length()-1)
        {
            char letra=c.charAt(i);
            lxl=lxl+letra;
            mensaje(""+letra);
            i++;
        }
        //return lxl;
    }
 /*   public static String mostrarLetraXLetraF(String c)
    {
        String lxl="";
        int i=0;
        while(i<=c.length()-1)
        {
            char letra=c.charAt(i);
            lxl=lxl+letra;
            i++;
        }
        return lxl;
    }*/
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
    public static char primLetra(String cad)
    {
        return cad.charAt(0);
    }
    public static char ultLetra(String cad)
    {
        return cad.charAt(cad.length()-1);
    }
    public static int tamanio(String c)
    {
        return c.length();
    }
    public static String invertir(String c)
    {
        String inv= "";                        
        for(int a= c.length()-1; a>=0; a-- )
        {
            inv= inv + c.charAt(a);
            //mensaje(inv);
        }
        return inv;

    }
    public static void invertirM(String c)
    {
        String inv= "";                        
        for(int a= c.length()-1; a>=0; a-- )
        {
            inv= inv + c.charAt(a);
            //mensaje(inv);
        }
        mensaje(inv);

    }
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
}
