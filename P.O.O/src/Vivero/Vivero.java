package Vivero;
import java.util.Scanner;
public class Vivero {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int id = 1;
        String nombre, color;
        int op, opDo=1;
        
        Rosal arrRosal[] = new Rosal[10];
        int auxRosal = 0;
        
        Rosal objRosal;
        do{
        System.out.println("-Bienvenido al vivero-");
        System.out.println("Que desea hacer?"
                         + "\n1.-Registrar"
                         + "\n2.-Mostrar"
                         + "\n3.-Buscar"
                         + "\n4.-Actualizar");
        op = leer.nextInt();
        switch (op) {
            case 1: //Registrar
                System.out.println("-Registro de ejemplar-");
                System.out.println("Ingresa el nombre de tu rosal: ");
                nombre = leer.next();
                System.out.println("Que color es: ");
                color = leer.next();
                System.out.println("ID: "+id);
                objRosal = new Rosal(color, id, nombre);
                arrRosal[auxRosal]=objRosal;
                auxRosal++;
                id++;
            break;
            case 2: //Mostrar
                for (int i = 0; auxRosal < 10; i++) {
                    System.out.println("\nId: "+arrRosal[i].getId()+
                                       "\nNombre: "+arrRosal[i].getNombre()+
                                       "\nColor :"+arrRosal[i].getColor());
                break;
                }
            break;
            case 3://Buscar
                System.out.println("Que ejemplar quieres buscar?\nIngresa la id: ");
                id = leer.nextInt();
                boolean encontrado = false;
                for (int i = 0; i < 10; i++) {
                    if (id == arrRosal[i].getId()) {
                        System.out.println("Ejemplar encontrado! "+
                                "\nId: "+arrRosal[i].getId()+
                                "\nNombre: "+arrRosal[i].getNombre()+
                                "\nColor :"+arrRosal[i].getColor());
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    System.out.println("No se ha encontrado el ejemplar :c"); 
                }
            break;
            case 4://Actualizar
                System.out.println("De que ejemplar desea actualizar su informacion\nIngrese su Id");
                 id = leer.nextInt();
                 encontrado = false;
                 for (int i = 0; i < 10; i++) {
                    if (id == arrRosal[i].getId()) {
                        System.out.println("Ejemplar encontrado! ");
                        System.out.println("Introduce el nuevo nombre de el ejemplar");
                        String newnom = leer.next();
                        arrRosal[i].setNombre(newnom);
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    System.out.println("No se ha encontrado el ejemplar :c"); 
                }
            break;
           }
            System.out.println("quieres hacer otra operacion?\n1.-Si\n2.-No ");
           opDo = leer.nextInt();
        }while(opDo==1);
    }
}
