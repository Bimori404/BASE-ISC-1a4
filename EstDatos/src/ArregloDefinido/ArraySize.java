package ArregloDefinido;

import java.util.ArrayList;
import java.util.Scanner;
public class ArraySize {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        ArrayList<String> listaString = new ArrayList<String>();
        for(String a : listaString){
            System.out.println(a);
        }
        listaString.add("Jorge");
        listaString.add("Javier");
        for(String a:listaString){
            System.out.println(a);
        }
        System.out.println("----------");
        System.out.println("Longitud de listaString "+listaString.size());
        listaString.clear();
        System.out.println("Longitud de listaString.clear "+listaString.size());
    }
}