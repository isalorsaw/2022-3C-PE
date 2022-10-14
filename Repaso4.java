/*
 * Pedir 5 números y mostrar si ese numero es múltiplo de 3.
   */
  import javax.swing.JOptionPane;
  public class Repaso4
  {
      public static void main(String args[])
      {
          int n=0;
          
          for(int i=1;i<=5;i++)
          {
              try
              {
                  String m=JOptionPane.showInputDialog("Ingrese un Numero");
                  n=Integer.parseInt(m);
                  
                  if(n%3==0)JOptionPane.showMessageDialog(null,n+" SI es multiplo de 3");
                  
              }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Error");
              }
              
          }
      }
  }