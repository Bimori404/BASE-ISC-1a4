//programa de double en donde se puedan ingresar n numeros

import java.util.Scanner;
public class Programa5 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
        int n;
        System.out.println("ingrese n");
        n=leer.nextInt();
        double arr[]=new double[n];
        for(int i=0; i<n; i++){
            arr[i]=leer.nextDouble();
        }
        System.out.println( );
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
