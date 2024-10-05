package FlujoArchivosFerreteria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;
public class Main {
    public static void main(String [] args) throws IOException {
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
        
        //Objetos y arreglos
        Cliente objCl;
        Cliente arrCl[]=new Cliente[100];
        Herramienta objHerr;
        Herramienta arrHerr[]=new Herramienta[100];
        Trabajador objTra;
        Trabajador arrTra[]=new Trabajador[100];
        Ticket objTicket=new Ticket();
        
        int op, op2, posCl=0, posHerr=0, posTra=0, indice=0, buscar; //Auxiliares
        String busqueda;
        
        //try{
         
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
                            tipo="Basico";
                            numClientes++;
                            objCl=new Cliente(numClientes, puntos, nombre, tipo);
                            arrCl[posCl]=objCl;
                            posCl++;
                            
                            String[] datosCliente={nombre,tipo,numClientes+"",puntos+""};
                            FileWriter compra=null;
                            try {
                                compra =new FileWriter("DatosCliente.txt");
                                for(String linea : datosCliente){
                                 compra.write(linea+"\n");
                                }
                                compra.close();
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());
                            }
                            
                            break;
                        case 2: //Mostrar Clientes
                           System.out.println("Esta es la informacion de tu cliente");
                            File compra2=new File("DatosCliente.txt");
                             Scanner c=null;
                            try {
                                c=new Scanner(compra2);
                                while(c.hasNextLine()){
                              String linea2=c.nextLine();
                                    System.out.println(linea2);
                               }
                            } catch (FileNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }finally{
                                try{
                               if(c !=null){
                                  c.close();
                                }
                             }catch(Exception e){
                                    System.out.println(e.getMessage());
                              }
                             }
                            break;
                        case 3: //Buscar Clientes
                            System.out.println("\nIngrese el numero de cliente: ");
                            buscar=leer.nextInt();
                            for (int i=0; i<posCl; i++){
                                if(buscar == arrCl[i].getNumCliente()){
                                    System.out.println("Registro encontrado!\n");
                                    System.out.println("Nombre: "+arrCl[i].getNombre());
                                    System.out.println("Tipo: "+arrCl[i].getTipo());
                                    System.out.println("Numero de cliente: "+arrCl[i].getNumCliente());
                                    System.out.println("Puntos: "+arrCl[i].getPuntos()+"\n\n");
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
                                if (buscar == arrCl[i].getNumCliente()){
                                    System.out.println("Ingrese los nuevos datos para actualizar:");
                                    System.out.println("Nombre: ");
                                    nombre=leer.next();
                                    arrCl[i].setNombre(nombre);
                                    System.out.println("Tipo: ");
                                    tipo=leer.next();
                                    arrCl[i].setTipo(tipo);
                                    System.out.println("\nEste es el nuevo registro: \n");
                                    System.out.println("Nombre: "+arrCl[i].getNombre());
                                    System.out.println("Tipo: "+arrCl[i].getTipo());
                                    System.out.println("Numero de cliente: "+arrCl[i].getNumCliente());
                                    System.out.println("Puntos: "+arrCl[i].getPuntos()+"\n\n");
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
                            arrHerr[posHerr]=objHerr;
                            posHerr++;
                            
                            String[] datosHerramienta={nombre,tipo,tamaño+"",color,cantidad+"",precio+""};
                            FileWriter RH=null;
                            try {
                                RH =new FileWriter("DatosHerramienta.txt");
                                for(String linea : datosHerramienta){
                                 RH.write(linea+"\n");
                                }
                                RH.close();
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());
                            }
                             
                            break;
                        case 2: //Mostrar Herramientas
                            System.out.println("Esta es la informacion de la herramienta");
                            File ReH=new File("DatosHerramienta.txt");
                             Scanner S2=null;
                            try {
                                S2=new Scanner(ReH);
                                while(S2.hasNextLine()){
                              String linea2=S2.nextLine();
                                    System.out.println(linea2+"\n");
                               }
                            } catch (FileNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }finally{
                                try{
                               if(S2 !=null){
                                  S2.close();
                                }
                             }catch(Exception e){
                                    System.out.println(e.getMessage());
                              }
                             }
                            break;
                        case 3: //Buscar Herramientas
                            System.out.println("\nIngrese el nombre de la herramienta: ");
                            busqueda=leer.next();
                            for (int i=0; i<posHerr; i++) {
                                if (busqueda.equalsIgnoreCase(arrHerr[i].getNombre())){
                                    System.out.println("Registro encontrado!\n");
                                    System.out.println("\nNombre: "+arrHerr[i].getNombre());
                                    System.out.println("Tipo: "+arrHerr[i].getTipo());
                                    System.out.println("Color: "+arrHerr[i].getColor());
                                    System.out.println("Tamaño: "+arrHerr[i].getTamaño());
                                    System.out.println("Cantidad: "+arrHerr[i].getCantidad());
                                    System.out.println("Precio: $"+arrHerr[i].getPrecio()+"\n");
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
                                if (busqueda.equalsIgnoreCase(arrHerr[i].getNombre())){
                                    System.out.println("Ingrese los datos a actualizar: ");
                                    System.out.println("Color: ");
                                    color=leer.next();
                                    arrHerr[i].setColor(color);
                                    System.out.println("Tamaño: ");
                                    tamaño=leer.next();
                                    arrHerr[i].setTamaño(tamaño);
                                    System.out.println("\nEste es el nuevo registro:\n");
                                    System.out.println("\nNombre: "+arrHerr[i].getNombre());
                                    System.out.println("Tipo: "+arrHerr[i].getTipo());
                                    System.out.println("Color: "+arrHerr[i].getColor());
                                    System.out.println("Tamaño: "+arrHerr[i].getTamaño());
                                    System.out.println("Cantidad: "+arrHerr[i].getCantidad());
                                    System.out.println("Precio: $"+arrHerr[i].getPrecio()+"\n");
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
                            arrTra[posTra]=objTra;
                            posTra++;
                            
                            String[] DatosTrabajador={nombre,tipo,numTrabajador+"",salario+""};
                            FileWriter RT=null;
                            try {
                                RT =new FileWriter("DatosTrabajador.txt");
                                for(String linea : DatosTrabajador){
                                 RT.write(linea+"\n");
                                }
                                RT.close();
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case 2: //Mostrar Trabajadores
                            System.out.println("Esta es la informacion de tu trababajdor");
                            File ReT=new File("DatosTrabajador.txt");
                             Scanner S3=null;
                            try {
                                S3=new Scanner(ReT);
                                while(S3.hasNextLine()){
                              String linea2=S3.nextLine();
                                    System.out.println(linea2+"\n");
                               }
                            } catch (FileNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }finally{
                                try{
                               if(S3 !=null){
                                  S3.close();
                                }
                             }catch(Exception e){
                                    System.out.println(e.getMessage());
                              }
                             }
                            break;
                        case 3: //Buscar Trabajadores
                            System.out.println("\nIngresa el numero de trabajador: ");
                            buscar=leer.nextInt();
                            for (int i=0; i<posTra; i++){
                                if (buscar == arrTra[i].getNumTrabajador()){
                                    System.out.println("Registro encontrado!\n");
                                    System.out.println("\nNombre: "+arrTra[i].getNombre());
                                    System.out.println("Tipo: "+arrTra[i].getTipo());
                                    System.out.println("Numero Trabajador: "+arrTra[i].getNumTrabajador());
                                    System.out.println("Salario: $"+arrTra[i].getSalario()+"\n");
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
                                if (buscar == arrTra[i].getNumTrabajador()){
                                    System.out.println("Ingrese los datos a actualizar:");
                                    System.out.println("Nombre: ");
                                    nombre=leer.next();
                                    arrTra[i].setNombre(nombre);
                                    System.out.println("Tipo: ");
                                    tipo=leer.next();
                                    arrTra[i].setTipo(tipo);
                                    System.out.println("Salario: ");
                                    salario=leer.nextDouble();
                                    arrTra[i].setSalario(salario);
                                    System.out.println("\nEstos son los datos actualizados: \n");
                                    System.out.println("Nombre: "+arrTra[i].getNombre());
                                    System.out.println("Tipo: "+arrTra[i].getTipo());
                                    System.out.println("Numero Trabajador: "+arrTra[i].getNumTrabajador());
                                    System.out.println("Salario: $"+arrTra[i].getSalario()+"\n\n");
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
                    for (int i = 0; i < posHerr; i++) {
                        System.out.println(arrHerr[i].getNombre());
                        System.out.println(arrHerr[i].getCantidad());
                        System.out.println(arrHerr[i].getPrecio());
                    }
                    System.out.println("Que herramienta desea comprar?");
                    String herramienta = leer.next();
                    for (int i = 0; i < posHerr; i++) {
                        if (herramienta.equals(arrHerr[i].getNombre())) {
                            encontrado = true;
                        }
                        System.out.println("Cuantas quiere comprar?");
                        cantidad = leer.nextInt();
                        System.out.println("Ingrese la fecha");
                        fecha = leer.next();
                        System.out.println("Ingresa el nombre del cliente");
                        String cliente = leer.next();
                       
                       
                        precio = objTicket.CalcPrecio(cantidad, arrHerr[i].getPrecio());
                        iva = objTicket.CalcIVA(precio);
                        total = (int) objTicket.CalcPrecioFin(total, iva);
                        arrHerr[i].setCantidad(arrHerr[i].getCantidad()-productos);
                        puntos=productos;
                        objTicket=new Ticket(noTicket++, total, fecha, arrCl[i].getNombre());
                            arrCl[i].setPuntos(arrCl[i].getPuntos() + 10);
                            String[] Compra={"Compra exitosa\n"+"nombre\n" + cliente+"\nproducto\n" + herramienta +"\nPrecio unitario\n" + precio
                            +"\nprecio total" + total+"\nVuelva pronto"};
                            FileWriter compra=null;
                            try {
                                compra =new FileWriter("Compra.txt");
                                for(String linea : Compra){
                                 compra.write(linea);
                                }
                                compra.close();
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());
                            }
                             File compra2=new File("Compra.txt");
                             Scanner S=null;
                            try {
                                S=new Scanner(compra2);
                                while(S.hasNextLine()){
                              String linea2=S.nextLine();
                                    System.out.println(linea2);
                               }
                            } catch (FileNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            }finally{
                            
                                try{
                               if(S !=null){
                                  S.close();
                                }
                            
                             }catch(Exception e){
                                    System.out.println(e.getMessage());
                              }
                             }
                            break;
                        }
                    if (encontrado == false){
                        System.out.println("Cliente no encontrado :c");
                    }
                    break;
                case 5:
                break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            } //Termina primer switch 
        }while(op != 5);
            /*
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayStoreException e) {
            System.out.println(e.getMessage());
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        } catch (IllegalThreadStateException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IllegalMonitorStateException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
                     */
    }
}
