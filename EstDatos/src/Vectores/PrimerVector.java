package Vectores;
import java.util.Scanner;
import java.util.Vector;
public class PrimerVector {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in); 
        Vector v=new Vector();
        int num;
        System.out.println("Mi primer vector :D");
        System.out.println("Ingresa cinco numeros al vector");       
        for(int i=0; i<5;i++){ 
            num=leer.nextInt();
            v.add(num);            
        }
        v.insertElementAt("Ricardo",2);
        System.out.println(v);
        
    }  
}
