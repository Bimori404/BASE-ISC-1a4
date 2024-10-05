package Paleteria;
import java.util.Scanner;
public class Paleteria {
    public static void main(String[]arg){
    Scanner leer = new Scanner(System.in);
        //Clase padre productos
        int cantexistente;
        double precio;
        //Clase Paleta
        Paleta arrPaleta[]= new Paleta[10];
        String sabor, nompaleta;
        int auxPaleta=0;
        int clavepal;
        //Clase nieve
        Nieve arrNieve[]= new Nieve[10];
        String nomnieve;
        double calorias;
        int auxNieve=0;
        int clavenie;
        //Clase Main
        int op, opDo, op1, op2, op3;
        do{
        System.out.println("Que accion desea realizar: "
                         + "\n1.-Registrar"
                         + "\n2.-Mostrar"
                         + "\n3.-Actualizar");
            op=leer.nextInt();
        switch(op){
            case 1:
                System.out.println("Que accion desea realizar:"
                                +"\n1.-Registrar Paleta"
                                +"\n2.-Registar Nieve\n3.-Salir");
                op1 = leer.nextInt();
                switch (op1){
/////////////////// R  E  G  I  S  T  R  A  R /////////////////////////////////////////////////////////////////////////////////////////
                    case 1: 
                        Paleta objPaleta;
                        System.out.println("Numero clave del producto(1, 2, 3...)");
                        clavepal = leer.nextInt();
                        System.out.println("Nombre: ");
                        nompaleta = leer.next();
                        System.out.println("Sabor");
                        sabor = leer.next();
                        System.out.println("Cantidad existente");
                        cantexistente = leer.nextInt();
                        System.out.println("Precio de la paleta");
                        precio = leer.nextDouble();
                        objPaleta = new Paleta(sabor, nompaleta, cantexistente, precio, clavepal);
                        
                        if(auxPaleta<10) {
                            arrPaleta[auxPaleta]=objPaleta;
                            auxPaleta++;
                        }else{
                            System.out.println("Paleta no registrada :c\nNumero en almacen exedido");
                        }
                    break;
                    case 2:
                        Nieve objNieve;
                        System.out.println("Numero clave del producto(1, 2, 3...)");
                        clavenie = leer.nextInt();
                        System.out.println("Nombre: ");
                        nomnieve = leer.next();
                        System.out.println("Cantidad existente");
                        cantexistente = leer.nextInt();
                        System.out.println("Precio de la paleta");
                        precio = leer.nextDouble();
                        System.out.println("Calorias de la paleta");
                        calorias = leer.nextDouble();
                        objNieve = new Nieve( calorias, nomnieve, cantexistente, precio, clavenie);
                        
                        if(auxNieve<10) {
                            arrNieve[auxNieve]=objNieve;
                            auxNieve++;
                        }else{
                            System.out.println("Nieve no registrada :c\nNumero en almacen exedido");
                        }
                    break;
                    case 3:
                    break;
                    }
            break;
/////////////////// M  O  S  T  R  A  R /////////////////////////////////////////////////////////////////////////////////////////
            case 2:
                System.out.println("Que accion desea realizar:\n1.-Mostrar informacion del producto Paleta"
                                  +"\n2.-Mostrar informacion del producto Nieve\n3.-Salir");
                op2 = leer.nextInt();
                switch (op2){
                    case 1:
                        for (int i = 0; i < auxPaleta; i++) {
                            System.out.println("La informacion del producto paleta es:"+
                            "\nNumero clave del producto:\n"+arrPaleta[i].getClavepal()+
                            "\nNombre:\n"+arrPaleta[i].getNombre()+
                            "\nSabor:\n"+arrPaleta[i].getSabor()+
                            "\nExistencia:\n"+arrPaleta[i].getCantexistente()+
                            "\nPrecio:\n"+arrPaleta[i].getPrecio());                                       
                        }   
                    break;
                    case 2:
                        for (int i = 0; i < auxNieve; i++) {
                            System.out.println("La informacion del producto nieve es:"+
                            "\nNumero clave del producto:\n"+arrNieve[i].getClavenie()+
                            "\nNombre:\n"+arrNieve[i].getNombre()+
                            "\nExistencia:\n"+arrNieve[i].getCantexistente()+
                            "\nExistencia:\n"+arrNieve[i].getCalorias()+
                            "\nPrecio:\n"+arrNieve[i].getPrecio());  
                        }
                    break;
                    case 3:
                    break;
                }
            break;
/////////////////// A  C  T  U  A  L  I  Z  A  R /////////////////////////////////////////////////////////////////////////////////////////
            case 3:
                System.out.println("Que accion desea realizar:\n1.-Actualizar informacion del producto paleta"
                                  +"\n2.-Actualizar informacion del producto Nieve\n4.-Salir");
                        op3 = leer.nextInt();
                        switch (op3){
                            case 1:
                                System.out.println("Ingrese el numero clave del producto al que se le desee modificar su informacion:");
                                clavepal = leer.nextInt();
                                boolean encontrado = false;
                                for (int i = 0; i < auxPaleta; i++){
                                  if (clavepal == arrPaleta[i].getClavepal()){
                                    System.out.println("Producto encontrado! ");
                                    System.out.println("Ingrese el nuevo precio\n:");
                                    double newprecio = leer.nextDouble();
                                    arrPaleta[i].setPrecio(newprecio);
                                    encontrado = true;
                                    break;
                                    }
                                }
                                if (encontrado == false) {
                                    System.out.println("No se ha encontrado la informacion ingresada :c"); 
                                }
                            break;
                            case 2:
                                System.out.println("Ingrese el numero clave del producto al que se le desee modificar su informacion:");
                                clavenie = leer.nextInt();
                                encontrado = false;
                                for (int i = 0; i < auxNieve; i++){
                                 if (clavenie == arrNieve[auxNieve].getClavenie()){
                                    System.out.println("Producto encontrado! ");
                                    System.out.println("Ingrese el nuevo precio\n:");
                                    double newprecio = leer.nextDouble();
                                    arrNieve[i].setPrecio(newprecio);
                                    encontrado = true;
                                  break;
                                 }
                                }
                                if (encontrado == false) {
                                    System.out.println("No se ha encontrado la informacion ingresada :c"); 
                                }
                            break; 
                        }
            break;
            default:
                System.out.println("Opcion no valida\nPor favor intente otra vez");
            break;
        }//Fin switch padre
       System.out.println("Desea realizar otra operacion\n1.-Si\n2.-No");
      opDo = leer.nextInt();
     }while( opDo == 1 );
    System.out.println("Gracias por comprar en LaPlaza\nVuelva pronto :3");
  }
}
