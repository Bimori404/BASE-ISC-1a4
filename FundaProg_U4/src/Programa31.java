//metodo int(suma) y void(saludo)

import java.util.*;
public class Programa31 {
    public static void main(String[]args){
        int a, b, r;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa a");
        a=leer.nextInt();
        System.out.println("ingresa b");
        b=leer.nextInt();
        System.out.println(suma(a,b));
        r=a+b;
        System.out.println("resultado: " +r);
        Saludo();
    }
    public static int suma(int a, int b){
        int res=0;
        res=a+b;
        return res;
    }
    public static void Saludo( ){
         System.out.println("Bienvenidos/as a todos");
    }
}