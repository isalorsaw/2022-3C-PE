package parcial2.EJemploProyecto;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Main
{
    public static void main(String args[])
    {
        int buenas=0;
        //int imagenes[]=new int[3];
        String imagenes[]={"abeja.png","gato.png","elefante.png"};
        int tam=3;
        String op1[]={"Abeja","Gato","Elefante"};
        String op2[]={"Mariposa","Elefante","Gato"};
        String op3[]={"Pajarito","Conejo","Perro"};
        int resp[]={2,3,1};
        String correct[]={"Mariposa","Conejo","Elefante"};
        
        int rangod[]={1,11,21};
        int rangoh[]={10,20,30};
        
        String mensaje[]={"Cual es el animal","Cual es el animal","Cual es el animal","Pais de esta bandera"};
        
        int opcion=0;
        
        for(int i=0;i<tam;i++)
        {
            String ops[]={op1[i],op2[i],op3[i]};
            
           // int ale=aleatorio(rangod[i],rangoh[i]);
            
            opcion=mostrarImagen((i+1)+".png",mensaje[i],"Acertados "+buenas,ops)+1;
            //JOptionPane.showMessageDialog(null,"Seleccione el Boton "+opcion);
            if(opcion==resp[i])buenas++;
        }
        JOptionPane.showMessageDialog(null,"Buenas fueron "+buenas+" de "+tam);
    }
    public static int mostrarImagen(String rutai,String informacion, String titulo, String resp[])
    {
        ImageIcon icono=new ImageIcon(Main.class.getResource(rutai));
        int seleccion = JOptionPane.showOptionDialog(null,
                       informacion, 
                       titulo,
                       JOptionPane.YES_NO_CANCEL_OPTION,
                       JOptionPane.QUESTION_MESSAGE,
                       icono,
                       resp,   // null para YES, NO y CANCEL
                       resp[0]);
        return seleccion;
    }
}