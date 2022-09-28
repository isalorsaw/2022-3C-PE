/*
   Venta de boletos en el estadio. 
   1. Sol o 2. Sombra preguntar cuántos boletos. 
   El precio del sol es 150 y de sombra es 400. 
   Mostrar el total a pagar.
   */
  import javax.swing.JOptionPane;
  public class Ejercicio12Switch
  {
      public static void main(String args[])
      {
          int totalpagar=0;
          int cantidad=0;
          
          String m=JOptionPane.showInputDialog("Menu\n1.Sol\n2.Sombra");
          int menu=Integer.parseInt(m);
          
          switch(menu)
          {
                case 1:
                  m=JOptionPane.showInputDialog("Cuantos Boletos de Sol Desea");
                  cantidad=Integer.parseInt(m);
                  totalpagar=cantidad*150;
                  JOptionPane.showMessageDialog(null,"Total a Pagar es "+totalpagar);
                break;
                
                case 2:
                  m=JOptionPane.showInputDialog("Cuantos Boletos de Sombra Desea");
                  cantidad=Integer.parseInt(m);
                  totalpagar=cantidad*400;
                  JOptionPane.showMessageDialog(null,"Total a Pagar es "+totalpagar);
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"La Opcion No Existe");
          }
          
      }
  }