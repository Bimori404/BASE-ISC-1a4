//programa en donde solo se permita ingresar nombres con inicial R

import java.util.Scanner;
public class Programa14 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
        String nom, ini;
        System.out.println("ingrese numero de nombres");
         int n=leer.nextInt();
        String arr[]=new String[n];
        System.out.println("ingresa nombres");
        for(int i=0; i<n; i++){
            nom=leer.next();
            ini=nom.substring(0,1);
            if(ini.equals( "R" )){
                arr[i]=nom;
            }
        }
        System.out.println( );
        for(int i=0; i<n; i++){
            System.out.println(arr[n]);
        }
    }
}
