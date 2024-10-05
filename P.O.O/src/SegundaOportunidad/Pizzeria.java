package SegundaOportunidad;
////// M  A  I  N  /////////////////////////////////////////77
import java.util.Scanner;

public class Pizzeria {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
        Cliente arrCliente[]= new Cliente[10];
        Empleado arrEmpleado[]= new Empleado[10];
        Pizza arrPizza[]= new Pizza[10];
        
        int auxEmpleado=0, auxCliente=0, auxPizza=0;
        
        String nombre, apeP, apeM;
        long numTel;
        double sueldoxHora;
        int id, horasT;
        String calle, numCasa, col;
        int claveclie;
        String nomPizza, tamaño;
        int codigo, cantIngre;
        double precio;
        
        int op, op1, op2, opDo;
        do{
        System.out.println("-Bienvenidos la tiendita SuTortuga-");
        System.out.println("Que accion desea realizar: "
                         + "\n1.-Registrar informacion"
                         + "\n2.-Mostrar informacion"
                         + "\n3.-Comprar articulos");
               op=leer.nextInt();
        switch(op){
            case 1:
                System.out.println("Que accion desea realizar:\n1.-Registrar empleado"
                                  +"\n2.-Registar cliente\n3.-Registrar pizza\n4.-Salir");
                op1 = leer.nextInt();
                switch (op1){
                    case 1: 
                        Empleado objEmpleado;
                        System.out.println("Nombre: ");
                        nombre = leer.next();
                        System.out.println("Apellido paterno: ");
                        apeP = leer.next();
                        System.out.println("Apellido materno: ");
                        apeM = leer.next();
                        System.out.println("Calle: ");
                        calle = leer.next();
                        calle = leer.next();
                        calle = leer.next();
                        System.out.println("Numero id de empleado: ");
                        id = leer.nextInt();
                        System.out.println("Ingresa el numero de horas Trabajadas");
                        horasT = leer.nextInt();
                        System.out.println("Ingresa el sueldo");
                        sueldoxHora= leer.nextDouble();
                        System.out.println("Ingresa su numero de telefono");
                        numTel= leer.nextLong();
                        objEmpleado= new Empleado(sueldoxHora, id, horasT, nombre, apeP, apeM, numTel);
                        if(auxEmpleado<10) {
                        arrEmpleado[auxEmpleado]=objEmpleado;
                        auxEmpleado++;
                        System.out.println("Usted a la semana va a ganar esto aprox: "+ objEmpleado.cSalario());
                        }else{
                        System.out.println("Empleado no registrado\nNumero de emplaeados exedido");
                        }
                    break;
                    case 2:
                        Cliente objCliente;
                        System.out.println("Nombre: ");
                        nombre = leer.next();
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
                        System.out.println("Numero de casa: ");
                        numCasa = leer.next();
                        System.out.println("Numero clave de cliente");
                        claveclie = leer.nextInt();
                        System.out.println("Ingresa su numero telefonico");
                        numTel= leer.nextLong();
                        objCliente= new Cliente(calle, numCasa, col, claveclie, nombre, apeP, apeM, numTel);
                        if(auxCliente<10) {
                        arrCliente[auxCliente]=objCliente;
                        auxCliente++;
                        }else{
                        System.out.println("Cliente no registrado\nNumero de clientes exedido");
                        }
                    break;
                    case 3:
                        Pizza objPizza;
                        System.out.println("Ingresa el nombre del producto:");
                        nomPizza = leer.next();
                        System.out.println("Ingresa el numero clave de producto(1,2...)");
                        codigo = leer.nextInt();
                        System.out.println("Que tamaño es:");
                        tamaño = leer.next();
                        System.out.println("Cuantos ingredientes llevara");
                        cantIngre=leer.nextInt();
                        System.out.println("Cuanto costara");
                        precio = leer.nextDouble();
                        objPizza = new Pizza(nomPizza, tamaño, codigo, cantIngre, precio);
                        if(auxPizza<10) {
                        arrPizza[auxPizza]= objPizza;
                        auxPizza++;
                        }else{
                        System.out.println("Almacen lleno\nPorfavor intente en otro momento");
                        }
                    break;
                }
            break;
        ////// B  U  S  C  A  R
            case 2:
                System.out.println("Que accion desea realizar:\n1.-Mostrar informacion del empleado"
                                  +"\n2.-Mostrar informacion del cliente\n3.-Mostrar la informacion de un producto\n4.-Salir");
                op2 = leer.nextInt();
                switch (op2){
                    case 1:
                        for (int i = 0; i < auxEmpleado; i++) {
                            System.out.println("La informacion del empleado es:"+
                            "\nNombre:\n"+arrEmpleado[i].getNombre()+" "+arrEmpleado[i].getApeP()+" "+arrEmpleado[i].getApeM()+
                            "\nNumero clave del empleado:\n"+arrEmpleado[i].getId()+
                            "\nTelefono:\n"+arrEmpleado[i].getNumTel());
                            
                        }   
                    break;
                    case 2:
                        for (int i = 0; i < auxCliente; i++) {
                            System.out.println("La informacion del cliente es: "+
                            "\nNombre:\n"+arrCliente[i].getNombre()+" "+arrCliente[i].getApeP()+" "+arrCliente[i].getApeM()+
                            "\nDirreccion:\n"+arrCliente[i].getCalle()+", "+arrCliente[i].getCol()+
                            "\nNumero clave del cliente:\n"+arrCliente[i].getClaveclie()+
                            "\nTelefono\n"+arrCliente[i].getNumTel());
                        }
                    break;
                    case 3:
                        for (int i = 0; i < auxPizza; i++) {
                             System.out.println("La informacion del producto es: "+
                             "Nombre del producto:\n"+arrPizza[i].getNomPizza()+
                             "\nNumero de pingredientes:\n"+arrPizza[i].getCantIngre()+
                             "\nCosto:\n"+arrPizza[i].getPrecio()+
                             "\nTamaño del producto:\n"+arrPizza[i].getTamaño());
                              auxPizza++;
                        }
                    break;
                }
            break;
        //////// C  O  M  P  R  A  R 
            case 3:
                System.out.println("Ingrese el numero de ingredientes");
                cantIngre = leer.nextInt();
                System.out.println("Ingrese tamaño: ");
                tamaño = leer.next();
                boolean encontrado = false;
                for(int i=0 ; i <auxPizza; i++){
                    if(cantIngre == arrPizza[i].getCantIngre() &&  tamaño.equals(arrPizza[i].getTamaño())){
                        System.out.println("Compra realizada exitosamente");
                        encontrado = true;
                    }
                }
                if (encontrado){
                    //nothing
                }else{
                    System.out.println("Pizza no encontrado");
                }
            break;          
        }           
            System.out.println("Desea realizar otra operacion\n1.-Si\n2.-No");
        opDo = leer.nextInt();
        }while( opDo == 1 );
    }   
}
   