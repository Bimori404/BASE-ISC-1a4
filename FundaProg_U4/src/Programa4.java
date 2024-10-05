//programa de float en donde se puedan ingresar n  numeros

import java.util.Scanner;
public class Programa4 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    int n;
        System.out.println("ingrese n");
        n=leer.nextInt();
        float arr[]=new float[n];
        for(int i=0; i<n; i++){
            arr[i]=leer.nextFloat();
        }
        System.out.println( );
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
