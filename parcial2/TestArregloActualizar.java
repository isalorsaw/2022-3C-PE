package parcial2;
public class TestArregloActualizar
{
    static int ar[]={11,12,13,14,15};//Variable Global
    public static void main(String args[])
    {
        //int a[]={11,12,13,14,15};//Variable Local
        FM.mensaje("Arreglo Original "+imprimir(ar));
        elimPosicion(ar,3);
        FM.mensaje("Nuevo Arreglo "+imprimir(ar));
        insAlFinal(ar,20);
        FM.mensaje("Insertar al Final "+imprimir(ar));
    }
    public static void insAlFinal(int a[], int v)
    {
        ar=new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            ar[i]=a[i];
        }
        ar[a.length]=v;
    }
    public static void elimPosicion(int a[], int p)
    {
        int b[]=new int[a.length-1];//Arreglo con 1 posicion menos
        int ip=p-1;
        
        for(int i=0;i<b.length;i++)
        {
            if(ip>i)
            {
                b[i]=a[i];
            }
            else
            {
                b[i]=a[i+1];
            }
        }
        
        ar=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            ar[i]=b[i];
            //FM.mensaje(b[i]+" ");
        }
        //FM.mensaje(imprimir(a));
    }
    public static String imprimir(int a[])
    {
        String c="";
        int i=0;
        while(i<a.length)
        {
            c+=a[i]+" ";
            i++;
        }
        return c;
    }
}
