package MisExcepciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num,den,coci;
       String val1,val2;
       try{
           System.out.println("Ingresa el numerador");
           val1=leer.next();
           System.out.println("Ingresa tu denominador");
           val2=leer.next();
           coci=operacion(val1,val2);
       
       }catch(NumberFormatException e){
           System.out.println(e.getMessage());
       }catch(ArithmeticException e){
           System.out.println(e.getMessage());
        }catch(ExcepcionIntervalo e){
           System.out.println(e.getMessage());
        }catch(Excep1 e){
           System.out.println(e.getMessage());
        }catch(Excep2 e){
           System.out.println(e.getMessage());
        }catch(Excep3 e){
           System.out.println(e.getMessage());
        }
       
     }
   static int operacion(String valor1,String valor2)throws ExcepcionIntervalo,Excep1,Excep2,Excep3,NumberFormatException,ArithmeticException{
     int num=Integer.parseInt(valor1);
     int den=Integer.parseInt(valor2);
     if(num>100 || den<-1){
      throw new ExcepcionIntervalo("Numeros fuera del intervalo");
     }
     if(num<-1 || den>10){
      throw new Excep1("Numeros fuera del intervalo");
     }
     if(num>10 || den<1){
      throw new Excep2("Aplica algo dentro del rango");
     }
     if(num>50 || den<2){
      throw new Excep3("Aplica algo dentro del rango");
     }
    return(num/den);
   } 
}
