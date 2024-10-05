package ArregloDefinido;

import java.util.ArrayList;

public class ArrayInt {
    public static  void main(String [] args){
        ArrayList<Integer> ListaInteger = new ArrayList<Integer>();
        ListaInteger.add(1);
        ListaInteger.add(2);
        ListaInteger.add(3);
        for (int i = 0; i < ListaInteger.size(); i++) {
            System.out.println(ListaInteger.get(i));
        }
        System.out.println("Estos son los numeros que actualmente se encuentran registrados");
    }
}