package ArregloDefinido;
import java.util.ArrayList;

public class ArrayDouble {
    public static  void main(String [] args){
        ArrayList<Double> ListaDouble = new ArrayList<Double>();
        ListaDouble.add(1.0);
        ListaDouble.add(2.3);
        ListaDouble.add(3.9);
        for (int i = 0; i < ListaDouble.size(); i++) {
            System.out.println(ListaDouble.get(i));
        }
        System.out.println("Estos son los numeros que actualmente se encuentran registrados");
    }
}