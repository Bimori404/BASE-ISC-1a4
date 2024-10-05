import java.util.Scanner;
public class Programa9 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int ed = 0,limite;
        String nombre;
        System.out.println("cuantos nombres quieres ingresar");
        limite=leer.nextInt();
        
        boolean arrDatos[]=new boolean[limite];
        
        for(int i=0; i<limite; i++){
               System.out.println("ingresa nombres");
               nombre=leer.next();
               System.out.println("ingresa edades");
               ed=leer.nextInt();  
               if(ed>=18){
                   arrDatos[i]=true;              
               }else{
                   arrDatos[i]=false;
               }
            }   
         for(int i=0; i<limite; i++){
             System.out.println(arrDatos[i]);
            }
             
        }
    }
