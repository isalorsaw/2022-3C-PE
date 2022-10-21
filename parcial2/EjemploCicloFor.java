package parcial2;
/*
   Pedir 5 numeros y mostrar cuantos son pares.
   */
import javax.swing.JOptionPane;
public class EjemploCicloFor
{
    public static void main(String args[])
    {
        //Ciclo For
        int n=0;
        int contar=0;//Contador
        int suma=0;//Acumulador
        String pares="";//Concatenar
        
        int contari=0;
        int sumai=0;
        String impares="";
        
        for(int i=0;i<5;i++)
        {
            try
            {
                n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
                
                if(n%2==0)
                {
                    contar++;//contar=contar+1;
                    suma=suma+n;//suma+=n;
                    pares=pares+" "+n;
                }
                else
                {
                    contari++;
                    sumai=sumai+n;
                    impares+=n+" ";
                }
            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,exp);
            }
        }
        JOptionPane.showMessageDialog(null,"Ingrese "+contar+" numeros Pares\nLa suma de ellos es "+
        suma+"\nLos numeros pares fueron "+pares);
        
        JOptionPane.showMessageDialog(null,"Ingrese "+contari+" numeros ImPares\nLa suma de ellos es "+
        sumai+"\nLos numeros impares fueron "+impares);
        /*int i=0;
        while(i<5)
        {
            i++;
        }*/
        
    }
}