//suma numeros pares introducidos aleatoriamente
package prueba;

import java.util.Scanner;
public class prueba1 {
    public static void main(String[]args){
         Scanner leer=new Scanner(System.in);
        int suma=0;
        System.out.println("ingresa cantidad de numeros");
        int a=leer.nextInt();
        int num[]=new int[a];
        System.out.println("ingrese los numero");
        for(int i=0; i<a; i++){
             num[i]=leer.nextInt();
             if(num[i]%2==0){
                 suma=suma+num[i];
             }else{
                 i--;
            }
          }
         System.out.println("E resultado es: " +suma);
     }
}