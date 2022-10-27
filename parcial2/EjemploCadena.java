package parcial2;
public class EjemploCadena
{
    public static void main(String args[])
    {
        String cadena="HONDURAS";//pedirCadena("Ingrese una Cadena");
        System.out.println(cadena);
        //primera letra
        char l=cadena.charAt(0);
        System.out.println(l+" primera letra");
        //Tamaño de la cadena
        int tam=cadena.length();
        System.out.println(tam+" tamanio");
        //char u=cadena.charAt(cadena.length()-1);
        char u=cadena.charAt(tam-1);
        System.out.println(u+" ult letra");
    }
}