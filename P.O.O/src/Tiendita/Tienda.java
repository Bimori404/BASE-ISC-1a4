package Tiendita;
import java.util.Scanner;
public class Tienda {
   public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        Cliente arrCliente[]= new Cliente[10];
        Empleado arrEmpleado[]= new Empleado[10];
        Producto arrProducto[]= new Producto[10];
        int auxEmpleado=0, auxCliente=0, auxProducto=0;
        int numempleado, numcliente, horasT, numcompras;
        double sueldo, precio;
        String nomcliente, nomempleado, nomprod, apeP, apeM, calle, col, cd, num;
        int edad, cp, existente, numprod;
        long numcontact;
        int op, opDo, opCompras=0, op1, op2, op3, op4;
        do{
        System.out.println("-Bienvenidos la tiendita SuTortuga-");
        System.out.println("Que accion desea realizar: "
                         + "\n1.-Registrar informacion"
                         + "\n2.-Mostrar informacion"
                         + "\n3.-Buscar informacion"
                         + "\n4.-Actualizar informacion"
                         + "\n5.-Comprar articulos");
               op=leer.nextInt();
        switch(op){
////////////Registrar la informacion de un empleado o de un cliente//////////////////////////////////////////////j/////////s/////////p/////////g//////////////////////////////////////
            case 1:
                System.out.println("Que accion desea realizar:\n1.-Registrar empleado"
                                  +"\n2.-Registar cliente\n3.-Registrar producto\n4.-Salir");
                op1 = leer.nextInt();
                switch (op1){
                    case 1: 
                        Empleado objEmpleado;
                        System.out.println("Nombre: ");
                        nomempleado = leer.next();
                        System.out.println("Apellido paterno: ");
                        apeP = leer.next();
                        System.out.println("Apellido materno: ");
                        apeM = leer.next();
                        System.out.println("Calle: ");
                        calle = leer.next();
                        calle = leer.next();
                        calle = leer.next();
                        System.out.println("Colonia: ");
                        col = leer.next();
                        System.out.println("Ciudad de origen: ");
                        cd = leer.next();
                        System.out.println("Numero de casa: ");
                        num = leer.next();
                        System.out.println("Edad: ");
                        edad = leer.nextInt();
                        System.out.println("Codigo postal: ");
                        cp = leer.nextInt();
                        System.out.println("Numero de contacto: ");
                        numcontact = leer.nextLong();
                        System.out.println("Numero clave del empleado: ");
                        numempleado = leer.nextInt();
                        System.out.println("Ingresa el numero de horas Trabajadas");
                        horasT = leer.nextInt();
                        System.out.println("Ingresa el sueldo");
                        sueldo= leer.nextDouble();
                        objEmpleado= new Empleado(nomempleado, apeP, apeM, calle, col,  cd, num, edad, cp, numcontact,numempleado,horasT,sueldo);
                        if(auxEmpleado<10) {
                        arrEmpleado[auxEmpleado]=objEmpleado;
                        auxEmpleado++;
                        }else{
                        System.out.println("Empleado no registrado\nNumero de emplaeados exedido");
                        }
                    break;
                    case 2:
                        Cliente objCliente;
                        System.out.println("Nombre: ");
                        nomcliente = leer.next();
                        System.out.println("Apellido paterno: ");
                        apeP = leer.next();
                        System.out.println("Apellido materno: ");
                        apeM = leer.next();
                        System.out.println("Numero clave del cliente: ");
                        numcliente = leer.nextInt();
                        System.out.println("Numero de compras: ");
                        numcompras = leer.nextInt();
                        System.out.println("Calle: ");
                        calle = leer.next();
                        calle = leer.next();
                        calle = leer.next();
                        System.out.println("Colonia: ");
                        col = leer.next();
                        System.out.println("Ciudad de origen: ");
                        cd = leer.next();
                        System.out.println("Numero de casa: ");
                        num = leer.next();
                        System.out.println("Edad: ");
                        edad = leer.nextInt();
                        System.out.println("Codigo postal: ");
                        cp = leer.nextInt();
                        System.out.println("Numero de contacto: ");
                        numcontact = leer.nextLong();
                        objCliente = new Cliente(numcliente, numcompras, nomcliente, apeP, apeM, calle, col, cd, num, edad, cp, numcontact);
                        if(auxCliente<10) {
                        arrCliente[auxCliente]=objCliente;
                        auxCliente++;
                        }else{
                        System.out.println("Empleado no registrado\nNumero de emplaeados exedido");
                        }
                    break;
                    case 3:
                        Producto objProducto;
                        System.out.println("Ingresa el nombre del producto:");
                        nomprod = leer.next();
                        System.out.println("Ingresa el numero clave de producto(1,2...)");
                        numprod = leer.nextInt();
                        System.out.println("Cuantas piezas son:");
                        existente = leer.nextInt();
                        System.out.println("Cuanto costara");
                        precio = leer.nextDouble();
                        objProducto = new Producto(nomprod, existente, numprod, precio);
                        if(auxProducto<10) {
                        arrProducto[auxProducto]= objProducto;
                        auxProducto++;
                        }else{
                        System.out.println("Almacen lleno\nPorfavor intente en otro momento");
                        }
                    break;
                    case 4:
                    break;
                }
            break;
///////////////Mostrar la informcion de un empleado o de un cliente//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 2:
                System.out.println("Que accion desea realizar:\n1.-Mostrar informacion del empleado"
                                  +"\n2.-Mostrar informacion del cliente\n3.-Mostrar la informacion de un producto\n4.-Salir");
                op2 = leer.nextInt();
                switch (op2){
                    case 1:
                        for (int i = 0; i < auxEmpleado; i++) {
                            System.out.println("La informacion del empleado es:"+
                            "\nNombre:\n"+arrEmpleado[i].getNombre()+" "+arrEmpleado[i].getApeP()+" "+arrEmpleado[i].getApeM()+
                            "\nDirreccion:\n"+arrEmpleado[i].getCalle()+", "+arrEmpleado[i].getCol()+", "+arrEmpleado[i].getCiudad()+", "+arrEmpleado[i].getCp()+", "+arrEmpleado[i].getNum()+
                            "\nNumero clave del empleado:\n"+arrEmpleado[i].getNumempleado()+
                            "\nEdad:\n"+arrEmpleado[i].getEdad()+
                            "\nTelefono:\n"+arrEmpleado[i].getNumcontact());                                       
                        }   
                    break;
                    case 2:
                        for (int i = 0; i < auxCliente; i++) {
                            System.out.println("La informacion del cliente es: "+
                            "\nNombre:\n"+arrCliente[i].getNombre()+" "+arrCliente[i].getApeP()+" "+arrCliente[i].getApeM()+
                            "\nDirreccion:\n"+arrCliente[i].getCalle()+", "+arrCliente[i].getCol()+", "+arrCliente[i].getCiudad()+", "+arrCliente[i].getNum()+", "+arrEmpleado[i].getCp()+
                            "\nNumero clave del cliente:\n"+arrCliente[i].getNumcliente()+
                            "\nTelefono\n"+arrCliente[i].getNumcontact()+
                            "\nArticulos comprados:\n"+arrCliente[i].getNumcompras());
                        }
                    break;
                    case 3:
                        for (int i = 0; i < auxProducto; i++) {
                             System.out.println("La informacion del producto es: "+
                             "Nombre del producto:\n"+arrProducto[i].getNombre()+
                             "\nNumero de piezas:\n"+arrProducto[i].getExistente()+
                             "\nCosto por pieza:\n"+arrProducto[i].getPrecio()+
                             "\nNumero clave del producto:\n"+arrProducto[i].getNumprod());
                        auxProducto++;
                        }
                    break;
                    case 4:
                    break;
                 }
            break;
///////////////Busqueda de informacion////////////////////////////////////////////////////////////////////////////////////////////////////////
             case 3:
                 System.out.println("Que accion desea realizar:\n1.-Buscar informacion de algun empleado"
                                   +"\n2.-Buscar informacion de algun cliente\n3.-Buscar informacion de algun producto\n4.-Salir");
                 op3 = leer.nextInt();
                 switch (op3){
                     case 1:
                         System.out.println("Que empleado desea buscar?\nIngrese el numero de empleado:");
                         numempleado = leer.nextInt();
                         for (int i = 0; i < auxEmpleado; i++){
                           if (numempleado == arrEmpleado[i].getNumempleado()){
                            System.out.println("\nNumero clave del empleado: " + arrEmpleado[i].getNumempleado()+
                                               "\nNombre: " + arrEmpleado[i].getNombre()+
                                               "\nApellido paterno: " + arrEmpleado[i].getApeP()+
                                               "\nApellido materno: " + arrEmpleado[i].getApeM()+
                                               "\nEdad: " + arrEmpleado[i].getEdad()+
                                               "\nTelefono de casa: " + arrEmpleado[i].getNum()+
                                               "\nTelefono de contacto: " + arrEmpleado[i].getNumcontact()+
                                               "\nCalle: " + arrEmpleado[i].getCalle() +
                                               "\nColonia: " + arrEmpleado[i].getCol() +
                                               "\nCiudad: " + arrEmpleado[i].getCiudad() +
                                               "\nCodigo postal: " + arrEmpleado[i].getCp() +
                                               "\nHoras de trabajo: " + arrEmpleado[i].getHorasT() +
                                               "\nSueldo: " + arrEmpleado[i].getobtenerSalario());
                           }
                         }
                     break;
                     case 2:
                         System.out.println("Que cliente desea buscar?\nIngrese el numero clave de cliente:");
                         numcliente = leer.nextInt();
                         for (int i = 0; i < auxCliente; i++){
                          if (numcliente == arrCliente[i].getNumcliente()){
                            System.out.println("\nNumero clave del cliente: " + arrCliente[i].getNumcliente() +
                                               "\nNombre: " + arrCliente[i].getNombre() +
                                               "\nApellido paterno: " + arrCliente[i].getApeP() +
                                               "\nApellido materno: " + arrCliente[i].getApeM() +
                                               "\nEdad: " + arrCliente[i].getEdad() +
                                               "\nTelefono de casa: " + arrCliente[i].getNum() +
                                               "\nTelefono de contacto: " + arrCliente[i].getNumcontact() +
                                               "\nCalle: " + arrCliente[i].getCalle() +
                                               "\nColonia: " + arrCliente[i].getCol() +
                                               "\nCiudad: " + arrCliente[i].getCiudad() +
                                               "\nCodigo postal: " + arrCliente[i].getCp() +
                                               "\nArticulos comprados: " + arrCliente[i].getNumcompras());
                           }
                         }
                     break;
                     case 3:
                         System.out.println("Que producto desea buscar?\nIngrese el numero clave del producto:");
                         numprod = leer.nextInt();
                         for (int i = 0; i < auxProducto; i++){
                           if (numprod == arrProducto[i].getNumprod()){
                            System.out.println("\nNumero clave del producto: " + arrProducto[i].getNumprod() +
                                               "\nNombre  del producto: " + arrProducto[i].getNombre() +
                                               "\nPiezas: " + arrProducto[i].getExistente() +
                                               "\nCosto: " + arrProducto[i].getPrecio());
                          }
                        }
                     break;
                     case 4:
                     break;
                 }
             break;
//////////////Actualizacion de informacion////////////////////////////////////////////////////////////////////////////////////////////////////
             case 4:
                 System.out.println("\nElige una opcion: ");
                 System.out.println("1.-Modificar informacion de algun empleado\n2.-Modificar informacion de algun cliente"
                                   +"\n3.-Modificar informacion de algun producto\n4.-Salir");
                 op4 = leer.nextInt();
                 switch (op4){
                     case 1:
                         System.out.println("Ingrese el numero clave del empleado del que se dese modificar su informacion:");
                         numempleado = leer.nextInt();
                         boolean encontrado = false;
                         for (int i = 0; i < auxEmpleado; i++){
                           if (numempleado == arrEmpleado[auxEmpleado].getSueldo()){
                               System.out.println("Empleado encontrado! ");
                               System.out.println("Ingrese el nuevo sueldo\n:");
                               double newsueldo = leer.nextDouble();
                               arrEmpleado[i].setSueldo(newsueldo);
                               encontrado = true;
                               break;
                            }
                        }
                            if (encontrado == false) {
                            System.out.println("No se ha encontrado el ejemplar :c"); 
                            }
                     break;
                     case 2:
                         System.out.println("Ingrese el nombre del cliente al que se dese modificar su informacion:");
                         nomcliente = leer.next();
                         encontrado = false;
                         for (int i = 0; i < auxCliente; i++){
                           if (nomcliente == arrCliente[auxCliente].getCalle()){
                               System.out.println("Cliente encontrado! ");
                               System.out.println("Ingrese la nueva calle\n:");
                               String newcalle = leer.next();
                               arrCliente[i].setCalle(newcalle);
                               encontrado = true;
                               break;
                            }
                        }
                            if (encontrado == false) {
                            System.out.println("No se ha encontrado el ejemplar :c"); 
                            }
                     break;
                     case 3:
                         System.out.println("Ingrese el numero clave del producto del que se dese modificar su informacion:");
                         numprod = leer.nextInt();
                         encontrado = false;
                         for (int i = 0; i < auxProducto; i++){
                           if (numprod == arrProducto[i].getExistente()){
                               System.out.println("Producto encontrado! ");
                               System.out.println("Ingrese la nueva cantidad de productos\n:");
                               int newexistente = leer.nextInt();
                               arrProducto[i].setExistente(newexistente);
                               encontrado = true;
                               break;
                            }
                        }
                            if (encontrado == false) {
                            System.out.println("No se ha encontrado el ejemplar :c"); 
                            }
                     break;
                 }
             break;
///////////////Comprar articulos/////////////////////////////////////////////////////////////////////////////////////////////////////////
             case 5:
                 for (int i = 0; i < auxProducto;i++) {
                     System.out.println((i + 1)+" "+arrProducto[i].getNombre());
                 }
                 System.out.println("Ingrese lo que se le pide\nQue producto desea comprar?");
                 opCompras = leer.nextInt();
                 System.out.println("Ingresa la cantidad que quiere comprar");
                 int cantComprada = leer.nextInt();
                 arrProducto[opCompras-1].setExistente(arrProducto[opCompras-1].getExistente()-cantComprada);
                 System.out.println("Ahora quedan "+arrProducto[opCompras-1].getExistente());
             break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        }//Fin del switch padre
        System.out.println("Desea realizar otra operacion\n1.-Si\n2.-No");
        opDo = leer.nextInt();
        }while( opDo == 1 );
      System.out.println("Gracias por comprar en SuTortuguita\nVuelva pronto :3");
    }
}
