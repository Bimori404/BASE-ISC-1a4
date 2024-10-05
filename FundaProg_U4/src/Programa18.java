//programa en donde almacene la cantidad de dias: ingresar la longitud e ingresar dias al final mostrar cantidad
//por dias

import java.util.Scanner;
 public class Programa18 {
  public static void main(String[]args){
   Scanner leer=new Scanner(System.in);
      int n;
      System.out.println("ingresa n");
      n=leer.nextInt();
      int arr[]={0,0,0,0,0,0,0};
      String arr2[]={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
      System.out.println("ingrsa los dias");
      for(int i=0; i<n; i++){
          String dia=leer.next();
          switch(dia){
              case "Lunes":
              arr[0]++;
              break;
              case "Martes":
              arr[1]++;
              break;
              case "Miercoles":
              arr[2]++;
              break;
              case "Jueves":
              arr[3]++;
              break;
              case "Viernes":
              arr[4]++;
              break;
              case "Sabado":
              arr[5]++;
              break;
              case "Domingo":
              arr[6]++;
              break;
          }
      }
       for(int i=0; i<arr2.length; i++){
            if (arr[i]>0){
           System.out.println(arr2[i] +";"+ arr[i]);
           
       }
      }
  }
}

