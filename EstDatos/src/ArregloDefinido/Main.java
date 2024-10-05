package ArregloDefinido;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  void main(String [] args){
        Scanner leer = new Scanner(System.in);
        //Definimos
        ArrayList<String> ListaString = new ArrayList<String>();
        //Guardamos valores
        ListaString.add("Daniela");
        ListaString.add("Migel");
        ListaString.add("Jonas");
        //Buscamos
        System.out.println("Que nombre desea buscar?");
        String buscar=leer.next();
        for (int i = 0; i < ListaString.size(); i++) {
            if (buscar.equals(ListaString.get(i))){
                //Actualizar
                String var = "Miguel Angel";
                ListaString.set(i, var);
                //Eliminamos
                ListaString.remove(i);
                System.out.println("Encontrado y actualizado!");
            }
        }
        System.out.println("-----------------------");
        //Mostramos
        for(String a : ListaString){
            System.out.println(a);
        }
        System.out.println("Longitid de ListaString "+ListaString.size());
        ListaString.clear();//Con esto se limpia el arrayList
        System.out.println("Longitid de ListaString.clear "+ListaString.size());

    }
}
