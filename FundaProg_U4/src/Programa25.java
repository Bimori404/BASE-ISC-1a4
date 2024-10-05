//matriz de longitud n que muestre los numeros ingresados y se actualize con un numero definido( 1 ) 

import java.util.Scanner;
public class Programa25 {
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
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                 System.out.print(mat[i][j] + " "); 
             }
              System.out.println( );
             }
         System.out.println( );
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                if(i==j){
                    mat[i][j]=1;
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
