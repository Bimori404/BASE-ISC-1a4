//programa que sume todos los datos de un arreglo

import java.util.Scanner;
public class Programa36 {
     public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int suma=0;
        System.out.println("ingresa cantidad de numeros");
        int a=leer.nextInt();
        int num[]=new int[a];
        System.out.println("ingrese los numeros");
        for(int i=0; i<a; i++){
             num[i]=leer.nextInt();
             suma=suma+num[i];
            }
        System.out.println("El resultado es: " +suma);
          }
     }
