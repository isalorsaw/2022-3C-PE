package com.parcial1;

/*
   Programa que pide un numero y muestra si es mayor,menor o igual que 15
*/
import javax.swing.JOptionPane;
public class CopyOfEjercicio4
{//Inicio
    public static void main(String args[])
    {//Inicio
        JOptionPane.showMessageDialog(null,"Este programa pedira un numero y mostrara si es menor, mayor o igual a 15");
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
        
        if(num<15)JOptionPane.showMessageDialog(null,"El Numero que usd ingreso es menor a 15");
        else if(num>15)JOptionPane.showMessageDialog(null,"El Numero que usd ingreso es mayor a 15");
        else JOptionPane.showMessageDialog(null,"El Numero que usd ingreso es igual a 15");
        
    }//Fin
}//Fin
