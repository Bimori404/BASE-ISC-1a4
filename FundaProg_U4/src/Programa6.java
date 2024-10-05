//programa de char en donde se puedan ingresar n  caracteres

import java.util.Scanner;
public class Programa6 {
   public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
        int n=5;
        System.out.println("ingrese caracteres");
        n=leer.nextInt();
        char []arr=new char[n];
        for(int i=0; i<n; i++){
            arr[i]=leer.next().charAt(0);
        }
        System.out.println("los caracteres son: " );
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
