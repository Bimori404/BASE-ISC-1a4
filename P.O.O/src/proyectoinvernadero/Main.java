package proyectoinvernadero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ExcepcionNumIncorrecto, ExcepcionNoMasPlantas,ExcepcionHerramienta,ExcepcionEmpleados,ExcepcionProductos, ArrayIndexOutOfBoundsException,ExcepcionProductos{
        Scanner leer = new Scanner(System.in);
        //Atributos informacion general
        String nombre = "", apellidoP = "", marca = "", cantidad = "";
        int telefono = 0, id = 0;

        //Atributos Plantas
        String familia = "", fechaS = "", tipo = "";

        //Atributos Cliente
        String direccion;

        //Atributos Empleado
        double sueldo; int horasT; String ocupacion;

        //Atributos Productos
        String contenido;

        //Atributos Herramienta
        String uso;

        //Objetos y arreglos
        Plantas arrPlantas[] = new Plantas[10];
        Plantas objPlantas;
        
        Clientes arrClientes[] = new Clientes[10];
        Clientes objClientes;
        
        Empleado arrEmpleado[] = new Empleado[20];
        Empleado objEmpleado;
        
        Herramientas arrHerramientas[] = new Herramientas[11];
        Herramientas objHerramientas;
        
        Productos arrProductos[] = new Productos[11];
        Productos objProductos;
        Productos objProducto;
        
        //Auxiliares
        int AuxPlantas = 0;
        int AuxClientes = 0;
        int AuxEmpleado = 0;
        int AuxHerramientas = 0;
        int AuxProducto = 0;
        int opc=0;
        do{
        switch (opc=MenuRegistro()) {
            
            case 1:
                switch (MenuRegistroA()) {
                    case 1:
                        System.out.println("Registro de planta");
                        try {
                            System.out.println("Ingresa el nombre de la planta");
                            nombre = leer.next();
                            ComprobarPlanta(nombre);
                        } catch (ExcepcionPlanta e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("Este es tu id");
                        System.out.println(id++);
                        System.out.println("Ingresa la familia ala que pertenece");
                        familia = leer.next();
                        try {
                            System.out.println("Ingresa el mes");
                            fechaS = leer.next();
                            ComprobarMes(fechaS);
                        } catch (ExcepcionNoMasPlantas e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("Ingresa el tipo");
                        tipo = leer.next();
                        try{
                        System.out.println("Ingresa la cantidad");
                        cantidad = leer.next();
                          ComprobarHerramienta(cantidad);
                        }catch(ExcepcionHerramienta e){
                            System.out.println(e.getMessage());
                         }
                            
                        
                        objPlantas = new Plantas(id, nombre, apellidoP, telefono, marca, cantidad, familia, fechaS, tipo);
                        arrPlantas[AuxPlantas++] = objPlantas;
                        break;
                    case 2:
                        System.out.println("Registro de cliente");
                        System.out.println("Ingresa tu nombre");
                        nombre = leer.next();
                        System.out.println("Ingresa tu apellido paterno");
                        apellidoP = leer.next();
                        System.out.println("Ingresa tu numero de telefono");
                        telefono = leer.nextInt();
                        System.out.println("Ingresa tu direccion");
                        direccion = leer.next();
                        System.out.println("Este es tu id");
                        System.out.println(id++);
                        objClientes = new Clientes(id, nombre, apellidoP, telefono, marca, cantidad, direccion);
                        arrClientes[AuxClientes++] = objClientes;
                        break;
                    case 3:
                        System.out.println("Registro de empleado");
                        System.out.println("Ingresa tu nombre");
                        nombre = leer.next();
                        System.out.println("Ingresa tu apellido paterno");
                        apellidoP = leer.next();
                        System.out.println("Ingresa tu sueldo");
                        sueldo = leer.nextDouble();
                        System.out.println("Ingresa tus horas trabajadas");
                        horasT = leer.nextInt();
                        System.out.println("Ingresa tu telefono");
                        telefono = leer.nextInt();
                        System.out.println("Ingresa tu ocupacion");
                        ocupacion = leer.next();
                        System.out.println("Este es tu id");
                        System.out.println(id++);
                        objEmpleado = new Empleado(id, nombre, apellidoP, telefono, marca, cantidad, sueldo, horasT, ocupacion);
                        arrEmpleado[AuxEmpleado++] = objEmpleado;
                        break;
                    case 4:
                        System.out.println("Registro de herramienta");
                        System.out.println("Ingresa tu nombre");
                        nombre = leer.next();
                        System.out.println("Ingresa la marca");
                        marca = leer.next();
                        System.out.println("Ingresa el uso");
                        uso = leer.next();
                        try {
                            System.out.println("Ingresa la cantidad");
                            cantidad = leer.next();
                            ComprobarHerramienta(cantidad);
                        } catch (ExcepcionHerramienta e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("Este es tu id");
                        System.out.println(id++);
                        objHerramientas = new Herramientas(id, nombre, apellidoP, telefono, marca, cantidad, uso);
                        arrHerramientas[AuxHerramientas++] = objHerramientas;
                        break;
                    case 5:
                        System.out.println("Registro de productos");
                        System.out.println("Ingresa tu nombre");
                        nombre = leer.next();
                        System.out.println("Ingresa la marca");
                        marca = leer.next();
                        System.out.println("Ingresa el contenido");
                        contenido = leer.next();
                        try {
                            System.out.println("Ingresa la cantidad");
                            cantidad = leer.next();
                            ComprobarProductos(cantidad);
                        } catch (ExcepcionProductos e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("Este es tu id");
                        System.out.println(id++);
                        objProducto = new Productos(id, nombre, apellidoP, telefono, marca, cantidad, contenido);
                        arrProductos[AuxProducto++] = objProducto;
                        break;
                }
                break;
            case 2:
                switch (MenuRegistroB()) {
                    case 1:
                        System.out.println("Informacion de planta");
                        System.out.println("----------------------");
                        for (int i = 0; i < AuxPlantas; i++) {
                            System.out.println(arrPlantas[i].getNombre());
                            System.out.println(arrPlantas[i].getId());
                            System.out.println(arrPlantas[i].getFamilia());
                            System.out.println(arrPlantas[i].getFechaS());
                            System.out.println(arrPlantas[i].getTipo());
                            System.out.println(arrPlantas[i].getCantidad());
                        }
                        break;
                    case 2:
                        System.out.println("Informacion de cliente");
                        System.out.println("----------------------");
                        for (int i = 0; i < AuxClientes; i++) {
                            System.out.println(arrClientes[i].getNombre());
                            System.out.println(arrClientes[i].getApellidoP());
                            System.out.println(arrClientes[i].getTelefono());
                            System.out.println(arrClientes[i].getDireccion());
                        }
                        break;
                    case 3:
                        System.out.println("Informacion de empleado");
                        System.out.println("----------------------");
                        for (int i = 0; i < AuxEmpleado; i++) {
                            System.out.println(arrEmpleado[i].getNombre());
                            System.out.println(arrEmpleado[i].getId());
                            System.out.println(arrEmpleado[i].getApellidoP());
                            System.out.println(arrEmpleado[i].getSueldo());
                            System.out.println(arrEmpleado[i].getHorasT());
                            System.out.println(arrEmpleado[i].getTelefono());
                            System.out.println(arrEmpleado[i].getOcupacion());
                        }
                        break;
                    case 4:
                        System.out.println("Informacion de herramienta");
                        System.out.println("----------------------");
                        for (int i = 0; i < AuxHerramientas; i++) {
                            System.out.println(arrHerramientas[i].getNombre());
                            System.out.println(arrHerramientas[i].getId());
                            System.out.println(arrHerramientas[i].getMarca());
                            System.out.println(arrHerramientas[i].getUso());
                            System.out.println(arrHerramientas[i].getCantidad());
                        }
                        break;
                    case 5:
                        System.out.println("Informacion de producto");
                        System.out.println("----------------------");
                        for (int i = 0; i < AuxProducto; i++) {
                            System.out.println(arrProductos[i].getNombre());
                            System.out.println(arrProductos[i].getId());
                            System.out.println(arrProductos[i].getMarca());
                            System.out.println(arrProductos[i].getContenido());
                            System.out.println(arrProductos[i].getCantidad());
                        }
                        break;
                }
                break;
            case 3:
                switch (MenuRegistroC()) {
                    case 1:
                        System.out.println("Ingresa su nombre");
                        nombre = leer.next();
                        System.out.println("Informacion de planta");
                        System.out.println("----------------------");
                        boolean buscado = false;
                        for (int i = 0; i < AuxPlantas; i++) {
                            if (nombre.equalsIgnoreCase(arrPlantas[i].getNombre())) {
                                buscado = true;
                                System.out.println(arrPlantas[i].getNombre());
                                System.out.println(arrPlantas[i].getId());
                                System.out.println(arrPlantas[i].getFamilia());
                                System.out.println(arrPlantas[i].getFechaS());
                                System.out.println(arrPlantas[i].getTipo());
                                System.out.println(arrPlantas[i].getCantidad());
                                break;
                            }
                        }
                        if (buscado == false) {
                            System.out.println("No se encuentra registrada");
                        }
                        break;
                    case 2:
                        System.out.println("Ingresa su nombre");
                        nombre = leer.next();
                        System.out.println("Informacion de Cliente");
                        System.out.println("----------------------");
                        boolean buscado1 = false;
                        for (int i = 0; i < AuxClientes; i++) {
                            if (nombre.equalsIgnoreCase(arrClientes[i].getNombre())) {
                                buscado1 = true;
                                System.out.println(arrClientes[i].getNombre());
                                System.out.println(arrClientes[i].getApellidoP());
                                System.out.println(arrClientes[i].getTelefono());
                                System.out.println(arrClientes[i].getDireccion());
                                break;
                            }
                        }
                        if (buscado1 == false) {
                            System.out.println("No se encuentra registrado");
                        }
                        break;
                    case 3:
                        System.out.println("Ingresa su nombre");
                        nombre = leer.next();
                        System.out.println("Informacion de empleado");
                        System.out.println("----------------------");
                        boolean buscado2 = false;
                        for (int i = 0; i < AuxEmpleado; i++) {
                            if (nombre.equalsIgnoreCase(arrEmpleado[i].getNombre())) {
                                buscado2 = true;
                                System.out.println(arrEmpleado[i].getNombre());
                                System.out.println(arrEmpleado[i].getId());
                                System.out.println(arrEmpleado[i].getApellidoP());
                                System.out.println(arrEmpleado[i].getSueldo());
                                System.out.println(arrEmpleado[i].getHorasT());
                                System.out.println(arrEmpleado[i].getTelefono());
                                System.out.println(arrEmpleado[i].getOcupacion());
                                break;
                            }
                        }
                        if (buscado2 == false) {
                            System.out.println("No se encuentra registrado");
                        }
                        break;
                    case 4:
                        System.out.println("Ingresa su nombre");
                        nombre = leer.next();
                        System.out.println("Informacion de la herramienta");
                        System.out.println("----------------------");
                        boolean buscado3 = false;
                        for (int i = 0; i < AuxHerramientas; i++) {
                            if (nombre.equalsIgnoreCase(arrHerramientas[i].getNombre())) {
                                buscado3 = true;
                                System.out.println(arrHerramientas[i].getNombre());
                                System.out.println(arrHerramientas[i].getId());
                                System.out.println(arrHerramientas[i].getMarca());
                                System.out.println(arrHerramientas[i].getUso());
                                System.out.println(arrHerramientas[i].getCantidad());
                                break;
                            }
                        }
                        if (buscado3 == false) {
                            System.out.println("No se encuentra registrado");
                        }

                        break;
                    case 5:
                        System.out.println("Ingresa su nombre");
                        nombre = leer.next();
                        System.out.println("Informacion de producto");
                        System.out.println("----------------------");
                        boolean buscado4 = false;
                        for (int i = 0; i < AuxProducto; i++) {
                            if (nombre.equalsIgnoreCase(arrProductos[i].getNombre())) {
                                buscado4 = true;
                                System.out.println(arrProductos[i].getNombre());
                                System.out.println(arrProductos[i].getId());
                                System.out.println(arrProductos[i].getMarca());
                                System.out.println(arrProductos[i].getContenido());
                                System.out.println(arrProductos[i].getCantidad());
                                break;
                            }
                        }
                        if (buscado4 == false) {
                            System.out.println("No se encuentra registrado");
                        }
                        break;

                }

                break;
            case 4:
                switch(MenuRegistroD()){
                    case 1:
                        System.out.println("Ingresa el nuevo nombre de la planta");
                        nombre=leer.next();
                        for(int i=0;i<AuxPlantas;i++){
                          arrPlantas[i].setNombre(nombre);
                          }
                        System.out.println("Tu nombre ha sido actualizado");
                        break;
                    case 2:
                        System.out.println("Ingresa el nuevo nombre del cliente");
                        nombre=leer.next();
                        for(int i=0;i<AuxClientes;i++){
                          arrClientes[i].setNombre(nombre);
                          }
                        System.out.println("Tu nombre ha sido actualizado");
                        break;
                    case 3:
                        System.out.println("Ingresa el nuevo nombre del empleado");
                        nombre=leer.next();
                        for(int i=0;i<AuxEmpleado;i++){
                          arrEmpleado[i].setNombre(nombre);
                          }
                        System.out.println("Tu nombre ha sido actualizado");
                        break;
                    case 4:
                        System.out.println("Ingresa el nuevo nombre de la herramienta");
                        nombre=leer.next();
                        for(int i=0;i<AuxHerramientas;i++){
                          arrHerramientas[i].setNombre(nombre);
                          }
                        System.out.println("Tu nombre ha sido actualizado");
                        break;
                    case 5:
                        System.out.println("Ingresa el nuevo nombre del producto");
                        nombre=leer.next();
                        for(int i=0;i<AuxProducto;i++){
                          arrProductos[i].setNombre(nombre);
                          }
                        System.out.println("Tu nombre ha sido actualizado");
                        break;
                 }
                break;
            case 5:
                switch(MenuRegistroE()){
                    case 1:
                        System.out.println("Bienvenido ingresa numero de plantas que quieres comprar");
                        System.out.println("Plantas disponibles");
                        for (int i = 0; i < AuxPlantas; i++) {
                            System.out.println(arrPlantas[i].getNombre());
                            System.out.println(arrPlantas[i].getId());
                            System.out.println(arrPlantas[i].getFamilia());
                            System.out.println(arrPlantas[i].getFechaS());
                            System.out.println(arrPlantas[i].getTipo());
                            System.out.println(arrPlantas[i].getCantidad());
                        }
                        System.out.println("Que flor deseas comprar?");
                        nombre=leer.next();
                        boolean florB=false;
                        for(int i=0;i<AuxPlantas;i++){
                           if(nombre.equalsIgnoreCase(arrPlantas[i].getNombre())){
                                florB=true;
                               System.out.println("Estas son las disponibles");
                               arrPlantas[i].getCantidad();
                            break; 
                           }
                         }
                        if(florB==false){
                            System.out.println("Esta flor no esta registrada");
                          }
                        try{
                        System.out.println("Cuantas quieres comprar?");
                        cantidad=leer.next();
                         ComprobarHerramienta(cantidad);
                        }catch(ExcepcionHerramienta e){
                            System.out.println(e.getMessage());
                        }
                        for(int i=0;i<AuxPlantas;i++){
                            int cant= Integer.parseInt(cantidad);
                            int cant2= Integer.parseInt(arrPlantas[i].getCantidad());
                          int total=cant2-cant;
                          arrPlantas[i].setCantidad(total+"");
                        }
                        System.out.println("Compra exitosa");
                        break;
                    case 2:
                        System.out.println("Bienvenido ingresa numero de productos que quieres comprar");
                        System.out.println("Productos disponibles");
                        for (int i = 0; i < AuxProducto; i++) {
                            System.out.println(arrProductos[i].getNombre());
                            System.out.println(arrProductos[i].getId());
                            System.out.println(arrProductos[i].getMarca());
                            System.out.println(arrProductos[i].getContenido());
                            System.out.println(arrProductos[i].getCantidad());
                        }
                        System.out.println("Que producto deseas comprar?");
                        nombre=leer.next();
                        boolean florB1=false;
                        for(int i=0;i<AuxProducto;i++){
                           if(nombre.equalsIgnoreCase(arrProductos[i].getNombre())){
                                florB1=true;
                               System.out.println("Estos son los disponibles");
                               arrProductos[i].getCantidad();
                            break; 
                           }
                         }
                        if(florB1==false){
                            System.out.println("Este producto no esta registrada");
                          }
                        try{
                        System.out.println("Cuantos quieres comprar?");
                        cantidad=leer.next();
                         ComprobarProductos(cantidad);
                        }catch(ExcepcionProductos e){
                            System.out.println(e.getMessage());
                        }
                        for(int i=0;i<AuxProducto;i++){
                            int cant= Integer.parseInt(cantidad);
                            int cant2= Integer.parseInt(arrPlantas[i].getCantidad());
                          int total=cant2-cant;
                          arrProductos[i].setCantidad(total+"");
                        }
                        
                        
                        System.out.println("Compra exitosa");
                        break;
                    case 3:
                        System.out.println("Bienvenido ingresa numero de herramientas que quieres comprar");
                        System.out.println("Productos disponibles");
                        for (int i = 0; i < AuxHerramientas; i++) {
                            System.out.println(arrHerramientas[i].getNombre());
                            System.out.println(arrHerramientas[i].getId());
                            System.out.println(arrHerramientas[i].getMarca());
                            System.out.println(arrHerramientas[i].getUso());
                            System.out.println(arrHerramientas[i].getCantidad());
                        }
                        System.out.println("Que herramienta deseas comprar?");
                        nombre=leer.next();
                        boolean florB2=false;
                        for(int i=0;i<AuxHerramientas;i++){
                           if(nombre.equalsIgnoreCase(arrHerramientas[i].getNombre())){
                                florB1=true;
                               System.out.println("Estas son las disponibles");
                               arrHerramientas[i].getCantidad();
                            break; 
                           }
                         }
                        if(florB2==false){
                            System.out.println("Esta herramienta no esta registrada");
                          }
                        try{
                        System.out.println("Cuantas quieres comprar?");
                        cantidad=leer.next();
                         ComprobarHerramienta(cantidad);
                        }catch(ExcepcionHerramienta e){
                            System.out.println(e.getMessage());
                        }
                        for(int i=0;i<AuxHerramientas;i++){
                            int cant= Integer.parseInt(cantidad);
                            int cant2= Integer.parseInt(arrPlantas[i].getCantidad());
                          int total=cant2-cant;
                          arrHerramientas[i].setCantidad(total+"");
                        }
                        
                        System.out.println("Compra exitosa");
                        break;
                
                 }
                
                break;
          }
        }while(opc!=6);
    }
    
    public static int MenuRegistro() throws ExcepcionNumIncorrecto {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que deseas hacer?");
        System.out.println("1.-Registrar\n2.-Mostrar\n3.-Buscar\n4.-Actualizar\n5.-Comprar\n6.-Salir");
        int op = leer.nextInt();
        if (op < 1 || op > 6) {
            throw new ExcepcionNumIncorrecto("Esas opciones no existen");
        }
        return op;
    }
    public static int MenuRegistroA() throws ExcepcionNumIncorrecto {
        Scanner leer = new Scanner(System.in);
        System.out.println("Aquien deseas registrar?");
        System.out.println("1.-Planta\n2.-Cliente\n3.-Empleado\n4.-Herramienta\n5.-Productos");
        int op = leer.nextInt();
        if (op < 1 || op > 5) {
            throw new ExcepcionNumIncorrecto("Esas opciones no existen");
        }
        return op;
    }
    public static int MenuRegistroB() throws ExcepcionNumIncorrecto {
        Scanner leer = new Scanner(System.in);
        System.out.println("De quien deseas mostrar la informacion");
        System.out.println("1.-Planta\n2.-Cliente\n3.-Empleado\n4.-productos\n5.-Herramienta");
        int op = leer.nextInt();
        if (op < 1 || op > 5) {
            throw new ExcepcionNumIncorrecto("Esas opciones no existen");
        }
        return op;
    }
    public static int MenuRegistroC() throws ExcepcionNumIncorrecto {
        Scanner leer = new Scanner(System.in);
        System.out.println("De quien deseas Buscar la informacion?");
        System.out.println("1.-Planta\n2.-Cliente\n3.-Empleado\n4.-productos\n5.-Herramienta");
        int op = leer.nextInt();
        if (op < 1 || op > 5) {
            throw new ExcepcionNumIncorrecto("Esas opciones no existen");
        }
        return op;
    }
     public static int MenuRegistroD() throws ExcepcionNumIncorrecto {
        Scanner leer = new Scanner(System.in);
        System.out.println("De quien deseas actualizar la informacion?");
        System.out.println("1.-Planta\n2.-Cliente\n3.-Empleado\n4.-productos\n5.-Herramienta");
        int op = leer.nextInt();
        if (op < 1 || op > 5) {
            throw new ExcepcionNumIncorrecto("Esas opciones no existen");
        }
        return op;
    }
    public static int MenuRegistroE() throws ExcepcionNumIncorrecto {
        Scanner leer = new Scanner(System.in);
        System.out.println("De quien deseas Comprar?");
        System.out.println("1.-Planta\n2.-productos\n3.-Herramientas");
        int op = leer.nextInt();
        if (op < 1 || op > 5) {
            throw new ExcepcionNumIncorrecto("Esas opciones no existen");
        }
        return op;
    }
    public static void ComprobarPlanta(String nombre) throws ExcepcionPlanta {
        String[] posiciones = {"girsol", "rosa", "hortensia", "tulipan", "dalia", "lirio", "clavel", "orquidia", "margarita", "latana"};
        boolean encontrado = false;
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i].equalsIgnoreCase(nombre)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            throw new ExcepcionPlanta("ESTA PLANTA NOSE ENCUENTRA");
        }
    }
    public static void ComprobarMes(String fechaS) throws ExcepcionNoMasPlantas {
        String[] posiciones = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        boolean encontrado = false;
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i].equalsIgnoreCase(fechaS)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            throw new ExcepcionNoMasPlantas("ESTE MES NO SE ENCUENTRA");
        }
    }
    public static void ComprobarHerramienta(String cantidad) throws ExcepcionHerramienta, ArrayIndexOutOfBoundsException {
           int cant = Integer.parseInt(cantidad);
        if (cant < 1) {
            throw new ExcepcionHerramienta("esta muy baja la cantidad");
        }
        if (cant> 10) {
            throw new ExcepcionHerramienta("Estas excediendo el limite");
        }  
    }
    public static void ComprobarEmpleado(int AuxEmpleado) throws ExcepcionEmpleados {
        for (int i = 0; i < AuxEmpleado; i++) {
            if (AuxEmpleado > 21) {
                throw new ExcepcionEmpleados("Estas excediendo el limite");
            }
        }
    }
    public static void ComprobarProductos(String cantidad) throws ExcepcionProductos {
        int cant1= Integer.parseInt(cantidad);
        if (cant1> 1) {
            throw new ExcepcionProductos("esta muy baja la cantidad");
        }
        if (cant1< 30) {
            throw new ExcepcionProductos("Estas excediendo el limite");
        }
    }

}
