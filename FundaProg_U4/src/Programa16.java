//programa que permite ingresar numeros negativos en posisiones pares y en las impares numeros del 10 al 20
//con longitud ingresada por el usuario

import java.util.Scanner;
public class Programa16 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    int longitud;
    System.out.println("Ingresa una longitud");
    longitud=leer.nextInt();
    int arrDatos[]=new int[longitud];
       System.out.println("ingresa un numero");
        for(int i=0; i<longitud; i++){
            int n= leer.nextInt();
          if(longitud%2==0){
              if(longitud<0){
                  arrDatos[i]=longitud;
              }
              else{
                  i--;
              }
          }
          else{
             if(longitud>10 && longitud<20){
                 arrDatos[i]=longitud;
             }
             else{
                 i--;
             }
          }
        }  
        for(int i=0; i<longitud; i++){
            System.out.println(arrDatos[i]);
        }
    }   
}
