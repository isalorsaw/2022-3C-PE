package com.parcial1;

/*
 * Primer Ejercicio.
 * Pedir 3 numeros y mostrar la suma de ellos.
*/
import javax.swing.JOptionPane;
public class Semana1
{//Inicio
    public static void main(String args[])
    {//Inicio Main
        
        //Declarar e Inicializar Variables
        int num1=0;
        int num2=0;
        int num3=0;
        
        //Salida
        JOptionPane.showMessageDialog(null,"Este sistema pedira 3 numeros enteros y mostrara la suma");
        
        //Entrada
        String n1=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        num1=Integer.parseInt(n1);
        
        String n2=JOptionPane.showInputDialog("Ingrese el Segundo Numero");
        num2=Integer.parseInt(n2);
        
        String n3=JOptionPane.showInputDialog("Ingrese el Tercer Numero");
        num3=Integer.parseInt(n3);
        
        int suma=num1+num2+num3;
        
        String msg="Los numeros ingresados fueron: "+num1+","+num2+","+num3+"\nLa Sumatoria es de: "+suma;
        JOptionPane.showMessageDialog(null,msg);
    }//Fin Main
}//Fin