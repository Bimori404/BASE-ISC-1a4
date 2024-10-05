package proyectofecha;

import java.util.Scanner;

public class ProyectoFecha {
    public static void main(String[]args) {
        Scanner leer=new Scanner(System.in);
        String name, apeP, apeM;
        int dia=0, mes=0, anio=0, salir = 0;
        
        do{
            try{
        System.out.println("Ingresa nombre:");
        name=leer.next();
        System.out.println("Ingresa apellido  paterno:");
        apeP=leer.next();
        System.out.println("Ingresa apellido  materno:");
        apeM=leer.next();
        System.out.println("Ingrese su dia de nacimiento");
        dia=leer.nextInt();
        ComprobarDia(dia);
            }catch(ExceptionDia e){
                System.out.println(e.getMessage());
            }
            try{
        System.out.println("Ingrese su mes de nacimiento");
        mes=leer.nextInt();
        ComprobarMes(mes);
            }catch(ExceptionMes e){
                System.out.println(e.getMessage());
            }
            try{
        System.out.println("Ingrese su año de nacimiento");
        anio=leer.nextInt();
        ComprobarAnio(anio);
            }catch(ExceptionAnio e){
                System.out.println(e.getMessage());
            }
            
            
            
        System.out.println("Desea salir?\n1.-Si\n2.-No");
        salir = leer.nextInt();
    }while(salir!=2);
    
}
    
    static void ComprobarDia(int dia) throws ExceptionDia{
        if(dia < 0 || dia > 32)
            throw new ExceptionDia("El dia es erroneo");
    }
    static void ComprobarMes(int mes) throws ExceptionMes{
        if(mes < 0 || mes > 12)
            throw new ExceptionMes("El mes es erroneo");
    }
    static void ComprobarAnio(int anio) throws ExceptionAnio{
        if(anio<1920 ||anio > 2020)
            throw new ExceptionAnio("El año es erroneo");
    }
}
