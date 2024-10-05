package ArregloDefinido;
import java.util.ArrayList;

public class ArrayString {
    public static  void main(String [] args){
        ArrayList<String> ListaString = new ArrayList<String>();
        ListaString.add("Daniela");
        for (int i = 0; i < ListaString.size(); i++) {
            System.out.println(ListaString.get(i));
            
        }
    }
}
