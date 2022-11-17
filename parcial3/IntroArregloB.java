package parcial3;
public class IntroArregloB
{
    public static void main(String args[])
    {
        String juego[][]=new String[5][5];
        llenarMatriz(juego);
        
        
        int f=FM.generaAleatorio(1,5);
        int c=FM.generaAleatorio(1,5);
        juego[f-1][c-1]="[X]";
        
        imprimir(juego);
    }
    public static void llenarMatriz(String b[][])
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]="[ ]";
            }
        }        
    }
    public static void main2()
    {
        int falea=FM.generaAleatorio(1,5);
        int calea=FM.generaAleatorio(1,5);
        FM.mensaje("Se va a crear una Matriz de "+falea+"X"+calea);
        int m[][]=new int[falea][calea];
        llenarMatriz(m,5);
        imprimir(m);
        llenarAleatorio(m,10,150);
        imprimir(m);
    }
    public static void llenarAleatorio(int b[][], int d, int h)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=FM.generaAleatorio(d,h);
            }
        }
    }
    public static void llenarMatriz(int b[][], int v)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=v;
            }
        }
    }
    public static void imprimir(int b[][])
    {
        String c="Informacion de la Matriz\n";
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                c+=b[i][j]+"-";
            }
            c+="\n";
        }
        FM.mensaje(c);
    }
    public static void imprimir(String b[][])
    {
        String c="Informacion de la Matriz\n";
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                c+=b[i][j];
            }
            c+="\n";
        }
        FM.mensaje(c);
    }
}