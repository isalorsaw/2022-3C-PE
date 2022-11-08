package parcial2;
import javax.swing.JOptionPane;
public class TestArreglo
{
    public static void main(String args[])
    {
        //int a[]={1,2,3,4,5};
        int a[]=new int[10];
        FM.llenarAleatorio(a,10,18);
        FM.imprimir(a);
        //String inv=invertir(a);
        //FM.mensaje(inv);
        
        int valor=FM.pedirNumero("Favor ingrese un valor a buscar");
        
        boolean b=buscarValor(a,valor);
        
        if(b)
        {
            FM.mensaje("EL Valor "+valor+" si esta en el Arreglo");
            int p=retPosicion(a,valor);
            //FM.mensaje("El Valor "+valor+" esta en la posicion "+p);
            String poss=retPosiciones(a,valor);
            FM.mensaje("El Valor "+valor+" esta en las posiciones "+poss);
            FM.imprimir(a);
            int c=contarVeces(a,valor);
            FM.mensaje("El Valor "+valor+" esta "+c+" Veces ");
        }
        else FM.mensaje("EL Valor "+valor+" NO esta en el Arreglo");
    }
    public static void main2()
    {
                int arreglo[]=new int[10];
        FM.llenarAleatorio(arreglo,1,100);//Llenar de Forma Aleatoria
        //llenar(arreglo);//Llenar por Ingreso de Usuario
        FM.imprimir(arreglo);
        int s=FM.suma(arreglo);
        FM.mensaje("La suma de todos los numeros es "+s);
        
        int a[]={10,20,30,40,50};//Llenar de forma Predeterminada(Manual)
        FM.imprimir(a);
        
        String inv=invertir(a);
        FM.mensaje(inv);
        
        String imagenes[]={"imagen1.jpg","imagen2.jpg","imagen3.png"};
    }
    public static boolean buscarValor(int a[], int v)
    {
        for(int i=0;i<a.length;i++)
        {
            int va=a[i];
            if(va==v)return true;
        }
      return false;   
    }
    public static int retPosicion(int a[], int v)
    {
        for(int i=0;i<a.length;i++)
        {
            int va=a[i];
            if(va==v)return i+1;
        }
        return 0;
    }
    public static int contarVeces(int a[], int v)
    {
        int contar=0;
        for(int i=0;i<a.length;i++)
        {
            int va=a[i];
            if(va==v)contar++;
        }
        return contar;
    }
    public static String invertir(int a[])
    {
        String inv= "Informacion a la Inversa\n";                        
        for(int i=a.length-1; i>=0; i-- )
        {
            //inv= inv + c.charAt(a);
            inv=inv+" "+a[i];
            //mensaje(inv);
        }
        return inv;
    }
    public static String retPosiciones(int a[], int v)
    {
        String poss="";
        //Que vamos a hacer....
        return poss;
    }
}