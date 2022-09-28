/*Venta de boletos en el estadio. 1. Sol o 2. Sombra 
 * preguntar cuántos boletos. 
 * El precio del sol es 150 y de sombra es 400. 
 * Mostrar el total a pagar.
   */
  import javax.swing.JOptionPane;
  public class Ejercicio12
  {
      public static void main(String args[])
      {
          //Declarar e Inicializar Variables
          int totalpagar=0;
          
          String m=JOptionPane.showInputDialog("Menu\n1. Sol\n2. Sombra");//Entrada=Input
          int menu=Integer.parseInt(m);//Convertir de String a Int
          int cantidad=0;
          
          if(menu==1)
          {
                m=JOptionPane.showInputDialog("Cuantos Boletos desea");//Entrada=Input
              cantidad=Integer.parseInt(m);//Convertir de String a Int
              totalpagar=cantidad*150;
              JOptionPane.showMessageDialog(null,"Total a Pagar sera: "+totalpagar);//Salida MessageDialog
          }
          else if(menu==2)
          {
               m=JOptionPane.showInputDialog("Cuantos Boletos desea");//Entrada=Input
              cantidad=Integer.parseInt(m);//Convertir de String a Int
              totalpagar=cantidad*400;
              JOptionPane.showMessageDialog(null,"Total a Pagar sera: "+totalpagar);//Salida MessageDialog
          }
          else JOptionPane.showMessageDialog(null,"Opcion Invalida");//Salida MessageDialog
          
      }
  }