import javax.swing.JOptionPane;
public class EjercicioString
{
    public static void main(String args[])
    {
        String cadena="";
        String menu="";
        int opcion=0;
        
        cadena=JOptionPane.showInputDialog("Ingrese una Cadena");
        
        try
        {
            menu=JOptionPane.showInputDialog("Menu.\n1. Mostrar tamaño \n2. Mostrar la Ultima Letra "+
            "\n3. Mostrar la Primera Letra\n4 Convertir a Mayusculas\n5 Convertir a Minusculas\n0 Salir"+
            "\n\nINGRESE UNA OPCION");
            opcion=Integer.parseInt(menu);    
        }
        catch(Exception exp)
        {
            //JOptionPane.showMessageDialog(null,exp+"\nHubo un Error. No ingreso una Opcion Valida ");  
            JOptionPane.showMessageDialog(null,"\nHubo un Error. No ingreso una Opcion Valida ");  
        }
        
        switch(opcion)
        {
            case 1:
                int t=cadena.length();
                JOptionPane.showMessageDialog(null,"La Cadena "+cadena+" tiene un tamaño de "+t);
            break;
            
            case 2:
                int iu=cadena.length()-1;
                char u=cadena.charAt(iu);
                JOptionPane.showMessageDialog(null,"La ultima letra de "+cadena+" es "+u);
            break;
            
            case 3:
                char l=cadena.charAt(0);
                JOptionPane.showMessageDialog(null,"La primera letra de "+cadena+" es "+l);
            break;
            
            default:
                JOptionPane.showMessageDialog(null,"Opcion No Valida");
            
        }
        
        
    }
}