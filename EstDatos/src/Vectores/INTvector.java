package Vectores;
import java.util .Scanner;
import java.util.Vector;
public class INTvector {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        Vector v= new Vector();
        int x;
        System.out.println("Ingresa un numero");
        x=leer.nextInt();
        v.add(x);
        System.out.println(v);
    }
    
}
