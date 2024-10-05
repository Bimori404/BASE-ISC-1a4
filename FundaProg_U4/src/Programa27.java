//crear una matriz de longitud n que muestre los numeros ingresados y se actualize
//su diagonal superior con un numero definido( 0 )

import java.util.Scanner;
public class Programa27 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
         System.out.println("ingresa numero de filas");
         int fil=leer.nextInt();
         System.out.println("ingresa numero de columnas");
         int col=leer.nextInt();
         int mat[][]=new int[fil][col];
          for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){ 
                 mat[i][j]=leer.nextInt();
                     }
                 }
          System.out.println("\n");
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                 System.out.print(mat[i][j] + " "); 
             }
         }
         System.out.println("\n");
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                if(i==j){
                    mat[i][j]=0;
                }
             }
         }
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                 System.out.print(mat[i][j] + " ");
             }
              System.out.println( );
             }
    }
}
