package com.parcial1;

/*
   Programa que pide un nombre y un apellido y los muestra concatenados en pantalla
   */
  import javax.swing.JOptionPane;
  public class CopyOfEjercicio5
  {
      public static void main(String args[])
        {
            JOptionPane.showMessageDialog(null,"Este programa pedira un nombre y un apellido y lo mostrara concatenado en pantalla");
            
            String nombre=JOptionPane.showInputDialog("Ingrese un Nombre");
            String apellido=JOptionPane.showInputDialog("Ingrese un Apellido");
            String concat=nombre+" "+apellido;
            JOptionPane.showMessageDialog(null,concat);
        }
  }
