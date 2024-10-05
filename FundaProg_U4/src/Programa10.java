//programa en donde solo se permita ingresar numeros pares y menores de 10, arreglo int

import java.util.Scanner;
  public class Programa10 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);     
        int n;  
        int valor;
        n=leer.nextInt();
        int arrDato[]=new int[n];
        for(int i=0; i<n; i++){
        valor=leer.nextInt();
        if(valor%2==0 && valor<10){
            arrDato[i]=valor;
        }else{
            i--;
        }
       }
    for(int i=0; i<n; i++){
        System.out.println(arrDato[i]);    
    }
  }
}
