//crear una matriz de longitud n*n y solo permita ingresar multiplos de 9

import java.util.Scanner;
public class Programa28 {
     public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int n;
            System.out.println("ingresa un numero");
            n=leer.nextInt();
        int mat[][]=new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){ 
                    mat[i][j]=leer.nextInt();
                    if(mat[i][j]%9==0){
                    }else{
                        j--;
                    }
                }
            }
        for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 System.out.print(mat[i][j] + " ");
             }
          System.out.println( );
        }
    }
}