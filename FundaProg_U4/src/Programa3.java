//programa de boolean en donde se puedan ingresar n true o false

import java.util.Scanner;
public class Programa3 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
        int n=0, lim;
        System.out.println("ingrese un limite");
        lim=leer.nextInt();
        boolean arr[]=new boolean[lim];
        System.out.println("ingresa edades");
        for(int i=0; i<lim; i++){
               n=leer.nextInt();  
               if(n>=18){
                   arr[i]=true;              
               }else{
                   arr[i]=false;
               }
            }   
         for(int i=0; i<lim; i++){
             System.out.println(arr[i]);
            }
        }
    }