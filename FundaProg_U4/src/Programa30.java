//crear un programa en donde se tenga una matriz n*n donde se ingresen números, una vez ingresados encuentre
//el número mayor, lo muestre y su posición en la matriz.

import java.util.Scanner;
public class Programa30 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int x=0, cont=0, pos=0;
            System.out.println("ingresa un numero");
            int n=leer.nextInt();
        int mat[][]=new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){ 
                    int num=leer.nextInt();
                    cont++;
                    if (num>x){
                        x=num;
                        pos=cont;
                        mat[i][j]=x;
                    }
                    mat[i][j]=num; 
                }
            }
        for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 System.out.print(mat[i][j] + " ");
             }
              System.out.println( );
             }
        System.out.println("El numero mayor es "+x);
        System.out.println("la pocicion es "+pos);
     }
}