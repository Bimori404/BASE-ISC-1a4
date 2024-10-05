
import java.util.Scanner;
public class Programa20 {
     public static void main(String[]args){
        Scanner leer=new Scanner(System.in); 
        int fil=0, col=0;
         System.out.println("ingresa numero de filas");
         fil=leer.nextInt();
         System.out.println("ingresa numero de columnas");
         col=leer.nextInt();
         int matA[][]=new int[fil][col];
         for(int a=0; a<fil; a++){
             for(int x=0; x<col; x++){              //PARA LLENAR LA MATRIZ A
                 matA[a][x]=leer.nextInt();
             }
         }
         int matB[][]=new int[fil][col];
         for(int a=0; a<fil; a++){
             for(int x=0; x<col; x++){              //PARA LLENAR LA MATRIZ B
                 matB[a][x]=leer.nextInt();
             }
          }
          int matC[][]=new int[fil][col];
          for(int a=0; a<fil; a++){
             for(int x=0; x<col; x++){              //PARA LLENAR AUTOMATICAMENTE LA MATRIZ C
                 matC[a][x]=matA[a][x]+matB[a][x];
             }
          }
           for(int a=0; a<fil; a++){
             for(int x=0; x<col; x++){               //PARA MOSTRAR LA MATRIZ C
                 System.out.println(matC[a][x]);   
             }
           }
    }
}
