//programa en donde solo se permita ingresar la longitud del arreglo, una vez que se ingresen los elementos mostrar
//la opcion de ingresar un numero a buscar, si lo encuentra mostrar "exito" sino "intenta otro dia"

import java.util.Scanner;
public class Programa17 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
        System.out.println("ingresa n");
        int n=leer.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=leer.nextInt();
        }
        System.out.println("Buscar numero");
        for(int i=0; i<n; i++){
            int a=leer.nextInt();
            if(a==arr[i]){
                System.out.println("exito");
            }else{
                System.out.println("Intente otro vez");
            }
        }
    }
}