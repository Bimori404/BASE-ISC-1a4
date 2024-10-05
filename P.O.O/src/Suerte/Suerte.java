package Suerte;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Suerte {
    public static void main(String[] args){
        Scanner l = new Scanner (System.in);
        Scanner s= new Scanner (System.in);
        System.out.println("1.-Adivinar 2.-Generar nuevo 3.-Salir");
        int op=l.nextInt();
        int vida=3;
        switch(op){
            case 1:
                System.out.println("Ingresa el numero de la suerte");
                int a=l.nextInt();
                String var= s.next();
                int vint= Integer.parseInt(var);
                if(a==vint){
                    System.out.println("Ganaste!! Pasa a cobrar a la caja");
                }else{
                    System.out.println("Suerte para la proxima");
                }
                break;
            case 2:
                FileWriter suerte = null;
        try {
            suerte = new FileWriter("Suerte.txt");
                System.out.println("Ingrese el min");
                int min=l.nextInt();
                System.out.println("Ingresa el max");
                int max=l.nextInt();
                int num=GenNumeros(min, max);
                System.out.println(num);
                suerte.write(num);
                suerte.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Suerte.class.getName()).log(Level.SEVERE, null, ex);
            }
//                System.out.println(GenNumeros(min, max));
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    static public int GenNumeros(int min, int max){
        return ThreadLocalRandom.current().nextInt(min , max);
    }
}
