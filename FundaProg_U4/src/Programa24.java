//matriz de longitud n*n=0

import java.util.Scanner;
public class Programa24 {
     public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int n;
            System.out.println("ingresa un numero");
            n=leer.nextInt();
        int mat[][]=new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){ 
                                 //if(i==j){
                    mat[i][j]=0; //mat[i][j]=0;
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
