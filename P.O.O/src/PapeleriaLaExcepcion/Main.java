package PapeleriaLaExcepcion;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner leer=new Scanner(System.in);
        try{
        String name="", ape=""; int id=0;//Atributos generales
        
        int puntos=0; //Atributos cliente
        Cliente objCli;
        Cliente arrCli[]=new Cliente[10];
        
        String marca; Double precio; int existente;//Atributos producto
        Producto objPro;
        Producto arrPro[]=new Producto[10];
        
        String dateContratado; double sueldo=0.0, salario=0.0, subsalario=0.0; int horasT=0, diasT=0; int dia=0; String mes="";//Atributos trabajador
        Trabajador llamada = new Trabajador(0.0, 0, "", "", 0, "", 0);//Para llamar metodo DateCotratado desde la clase trabajador
        Trabajador objTra;
        Trabajador arrTra[]=new Trabajador[10];
        
        String cliente="", vendedor=""; int fechaComp=0;//Atributos ticket
        Ticket objTic = null;
        Ticket arrTic[]=new Ticket[100];
        
        int op, op2, opDo, opAct, posCli=0, posPro=0, posTra=0, posTic=0, buscar; //Auxiliares
        String busqueda;
        
        System.out.println("Bienvenido al sistema de la Papeleria LaExcepcion");
        do{
            System.out.println("En que modulo desea entrar?:");
            System.out.println("1.-Cliente\n2.-Productos\n3.-Trabajador\n5.-Salir");
            op=leer.nextInt();
            switch (op){
                case 1: //Clientes
                    System.out.println("---C L I E N T E S---");
                    System.out.println("Seleccione la accion desea realizar:");
                    System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Modificar\n5.-Salir");
                    op2=leer.nextInt();
                    switch (op2){
                        case 1: //Registrar
                            System.out.println("Ingrese su nombre:");
                            name=leer.next();
                            System.out.println("Ingrese su apellido");
                            ape=leer.next();
                            id++;
                            puntos=+5;
                            objCli=new Cliente(puntos, name, ape, id);
                            arrCli[posCli]=objCli;
                            posCli=id;
                        break;
                        case 2: //Mostrar
                            for (int i=0; i<posCli; i++){
                                System.out.println("Nombre: "+arrCli[i].getName());
                                System.out.println("Apellido: "+arrCli[i].getApe());
                                System.out.println("Numero de cliente: "+arrCli[i].getId());
                                System.out.println("Puntos: "+arrCli[i].getPuntos());
                              break;
                            }
                        break;
                        case 3: //Buscar
                            System.out.println("Ingrese el numero de cliente: ");
                            buscar=leer.nextInt();
                            boolean encontrado=false;
                            for (int i=0; i<posCli; i++){
                                if(buscar == arrCli[i].getId()){
                                    System.out.println("Registro encontrado!");
                                    System.out.println("Nombre: "+arrCli[i].getName());
                                    System.out.println("Numero de cliente: "+arrCli[i].getId());
                                    System.out.println("Puntos: "+arrCli[i].getPuntos());
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado==false){
                                System.out.println("Registro no encontrado :(");
                            }
                        break;
                        case 4: //Modificar
                            System.out.println("Ingrese el numero de cliente:");
                            buscar=leer.nextInt();
                            encontrado = false;
                            for (int i=0; i<posCli; i++){
                                if (buscar == arrCli[i].getId()){
                                    System.out.println("Que desea actualizar: \n1.-Nombre\n2.-Puntos de compra");
                                    opAct=leer.nextInt();
                                    switch(opAct){
                                        case 1:
                                            System.out.println("Ingrese el nuevo nombre:");
                                            String newnombre=leer.next();
                                            arrCli[i].setName(newnombre);
                                        break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo puntaje:");
                                            int newpuntos=leer.nextInt();
                                            arrCli[i].setPuntos(newpuntos);
                                        break;
                                    }
                                    System.out.println("\nEste es el registro ya actualizado:");
                                    System.out.println("Nombre: "+arrCli[i].getName());
                                    System.out.println("Numero de cliente: "+arrCli[i].getId());
                                    System.out.println("Puntos: "+arrCli[i].getPuntos());
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :(");
                            }
                        break;
                        case 5:
                        break;
                        default:
                            System.out.println("Opcion no valida");
                        break;
                    }
                    break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2: //Productos
                    System.out.println("---P R O D U C T O S---");
                    System.out.println("Seleccione la accion desea realizar:");
                    System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Modificar\n5.-Salir");
                    op2=leer.nextInt();
                    switch (op2){
                        case 1: //Registrar
                            System.out.println("Ingrese su nombre:");
                            name=leer.next();
                            System.out.println("Ingrese la marca del producto:");
                            marca=leer.next();
                            System.out.println("Ingrese la cantidad existente:");
                            existente=leer.nextInt();
                            System.out.println("Ingrese el precio unitario:");
                            precio=leer.nextDouble();
                            id++;
                            objPro=new Producto(marca, precio, existente, name, ape, id);
                            arrPro[posPro]=objPro;
                            posPro=id;
                        break;
                        case 2: //Mostrar
                            for (int i=0; i<posPro; i++){
                                System.out.println("\nNombre: "+arrPro[i].getName());
                                System.out.println("Marca: "+arrPro[i].getMarca());
                                System.out.println("Cantidad: "+arrPro[i].getExistente());
                                System.out.println("Precio: $"+arrPro[i].getPrecio());
                            }
                        break;
                        case 3: //Buscar
                            System.out.println("Ingrese el nombre del producto: ");
                            busqueda=leer.next();
                            boolean encontrado = false;
                            for (int i=0; i<posPro; i++) {
                                if (busqueda.equalsIgnoreCase(arrPro[i].getName())){
                                    System.out.println("Registro encontrado!");
                                    System.out.println("Nombre: "+arrPro[i].getName());
                                    System.out.println("Marca: "+arrPro[i].getMarca());
                                    System.out.println("Cantidad: "+arrPro[i].getExistente());
                                    System.out.println("Precio: "+arrPro[i].getPrecio());
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :( ");
                            }
                        break;
                        case 4: //Modificar
                            System.out.println("Ingrese el nombre del producto: ");
                            busqueda=leer.next();
                            encontrado = false;
                            for (int i=0; i<posPro; i++){
                                if (busqueda.equalsIgnoreCase(arrPro[i].getName())){
                                    System.out.println("Que desea actualizar: \n1.-Nombre\n2.-Puntos de compra");
                                    opAct=leer.nextInt();
                                    switch(opAct){
                                        case 1:
                                            System.out.println("Ingrese el nuevo precio:");
                                            double newprecio=leer.nextDouble();
                                            arrPro[i].setPrecio(newprecio);
                                        break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo numero en existencia:");
                                            int newexistente=leer.nextInt();
                                            arrPro[i].setExistente(newexistente);
                                        break;
                                    }
                                    System.out.println("Este es el registro ya actualizado:");
                                    System.out.println("Nombre: "+arrPro[i].getName());
                                    System.out.println("Marca: "+arrPro[i].getMarca());
                                    System.out.println("Cantidad: "+arrPro[i].getExistente());
                                    System.out.println("Precio: $"+arrPro[i].getPrecio());
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :(");
                            }
                        break;
                        case 5:
                        break;
                        default:
                            System.out.println("Opcion no valida");
                        break;
                    }
                break;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3: //Trabajadores
                    System.out.println("---T R A B A J A D O R E S---");
                    System.out.println("Seleccione la accion desea realizar:");
                    System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Modificar\n5.-Salir");
                    op2=leer.nextInt();
                    switch (op2){
                        case 1: //Registrar
                            System.out.println("Ingrese su nombre:");
                            name=leer.next();
                            System.out.println("Ingrese su apellido");
                            ape=leer.next();
                            //
                            System.out.println("Ingrese su salario base(Lo que cobra por hora)");
                            sueldo=leer.nextDouble();
                            System.out.println("Cuantas horas trabaja");
                            horasT=leer.nextInt();
                            System.out.println("Cuantas dias a la semana trabaja");
                            diasT=leer.nextInt();
                            subsalario=horasT*sueldo;
                            salario=subsalario*diasT;
                            //
                            System.out.println("Ingrese el dia que inicio sus labores(1, 2, 3,... 29, 30, 31)");
                            dia=leer.nextInt();
                            System.out.println("Ingrese el mes que inicio sus labores(Ene, Feb, Mar... etc)");
                            mes=leer.next();
                            id++;
                            objTra=new Trabajador(salario, horasT, name, ape, id, mes, dia);
                            arrTra[posTra]=objTra;
                            posTra=id;
                        break;
                        case 2: //Mostrar
                            for (int i=0; i<posTra; i++){
                                System.out.println("Nombre: "+arrTra[i].getName()+" "+arrTra[i].getApe());
                                System.out.println("Numero de trabajador: "+arrTra[i].getId());
                                System.out.println("Entro a trabajar el "+arrTra[i].getDia()+" de "+arrTra[i].getMes());
                                System.out.println("Sueldo: "+arrTra[i].getSalario());
                                System.out.println("Horas de trabajo: "+arrTra[i].getHorasT());
                                System.out.println("Dias de trabajo: "+diasT);
                            }
                            break;
                        case 3: //Buscar
                            System.out.println("Ingrese el numero de cliente: ");
                            buscar=leer.nextInt();
                            boolean encontrado=false;
                            for (int i=0; i<posTra; i++){
                                if(buscar == arrTra[i].getId()){
                                    System.out.println("Nombre: "+arrTra[i].getName()+" "+arrTra[i].getApe());
                                    System.out.println("Numero de trabajador: "+arrTra[i].getId());
                                    System.out.println("Sueldo: "+arrTra[i].getSalario());
                                    System.out.println("Horas de trabajo: "+arrTra[i].getHorasT());
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado==false){
                                System.out.println("Registro no encontrado :(");
                            }
                            break;
                        case 4: //Modificar
                            System.out.println("Ingrese el numero de trabajador: ");
                            buscar=leer.nextInt();
                            encontrado = false;
                            for (int i=0; i<posTra; i++){
                                if (buscar == arrTra[i].getId()){
                                    System.out.println("Que desea actualizar: \n1.-Nuevas horas de trabajo\n2.-Sueldo");
                                    opAct=leer.nextInt();
                                    switch(opAct){
                                        case 1:
                                            System.out.println("Ingrese las nuevas horas de trabajo:");
                                            int newhorasT=leer.nextInt();
                                            arrTra[i].setHorasT(newhorasT);
                                        break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo sueldo:");
                                            double newsalario=leer.nextDouble();
                                            arrTra[i].setSalario(newsalario);
                                        break;
                                    }
                                    System.out.println("Este es el registro ya actualizado:");
                                    System.out.println("Nombre: "+arrTra[i].getName()+" "+arrTra[i].getApe());
                                    System.out.println("Numero de trabajador: "+arrTra[i].getId());
                                    System.out.println("Sueldo: "+arrTra[i].getSalario());
                                    System.out.println("Horas de trabajo: "+arrTra[i].getHorasT());
                                    encontrado=true;
                                    break;
                                }
                            }
                            if (encontrado == false){
                                System.out.println("Registro no encontrado :(");
                            }
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 4: //Comprar
                    System.out.println("Ingrese su numero de cliente: ");
                    int idCliente=leer.nextInt();
                    boolean encontrado = false;
                    for (int i=0; i<posCli; i++){
                        if (idCliente == arrCli[i].getId()){
                            encontrado=true;
                            System.out.println("Ingrese el nombre del producto que desea comprar: ");
                            name=leer.next();
                            for (int j=0; j<posPro; j++){
                                if (name.equalsIgnoreCase(arrPro[j].getName())){
                                    System.out.println("Contamos con: "+arrPro[j].getExistente());
                                    System.out.println("Cuantos productos quiere?");
                                    int compra=leer.nextInt();
                                    if (compra>arrPro[j].getExistente()){
                                        System.out.println("Lo sentimos no disponemos de esa cantidad");
                                        break;
                                    }
                                    System.out.println("Ingrese la fecha: ");
                                    String fecha=leer.next();
                                    int total = (int) objTic.CalcSubTotal(compra, arrPro[j].getPrecio());
                                    double iva = objTic.CalcIVA(total);
                                    double costo = objTic.CalcPrecioFin(total, iva);
                                    arrPro[j].setExistente(arrPro[j].getExistente()-compra);
                                    id++;
                                    posTic=id;
                                    puntos=+compra;
                                    
                                    objTic=new Ticket(cliente, vendedor, fechaComp, id);
                                    System.out.println("Su compra ha sido realizada Sr(a). "+arrCli[i].getName());
                                    System.out.println("Producto: "+arrPro[j].getName());
                                    System.out.println("Precio unitario: "+arrPro[j].getPrecio());
                                    System.out.println("Cantidad: "+compra);
                                    System.out.println("Subtotal: "+total);
                                    System.out.println("Total: "+costo);
                                    System.out.println("IVA: "+iva);
                                    System.out.println("Puntos "+arrCli[i].getPuntos());
                                    System.out.println("Fecha: "+fecha);
                                    System.out.println("No. Ticket: "+arrTic[i].getId());
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
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            } //Termina primer switch 
            System.out.println("Desea hacer alguna otra cosa?\n1.-Si\n2.-No");
            opDo=leer.nextInt();
        }while(opDo != 2);
        
        }catch (UnsupportedOperationException ex){
                 System.out.println("Lo sentimos..\nAlgo sali mal :c");
                 }
        
    }
}
