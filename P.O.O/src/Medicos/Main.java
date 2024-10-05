package Medicos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cedula = 0;
        String nombre = "";
        int op = 0, opDo=0;
        int numImplantes = 0;
        double calidadImplante = 0;
        double mlAnestecia;
        int cantEspecialidad;
        int horaQuirofano = 0;
        int NumPersonas = 0;
        int horasLabor = 0;
        double anestecia = 0;
        CirujanoPlastico objPlastico;
        Dentista objDentista;
        Neurocirujano objNeuro;
        Obstetra objobs;
        do{
        System.out.println("Ingresa la opcion que deseas ver");
        System.out.println("1.-Cirujano plastico\n2.-Dentista\n3.-Neurocirujano\n4.-Obstetra\n5.-Salir");
        op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.println("--Cirujano plastico--");
                System.out.println("Ingresa tu nombre");
                nombre = leer.next();
                System.out.println("Ingresa tu cedula");
                cedula = leer.nextInt();
                System.out.println("Ingresa el numero de implantes");
                numImplantes = leer.nextInt();
                System.out.println("Ingresa la calidad del implante");
                calidadImplante = leer.nextDouble();
                objPlastico = new CirujanoPlastico(cedula, nombre, numImplantes, calidadImplante);
                objPlastico.setNumImplantes(numImplantes);
                objPlastico.setCalidadImplante(calidadImplante);
                objPlastico.operar();
                System.out.println("Estos son tus honorarios\n" + objPlastico.cHonorario());
            break;
            case 2:
                System.out.println("--Dentista--");
                System.out.println("Ingresa tu nombre");
                nombre = leer.next();
                System.out.println("Ingresa tu cedula");
                cedula = leer.nextInt();
                System.out.println("Ingresa los miligramos de la anestecia");
                mlAnestecia = leer.nextDouble();
                System.out.println("Ingresa la cantidad de especialidades que tiene");
                cantEspecialidad = leer.nextInt();
                objDentista = new Dentista(cedula, nombre, mlAnestecia, cantEspecialidad);
                objDentista.setMlAnestecia(mlAnestecia);
                objDentista.setCantEspecialidad(cantEspecialidad);
                objDentista.operar();
                System.out.println("Estos son tus honorarios\n" + objDentista.cHonorario());
            break;
            case 3:
                System.out.println("--Neurocirujano--");
                System.out.println("Ingresa tu nombre");
                nombre = leer.next();
                System.out.println("Ingresa tu cedula");
                cedula = leer.nextInt();
                System.out.println("Ingresa tus horas en quirofano");
                horaQuirofano = leer.nextInt();
                System.out.println("Ingresa el numero de personas operadas");
                NumPersonas = leer.nextInt();
                objNeuro = new Neurocirujano(cedula, nombre, horaQuirofano, NumPersonas);
                objNeuro.setHoraQuirofano(horaQuirofano);
                objNeuro.setNumPersonas(NumPersonas);
                objNeuro.operar();
                System.out.println("Estos son tus honorarios\n" + objNeuro.cHonorario());
            break;
            case 4:
                System.out.println("--Obstetra--");
                System.out.println("Ingresa tu nombre");
                nombre = leer.next();
                System.out.println("Ingresa tu cedula");
                cedula = leer.nextInt();
                System.out.println("Ingresa tus horas de labor");
                horasLabor = leer.nextInt();
                System.out.println("Ingresa la anestecia(ml)");
                anestecia = leer.nextDouble();
                objobs=new Obstetra(cedula,nombre, horasLabor, anestecia);
                objobs.setHorasLabor(horasLabor);
                objobs.setAnestecia(anestecia);
                objobs.operar();
                System.out.println("Estos son tus honorarios\n"+objobs.cHonorario());
            break;
            case 5:
                System.out.println("Nos vemos pronto!!");
                break;
        }
        System.out.println("\nDesea realizar otra operacion\n1.-Si\n2.-No");
        opDo = leer.nextInt();
        }while( opDo == 1 );
    }
}
