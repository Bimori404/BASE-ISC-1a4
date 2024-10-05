//programa en donde se ingresen numeros pares en las posiciones pares de una matriz

import java.util.Scanner;
public class Programa26 {
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
             System.out.println( );
         }
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                 if(mat[i][j]%2==0){ 
                    System.out.print(mat[i][j] + " ");
                 }else{
                     System.out.print( 0 );
                 }
             }
         }
    }
}

//ya reconoce los pares, falta que los muestre en la posicion que debe