/*
   Leer y validar un numero entero que debe de ser de 0 a 10 y 
   mostrar la tabla de multiplicación de ese numero de 1 al 10.
   */
  import javax.swing.JOptionPane;
  public class Repaso1
  {
      public static void main(String args[])
      {
          int numero=0;
          boolean seguir=true;
          
          do
          {
              try
              {
                  String m=JOptionPane.showInputDialog("Ingrese un Numero del 0 al 10");
                  numero=Integer.parseInt(m);
                    if(numero>=0&&numero<=10)seguir=false;
                  else JOptionPane.showMessageDialog(null,"El numero que usd ingreso no esta entre el rango."+
                " Voy a pedir otro numero");
              }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Error al Ingresar");
              }
          }while(seguir);
          
          //JOptionPane.showMessageDialog(null,"Tabla de Multiplicacion");
          String mensaje="Tabla de Multiplicacion del "+numero;
          
          /*for(int i=1;i<=10;i++)
          {
              int v=i*numero;
              mensaje=mensaje+"\n"+i+" X "+numero+" = "+v;
              //mensaje+="\n"+i+" por "+numero+" = "+v;
          }*/
          
          int i=1;
          while(i<=10)
          {
              int v=i*numero;
              mensaje=mensaje+"\n"+numero+" X "+i+" = "+v;
              i++;
          }
          
          JOptionPane.showMessageDialog(null,mensaje);
      }
  }