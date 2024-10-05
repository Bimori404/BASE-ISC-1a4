package farmacia;

import java.util.Scanner;

public class Main {

    static int opcionMenuPrincipal = 0;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Varibles De Clase Medicamento
        String nombreXAXXMedicamento = "";
        int contenido = 0;
        double precio = 0;
        long codigo = 0;
        String formula = "";
        String laboratorio = "";
        int grupo = 0;
        int cantidad = 0;
        //Variables De Clase Antibiotico (extends Medicamento)
        int duracionTratamiento = 0;
        String medicoEmisor = "";
        int numeroControl = 0;
        int cantidadEnLibro = 0;
        //Variables De Clase Controlado (extends  Medicamento)
        String tipoReceta = "";
        int vigenciaReceta = 0;
        int limiteSurtido = 0;
        int numeroSellos = 0;
        //Variables De Clase OTC (extends  Medicamento)
        boolean Existencia = false;
        //Variables De Clase Estupefeciente (extends  Controlado)
        String codigoBarras = "";
        int vigencia = 0;
        int conteoMedicamento = 0;
        //Variables De Clase Psicotropicos (extends  Controlado)
        //Variables De Clase InfoGral
        String nombreXAXXInfoGral = "";
        int edad = 0;
        String apellidoM = "";
        String apellidoP = "";
        String numTelefono = "";
        String calle = "";
        String col = "";
        String ciudad = "";
        //Variables De Clase Empleado (extends InfoGral)
        int numEmpleado = 0;
        double sueldo = 0;
        int horasT = 0;
        //Varibales De Clase Cliente (extends InfoGral) 
        int puntos = 0;
        long numCliente = 0;
        int numComprar = 0;
        //Variables De Clase Main (Informacion)

        Integer auxiliarMedicamento = new Integer(0);
        Medicamento informacionMedicamento[] = new Medicamento[auxiliarMedicamento + 1];

        Integer auxiliarEmpleado = new Integer(0);
        Empleado informacionEmpleado[] = new Empleado[auxiliarEmpleado + 1];

        Integer auxiliarCliente = new Integer(0);
        Cliente informacionCliente[] = new Cliente[auxiliarCliente + 1];

        Integer auxiliarOTC = new Integer(0);
        OTC informacionOTC[] = new OTC[auxiliarOTC + 1];

        //Variables De Clase Main (Desiciones)
        int opcionMenuPrincipalQueRegistrar = 0;
        int opcionMenuPrincipalRegistrarTipo = 0;
        int opcionMenuPrincipalRegistrarExistencia = 0;
        int opcionMenuPrincipalMostrarEnSuTotalidad = 0;
        int opcionMenuPrincipalQueBuscar = 0;
        String busquedaMedicamentoNombre = "";
        int busquedaEmpleadoNumero = 0;
        long busquedaClienteNumero = 0;
        int opcionMenuPrincipalQueModificar = 0;
        boolean esPsicotropico = false;
        boolean esEmpleado = false;
        boolean esCliente = false;
        boolean medicamentoEncontrado = false;
        boolean empleadoEncontrado = false;
        boolean clienteEncontrado = false;
        int posicionMedicamentoEncontrado = 0;
        int posicionEmpleadoEncontrado = 0;
        int posicionClienteEncontrado = 0;
        boolean seMostroAlgunMedicamento = false;
        boolean seMostroAlgunEmpleado = false;
        boolean seMostroAlgunCliente = false;
        do {
            System.out.println("SISTEMA FARMACIA DEL SAGRADO CORAZON DE DIOS SENOR GUADALUPE");
            System.out.println("SELECCIONE UNA OPCION");
            System.out.println("1.- REGISTRAR\n2.- MOSTRAR\n3.- BUSCAR\n4.- MODIFICAR\n5.- SALIR");
            opcionMenuPrincipal = leer.nextInt();
            switch (opcionMenuPrincipal) {
                case 1:
                    System.out.println("¿QUE DESEA REGISTRAR?");
                    System.out.println("1.- MEDICAMENTO\n2.- EMPLEADO\n3.- CLIENTE");
                    opcionMenuPrincipalQueRegistrar = leer.nextInt();
                    switch (opcionMenuPrincipalQueRegistrar) {
                        case 1:
                            //MEDICAMENTO
                            System.out.println("¿QUE TIPO DE MEDICAMENTO DESEA REGISTRAR?");
                            System.out.println("1.- ANTIBIOTICO\n2.- ESTUPEFACIENTE\n3.- PSICOPICO");
                            opcionMenuPrincipalRegistrarTipo = leer.nextInt();
                            if (opcionMenuPrincipalRegistrarTipo == 3) {
                                esPsicotropico = true;
                            }
                            System.out.println("*****INGRESE LO SOLICITADO*****");
                            System.out.println("NOMBRE:");
                            nombreXAXXMedicamento = leer.nextLine();
                            System.out.println("CONTENIDO:");
                            contenido = leer.nextInt();
                            System.out.println("PRECIO:");
                            precio = leer.nextDouble();
                            System.out.println("CODIGO:");
                            codigo = leer.nextLong();
                            System.out.println("FORMULA:");
                            formula = leer.nextLine();
                            System.out.println("LABORATORIO:");
                            laboratorio = leer.nextLine();
                            System.out.println("GRUPO:");
                            grupo = leer.nextInt();
                            System.out.println("CANTIDAD:");
                            cantidad = leer.nextInt();
                            switch (opcionMenuPrincipalRegistrarTipo) {
                                case 1:
                                    System.out.println("DURACION DE TRATAMIENTO (DIAS):");
                                    duracionTratamiento = leer.nextInt();
                                    System.out.println("MEDICO EMISOR:");
                                    medicoEmisor = leer.nextLine();
                                    System.out.println("NUMERO DE CONTROL:");
                                    numeroControl = leer.nextInt();
                                    System.out.println("CANTIDAD EN LIBRO:");
                                    cantidadEnLibro = leer.nextInt();
                                    System.out.println("¿HAY EXISTENCIA EN EL MOSTRADOR?\n1.- SI\n2.- NO");
                                    opcionMenuPrincipalRegistrarExistencia = leer.nextInt();
                                    switch (opcionMenuPrincipalRegistrarExistencia) {
                                        case 1:
                                            Existencia = true;
                                            break;
                                        case 2:
                                            Existencia = false;
                                            break;
                                        default:
                                            Advertencia();
                                            break;
                                    }
                                    Antibiotico objAntibiotico = new Antibiotico(nombreXAXXMedicamento, contenido, precio, codigo, formula, laboratorio,
                                            grupo, cantidad, duracionTratamiento, medicoEmisor, numeroControl, cantidadEnLibro);
                                    informacionMedicamento[auxiliarMedicamento++] = objAntibiotico;
                                    OTC objOTC = new OTC(nombreXAXXMedicamento, contenido, precio, codigo, formula, laboratorio,
                                            grupo, cantidad, Existencia);
                                    informacionOTC[auxiliarOTC++] = objOTC;
                                    break;
                                case 2:
                                case 3:
                                    System.out.println("TIPO DE RECETA:");
                                    tipoReceta = leer.nextLine();
                                    System.out.println("VIGENCIA DE RECETA:");
                                    vigenciaReceta = leer.nextInt();
                                    System.out.println("LIMITE DE SURTIDO:");
                                    limiteSurtido = leer.nextInt();
                                    System.out.println("NUMERO DE SELLOS:");
                                    numeroSellos = leer.nextInt();
                                    if (esPsicotropico) {
                                        Psicotropico objPsicotropico = new Psicotropico(nombreXAXXMedicamento, contenido, precio, codigo,
                                                formula, laboratorio, grupo, cantidad, tipoReceta, vigenciaReceta, limiteSurtido, numeroSellos);
                                        informacionMedicamento[auxiliarMedicamento++] = objPsicotropico;
                                        break;
                                    }
                                    System.out.println("CODIGO DE BARRAS:");
                                    codigoBarras = leer.nextLine();
                                    System.out.println("VIGENCIA:");
                                    vigencia = leer.nextInt();
                                    System.out.println("CONTEO MEDICAMENTO:");
                                    conteoMedicamento = leer.nextInt();
                                    Estupefaciente objEstupefaciente = new Estupefaciente(nombreXAXXMedicamento, contenido, precio, codigo, formula, laboratorio,
                                            grupo, cantidad, tipoReceta, vigenciaReceta, limiteSurtido, numeroSellos, codigoBarras,
                                            vigencia, conteoMedicamento);
                                    informacionMedicamento[auxiliarMedicamento++] = objEstupefaciente;
                                    break;
                                default:
                                    Advertencia();
                                    break;

                            }
                            break;
                        case 2:
                        case 3:
                            if (opcionMenuPrincipalQueRegistrar == 2) {
                                esEmpleado = true;
                                esCliente = false;
                            } else if (opcionMenuPrincipalQueRegistrar == 3) {
                                esEmpleado = false;
                                esCliente = true;
                            }
                            System.out.println("*****INGRESE LO SOLICITADO*****");
                            //INFOGRAL
                            System.out.println("NOMBRE:");
                            nombreXAXXInfoGral = leer.nextLine();
                            System.out.println("EDAD:");
                            edad = leer.nextInt();
                            System.out.println("APELLIDO PATERNO:");
                            apellidoP = leer.nextLine();
                            System.out.println("APELLIDO MATERNO:");
                            apellidoM = leer.nextLine();
                            System.out.println("NUMERO DE TELEFONO:");
                            numTelefono = leer.nextLine();
                            System.out.println("CALLE:");
                            calle = leer.nextLine();
                            System.out.println("COLONIA:");
                            col = leer.nextLine();
                            System.out.println("CIUDAD:");
                            ciudad = leer.nextLine();
                            //EMPLEADO
                            if (esEmpleado) {
                                System.out.println("NUMERO DE EMPLEADO:");
                                numEmpleado = leer.nextInt();
                                System.out.println("SUELDO:");
                                sueldo = leer.nextDouble();
                                System.out.println("HORAS A TRABAJAR");
                                horasT = leer.nextInt();
                                Empleado objEmpleado = new Empleado(nombreXAXXInfoGral, edad, apellidoM, apellidoP, numTelefono, calle,
                                        col, ciudad, sueldo, numEmpleado, sueldo, horasT);
                                informacionEmpleado[auxiliarEmpleado++] = objEmpleado;
                                //CLIENTE
                            } else if (esCliente) {
                                System.out.println("PUNTOS INICIALES");
                                puntos = leer.nextInt();
                                System.out.println("NUMERO DE CLIENTE");
                                numCliente = leer.nextInt();
                                System.out.println("NUMERO DE COMPRAS");
                                numComprar = leer.nextInt();
                                Cliente objCliente = new Cliente(nombreXAXXInfoGral, edad, apellidoM, apellidoP, numTelefono, calle, col,
                                        ciudad, puntos, numCliente, numComprar);
                                informacionCliente[auxiliarCliente++] = objCliente;
                            }
                            break;
                        default:
                            Advertencia();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("¿QUE DESEA MOSTRAR EN SU TOTALIDAD?");
                    System.out.println("1.- MEDICAMENTOS\n2.- EMPLEADOS\n3.- CLIENTES");
                    opcionMenuPrincipalMostrarEnSuTotalidad = leer.nextInt();
                    
                    switch (opcionMenuPrincipalMostrarEnSuTotalidad) {
                        case 1:
                            //MEDICAMENTOS
                            seMostroAlgunMedicamento=false;
                            for (int i = 0; i < auxiliarOTC; i++) {
                                System.out.printf("NOMBRE: %s\nCONTENIDO: %d\nPRECIO: %.2f\nCODIGO: %d\nFORMULA: %s\nLABORATORIO: %s\nGRUPO: %d\nCANTIDAD: %d\nEXISTENCIA: %s\n", informacionOTC[i].getNombre(), informacionOTC[i].getContenido(),
                                        informacionOTC[i].getPrecio(), informacionOTC[i].getCodigo(), informacionOTC[i].getFormula(),
                                        informacionOTC[i].getLaboratorio(), informacionOTC[i].getGrupo(), informacionOTC[i].getCantidad(),
                                        informacionOTC[i].isExistencia());
                                seMostroAlgunMedicamento=true;
                            }
                            if (!seMostroAlgunMedicamento) {
                                System.out.println("***EL REGISTRO ESTA VACIO***");
                                break;
                            }
                        case 2:
                            //EMPLEADOS
                            seMostroAlgunEmpleado=false;
                            for (int i = 0; i < auxiliarEmpleado; i++) {
                                System.out.printf("NOMBRE: %s %s %s\nEDAD: %d\nNUMERO DE TELEFONO: %s\nCALLE: %s\nCOLONIA: %s\nCIUDAD: %s\nNUMERO DE EMPLEADO: %d\n"
                                        + "SUELDO: %.2f\nHORAS TRABAJADAS: %d\n", informacionEmpleado[i].getNombre(),
                                        informacionEmpleado[i].getApellidoP(), informacionEmpleado[i].getApellidoM(), informacionEmpleado[i].getEdad(),
                                        informacionEmpleado[i].getNumTelefono(), informacionEmpleado[i].getCalle(),
                                        informacionEmpleado[i].getCol(), informacionEmpleado[i].getCiudad(), informacionEmpleado[i].getNumEmpleado(),
                                        informacionEmpleado[i].getSueldo(), informacionEmpleado[i].getHorasT());
                                seMostroAlgunEmpleado=true;
                            }
                            if (!seMostroAlgunEmpleado) {
                                System.out.println("***EL REGISTRO ESTA VACIO***");
                                break;
                            }
                            break;
                        case 3:
                            //CLIENTES
                            seMostroAlgunCliente=false;
                            for (int i = 0; i < auxiliarCliente; i++) {
                                System.out.printf("NOMBRE: %s %s %s\nEDAD: %d\nNUMERO DE TELEFONO: %s\nCALLE: %s\nCOLONIA: %s\nCIUDAD: %s\nPUNTOS: %d\n"
                                        + "NUMERO DE CLIENTE: %d\nNUMERO DE COMPRAS: %d\n", informacionCliente[i].getNombre(),
                                        informacionCliente[i].getApellidoP(), informacionCliente[i].getApellidoM(), informacionCliente[i].getEdad(),
                                        informacionCliente[i].getNumTelefono(), informacionCliente[i].getCalle(),
                                        informacionCliente[i].getCol(), informacionCliente[i].getCiudad(), informacionCliente[i].getPuntos(),
                                        informacionCliente[i].getNumCliente(), informacionCliente[i].getNumComprar());
                                seMostroAlgunCliente=true;
                            }
                            if (!seMostroAlgunCliente) {
                                System.out.println("***EL REGISTRO ESTA VACIO***");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("¿QUE DESEA BUSCAR?");
                    System.out.println("1.- MEDICAMENTOS\n2.- EMPLEADOS\n3.- CLIENTES");
                    opcionMenuPrincipalQueBuscar = leer.nextInt();
                    switch (opcionMenuPrincipalQueBuscar) {
                        case 1:
                            //MEDICAMENTOS
                            System.out.println("INGRESE EL NOMBRE DE EL MEDICAMENTO");
                            busquedaMedicamentoNombre = leer.nextLine();
                            medicamentoEncontrado = false;
                            for (int i = 0; i < auxiliarMedicamento; i++) {
                                if (busquedaMedicamentoNombre.equalsIgnoreCase(informacionMedicamento[i].getNombre())) {
                                    System.out.printf("NOMBRE: %s\nCONTENIDO: %d\nPRECIO: %.2f\nCODIGO: %d\nFORMULA: %s\nLABORATORIO: %s\nGRUPO: %d\nCANTIDAD: %d\nEXISTENCIA: %s\n", informacionOTC[i].getNombre(), informacionOTC[i].getContenido(),
                                            informacionOTC[i].getPrecio(), informacionOTC[i].getCodigo(), informacionOTC[i].getFormula(),
                                            informacionOTC[i].getLaboratorio(), informacionOTC[i].getGrupo(), informacionOTC[i].getCantidad(),
                                            informacionOTC[i].isExistencia());
                                    medicamentoEncontrado = true;
                                    break;
                                }
                            }
                            if (!medicamentoEncontrado) {
                                System.out.println("**NO ENCONTRADO**");
                            }
                            break;
                        case 2:
                            //EMPLEADOS
                            System.out.println("INGRESE EL NUMERO DE EMPLEADO");
                            busquedaEmpleadoNumero = leer.nextInt();
                            empleadoEncontrado = false;
                            for (int i = 0; i < auxiliarEmpleado; i++) {
                                if (busquedaEmpleadoNumero == informacionEmpleado[i].getNumEmpleado()) {
                                    System.out.println("*****ESTE ES EL VALOR DE i: "+i);
                                    System.out.printf("NOMBRE: %s %s %s\nEDAD: %d\nNUMERO DE TELEFONO: %s\nCALLE: %s\nCOLONIA: %s\nCIUDAD: %s\nNUMERO DE EMPLEADO: %d\n"
                                            + "SUELDO: %.2f\nHORAS TRABAJADAS: %d\n", informacionEmpleado[i].getNombre(),
                                            informacionEmpleado[i].getApellidoP(), informacionEmpleado[i].getApellidoM(), informacionEmpleado[i].getEdad(),
                                            informacionEmpleado[i].getNumTelefono(), informacionEmpleado[i].getCalle(),
                                            informacionEmpleado[i].getCol(), informacionEmpleado[i].getCiudad(), informacionEmpleado[i].getNumEmpleado(),
                                            informacionEmpleado[i].getSueldo(), informacionEmpleado[i].getHorasT());
                                    System.out.println("*****MOSTRANDO EL DATO CON POSICION MANUAL: "+informacionEmpleado[0].getCiudad());
                                    empleadoEncontrado = true;
                                    break;
                                }
                            }
                            if (!empleadoEncontrado) {
                                System.out.println("**NO ENCONTRADO**");
                            }
                            break;
                        case 3:
                            //CLIENTES
                            System.out.println("INGRESE EL NUMERO DE CLIENTE");
                            busquedaClienteNumero = leer.nextLong();
                            clienteEncontrado = false;
                            for (int i = 0; i < auxiliarCliente; i++) {
                                if (busquedaClienteNumero == informacionCliente[i].getNumCliente()) {
                                    System.out.printf("NOMBRE: %s %s %s\nEDAD: %d\nNUMERO DE TELEFONO: %s\nCALLE: %s\nCOLONIA: %s\nCIUDAD: %s\nPUNTOS: %d\n"
                                            + "NUMERO DE CLIENTE: %d\nNUMERO DE COMPRAS: %d\n", informacionCliente[i].getNombre(),
                                            informacionCliente[i].getApellidoP(), informacionCliente[i].getApellidoM(), informacionCliente[i].getEdad(),
                                            informacionCliente[i].getNumTelefono(), informacionCliente[i].getCalle(),
                                            informacionCliente[i].getCol(), informacionCliente[i].getCiudad(), informacionCliente[i].getPuntos(),
                                            informacionCliente[i].getNumCliente(), informacionCliente[i].getNumComprar());
                                    clienteEncontrado = true;
                                }
                            }
                            if (!clienteEncontrado) {
                                System.out.println("**NO ENCONTRADO**");
                            }
                            break;
                        default:
                            Advertencia();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("¿QUE DESEA MODIFICAR?");
                    System.out.println("1.- MEDICAMENTO\n2.- EMPLEADO\n3.- CLIENTE");
                    opcionMenuPrincipalQueModificar = leer.nextInt();
                    switch (opcionMenuPrincipalQueModificar) {
                        case 1:
                            //MEDICAMENTO
                            System.out.println("INGRESE EL NOMBRE DE EL MEDICAMENTO");
                            busquedaMedicamentoNombre = leer.nextLine();
                            medicamentoEncontrado = false;
                            posicionMedicamentoEncontrado = 0;
                            for (int i = 0; i < auxiliarMedicamento; i++) {
                                if (busquedaMedicamentoNombre.equalsIgnoreCase(informacionMedicamento[i].getNombre())) {
                                    System.out.println("*****LA INFORMACION ACTUAL*****");
                                    System.out.printf("NOMBRE: %s\nCONTENIDO: %d\nPRECIO: %.2f\nCODIGO: %d\nFORMULA: %s\nLABORATORIO: %s\nGRUPO: %d\nCANTIDAD: %d\nEXISTENCIA: %s\n", informacionOTC[i].getNombre(), informacionOTC[i].getContenido(),
                                            informacionOTC[i].getPrecio(), informacionOTC[i].getCodigo(), informacionOTC[i].getFormula(),
                                            informacionOTC[i].getLaboratorio(), informacionOTC[i].getGrupo(), informacionOTC[i].getCantidad(),
                                            informacionOTC[i].isExistencia());
                                    medicamentoEncontrado = true;
                                    posicionMedicamentoEncontrado = i;
                                    break;
                                }
                            }
                            if (!medicamentoEncontrado) {
                                System.out.println("**NO ENCONTRADO**");
                            }
                            if (medicamentoEncontrado) {
                                //MODIFICAR
                                System.out.println("*****MODIFIQUE LO DESEADO*****");
                                System.out.println("NOMBRE:");
                                nombreXAXXMedicamento = leer.nextLine();
                                informacionMedicamento[posicionMedicamentoEncontrado].setNombre(nombreXAXXMedicamento);
                                informacionOTC[posicionMedicamentoEncontrado].setNombre(nombreXAXXMedicamento);
                                System.out.println("CONTENIDO:");
                                contenido = leer.nextInt();
                                informacionMedicamento[posicionMedicamentoEncontrado].setContenido(conteoMedicamento);
                                informacionOTC[posicionMedicamentoEncontrado].setContenido(contenido);
                                System.out.println("PRECIO:");
                                precio = leer.nextDouble();
                                informacionMedicamento[posicionMedicamentoEncontrado].setPrecio(precio);
                                informacionOTC[posicionMedicamentoEncontrado].setPrecio(precio);
                                System.out.println("CODIGO:");
                                codigo = leer.nextLong();
                                informacionMedicamento[posicionMedicamentoEncontrado].setCodigo(codigo);
                                informacionOTC[posicionMedicamentoEncontrado].setCodigo(codigo);
                                System.out.println("FORMULA:");
                                formula = leer.nextLine();
                                informacionMedicamento[posicionMedicamentoEncontrado].setFormula(formula);
                                informacionOTC[posicionMedicamentoEncontrado].setFormula(formula);
                                System.out.println("LABORATORIO:");
                                laboratorio = leer.nextLine();
                                informacionMedicamento[posicionMedicamentoEncontrado].setLaboratorio(laboratorio);
                                informacionOTC[posicionMedicamentoEncontrado].setLaboratorio(laboratorio);
                                System.out.println("GRUPO:");
                                grupo = leer.nextInt();
                                informacionMedicamento[posicionMedicamentoEncontrado].setGrupo(grupo);
                                informacionOTC[posicionMedicamentoEncontrado].setGrupo(grupo);
                                System.out.println("CANTIDAD:");
                                cantidad = leer.nextInt();
                                informacionMedicamento[posicionMedicamentoEncontrado].setCantidad(cantidad);
                                informacionOTC[posicionMedicamentoEncontrado].setCantidad(cantidad);
                                System.out.println("*****MODIFICACION REALIZADA CON EXITO*****");
                            }
                            break;
                        case 2:
                            //EMPLEADO     
                            System.out.println("INGRESE EL NUMERO DE EMPLEADO");
                            busquedaEmpleadoNumero = leer.nextInt();
                            empleadoEncontrado = false;
                            posicionEmpleadoEncontrado = 0;
                            for (int i = 0; i < auxiliarEmpleado; i++) {
                                if (busquedaEmpleadoNumero == informacionEmpleado[i].getNumEmpleado()) {
                                    System.out.printf("NOMBRE: %s %s %s\nEDAD: %d\nNUMERO DE TELEFONO: %s\nCALLE: %s\nCOLONIA: %s\nCIUDAD: %s\nNUMERO DE EMPLEADO: %d\n"
                                            + "SUELDO: %.2f\nHORAS TRABAJADAS: %d\n", informacionEmpleado[i].getNombre(),
                                            informacionEmpleado[i].getApellidoP(), informacionEmpleado[i].getApellidoM(), informacionEmpleado[i].getEdad(),
                                            informacionEmpleado[i].getNumTelefono(), informacionEmpleado[i].getCalle(),
                                            informacionEmpleado[i].getCol(), informacionEmpleado[i].getCiudad(), informacionEmpleado[i].getNumEmpleado(),
                                            informacionEmpleado[i].getSueldo(), informacionEmpleado[i].getHorasT());
                                    empleadoEncontrado = true;
                                    posicionEmpleadoEncontrado = i;
                                    break;
                                }
                            }
                            if (!empleadoEncontrado) {
                                System.out.println("**NO ENCONTRADO**");
                            }
                            if (empleadoEncontrado) {
                                //MODIFICAR
                                System.out.println("*****MODIFIQUE LO DESEADO*****");
                                System.out.println("SUELDO:");
                                sueldo = leer.nextDouble();
                                informacionEmpleado[posicionEmpleadoEncontrado].setSueldo(sueldo);
                                System.out.println("HORAS A TRABAJAR");
                                horasT = leer.nextInt();
                                informacionEmpleado[posicionEmpleadoEncontrado].setHorasT(horasT);
                                System.out.println("*****MODIFICACION REALIZADA CON EXITO*****");
                            }
                            break;
                        case 3:
                            //CLIENTE
                            System.out.println("INGRESE EL NUMERO DE CLIENTE");
                            busquedaClienteNumero = leer.nextLong();
                            clienteEncontrado = false;
                            posicionClienteEncontrado = 0;
                            for (int i = 0; i < auxiliarCliente; i++) {
                                if (busquedaClienteNumero == informacionCliente[i].getNumCliente()) {
                                    System.out.printf("NOMBRE: %s %s %s\nEDAD: %d\nNUMERO DE TELEFONO: %s\nCALLE: %s\nCOLONIA: %s\nCIUDAD: %s\nPUNTOS: %d\n"
                                            + "NUMERO DE CLIENTE: %d\nNUMERO DE COMPRAS: %d\n", informacionCliente[i].getNombre(),
                                            informacionCliente[i].getApellidoP(), informacionCliente[i].getApellidoM(), informacionCliente[i].getEdad(),
                                            informacionCliente[i].getNumTelefono(), informacionCliente[i].getCalle(),
                                            informacionCliente[i].getCol(), informacionCliente[i].getCiudad(), informacionCliente[i].getPuntos(),
                                            informacionCliente[i].getNumCliente(), informacionCliente[i].getNumComprar());
                                    clienteEncontrado = true;
                                    posicionClienteEncontrado = i;
                                }
                            }
                            if (!clienteEncontrado) {
                                System.out.println("**NO ENCONTRADO**");
                            }
                            if (clienteEncontrado) {
                                //MODIFICAR
                                System.out.println("*****MODIFIQUE LO DESEADO*****");
                                System.out.println("PUNTOS INICIALES");
                                puntos = leer.nextInt();
                                informacionCliente[posicionClienteEncontrado].setPuntos(puntos);
                                System.out.println("NUMERO DE CLIENTE");
                                numCliente = leer.nextInt();
                                informacionCliente[posicionClienteEncontrado].setNumCliente(numCliente);
                                System.out.println("NUMERO DE COMPRAS");
                                numComprar = leer.nextInt();
                                informacionCliente[posicionClienteEncontrado].setNumComprar(numComprar);
                                System.out.println("*****MODIFICACION REALIZADA CON EXITO*****");
                            }
                            break;
                        default:
                            Advertencia();
                            break;
                    }

                    break;
                case 5:
                    /*SALIR*/
                    Salir();
                    break;
                default:
                    Advertencia();
                    break;
            }
            if (opcionMenuPrincipal != 0) {
                System.out.println("¿DESEA REALIZAR OTRA ACCION?\n1.- SI\n2.- NO");
                opcionMenuPrincipal = leer.nextInt();
            }
        } while (opcionMenuPrincipal != 0);
    }

    public static void Advertencia() {
        System.out.println("SELECCIONE UNA OPCION VALIDA");
    }

    public static void Salir() {
        opcionMenuPrincipal = 0;
    }
}
