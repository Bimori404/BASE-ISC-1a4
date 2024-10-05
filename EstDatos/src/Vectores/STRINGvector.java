package Vectores;
import java.util.Scanner;
import java.util.Vector;
public class STRINGvector {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        Vector v=new Vector();
        String nom;
        System.out.println("Ingresa un nombre");
        nom=leer.next();
        v.add(nom);
        System.out.println(v);
    }
}
