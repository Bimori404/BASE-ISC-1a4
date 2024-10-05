package Filehandling;
import java.io.*;

public class EscrituraLecturaFicheros {
    public static void main(String[] args) {
        //Escribir datos desde el codigo en el archivo 
        String texto = "Escribo esto desde el codigo, soy un pro";//Lo que se guarde en esta variable, sera escrita en el archivo
        try {
            FileWriter fw = new FileWriter("FEscribir.txt");
            System.out.println(texto);
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        //Leer lo guardado en elarchivo desde el codigo
        try {
            FileReader fr = new FileReader("FLeer.txt");//Permite leer caracteres desde un archivo externo
            BufferedReader br = new BufferedReader(fr);//Permite leer info temporal de la pc 
            System.out.println(br.readLine());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
