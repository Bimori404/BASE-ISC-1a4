package NumLineasDeArchivo;
//Lee y muestra cuantas vocales tiene un archivo txt
import java.io.*;
import java.util.Scanner;

public class CantidadDeVocales {
    public static void main(String[] args) {
        int cont = 0;
        int a = 0, e = 0, i= 0, o= 0, u = 0;
        File entrada = new File ("Vocales.txt");
        try {
            String b;
            String c="";
            Scanner leer = new Scanner (entrada);
            while (leer.hasNextLine()) {
                b=leer.nextLine();
                c=b.replace(" ", "");
                char[] arreglo = c.toCharArray();
                for (int j=0; j < arreglo.length; j++) {
                    if (arreglo [j] == 'a') {
                        a++;
                    } else if (arreglo [j] == 'e') {
                        e++;
                    } else if (arreglo [j] == 'i') {
                        i++;
                    } else if (arreglo [j] == 'o') {
                        o++;
                    } else if (arreglo [j] == 'u') {
                        u++;
                    }
                }
                cont++;
            }
            System.out.println("Las lineas de tu archivo son: " + cont);
            System.out.println("Vocales A " + a);
            System.out.println("Vocales E " + e);
            System.out.println("Vocales I " + i);
            System.out.println("Vocales O " + o);
            System.out.println("Vocales U " + u);
        } catch (IOException es) {
            System.out.println(es.getMessage());
        }
    }
}