package SumaDeMatrizes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
      File entrada =new File("Entrada.txt");
      File salida=new File("salida.txt");
      int n=0,b=0,n2=0,b2=0;
      try{
      BufferedReader leer = new BufferedReader(new FileReader(entrada));
       for (int i = 0; i < 2; i++) {
              String Aux = leer.readLine();
             if(i==0){
               n=Integer.parseInt(Aux);
              }else{
                b=Integer.parseInt(Aux);
               }
            }
       int [][] m1=new int [n][b];
       for (int i = 0; i < n; i++) {
                for (int j = 0; j < b; j++) {
                    String Aux = leer.readLine();
                    m1[i][j] = Integer.parseInt(Aux);
                }
            }
       for (int i = 0; i < 2; i++) {
              String Aux = leer.readLine();
             if(i==0){
               n2=Integer.parseInt(Aux);
              }else{
                b2=Integer.parseInt(Aux);
               }
            }
       int [][] m2=new int [n2][b2];
       for (int i = 0; i < n2; i++) {
                for (int j = 0; j < b2; j++) {
                    String Aux = leer.readLine();
                    m2[i][j] = Integer.parseInt(Aux);
                }
            }
       int [][] m3=new int [b][n2];
       String Aux = leer.readLine();
             switch(Aux){
                case "+":
                    for(int i=0;i<b;i++){
                      for(int j=0;j<n2;j++){
                       m3[i][j]=m1[i][j]+m2[i][j];        
                      }
                     }
                    break;
                case "-":
                    for(int i=0;i<b;i++){
                      for(int j=0;j<n2;j++){
                       m3[i][j]=m1[i][j]-m2[i][j];       
                      }
                     }
                    break;
                case "*":
                    for(int i=0;i<b;i++){
                      for(int j=0;j<n2;j++){
                       m3[i][j]=m1[i][j]*m2[i][j];       
                      }
                     }
                    break;
                case "/":
                    for(int i=0;i<b;i++){
                      for(int j=0;j<n2;j++){
                       m3[i][j]=m1[i][j]/m2[i][j];              
                      }
                     }
                    break;
               }
           FileWriter s2=new FileWriter(salida);
             String fila="";
             s2.write("Matriz 1: \n");
             for(int i=0;i<b;i++){
               for(int j=0;j<n2;j++){
                 fila +=m1[i][j] + " ";
                } 
                  s2.write(fila + "\n");
                 fila="";
               }
              s2.write("Matriz 2: \n");
             for(int i=0;i<b;i++){
               for(int j=0;j<n2;j++){
                 fila +=m2[i][j] + " ";
                } 
                s2.write(fila + "\n");
               fila="";
               }
             s2.write("Matriz 3 es una ");
             if(Aux.equals("+")){
                s2.write("Suma\n");
              }
             if(Aux.equals("-")){
                s2.write("Resta\n");
              }
             if(Aux.equals("*")){
                s2.write("Multiplicacion\n");
              }
             if(Aux.equals("/")){
                s2.write("Division\n");
              }
             for(int i=0;i<b;i++){
               for(int j=0;j<n2;j++){
                 fila +=m3[i][j] + " ";
                } 
                s2.write(fila + "\n");
               fila="";
               }
             s2.close();
      }catch(IOException e){
          System.out.println(e.getMessage());
       }
    }   
}
