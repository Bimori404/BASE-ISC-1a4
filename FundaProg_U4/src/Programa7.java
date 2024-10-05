//programa de tipo long en donde se puedan ingresar n  numeros

import java.util.Scanner;
public class Programa7 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
        int n=5;
        System.out.println("ingrese n");
        n=leer.nextInt();
        long arr[]=new long[n];
        for(int i=0; i<n; i++){
            arr[i]=leer.nextLong();
        }
        System.out.println("los datos long son: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
