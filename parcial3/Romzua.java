package parcial3;
import javax.swing.JOptionPane;
public class Romzua
{
    public static void main(String args[])
    {
        String imagenes[]={"imag1.jpg","imag1.jpg","imag1.jpg","imag1.jpg","imag1.jpg"};
        int arregloa[]=new int[10];
        boolean seguir=true;
        int puntos=0;
        int pregunta=1;
        
        llenarAleatorioSR(arregloa,1,25);
        do
        {
            JOptionPane.showMessageDialog(null,"Pregunta "+pregunta+" Llevo "+puntos+" Puntos");
            
            //if(resppregunta==respuetacorrecta)
            puntos+=pregunta*30;
            
            
            pregunta++;
            
            if(puntos>150)
            {
                //JOptionPane.showMessageDialog(null,"Ya llegastes a mas de 150 puntos "+puntos);
                int resp=preguntar("Ya llegastes a mas de 150 puntos "+puntos+"\nDesea continuar?");
                if(resp==0)
                {
                    llenarValor(arregloa,0);
                    llenarAleatorioSR(arregloa,1,25);
                    puntos=0;
                    pregunta=1;
                }
                else
                {
                    seguir=false;
                    JOptionPane.showMessageDialog(null,"Adios");
                }
            }
            
        }while(seguir);
        JOptionPane.showMessageDialog(null,"Me sali del ciclo");
    }
    public static int preguntar(String pregunta)
    {
        int res=JOptionPane.showConfirmDialog(null,pregunta);
        return res;
    }
}