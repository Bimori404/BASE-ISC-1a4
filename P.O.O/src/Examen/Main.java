package Examen;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op, op1, op2, op3;
        String marca, dueño, matricula, tipo;
        float pesoVehiculo;
        int MotorCaballos=0, cargaMaxima=0;
        boolean descapotable;

        int contv = 0;
        Camioneta objCamioneta;
        Camioneta arrCamioneta[] = new Camioneta[10];

        int conta = 0;
        Auto arrAuto[] = new Auto[10];
        
        boolean autoencontrado = false;
        System.out.println("que desea hacer \n1.-Registrar\n 2.-Buscar \n3.-Actualizar");
        op = leer.nextInt();
        switch (op) {
         case 1://Registrar
            System.out.println("que desea hacer \n1.-Registrar Camioneta \n3.-Registrar Auto");
            op1 = leer.nextInt();
            switch(op1){
                case 1://Registrar Camioneta
                System.out.println("Ingrese su nombre: ");
                dueño = leer.next();
                System.out.println("Ingrese marca: ");
                marca = leer.next();
                System.out.println("Ingrese la matricula: ");
                matricula = leer.next();
                System.out.println("Ingrese su tipo: ");
                tipo = leer.next();
                System.out.println("Ingrese el peso aprox del vehiculo: ");
                pesoVehiculo = leer.nextFloat();
                System.out.println("Ingrese los caballos de fuerza que tiene su motor: ");
                MotorCaballos = leer.nextInt();
                arrCamioneta[contv] = new Camioneta(cargaMaxima, marca, dueño, matricula, tipo, pesoVehiculo, MotorCaballos);
                contv++;
                System.out.println("--CAMIONETA REGISTRADO--");
            break;
            case 2://Registrar Auto
                
                System.out.println("Ingrese su nombre: ");
                dueño = leer.next();
                System.out.println("Ingrese marca: ");
                marca = leer.next();
                System.out.println("Ingrese la matricula: ");
                matricula = leer.next();
                System.out.println("Ingrese su tipo: ");
                tipo = leer.next();
                System.out.println("Ingrese el peso aprox del vehiculo: ");
                pesoVehiculo = leer.nextFloat();
                System.out.println("Su auto es descapotable? (False) o (True) ");
                descapotable = leer.nextBoolean();
                arrAuto[conta] = new Auto(descapotable, marca, dueño, matricula, tipo, pesoVehiculo, MotorCaballos);
                conta++;
                System.out.println("AUTO REGISTRADO.");
            break;
            }
        break;
        case 2://Actualizar
            System.out.println("que desea hacer \n1.-Actualzar Camioneta \n3.-Actualzar Auto");
            op2 = leer.nextInt();
            switch(op2){
            case 1:
                System.out.println("Ingrese año");
                matricula = leer.next();
                for(int i=0 ; i <contv; i++){
                    if(matricula == arrCamioneta[i].getMatricula()){
                        System.out.println("Ingrese el nombre del nuevo dueño");
                        dueño = leer.next();
                        arrCamioneta[i].setMatricula(matricula);
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
            case  2:
                System.out.println("Ingrese año");
                matricula = leer.next();
                for(int i=0 ; i <conta; i++){
                    if(matricula == arrAuto[i].getMatricula()){
                        System.out.println("Ingrese el nombre del nuevo dueño");
                        dueño = leer.next();
                        arrAuto[i].setMatricula(matricula);
                        System.out.println("Datos actualizados.");
                        autoencontrado = true;
                    }
                }
                if (autoencontrado){
                }else{
                    System.out.println("Auto no encontrado");
                }
            break;
            }
        break;
        case 3://Buscar
            System.out.println("que desea hacer \n1.-Buscar Camioneta \n3.-Buscar Auto");
            op3 = leer.nextInt();
            switch(op3){
            case 1:
                System.out.println("Ingrese año");
                dueño = leer.next();
                System.out.println("Ingrese modelo: ");
                matricula = leer.next();
                for(int i=0 ; i <conta; i++){
                    if(dueño == arrAuto[i].getDueño() &&  matricula.equals(arrAuto[i].getMatricula())){
                        System.out.println("Se encontro el auto"+ " \nDueño: "  + dueño + " \nMatricula: "+ matricula);
                        autoencontrado = true;
                    }
                }
                if (autoencontrado){
                }else{
                    System.out.println("Auto no encontrado");
                }
            break;
            case 2:
                System.out.println("Ingrese año");
                dueño = leer.next();
                System.out.println("Ingrese modelo: ");
                matricula = leer.next();
                for(int i=0 ; i <conta; i++){
                    if(dueño == arrAuto[i].getDueño() &&  matricula.equals(arrAuto[i].getMatricula())){
                        System.out.println("Se encontro el auto"+ " \nDueño: "  + dueño + " \nMatricula: "+ matricula);
                        autoencontrado = true;
                    }
                }
                if (autoencontrado){
                }else{
                    System.out.println("Auto no encontrado");
                }
            break;
            }
        }
    }
    
}
