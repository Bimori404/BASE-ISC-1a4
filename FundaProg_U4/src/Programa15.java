//programa en donde se ingresen n numeros, muestre el numero mayor y en que lugar se localiza

import java.util.Scanner;
public class Programa15 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);;
        
         System.out.println("ingresa cantidad de numeros");
         int a=leer.nextInt();
         int mayor=0;
         int pos=0;
         int numeros[]=new int[a];
         for(int i=0; i<a; i++){
             System.out.println("ingrese un numero");
             numeros[i]=leer.nextInt();
                if(numeros[i]>mayor){
                    mayor=numeros[i];
                    pos=i;
                }
            }
        System.out.println("El numero mayor es " +mayor);
        System.out.println("La posicion donde se encuentra el numero mayor es " +pos);
          }
     }
