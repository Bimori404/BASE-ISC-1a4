package Vectores;
import java.util.Scanner;
import java.util.Vector;
public class DOUvector {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        Vector v=new Vector();
        double x=0;
        System.out.println("Ingresa 5 valores valor");
        for(int i=0;i<5;i++){
        x=leer.nextDouble();
        v.add(x);
        }
        System.out.println(v);
        System.out.println("Se almacenaron estos valores");
    }
    
}
