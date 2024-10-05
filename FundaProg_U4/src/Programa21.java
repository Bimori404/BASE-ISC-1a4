//matriz que se llene con nombres

import java.util.Scanner;
public class Programa21 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
         int fil=0, col=0;
         System.out.println("ingresa numero de filas");
         fil=leer.nextInt();
         System.out.println("ingresa numero de columnas");
         col=leer.nextInt();
        System.out.println("Ingresa los nombres");
         String mat[][]=new String[fil][col];
         for(int i=0; i<fil; i++){
             for(int j=0; j<col; j++){      //esto es para llenar la matriz
                 mat[i][j]=leer.next(); 
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
