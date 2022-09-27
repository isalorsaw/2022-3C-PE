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
          
          String m=JOptionPane.showInputDialog("Menu\n1. Sol\n2. Sombra");
          int menu=Integer.parseInt(m);
          
          m=JOptionPane.showInputDialog("Cuantos Boletos desea");
          int cantidad=Integer.parseInt(m);
          
          if(menu==1)
          {
              totalpagar=cantidad*150;
          }
          else if(menu==2)
          {
              totalpagar=cantidad*400;
          }
          
          JOptionPane.showMessageDialog(null,"Total a Pagar sera: "+totalpagar);
      }
  }