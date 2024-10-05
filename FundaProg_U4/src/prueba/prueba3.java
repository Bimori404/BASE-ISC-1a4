//Cual es el numero mayor
package prueba;

import java.util.Scanner;
public class prueba3 {
     public static void main(String[]args){
     Scanner leer=new Scanner(System.in);
     int a=0, n=0;
     System.out.println("ingresa un numero");
     a=leer.nextInt();
     System.out.println("ingresa otro numero");
     n=leer.nextInt();
     fin(a, n);
     }
     public static void fin(int a, int n){
         if(n<a){
             System.out.println("El numero mayor es " +a);
         }if(n>a){
             System.out.println("El numero mayor es " +n);
         }
     }
}