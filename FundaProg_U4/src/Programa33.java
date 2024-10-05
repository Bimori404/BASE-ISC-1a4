//programa com metodos que pueda registrar(nombre, edad, color) y mostrarlos

import java.util.*;
 public class Programa33 {
     
  public static void main(String[]args){
     Scanner leer=new Scanner(System.in);
        int e=0;
      System.out.println("ingresa tu edad");
      e=leer.nextInt();
     String n;
      System.out.println("ingresa tu nombre");
      n=leer.next();
      String c;
      System.out.println("ingresa tu color");
      c = leer.next();
      fin(e,n,c);
    }
    public static void fin( int e, String c, String n ){
        System.out.println("Tu nombre es " +n);
        System.out.println("Tu edad es " +e);
        System.out.println("Tu color es " +c);
  }
 }