package NumLineasDeArchivo;
//Lee y muestra cuantas lineas tiene un archivo txt
import java.io.*;
import java.util.Scanner;

public class LineasDeTexto {
    public static void main(String[] args) {
        File entrada = new File("NumLineas.txt");
        int x=0;//contador
        try{
            //entrada.createNewFile();//Esto permite crear un archivo desde el programa
            BufferedReader leer = new BufferedReader(new FileReader(entrada));
            String a="";//variable para guardar los datos
            Scanner scr = new Scanner(entrada);
            while(scr.hasNextLine()){//Esto permite leer el total de lineas que contiene el archivo
                a=scr.nextLine();
                x++;
            }
            System.out.println("Tu archivo contiene "+x+" lineas");//Muestra el numero de lineas que contiene el txt
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
