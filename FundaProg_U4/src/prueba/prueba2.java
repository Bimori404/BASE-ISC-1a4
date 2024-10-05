//Suma de fila de matrizes( matrizA + matrizB = matrizC )
package prueba;

import java.util.Scanner;
public class prueba2 {
     public static void main(String[]args){
     Scanner leer=new Scanner(System.in);
      int n;
      int var=0, arr[],y=0;
      System.out.println("ingresa n");
      n=leer.nextInt();
      arr = new int[n];
      //Llenado mtriz A
      int matA[][]= new int[n][n];
      for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
               matA[i][j]=leer.nextInt();
          }
      }
      System.out.println("");
      //Llenado mtriz B
       int matB[][]= new int[n][n];
      for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
               matB[i][j]=leer.nextInt();
          }
      }
         System.out.println("");
      //Mostrando mtriz C
      int matC[][]= new int[n][n];
        for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
               matC[i][j]=matA[i][j]+matB[i][j];
                 System.out.print(matC[i][j] + " ");
             }
              System.out.println( );
             }
    }
}

