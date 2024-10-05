//matriz donde solo se ingresen numeros negativos

import java.util.Scanner;
public class Programa22 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int fil, col;
        System.out.println("ingresa numero de filas");
         fil=leer.nextInt();
         System.out.println("ingresa numero de columnas");
         col=leer.nextInt();
         int mat[][]=new int[fil][col];
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){      //esto es para llenar la matriz
                 int valor=leer.nextInt();
                 if(valor<0){
                 mat[i][j]=valor;
             }
         }
         for( i=0; i<fil; i++){
             for(int j=0; j<col; j++){
                 System.out.print(mat[i][j] + " ");   //Esto es para mostrar la matriz
             }
              System.out.println( );
             }
         }
    }
}

        
     

