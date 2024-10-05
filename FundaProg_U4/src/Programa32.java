//programa con metodos que calcule el area de 5 figuras geometricas

import java.util.Scanner;
public class Programa32 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int op=0;
         System.out.println("Elige una opcion");
         System.out.println("1.-AREA DE UN CIRCULO");
         System.out.println("2.-AREA DE UN RECTANGULO");
         System.out.println("3.-AREA DE UN CUADRADO");
         System.out.println("4.-AREA DE UN TRIANGULO");
         System.out.println("5.-AREA DE UN TRAPECIO");
         op=leer.nextInt();
         switch(op){
              case 1:
                 System.out.println("ingrese el radio del circulo");
                 int r=leer.nextInt();
                 System.out.println("Area circulo es");
                 System.out.println(areaCirc(r));
              break;
              case 2:
                 System.out.println("ingrese base del rectangulo");
                 int b=leer.nextInt();
                 System.out.println("ingrese altura del rectangulo");
                 int a=leer.nextInt();
                 System.out.println("Area rectangulo es");
                 System.out.println(areaRect(b,a));
             break;
             case 3:
                 System.out.println("ingrese un lado del cuadrado");
                 int l=leer.nextInt();
                 System.out.println("Area cuadrado es");
                 System.out.println(areaCua(l));
             break;
             case 4:
                 System.out.println("ingrese base del triangulo");
                 int d=leer.nextInt();
                 System.out.println("ingrese altura del triangulo");
                 int e=leer.nextInt();
                System.out.println("Area triangulo es");
                System.out.println(areaTrian(d,e));
             break;
             case 5:
                 System.out.println("ingrese base mayor del trapecio");
                 int f=leer.nextInt();
                 System.out.println("ingrese la base menor del trapecio");
                 int g=leer.nextInt();
                 System.out.println("ingrese la altura del trapecio");
                 int h=leer.nextInt();
                 System.out.println("Area trapecio es");
                 System.out.println(areaTrap(f,g,h));
             break;
         }    
    }
     public static double areaCirc(int r){
        int res=0, r2=0;
        r2=(r*r);
        res=(int)(r2*3.14);
        return res;
    }
     public static int areaRect(int a, int b){
        int res=0;
        res=b*a;
        return res;
    }
     public static int areaCua(int l){
        int res=0;
        res=l*l;
        return res;
     }
    public static double areaTrian(int d, int e){
        int res=0;
        res=(int) ((double)(d*e)/2);
        return res;
    }
    public static double areaTrap(int f, int g, int h){
        int res=0;
        res=(int) ((double)(f*(g+h))/2);
        return res;
    }
}