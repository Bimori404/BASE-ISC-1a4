package Papeleria;
import java.util.*;

/*

Hay que revisar la funcionalidad de este programa.
No muestra la informacion en algunas clases

*/

public class Main {
    public static void main(String [] args){
        Scanner leer=new Scanner(System.in);
        //InfoGen
        String name;
        int ID=0;
        
        //Productos
        Vector<Productos> vPro=new Vector<Productos>();
        Productos objPro = null;
        int cant=0;
        double precio=0.0;
        
        //Empleado y Gerente
        Vector<Empleado> vEmp=new Vector<Empleado>();
        Empleado objEmp = null;
        Vector<Gerente> vGer=new Vector<Gerente>();
        Gerente objGer = null;
        String apeEm, apeGe, direccion;
        double salario=0.0;
        int numtel=0;
        
        //Cliente
        Vector<Cliente> vCli=new Vector<Cliente>();
        Cliente objCli = null;
        int tel=0;
        String dir;
        
        //Ticket
        Vector<Ticket> vTicket=new Vector<Ticket>();
        Ticket objTik = null;
        double Total=0.0, precioT=0.0;
        int cantT=0;
        
        
        int opMe=0, opCli=0, opTra=0, opDo=0;
        
        System.out.println("Bienvenido a la papeleria ´la Discreta´");
        do{
        System.out.println("Menu del sistema \n1.-Cliente \n2.-Trabajador \n3.-Producto \n4.-Comprar \n5.-Salir");
        opMe=leer.nextInt();
        switch(opMe){
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 1:
                System.out.println("---C L I E N T E S---");
        System.out.println("Que deseas hacer? \n1.-Registrar datos\n1.-Mostrar datos\n3.-Buscar datos\n4.-Actualizar datos\n5.-Eliminar dato\n6.-Salir");
                opCli=leer.nextInt();
                    switch (opCli){
                        case 1: //Registrar
                            System.out.println("Ingrese el nombre del cliente");
                            name=leer.next();
                            System.out.println("Ingresa el numero de telefono del cliente");
                            tel=leer.nextInt();
                            System.out.println("Ingresa la direccion del cliente");
                            dir=leer.next();
                            dir=leer.next();
                            ////////////////////////////////////////////////////
                            if(vPro.isEmpty())
                                ID=1;
                            else
                                ID=vPro.lastElement().getID();
                            ////////////////////////////////////////////////////
                            objCli = new Cliente(tel, dir, name, vCli.size()+1);
                            vCli.add(objCli);
                            System.out.println("Cliente registrado!");
                            System.out.println("-----------------------------------");
                        break;
                        case 2://Mostrar
                            for(int i=0;i<vCli.size();i++){
                            System.out.print("ID: "+vCli.get(i).getID()+"\n"+
                                             "Nombre: "+vCli.get(i).getName()+"\n"+
                                             "Telefono: "+vCli.get(i).getTel()+"\n"+
                                             "Direccion: "+vCli.get(i).getDir());
                            System.out.println("-----------------------------------");
                            }
                        break;
                        case 3://Buscar
                              System.out.println("Ingrese el nombre que desee buscar");
                            String buscar=leer.next();
                            for (int i = 0; i <vCli.size(); i++){
                                for(Cliente a : vCli){
                                    System.out.println("ID: "+objCli.getID());
                                    System.out.println("Nombre: "+objCli.getName());
                                    System.out.println("Telefono: "+objCli.getTel());
                                    System.out.println("Direccion: "+objCli.getDir());
                                    System.out.println("--------------------------------");
                                }
                            }
                        break;
                        case 4://Actualizar
                            System.out.println("Ingrese el nombre que desee buscar para actualizar");
                            String actualizar=leer.next();
                            for (int i = 0; i < vCli.size(); i++) {
                                for(Cliente a : vCli){
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nombreAct;
                                    vCli.get(i).setName(nombreAct=leer.next());
                                    System.out.println("Actualizado!");
                                    System.out.println("Nuevo nombre " + objCli.getName());
                                }
                            }
                        break;
                        case 5://Eliminar
                            System.out.println("Ingrese el nombre que desee eliminar");
                            buscar=leer.next();
                            for (int i = 0; i < vCli.size(); i++) {
                                if (buscar.equals(vCli.get(i).getName())) {
                                   vCli.remove(i);
                                }
                            }
                        break;
                        case 6:
                            // S A L I R //
                        break;
                    }
                break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 2:
                System.out.println("---T R A B A J A D O R E S---");
                System.out.println("Seleccione la accion desea realizar:");
                    System.out.println("1.-Empleado\n2.-Gerente\n3.-Salir");
                    opTra=leer.nextInt();
                    switch(opTra){
                        case 1://Empleados
                            System.out.println("---E M P L E A D O---");
                            System.out.println("Que desea hacer? ");
        System.out.println("Que deseas hacer? \n1.-Registrar datos\n1.-Mostrar datos\n3.-Buscar datos\n4.-Actualizar datos\n5.-Eliminar dato\n6.-Salir");
                            int opEmp=leer.nextInt();
                                switch (opEmp){
                                    case 1: //Registrar
                                        System.out.println("Ingrese el nombre del Empleado");
                                        name=leer.next();
                                        System.out.println("Ingresa el apellido del Empleado");
                                        apeEm=leer.next();
                                        System.out.println("Ingresa la direccion del empleado");
                                        direccion=leer.next();
                                        System.out.println("Ingrese el numero telefonico del empleado");
                                        numtel=leer.nextInt();
                                        System.out.println("Ingrese el salario del empleado");
                                        salario=leer.nextDouble();
                                        ////////////////////////////////////////////
                                        if(vEmp.isEmpty())
                                            ID=1;            
                                        else
                                            ID=vEmp.lastElement().getID()+1;
                                        ////////////////////////////////////////////
                                        objEmp= new Empleado(apeEm, direccion, salario, numtel, name, vEmp.size()+1);
                                        System.out.println("Empleado Registrado con exito!");
                                        System.out.println("-------------------------------------------");
                                    break;        
                                    case 2: //Mostrar
                                        System.out.println("Mostrando");
                                        for(int i=0;i<vEmp.size();i++){
                                            System.out.print("ID: "+vEmp.get(i).getID()+"\n"+
                                                             "Nombre: "+vEmp.get(i).getName()+"\n"+
                                                             "Apellido: "+vEmp.get(i).getApeEm()+"\n"+
                                                             "Numero telefonico: "+vEmp.get(i).getNumtel()+"\n"+
                                                             "Direccion: "+vEmp.get(i).getDireccion()+"\n"+
                                                             "Salario: "+vEmp.get(i).getSalario()+"\n");
                                            System.out.println("-------------------------------------------");
                                        }
                                    break;
                                    case 3://Buscar
                                        System.out.println("Ingrese el nombre que desee buscar");
                                        String buscar=leer.next();
                                        for (int i = 0; i <vEmp.size(); i++){
                                            for(Empleado a : vEmp){       
                                                System.out.print("ID: "+vEmp.get(i).getID()+"\n"+
                                                             "Nombre: "+vEmp.get(i).getName()+"\n"+
                                                             "Apellido: "+vEmp.get(i).getApeEm()+"\n"+
                                                             "Numero telefonico: "+vEmp.get(i).getNumtel()+"\n"+
                                                             "Direccion: "+vEmp.get(i).getDireccion()+"\n"+
                                                             "Salario: "+vEmp.get(i).getSalario()+"\n");
                                                System.out.println("-------------------------------------------");
                                            }
                                        }
                                    break;
                                    case 4://Actualizar
                                        System.out.println("Ingrese el nombre que desee buscar para actualizar");
                                        String actualizar=leer.next();
                                        for (int i = 0; i < vEmp.size(); i++) {
                                            for(Empleado a : vEmp){
                                                System.out.println("Ingrese el nuevo nombre");
                                                String nombreAct;
                                                vEmp.get(i).setName(nombreAct=leer.next());
                                                System.out.println("Actualizado!");
                                                System.out.println("Nuevo nombre " + objEmp.getName());
                                            }
                                        }
                                    break;  
                                    case 5://Eliminar
                                        System.out.println("Ingrese el nombre que desee eliminar");
                                        buscar=leer.next();
                                        for (int i = 0; i < vEmp.size(); i++) {
                                            if (buscar.equals(vEmp.get(i).getName())) {
                                                vEmp.remove(i);
                                            }
                                        }
                                    break;
                                    case 6://Salir
                                    break;
                                }
                        break;
                        case 2://Gerente
                            System.out.println("---G E R E N T E---");
                            System.out.println("Que desea hacer? ");
        System.out.println("Que deseas hacer? \n1.-Registrar datos\n1.-Mostrar datos\n3.-Buscar datos\n4.-Actualizar datos\n5.-Eliminar dato\n6.-Salir");
                            int opGer=leer.nextInt();
                                switch (opGer){
                                    case 1: //Registrar
                                        System.out.println("Ingrese el nombre del Empleado");
                                        name=leer.next();
                                        System.out.println("Ingresa el apellido del Empleado");
                                        apeGe=leer.next();
                                        System.out.println("Ingresa la direccion del empleado");
                                        direccion=leer.next();
                                        System.out.println("Ingrese el numero telefonico del empleado");
                                        numtel=leer.nextInt();
                                        System.out.println("Ingrese el salario del empleado");
                                        salario=leer.nextDouble();
                                        ////////////////////////////////////////////
                                        if(vGer.isEmpty())
                                            ID=1;            
                                        else
                                            ID=vGer.lastElement().getID()+1;
                                        ////////////////////////////////////////////
                                        objEmp= new Empleado(apeGe, direccion, salario, numtel, name, vGer.size()+1);
                                        System.out.println("Empleado Registrado con exito!");
                                        System.out.println("-------------------------------------------");
                                    break;        
                                    case 2: //Mostrar
                                        for(int i=0;i<vGer.size();i++){
                                            System.out.print("ID: "+vGer.get(i).getID()+"\n"+
                                                             "Nombre: "+vGer.get(i).getName()+"\n"+
                                                             "Apellido: "+vGer.get(i).getApeGe()+"\n"+
                                                             "Numero telefonico: "+vGer.get(i).getNumtel()+"\n"+
                                                             "Direccion: "+vGer.get(i).getDireccion()+"\n"+
                                                             "Salario: "+vGer.get(i).getSalario()+"\n");
                                            System.out.println("-------------------------------------------");
                                        }
                                    break;
                                    case 3://Buscar
                                        System.out.println("Ingrese el nombre que desee buscar");
                                        String buscar=leer.next();
                                        for (int i = 0; i <vGer.size(); i++){
                                            for(Gerente a : vGer){       
                                                System.out.print("ID: "+vGer.get(i).getID()+"\n"+
                                                             "Nombre: "+vGer.get(i).getName()+"\n"+
                                                             "Apellido: "+vGer.get(i).getApeGe()+"\n"+
                                                             "Numero telefonico: "+vGer.get(i).getNumtel()+"\n"+
                                                             "Direccion: "+vGer.get(i).getDireccion()+"\n"+
                                                             "Salario: "+vGer.get(i).getSalario()+"\n");
                                                System.out.println("-------------------------------------------");
                                            }
                                        }
                                    break;
                                    case 4://Actualizar
                                        System.out.println("Ingrese el nombre que desee buscar para actualizar");
                                        String actualizar=leer.next();
                                        for (int i = 0; i < vGer.size(); i++) {
                                            for(Gerente a : vGer){
                                                System.out.println("Ingrese el nuevo nombre");
                                                String nombreAct;
                                                vGer.get(i).setName(nombreAct=leer.next());
                                                System.out.println("Actualizado!");
                                                System.out.println("Nuevo nombre " + objGer.getName());
                                            }
                                        }
                                    break;  
                                    case 5://Eliminar
                                        System.out.println("Ingrese el nombre que desee eliminar");
                                        buscar=leer.next();
                                        for (int i = 0; i < vGer.size(); i++) {
                                            if (buscar.equals(vGer.get(i).getName())) {
                                                vGer.remove(i);
                                            }
                                        }
                                    break;
                                    case 6://Salir
                                    break;
                                }
                        break;
                        case 3:
                            // S A L I R //
                        break;
                    }
                break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 3:
                System.out.println("---P R O D U C T O S---");
                System.out.println("Seleccione la accion desea realizar:");
                    System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Modificar\n5.-Eliminar\n6.-Salir");
                    int op3=leer.nextInt();
                    switch(op3){
                        case 1://Registrar
                            System.out.println("Ingrese el nombre del producto que desea registrar");
                            name=leer.next();
                            System.out.println("Ingrese el precio unitario del producto");
                            precio=leer.nextInt();
                            System.out.println("Ingrese la cantidad neta del producto");
                            cant=leer.nextInt();
                            ////////////////////////////////////////////////////
                            if(vPro.isEmpty())
                                ID=1;
                            else
                                ID=vPro.lastElement().getID()+1;
                            ////////////////////////////////////////////////////
                            objPro= new Productos(cant, precio, name, vPro.size()+1);
                            System.out.println("--------------------------------");
                            break;
                            
                        case 2://Mostrar
                            for(int i=0; i<vPro.size();i++){
                                System.out.println("ID: "+vPro.get(i).getID()+"\n"+
                                                   "Producto: "+vPro.get(i).getName()+"\n"+
                                                   "Precio $"+vPro.get(i).getPrecio()+"\n"+
                                                   "Cantidad: "+vPro.get(i).getCant());
                                System.out.println("--------------------------------");
                            }
                            break;
                        case 3://Buscar
                            System.out.println("Ingresa el producto que desa buscar");
                            String busProd=leer.next();
                            for(int i=0;i<vPro.size();i++){
                                for(Productos p: vPro){                                    
                                    System.out.println("ID: "+vPro.get(i).getID()+"\n"+
                                                   "Producto: "+vPro.get(i).getName()+"\n"+
                                                   "Precio "+ vPro.get(i).getPrecio()+" pesos");
                                    System.out.println("--------------------------------");
                                }
                            }
                             break;
                        case 4://Modificar
                             System.out.println("Ingrese el Producto que desee buscar para actualizar");
                            String actualizar=leer.next();
                            for (int i = 0; i < vPro.size(); i++) {
                                for(Productos p : vPro){
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nombreProd;
                                    vPro.get(i).setName(nombreProd=leer.next());
                                    System.out.println("Producto Actualizado!");
                                    System.out.println("Nuevo nombre " + objPro.getName());                                   
                                }
                            }
                            break;
                        case 5://Eliminar
                            System.out.println("Ingrese el Producto que desee eliminar");
                            String Prodbuscar=leer.next();
                            for (int i = 0; i < vPro.size(); i++) {
                                if (Prodbuscar.equals(vPro.get(i).getName())) {
                                   vPro.remove(i);
                                }
                            }                      
                            break;
                        case 6://Salir
                            break;
                    }
                break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 4:
                System.out.println("---C O M P R A R---");
                
                System.out.println("Ingrese su numero de cliente: ");
                    int idCliente=leer.nextInt();
                    boolean encontrado = false;
                    for (int i=0; i< vCli.size(); i++){
                        for(Cliente a : vCli){
                            encontrado=true;
                            System.out.println("Ingrese el nombre del producto que desea comprar: ");
                            name=leer.next();
                            for (int j=0; j<vPro.capacity(); j++){
                                if (name.equals(vPro.get(j).getName())){
                                    System.out.println("Contamos con: "+vPro.get(j).getCant());
                                    System.out.println("Cuantos productos quiere?");
                                    int compra=leer.nextInt();
                                    if (compra>+vPro.get(j).getCant()){
                                        System.out.println("Lo sentimos no disponemos de esa cantidad");
                                        break;
                                    }
                                    System.out.println("Porfavor ingrese la fecha de hoy: ");
                                    String fecha=leer.next();
                                    int total = (int) objTik.CalcSubTotal(compra, +vPro.get(i).getPrecio());
                                    double iva = objTik.CalcIVA(total);
                                    double costo = objTik.CalcPrecioFin(total, iva);
                                    vPro.get(j).getCant(vPro.get(j).getCant()-compra);
                                    
                                    if(vTicket.isEmpty()){
                                        ID=1;
                                    }else{
                                        ID=vTicket.lastElement().getID()+1;
                                    }
                                    
                                    objTik=new Ticket(Total, precioT, cantT, name, ID);
                                    System.out.println("Su compra ha sido realizada Sr(a). "+vCli.get(i).getName());
                                    System.out.println("Producto: "+vPro.get(j).getName());
                                    System.out.println("Precio unitario: "+vPro.get(j).getPrecio());
                                    System.out.println("Cantidad: "+compra);
                                    System.out.println("Subtotal: "+total);
                                    System.out.println("Total: "+costo);
                                    System.out.println("IVA: "+iva);
                                    System.out.println("Fecha: "+fecha);
                                    System.out.println("No. Ticket: "+vTicket.get(i).getID());
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 5:
                // S A L I R
            break;
            default:
                System.out.println("Opcion no valida");
            break;
            }//Termina primer switch 
            System.out.println("Desea hacer alguna otra cosa?\n1.-Si\n2.-No");
          opDo=leer.nextInt();
       }while(opDo != 2);
   }
}
