package PoliTrabajos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int horasT=0, proyecto=0, comicionPlatillo=0, cobroKm=0, ComClieAtendidos=0, opDo;
         double sueldoBase=0;
         do{
         System.out.println("----Programa para calcuar el salario de varios trabajadores----");
         System.out.println("\n1.-Programador\n2.-Chef"
                           +"\n3.-Taxista\n4.-Carnicero");
         int op=leer.nextInt();
         switch(op){
            case 1:
                    Programador objProgramador = new Programador( proyecto, horasT, sueldoBase);
                    System.out.println("Cuantos horas ha trabajado el dia de hoy: ");
                    objProgramador.setHorasT(leer.nextInt());
                    System.out.println("Cual es su sueldo normalmente");
                    objProgramador.setSueldoBase(leer.nextInt());
                    System.out.println("Cuantos proyectos hizo hoy??");
                    objProgramador.setProyecto(leer.nextInt());
                    System.out.println("El salario final del trabajador es: " +objProgramador.cSalario());
                    objProgramador.programar();
            break;
            case 2:
                    Chef objChef = new Chef(comicionPlatillo, horasT, sueldoBase);
                    System.out.println("Cuantos horas ha trabajado el dia de hoy: ");
                    objChef.setHorasT(leer.nextInt());
                    System.out.println("Cual es su sueldo normalmente");
                    objChef.setSueldoBase(leer.nextInt());
                    System.out.println("Cuantos platillos preparo hoy??");
                    objChef.setComicionPlatillo(leer.nextInt());
                    System.out.println("El salario final del trabajador es: " +objChef.cSalario());
                    objChef.Cosinar();
            break;
            case 3:
                    Taxista objTaxista = new Taxista(cobroKm, horasT, sueldoBase);
                    System.out.println("Cuantos horas ha trabajado el dia de hoy: ");
                    objTaxista.setHorasT(leer.nextInt());
                    System.out.println("Cual es su sueldo normalmente");
                    objTaxista.setSueldoBase(leer.nextInt());
                    System.out.println("Cuantos kilometros recorrio hoy??");
                    objTaxista.setCobroKm(leer.nextInt());
                    System.out.println("El salario final del trabajador es: " +objTaxista.cSalario());
                    objTaxista.Transportar();
            break;
            case 4:
                    Carnicero objCarnicero = new Carnicero(ComClieAtendidos, horasT, sueldoBase);
                    System.out.println("Cuantos horas ha trabajado el dia de hoy: ");
                    objCarnicero.setHorasT(leer.nextInt());
                    System.out.println("Cual es su sueldo normalmente");
                    objCarnicero.setSueldoBase(leer.nextInt());
                    System.out.println("Cuantos clientes ha atendido hoy??");
                    objCarnicero.setComClieAtendidos(leer.nextInt());
                    System.out.println("El salario final del trabajador es: " +objCarnicero.cSalario());
                    objCarnicero.PesarCarne();
            break;
         }
         System.out.println("\nDesea realizar otra operacion\n1.-Si\n2.-No");
        opDo = leer.nextInt();
        }while( opDo == 1 );
    }     
}
