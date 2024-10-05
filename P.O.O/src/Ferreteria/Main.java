
package Ferreteria;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner leer=new Scanner(System.in);
        
        String nombre="", tipo=""; //Atributos generales
        int numClientes=0, puntos=0; //Atributos cliente
        String tamaño="", color=""; 
        int cantidad=0;
        double precio=0; //Atributos herramienta
        int numTrabajador=0;
        double salario=0; //Atributos trabajador
        int noTicket=0, total=0, productos=0;
        double iva=0, costo=0;
        String fecha=""; //Atributos ticket
        
        Cliente objCl;
        Cliente argCl[]=new Cliente[100];
        
        Herramienta objHerr;
        Herramienta argHerr[]=new Herramienta[100];
        
        Trabajador objTra;
        Trabajador argTra[]=new Trabajador[100];
        
        Ticket objTicket=new Ticket();
        
        int op, op2, posCl=0, posHerr=0, posTra=0, indice=0, buscar; //Auxiliares
        String busqueda;
        
        System.out.println("Bienvenido al sistema de la Ferreteria Tornillo Loko!\n");
        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1.-Cliente\n2.-Herramienta\n3.-Trabajador\n4.-Comprar\n5.-Salir");
            op=leer.nextInt();
            boolean encontrado=false;
            switch (op){
                case 1: //Clientes
                    System.out.println("\nSeleccione la accion desea realizar:");
                    System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Modificar\n5.-Salir\n");
                    op2=leer.nextInt();
                    switch (op2){
                        case 1: //Registrar Clientes
                            System.out.println("\nIngrese el nombre:");
                            nombre=leer.next();
                            System.out.println("\n\n");
                            tipo="Basico";
                            numClientes++;
                            objCl=new Cliente(numClientes, puntos, nombre, tipo);
                            argCl[posCl]=objCl;
                            posCl++;
                            break;
                        case 2: //Mostrar Clientes
                            for (int i=0; i<posCl; i++){
                                System.out.println("\nNombre: "+argCl[i].getNombre());
                                System.out.println("Tipo: "+argCl[i].getTipo());
                                System.out.println("Numero de cliente: "+argCl[i].getNumCliente());
                                System.out.println("Puntos: "+argCl[i].getPuntos()+"\n");
                            }
                            break;
                        case 3: //Buscar Clientes
                            System.out.println("\nIngrese el numero de cliente: ");
                            buscar=leer.nextInt();
                            for (int i=0; i<posCl; i++){
                                if(buscar == argCl[i].getNumCliente()){
                                    System.out.println("Registro encontrado!\n");
                                    System.out.println("Nombre: "+argCl[i].getNombre());
                                    System.out.println("Tipo: "+argCl[i].getTipo());
                                    System.out.println("Numero de cliente: "+argCl[i].getNumCliente());
                                    System.out.println("Puntos: "+argCl[i].getPuntos()+"\n\n");
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado==false){
                                System.out.println("Registro no encontrado :(\n\n");
                            }
                            break;
                        case 4: //Modificar Clientes
                            System.out.println("\nIngrese el numero de cliente: ");
                            buscar=leer.nextInt();
                            for (int i=0; i<posCl; i++){
                                if (buscar == argCl[i].getNumCliente()){
                                    System.out.println("Ingrese los nuevos datos para actualizar:");
                                    System.out.println("Nombre: ");
                                    nombre=leer.next();
                                    argCl[i].setNombre(nombre);
                                    System.out.println("Tipo: ");
                                    tipo=leer.next();
                                    argCl[i].setTipo(tipo);
                                    System.out.println("\nEste es el nuevo registro: \n");
                                    System.out.println("Nombre: "+argCl[i].getNombre());
                                    System.out.println("Tipo: "+argCl[i].getTipo());
                                    System.out.println("Numero de cliente: "+argCl[i].getNumCliente());
                                    System.out.println("Puntos: "+argCl[i].getPuntos()+"\n\n");
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :( \n\n");
                            }
                            break;
                        case 5:
                            System.out.println("Vuelva pronto!");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 2: //Herramientas
                    System.out.println("\nSeleccione la accion desea realizar:");
                    System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Modificar\n5.-Salir\n");
                    op2=leer.nextInt();
                    switch (op2){
                        case 1: //Registrar Herramientas
                            System.out.println("\nIngrese el nombre:");
                            nombre=leer.next();
                            System.out.println("Ingrese el tipo:");
                            tipo=leer.next();
                            System.out.println("Ingrese el tamaño:");
                            tamaño=leer.next();
                            System.out.println("Ingrese el color:");
                            color=leer.next();
                            System.out.println("Ingrese la cantidad:");
                            cantidad=leer.nextInt();
                            System.out.println("Ingrese el precio unitario:");
                            precio=leer.nextDouble();
                            objHerr=new Herramienta(nombre, tamaño, tipo, color, cantidad, precio);
                            argHerr[posHerr]=objHerr;
                            posHerr++;
                            break;
                        case 2: //Mostrar Herramientas
                            for (int i=0; i<posHerr; i++){
                                System.out.println("\nNombre: "+argHerr[i].getNombre());
                                System.out.println("Tipo: "+argHerr[i].getTipo());
                                System.out.println("Color: "+argHerr[i].getColor());
                                System.out.println("Tamaño: "+argHerr[i].getTamaño());
                                System.out.println("Cantidad: "+argHerr[i].getCantidad());
                                System.out.println("Precio: $"+argHerr[i].getPrecio()+"\n");
                            }
                            break;
                        case 3: //Buscar Herramientas
                            System.out.println("\nIngrese el nombre de la herramienta: ");
                            busqueda=leer.next();
                            for (int i=0; i<posHerr; i++) {
                                if (busqueda.equalsIgnoreCase(argHerr[i].getNombre())){
                                    System.out.println("Registro encontrado!\n");
                                    System.out.println("Nombre: "+argHerr[i].getNombre());
                                    System.out.println("Tipo: "+argHerr[i].getTipo());
                                    System.out.println("Color: "+argHerr[i].getColor());
                                    System.out.println("Tamaño: "+argHerr[i].getTamaño());
                                    System.out.println("Cantidad: "+argHerr[i].getCantidad());
                                    System.out.println("Precio: $"+argHerr[i].getPrecio()+"\n\n");
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :(\n\n");
                            }
                            break;
                        case 4: //Modificar Herramientas
                            System.out.println("\nIngrese el nombre de la herramienta: ");
                            busqueda=leer.next();
                            for (int i=0; i<posHerr; i++){
                                if (busqueda.equalsIgnoreCase(argHerr[i].getNombre())){
                                    System.out.println("Ingrese los datos a actualizar: ");
                                    System.out.println("Color: ");
                                    color=leer.next();
                                    argHerr[i].setColor(color);
                                    System.out.println("Tamaño: ");
                                    tamaño=leer.next();
                                    argHerr[i].setTamaño(tamaño);
                                    System.out.println("\nEste es el nuevo registro:\n");
                                    System.out.println("Nombre: "+argHerr[i].getNombre());
                                    System.out.println("Tipo: "+argHerr[i].getTipo());
                                    System.out.println("Color: "+argHerr[i].getColor());
                                    System.out.println("Tamaño: "+argHerr[i].getTamaño());
                                    System.out.println("Cantidad: "+argHerr[i].getCantidad());
                                    System.out.println("Precio: $"+argHerr[i].getPrecio()+"\n\n");
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :(\n\n");
                            }
                            break;
                        case 5:
                            System.out.println("Vuelva pronto!");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 3: //Trabajadores
                    System.out.println("\nSeleccione la accion desea realizar:");
                    System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Modificar\n5.-Salir\n");
                    op2=leer.nextInt();
                    switch (op2){
                        case 1: //Registrar Trabajadores
                            System.out.println("\nIngrese el nombre:");
                            nombre=leer.next();
                            System.out.println("Ingrese el tipo de trabajador:");
                            tipo=leer.next();
                            numTrabajador++;
                            System.out.println("Ingrese el salario:");
                            salario=leer.nextDouble();
                            objTra=new Trabajador(nombre, tipo, numTrabajador, salario);
                            argTra[posTra]=objTra;
                            posTra++;
                            break;
                        case 2: //Mostrar Trabajadores
                            for (int i=0; i<posTra; i++){
                                System.out.println("\nNombre: "+argTra[i].getNombre());
                                System.out.println("Tipo: "+argTra[i].getTipo());
                                System.out.println("Numero Trabajador: "+argTra[i].getNumTrabajador());
                                System.out.println("Salario: $"+argTra[i].getSalario()+"\n");
                            }
                            break;
                        case 3: //Buscar Trabajadores
                            System.out.println("\nIngresa el numero de trabajador: ");
                            buscar=leer.nextInt();
                            for (int i=0; i<posTra; i++){
                                if (buscar == argTra[i].getNumTrabajador()){
                                    System.out.println("Registro encontrado!\n");
                                    System.out.println("Nombre: "+argTra[i].getNombre());
                                    System.out.println("Tipo: "+argTra[i].getTipo());
                                    System.out.println("Numero Trabajador: "+argTra[i].getNumTrabajador());
                                    System.out.println("Salario: $"+argTra[i].getSalario()+"\n\n");
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :(\n\n");
                            }
                            break;
                        case 4: //Modificar Trabajadores
                            System.out.println("\nIngresa el numero de trabajador: ");
                            buscar=leer.nextInt();
                            for (int i=0; i<posTra; i++) {
                                if (buscar == argTra[i].getNumTrabajador()){
                                    System.out.println("Ingrese los datos a actualizar:");
                                    System.out.println("Nombre: ");
                                    nombre=leer.next();
                                    argTra[i].setNombre(nombre);
                                    System.out.println("Tipo: ");
                                    tipo=leer.next();
                                    argTra[i].setTipo(tipo);
                                    System.out.println("Salario: ");
                                    salario=leer.nextDouble();
                                    argTra[i].setSalario(salario);
                                    System.out.println("\nEstos son los datos actualizados: \n");
                                    System.out.println("Nombre: "+argTra[i].getNombre());
                                    System.out.println("Tipo: "+argTra[i].getTipo());
                                    System.out.println("Numero Trabajador: "+argTra[i].getNumTrabajador());
                                    System.out.println("Salario: $"+argTra[i].getSalario()+"\n\n");
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :(\n\n");
                            }
                            break;
                        case 5:
                            System.out.println("Vuelva pronto!");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 4: //Comprar
                    System.out.println("Ingrese su numero de cliente: ");
                    buscar=leer.nextInt();
                    for (int i=0; i<posCl; i++){
                        if (buscar == argCl[i].getNumCliente()){
                            encontrado=true;
                            System.out.println("Ingrese el nombre del producto que desea comprar: ");
                            busqueda=leer.next();
                            for (int j=0; j<posHerr; j++){
                                if (busqueda.equalsIgnoreCase(argHerr[j].getNombre())){
                                    System.out.println("Contamos con: "+argHerr[j].getCantidad());
                                    System.out.println("Cuantos productos quiere?");
                                    productos=leer.nextInt();
                                    if (productos>argHerr[j].getCantidad()){
                                        System.out.println("Lo sentimos no disponemos de esa cantidad");
                                        break;
                                    }
                                    System.out.println("Ingrese la fecha: ");
                                    fecha=leer.next();
                                    total = (int)objTicket.CalcPrecio(productos, argHerr[j].getPrecio());
                                    iva = objTicket.CalcIVA(total);
                                    costo = objTicket.CalcPrecioFin(iva, total);
                                    argHerr[j].setCantidad(argHerr[j].getCantidad()-productos);
                                    puntos=productos;
                                    objTicket=new Ticket(noTicket++, total, fecha, argCl[i].getNombre());
                                    System.out.println("\nSu compra ha sido realizada Sr(a). "+
                                            argCl[i].getNombre());
                                    System.out.println("Producto: "+argHerr[j].getNombre());
                                    System.out.println("Precio unitario: "+argHerr[j].getPrecio());
                                    System.out.println("Cantidad: "+productos);
                                    System.out.println("Total (incluye IVA): "+costo);
                                    System.out.println("Fecha: "+fecha);
                                    System.out.println("No. Ticket: "+noTicket);
                                    System.out.println("GRACIAS POR SU COMPRA! \n\n");
                                }
                            }
                            break;
                        }
                    }
                    if (encontrado == false){
                        System.out.println("Cliente no encontrado :c");
                    }
                    break;
                case 5:
                    System.out.println("Adios popo!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            } //Termina primer switch 
        }while(op != 5);
    }
}
