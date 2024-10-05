
package TiendaDeTelefonia;
import java.util.Scanner;
public class Tienda {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        int op, op1;
        int recarga = 0;
        
        Cliente arrCliente[]= new Cliente[10];
        int auxCliente=0;
        Empleado arrEmpleado[]= new Empleado[10];
        int auxEmpleado=0;
        Telefonos arrTelefono[]= new Telefonos[10];
        int auxTelefono=0;
        
        String nombre, apeP, apeM, calle, col;
        int edad;
        long numtel=0;
        String modtel="";
        int saldo=0;
        double sueldo;
        int codempleado = 0;
        
        String modelo, marca, color;
        int espacio, ram, numprod, precio;
        boolean tomaFotos;
        
        do{
            System.out.println("1. Registrar\n2. Mostrar\n3. Actualizar\n4. Comprar\n5. Buscar\n6. Recargar\n7. Salir");
            System.out.print("Selecciona una opcion ");
            op = leer.nextInt();
            switch (op){
                case 1: //Registrar
                    System.out.println("1. Empleado\n2. Productos");
                    System.out.print("Que desea registrar?\n> ");
                    op1 = leer.nextInt();
                    switch (op1){
                        case 1://REGISTRAR
                            System.out.println("-----Reistro de Empleado------");
                            System.out.println("Ingresa el nombre ");
                            nombre = leer.next();
                            System.out.println("Apellido paterno: ");
                            apeP = leer.next();
                            System.out.println("Apellido materno: ");
                            apeM = leer.next();
                            System.out.println("Calle: ");
                            calle = leer.next();
                            System.out.println("Colonia: ");
                            col = leer.next();
                            System.out.println("Edad: ");
                            edad = leer.nextInt();
                            System.out.println("Ingresa el sueldo");
                            sueldo= leer.nextDouble();
                            Empleado objEmpleado = new Empleado(nombre, apeP, apeM, calle, col, edad, 0, sueldo, auxEmpleado + 1);
                            arrEmpleado[auxEmpleado++]=objEmpleado;
                        break;
                        case 2:
                            System.out.println("-----Reistro de Telefono------");
                            System.out.println("Ingrese la marca del telefono");
                            marca = leer.next();
                            System.out.println("Ingrese el modelo del telefono");
                            modelo = leer.next();
                            System.out.println("Ingrese el color del telefono");
                            color = leer.next();
                            System.out.println("Ingrese el espacio de almacenamiento");
                            espacio = leer.nextInt();
                            System.out.println("Ingrese la memoria RAM");
                            ram = leer.nextInt();
                            System.out.println("Ingresa el numero clave de producto(1,2...)");
                            numprod = leer.nextInt();
                            System.out.println("Ingrese el precio del telefono");
                            precio = leer.nextInt();
                            System.out.println("Ingrese si puede tomar fotos");
                            tomaFotos = leer.nextBoolean();
                            Telefonos objTelefono=new Telefonos(modelo, marca, color, espacio, ram, numprod, precio, tomaFotos);
                            arrTelefono[auxTelefono++]=objTelefono;
                        break;
			}
                case 2://Mostrar
                        System.out.println("Que accion desea realizar:\n1.-Mostrar informacion del empleado"
                            +"\n2.-Mostrar informacion del cliente\n3.-Mostrar la informacion de un producto\n4.-Salir");
                        int op2 = leer.nextInt();
                        switch (op2){
                        case 1:
                           for (int i = 0; i < auxEmpleado; i++) {
                            System.out.println("La informacion del empleado es:"+
                            "\nNombre:\n"+arrEmpleado[i].getNombre()+" "+arrEmpleado[i].getApeP()+" "+arrEmpleado[i].getApeM()+
                            "\nDirreccion:\n"+arrEmpleado[i].getCalle()+", "+arrEmpleado[i].getCol()+", "+
                            "\nEdad:\n"+arrEmpleado[i].getEdad());
                            System.out.println("Codigo de empleado:");
                            arrEmpleado[i].Print();
                        }   
                        break;
                        case 2:
                           for (int i = 0; i < auxCliente; i++) {
                            System.out.println("La informacion del cliente es: "+
                            "\nNombre:\n"+arrCliente[i].getNombre()+" "+arrCliente[i].getApeP()+" "+arrCliente[i].getApeM()+
                            "\nDirreccion:\n"+arrCliente[i].getCalle()+", "+arrCliente[i].getCol()+", "+
                            "\nTelefono\n"+arrCliente[i].getNumtel());
                            System.out.println("Codigo de cliente:");
                            arrCliente[i].Print();
                        }
                        break;
                        case 3:
                           for (int i = 0; i < auxTelefono; i++) {
                             System.out.println("La informacion del producto es: "+
                             "Modelo:\n"+arrTelefono[i].getModelo()+
                             "\nColor:\n"+arrTelefono[i].getColor()+
                             "\nMarca:\n"+arrTelefono[i].getMarca()+
                             "\nEspacio:\n"+arrTelefono[i].getEspacio()+
                             "\nRam:\n"+arrTelefono[i].getRam()+
                             "\nPrecio:\n"+arrTelefono[i].getPrecio());
                             auxTelefono++;
                        }
                        break;
                        case 4:
                        break;
                        }
                    break;
                case 3: //Actualizar
                        System.out.println("Que accion desea realizar:\n1.-Actualizar informacion de un empleado"
                            +"\n2.-Actualizar informacion de un cliente\n3.-Actualizar la informacion de un producto\n4.-Salir");
                        int op3 = leer.nextInt();
                        switch (op3){
                          case 1:
                            System.out.println("Ingrese el numero clave del empleado del que se dese modificar su informacion:");
                            codempleado = leer.nextInt();
                            boolean encontrado = false;
                            for (int i = 0; i < auxEmpleado; i++){
                            if (codempleado == arrEmpleado[auxEmpleado].getSueldo()){
                            System.out.println("Empleado encontrado! ");
                            System.out.println("Ingrese el nuevo sueldo\n:");
                            double newsueldo = leer.nextDouble();
                            arrEmpleado[i].setSueldo(newsueldo);
                            encontrado = true;
                            break;
                            }
                            }
                            if (encontrado == false) {
                            System.out.println("No se ha encontrado la informacion ingresada :c"); 
                            }
                          break;
                          case 2:
                            System.out.println("Ingrese el numero telefonico del cliente al que se dese modificar su informacion:");
                            numtel = leer.nextInt();
                            encontrado = false;
                            for (int i = 0; i < auxCliente; i++){
                            if (numtel == arrCliente[auxCliente].getNumtel()){
                               System.out.println("Cliente encontrado! ");
                               System.out.println("Ingrese el nuevo modelo de celular\n:");
                               String newmodtel = leer.next();
                               arrCliente[i].setModtel(newmodtel);
                               encontrado = true;
                            break;
                            }
                            }
                            if (encontrado == false) {
                            System.out.println("No se ha encontrado la informacion ingresada :c"); 
                            }
                          break;
                          case 3:
                         System.out.println("Ingrese el numero clave del telefono del que se dese modificar su informacion:");
                         numprod = leer.nextInt();
                         encontrado = false;
                         for (int i = 0; i < auxTelefono; i++){
                           if (numprod == arrTelefono[i].getNumprod()){
                               System.out.println("Producto encontrado! ");
                               System.out.println("Ingrese el nuevo precio\n:");
                               int newprecio = leer.nextInt();
                               arrTelefono[i].setPrecio(newprecio);
                               encontrado = true;
                               break;
                            }
                        }
                            if (encontrado == false) {
                            System.out.println("No se ha encontrado la informacion ingresada :c"); 
                            }
                     break;
                        }        
         ////////////////////////////////////////////////////////////////////////////7///////////////////////
                    break;
                case 4: //Comprar
                        for (int i = 0; i < auxTelefono; i++){
                         System.out.println(arrTelefono[i].getMarca()+" "+arrTelefono[i].getModelo()+" "+arrTelefono[i].getColor());
                          System.out.println("Almacenamiento: "+arrTelefono[i].getEspacio());
                           System.out.println("Memoria RAM: "+arrTelefono[i].getRam());
                            System.out.println("Precio: "+arrTelefono[i].getPrecio());
                            System.out.println("--------------------------");
                            }
                            System.out.println("Selecciona el telefono que quieras comprar");
                            int seleccion = leer.nextInt();
                            String telefono = arrTelefono[seleccion].getMarca()+" "+arrTelefono[seleccion].getModelo()+" "+arrTelefono[seleccion].getColor();
                            if(seleccion < 0 || seleccion >= auxTelefono){
                            System.out.println("Su telefono es " + telefono);
                            }
                            System.out.println("Es un cliente registrado?\n1.-Si\n2.-No");
                            int opRegistro = leer.nextInt();
                            if(opRegistro == 2){
                                System.out.println("Deseas registrarte?\n1.-Si\n2.-No");
                                int opRegistro2 = leer.nextInt();
                                if(opRegistro2 != 2){
                                Cliente objCliente;
                                System.out.println("Ingresa el nombre");
                                nombre = leer.next();
                                System.out.println("Ingresa el apellido paterno");
                                apeP = leer.next();
                                System.out.println("Ingresa el apellido materno");
                                apeM = leer.next();
                                System.out.println("Ingresa el calle");
                                calle = leer.next();
                                System.out.println("Ingresa el colonia");
                                col = leer.next();
                                System.out.println("Ingrese la edad");
                                edad = leer.nextInt();
                                objCliente = new Cliente(numtel, modtel, saldo, nombre, apeP, apeM, calle, col, edad, auxCliente + 1);
                                arrCliente[auxCliente++] = objCliente;
                                }
                            }
                            System.out.println("Compra realizada con exito");
                    break;
                case 5: //Buscar
                        System.out.println("Que accion desea realizar:\n1.-Buscar informacion de algun empleado"
                                   +"\n2.-Buscar informacion de algun cliente\n3.-Buscar informacion de algun producto\n4.-Salir");
                        int op5 = leer.nextInt();
                        switch (op5){
                        case 1:
                            System.out.println("Que empleado desea buscar?");
                            codempleado = leer.nextInt();
                            for (int i = 0; i < auxEmpleado; i++){
                            if (codempleado == arrEmpleado[i].getCodempleado()){
                            System.out.println("Numero clave del empleado: " + arrEmpleado[i].getCodempleado()+
                                               "\nNombre: " + arrEmpleado[i].getNombre()+
                                               "\nApellido paterno: " + arrEmpleado[i].getApeP()+
                                               "\nApellido materno: " + arrEmpleado[i].getApeM()+
                                               "\nEdad: " + arrEmpleado[i].getEdad()+
                                               "\nCalle: " + arrEmpleado[i].getCalle() +
                                               "\nColonia: " + arrEmpleado[i].getCol() +
                                               "\nSueldo: " + arrEmpleado[i].getSueldo());
                           }
                         }
                        break;
                        case 2:
                            System.out.println("Que cliente desea buscar?\nIngrese el numero telefonico del cliente:");
                            numtel = leer.nextInt();
                            for (int i = 0; i < auxCliente; i++){
                            if (numtel == arrCliente[i].getNumtel()){
                            System.out.println("Nombre: " + arrCliente[i].getNombre() +
                                               "\nApellido paterno: " + arrCliente[i].getApeP() +
                                               "\nApellido materno: " + arrCliente[i].getApeM() +
                                               "\nEdad: " + arrCliente[i].getEdad() +
                                               "\nCalle: " + arrCliente[i].getCalle() +
                                               "\nColonia: " + arrCliente[i].getCol() +
                                               "\nTelefono de contacto: " + arrCliente[i].getNumtel() +
                                               "\nModelo de telefono: " + arrCliente[i].getModtel());
                           }
                         }
                        break;
                        case 3:
                         System.out.println("Que telefono desea buscar?\nIngrese el modelo del producto:");
                         modtel = leer.next();
                         for (int i = 0; i < auxTelefono; i++){
                           if (modtel == arrTelefono[i].getModelo()){
                            System.out.println("\nMarca: " + arrTelefono[i].getMarca() +
                                               "\nColor  del producto: " + arrTelefono[i].getColor() +
                                               "\nEspacio de almacenamiento: " + arrTelefono[i].getEspacio() +
                                               "\nCosto: " + arrTelefono[i].getPrecio());
                          }
                        }
                      break;
                        }
                break;
                case 6://Recargas
                            System.out.println("Ingrese su numero de telefono");
                            numtel = leer.nextLong();
                            System.out.println("Confirme su numero porfavor");
                            numtel = leer.nextLong();
                            System.out.println("Cuanto quieres recargar?");
                            recarga = leer.nextInt();
                            for(int i=0 ; i <auxTelefono; i++){
                            if (numtel == arrCliente[i].getNumtel()){
                            System.out.println("Compra realizada con exito");
                            arrCliente[i].setSaldo(arrCliente[i].getSaldo()+recarga);
                            System.out.println("Recarga realizada correctamente! revise su bandjea de mensajes");
                            }else {
                                System.out.println("Los numeros no coinciden");
                            }
                            }
                    break;
                    case 7:
                            System.out.println("Hasta pronto");   
                    break;
                }
        }while(op != 7);
    }
}