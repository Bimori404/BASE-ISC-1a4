package Vehiculos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        String color, marca, modelo;
        double km, velocidad;
        int año, cilindros;

        int contv = 0;
        Vehiculo arrVehiculo[] = new Vehiculo[100];

        int conta = 0;
        Auto arrAuto[] = new Auto[100];
        
        boolean autoencontrado = false;
        do{
        System.out.println("que desea hacer=");
        System.out.println("1.- registrar vehiculo");
        System.out.println("2.-Registrar auto.");
        System.out.println("3.- actualizar auto");
        System.out.println("4.- Buscar auto");
        System.out.println("5.- mostrar vehiculos");
        System.out.println("6.- Salir");
        op = leer.nextInt();
        switch (op) {
            case 1://Registrar Vehiculo
                System.out.println("Ingrese color: ");
                color = leer.next();
                System.out.println("Ingrese marca: ");
                marca = leer.next();
                System.out.println("Ingrese kilometraje: ");
                km = leer.nextDouble();
                System.out.println("Ingrese Velocidad: ");
                velocidad = leer.nextDouble();
                arrVehiculo[contv] = new Vehiculo(color, marca, km, velocidad);
                contv++;
                System.out.println("VEHICULO REGISTRADO.");
                break;
            case 2://Registrar Auto
                System.out.println("Ingrese color: ");
                color = leer.next();
                System.out.println("Ingrese marca: ");
                marca = leer.next();
                System.out.println("Ingrese kilometraje: ");
                km = leer.nextDouble();
                System.out.println("Ingrese Velocidad: ");
                velocidad = leer.nextDouble();
                System.out.println("Ingrese año");
                año = leer.nextInt();
                System.out.println("Ingrese cilindros: ");
                cilindros = leer.nextInt();
                System.out.println("Ingrese modelo: ");
                modelo = leer.next();
                arrAuto[conta] = new Auto( año, cilindros, modelo, color, marca, km, velocidad);
                conta++;
                System.out.println("AUTO REGISTRADO.");
                break;
            case 3://Actualizar
                System.out.println("Ingrese año");
                año = leer.nextInt();
                System.out.println("Ingrese modelo: ");
                modelo = leer.next();
                for(int i=0 ; i <conta; i++){
                    if(año == arrAuto[i].getAño() &&  modelo.equals(arrAuto[i].getModelo())){
                        System.out.println("Ingrese el nuevo kilometraje");
                        km = leer.nextDouble();
                        System.out.println("Ingrese color");
                        color = leer.next();
                        arrAuto[i].setKm(km);
                        arrAuto[i].setColor(color);
                        System.out.println("Datos actualizados.");
                        autoencontrado = true;
                    }
                }
                if (autoencontrado){
                    //nothing
                }else{
                    System.out.println("Auto no encontrado");
                }
                break;
            case 4://Buscar
                System.out.println("Ingrese año");
                año = leer.nextInt();
                System.out.println("Ingrese modelo: ");
                modelo = leer.next();
                for(int i=0 ; i <conta; i++){
                    if(año == arrAuto[i].getAño() &&  modelo.equals(arrAuto[i].getModelo())){
                        System.out.println("Se encontro el auto" + " modelo: "+ modelo + " año: "  + año);
                        autoencontrado = true;
                    }
                }
                if (autoencontrado){
                    //nothing
                }else{
                    System.out.println("Auto no encontrado");
                }
                break;
            case 5://Buscar auto o vehiculo///////Esto se usa para ahorrarnos codigo
                System.out.println("---------VEHICULOS--------");
                for(int i=0 ; i <contv; i++){
                    arrVehiculo[i].Print();
                System.out.println("--------------------------");
                }
                System.out.println("--------AUTOS-----------");
                for(int i=0 ; i <conta; i++){
                    arrAuto[i].Print();
                System.out.println("------------------------"); 
                }
                break;
            case 6:
                System.out.println("ADIOS");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        }while(op!=6);
    }
}