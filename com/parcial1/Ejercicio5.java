package com.parcial1;

/*
   Programa que pide un nombre y un apellido y los muestra concatenados en pantalla
   */
  public class Ejercicio5
  {
      public static void main(String args[])
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Este programa pedira un nombre y un apellido y lo mostrara concatenado en pantalla");
            
            String nombre=javax.swing.JOptionPane.showInputDialog("Ingrese un Nombre");
            String apellido=javax.swing.JOptionPane.showInputDialog("Ingrese un Apellido");
            String concat=nombre+" "+apellido;
            javax.swing.JOptionPane.showMessageDialog(null,concat);
        }
  }