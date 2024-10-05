
package Registro;
import java.util.Scanner;
public class Registro {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nom, apeP, apeM, sexo;
        int edad;
        System.out.println("-Sistema de Registro-\nPorfavor ingresa los datos solisitados:");
        System.out.println("Ingresa nombre:");
        nom=leer.next();
        System.out.println("Ingresa apellido paterno:");
        apeP=leer.next();
        System.out.println("Ingresa apellido materno:");
        apeM=leer.next();
        System.out.println("Ingresa tu edad:");
        edad=leer.nextInt();
        System.out.println("Ingresa tu sexo \nHombre \nMujer");
        sexo=leer.next();
        Persona objPersona= new Persona(nom,apeP, apeM, sexo,edad);
        System.out.println("La persona registrada es:\n");
        System.out.println("Bienvenido(a): "+objPersona.getNom()+" "
                + ""+objPersona.getApeP()+" "+ objPersona.getApeM()+""
                + "\nTú sexo es: "+ objPersona.getSexo()+" "
                + objPersona.calcMayoria()+" te asignaremos la clave: ");
        objPersona.generaClave();
    }
    
}
