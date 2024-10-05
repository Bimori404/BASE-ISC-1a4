package ArregloDefinido;

import java.util.ArrayList;

public class ArrayChar {
    public static  void main(String [] args){
        ArrayList<Character> ListaCharacter = new ArrayList<Character>();
        String aux=new String("HOLA MUNDO!");
        for (int i = 0; i < aux.length(); i++) {
            ListaCharacter.add(aux.charAt(i));
        }
    }
}


//No muestra nada al momento de correrlo :c
//Y pos como no eh trabajado con Characters, pos no se si este bien :c