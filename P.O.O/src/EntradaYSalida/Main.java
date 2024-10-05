package EntradaYSalida;
//Genera 18 numeros y los muestra en  forma de matrizes
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3], m2 = new int[3][3];
        File entrada = new File("Entrada.txt");
        File salida = new File("Salida.txt");
        try {
            FileWriter s1 = new FileWriter(entrada);
            for (int i = 1; i <= 18; i++) {
                s1.write(String.valueOf(i) + "\n");
            }
            s1.close();
            BufferedReader leer = new BufferedReader(new FileReader(entrada));
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    String Aux = leer.readLine();
                    m1[i][j] = Integer.parseInt(Aux);
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    String Aux = leer.readLine();
                    m2[i][j] = Integer.parseInt(Aux);
                }
            }
            FileWriter s2=new FileWriter(salida);
             String fila="";
             s2.write("Matriz 1: \n");
             for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                 fila +=m1[i][j] + " ";
                } 
                  s2.write(fila + "\n");
                 fila="";
               }
              s2.write("Matriz 2: \n");
             for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                 fila +=m2[i][j] + " ";
                } 
                s2.write(fila + "\n");
               fila="";
               }
             s2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}