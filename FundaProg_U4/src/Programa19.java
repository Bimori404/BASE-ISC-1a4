//matriz bidimencional

import java.util.Scanner;
public class Programa19 {
     public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int fil=0, col=0,var;
         System.out.println("ingresa numero de filas");
         fil=leer.nextInt();
         System.out.println("ingresa numero de columnas");
         col=leer.nextInt();
         int mat[][]=new int[fil][col];
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){      //esto es para llenar la matriz
                 mat[i][j]=leer.nextInt(); 
             }
         }
          for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                 System.out.print(mat[i][j] + " ");   //Esto es para mostrar la matriz
             }
              System.out.println( );
          }
     }
}
