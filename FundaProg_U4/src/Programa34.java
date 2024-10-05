//programa con meetodos que tenga las funciones de una calculadora

import java.util.Scanner;
public class Programa34 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int op=0, a=0, b=0;
        System.out.println("Escoge una opcion(1, 2, 3, 4)");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir");
        op=leer.nextInt();
        switch(op){
            case 1:
                 System.out.println("ingrese el primer numero");
                 a=leer.nextInt();
                 System.out.println("ingrese el segundo numero");
                 b=leer.nextInt();
                 
                 System.out.println("el resultado es "+suma(a,b));
                 System.out.println("\n");
                 break;
              case 2:
                 System.out.println("ingrese el primer numero");
                 a=leer.nextInt();
                 System.out.println("ingrese el segundo numero");
                 b=leer.nextInt();
                 
                 System.out.println("el resultado es "+resta(a,b));
                 System.out.println("\n");
             break;
             case 3:
                 System.out.println("ingrese el primer numero");
                 a=leer.nextInt();
                 System.out.println("ingrese el segundo numero");
                 b=leer.nextInt();
                 
                 System.out.println("el resultado es "+multi(a,b));
                 System.out.println("\n");
             break;
             case 4:
                 System.out.println("ingrese el primer numero");
                 a=leer.nextInt();
                 System.out.println("ingrese el segundo numero");
                 b=leer.nextInt();
                 
                 System.out.println("el resultado es "+divic(a,b));
                 System.out.println("\n");
             break;
        }
    }
      public static int suma(int a, int b){
        int res=0;
        res=a+b;
        return res;
      }
       public static int resta(int a, int b){
        int res=0;
        res=a-b;
        return res;
      }
        public static int multi(int a, int b){
        int res=0;
        res=a*b;
        return res;
      }
         public static double divic(int a, int b){
        int res=0;
        res=a/b;
        return res;
      }
}

