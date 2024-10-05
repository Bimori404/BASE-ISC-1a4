//programa en donde solo se puedan ingresar multiplos de 3 y mayores que 15, arreglo int

import java.util.Scanner;
  public class Programa11 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
	int n;
	System.out.println("ingresa cantidad");
	n=leer.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++){
        int valor=leer.nextInt();
        if(valor%3==0 && valor>15){
            arr[i]=valor;
        }else{
            i--;
        }
       }
    for(int i=0; i<n; i++){
        System.out.println("[" +arr[i]+ "]");
  }
 }
}
