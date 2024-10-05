//programa en donde se ingresen 3 calificaciones y obtenga su promedio, arreglo float

import java.util.Scanner;
public class Programa13 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
        int v1, v2, v3, suma;
        int n=1;
        float arr[]=new float[n];
        for(int i=0; i<n; i++){
            System.out.println("ingresa calificacion 1");
            v1=leer.nextInt();
            System.out.println("ingresa calificacion 2");
            v2=leer.nextInt();
            System.out.println("ingrese calificacion 3");
            v3=leer.nextInt();
            suma=v1+v2+v3;
            arr[i]=(float)suma/3;
        }
        System.out.println( );
        for(int i=0; i<n; i++){
            System.out.println("Promedio " +arr[i]);
        }
    }
}
