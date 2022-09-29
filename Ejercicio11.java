/*
 * Escribir un algoritmo que, dada una nota ingresada por el usuario si esta es 
 * menor que 70 escriba "Reprobado" si la nota es mayor que 70 pero menor 
 * que 90 "Bueno" y si la nota es mayor que 90 imprima “Excelente”.
   */
  import javax.swing.JOptionPane;
  public class Ejercicio11
  {
      public static void main(String args[])
      {
            String entrada=JOptionPane.showInputDialog("Ingrese una Nota");
            int nota=Integer.parseInt(entrada);
            
            if(nota<70)
            {
                JOptionPane.showMessageDialog(null,"Reprobado");
            }
            //else if(nota>70 && nota<90)//Operador Logico. 
            else if(nota>=70 && nota<=90)//Operador Logico. No se pierde el 70 y 90
            {
                JOptionPane.showMessageDialog(null,"Bueno");
            }
            else if(nota>90)
            {
                JOptionPane.showMessageDialog(null,"Excelente");
            }
      }
  }