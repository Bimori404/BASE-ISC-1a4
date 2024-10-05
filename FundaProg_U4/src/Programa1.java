//programa de tipo int en donde se puedan ingresar n numeros

import java.util.Scanner;
  public class Programa1 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int longitud=5;
        int arregloDatos[]=new int[longitud];
            for(int i=0; i<longitud; i++){           
                arregloDatos[i] = leer.nextInt();
            }   
            System.out.println("Los numeros que ingresaste son");
            for(int i=0; i<longitud; i++){
                System.out.println(arregloDatos[i]);
            }   
        }
    }

