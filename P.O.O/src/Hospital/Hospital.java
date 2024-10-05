package hospital;

import java.util.Random;
import java.util.Scanner;

public class Hospital {

    //VARIABLES CLASE InfoBasica
    public static String nombre = "";
    public static String apellidoP = "";
    public static String apellidoM = "";
    public static String nacionalidad = "";
    public static int edad = 0;
    public static String calle = "";
    public static String numCasa = "";
    public static String colonia = "";
    public static String ciudad = "";
    public static long numTelef = 0;
    public static double peso = 0.0;
    public static double estatura = 0.0;
    public static double imc = 0.0;
    public static String diagImc = "";
    public static long nss = 0;
    //VARIABLES CLASE Paciente
    public static int diasHospitalizado = 0;
    public static String diagnostico = "";
    public static String estado = "";
    public static int numRegistro = 0;
    public static int talla = 0;
    public static String tipoSangre = "";
    public static boolean vacunasComp = false;
    public static int nivelGlucosa = 0;
    public static String diagDiabetes = "";
    public static int presionArterial = 0;
    public static String diagPresion = "";
    public static boolean enfermCronicas = false;
    //VARIABLES CLASE Medicamentos
    public static int codigo = 0;
    public static String tipo = "";
    public static int cantTotal = 0;
    public static String nombComercial = "";
    public static String nombGenerico = "";
    public static String nombLaboratorio = "";
    public static String lote = "";
    public static String fechaCaducidad = "";
    public static int cantEnvase = 0;
    public static String viaAdministracion = "";
    public static boolean efectosSec = false;
    //VARIABLES CLASE PersonalMedico
    public static int id = 0;
    public static String tipoPersonal = "";
    public static long cedula = 0;
    public static String gradoEstudios = "";
    public static String especialidad = "";
    public static int sueldo = 0;
    //VARIABLES AUXILIARES EN METODOS
    public static int posicionPaciente = 0;
    public static int posicionMedicamento = 0;
    public static int posicionPersonalMedico = 0;
    public static boolean pacienteEncontrado = false;
    public static boolean medicamentoEncontrado = false;
    public static boolean personalMedicoEncontrado = false;
    public static int opcionMenuPrincipal = 0;
    //VARIABLES DE INFORMACION GENERAL
    public static int auxiliarPaciente = 0;
    public static Paciente informacionPacientes[] = new Paciente[auxiliarPaciente + 2];
    public static int auxiliarMedicamentos = 0;
    public static Medicamentos informacionMedicamentos[] = new Medicamentos[auxiliarMedicamentos + 2];
    public static int auxiliarPersonalMedico = 0;
    public static PersonalMedico informacionPersonalMedico[] = new PersonalMedico[auxiliarPersonalMedico + 2];

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("--------------SISTEMA DEL HOSPITAL IMSS--------------");
            System.out.println("QUE DESEA HACER?\nSELECCIONE UNA OPCION:");
            System.out.println("1.- REGISTRAR\n2.- MOSTRAR\n3.- BUSCAR\n4.- MODIFICAR\n5.- SALIR ");

            opcionMenuPrincipal = leer.nextInt();
            switch (opcionMenuPrincipal) {
                case 1:
                    //REGISTRAR
                    System.out.println("¿QUE DESEA REGISTRAR? SELECCIONE UNA OPCION");
                    System.out.println("1.- PACIENTES\n2.- MEDICAMENTOS\n3.- PERSONAL MEDICO");
                    int opcionQuienRegistrar = leer.nextInt();
                    switch (opcionQuienRegistrar) {
                        case 1:
                            //REGISTRAR-PACIENTES
                            RegistrarInfoBasica(leer);
                            RegistrarPaciente(leer);
                            break;
                        case 2:
                            //REGISTRAR-MEDICAMENTOS
                            RegistrarMedicamentos(leer);
                            break;
                        case 3:
                            //REGISTRAR-PERSONAL MEDICO
                            RegistrarInfoBasica(leer);
                            RegistrarPersonalMedico(leer);
                            break;
                    }
                    break;
                case 2:
                    //MOSTRAR
                    System.out.println("¿QUE DESEA MOSTRAR?");
                    System.out.println("1.- PACIENTES\n2.- MEDICAMENTOS\n3.- PERSONAL MEDICO");
                    int opcionDeseadaMostrar = 0;
                    while (opcionDeseadaMostrar < 1 || opcionDeseadaMostrar > 3) {
                        opcionDeseadaMostrar = leer.nextInt();
                        switch (opcionDeseadaMostrar) {
                            case 1:
                                //MOSTRAR-PACIENTE
                                MostrarPaciente();
                                break;
                            case 2:
                                //MOSTRAR-MEDICAMENTOS
                                MostrarMedicamento();
                                break;
                            case 3:
                                //MOSTRAR_PERSONAL MEDICO
                                MostrarPersonalMedico();
                                break;
                        }
                    }
                    break;
                case 3:
                    //BUSCAR
                    System.out.println("¿QUE DESEA BUSCAR?");
                    System.out.println("1.- PACIENTES\n2.- MEDICAMENTOS\n3.- PERSONAL MEDICO");
                    int opcionDeseadaBuscar = 0;
                    while (opcionDeseadaBuscar < 1 || opcionDeseadaBuscar > 3) {
                        opcionDeseadaBuscar = leer.nextInt();
                        switch (opcionDeseadaBuscar) {
                            case 1:
                                //BUSCAR-PACIENTE
                                BuscarPaciente(leer);
                                break;
                            case 2:
                                //BUSCAR-MEDICAMENTO
                                BuscarMedicamento(leer);
                                break;
                            case 3:
                                //BUSCAR-PERSONAL MEDICO
                                BuscarPersonalMedico(leer);
                                break;
                        }
                    }
                    break;
                case 4:
                    //MODIFICAR
                    System.out.println("¿QUE DESEA MODIFICAR?");
                    System.out.println("1.- PACIENTES\n2.- MEDICAMENTOS\n3.- PERSONAL MEDICO");
                    int opcionDeseadaModificar = 0;
                    while (opcionDeseadaModificar < 1 || opcionDeseadaModificar > 3) {
                        opcionDeseadaModificar = leer.nextInt();
                        switch (opcionDeseadaModificar) {
                            case 1:
                                //MODIFICAR-PACIENTES
                                System.out.println("INGRESE EL NOMBRE DEL PACIENTE");
                                String nombreBusqueda = leer.nextLine();
                                posicionPaciente = 0;
                                pacienteEncontrado = false;
                                for (int i = 0; i < auxiliarPaciente; i++) {
                                    if (nombreBusqueda.equalsIgnoreCase(informacionPacientes[i].getNombre())) {
                                        posicionPaciente = i;
                                        MostrarPacienteActual();
                                        pacienteEncontrado = true;
                                    }
                                }
                                if (pacienteEncontrado == false) {
                                    System.out.println("NO SE HA ENCONTRADO A ESE PACIENTE");
                                } else {
                                    //SE USA POSICION PACIENTE PARA MODIFICAR
                                    ModificarPaciente(leer);
                                }
                                break;
                            case 2:
                                //MODIFICAR-MEDICAMENTOS
                                System.out.println("INGRESE EL NOMBRE DE EL MEDICAMENTO (NOMBRE DE LABORATORIO)");
                                String nombreBusquedaMedicamentos = leer.nextLine();
                                posicionMedicamento = 0;
                                medicamentoEncontrado = false;
                                for (int i = 0; i < auxiliarMedicamentos; i++) {
                                    if (nombreBusquedaMedicamentos.equalsIgnoreCase(informacionMedicamentos[i].getNombLaboratorio())) {
                                        posicionMedicamento = i;
                                        MostrarMedicamentoActual();
                                        medicamentoEncontrado = true;
                                    }
                                }
                                if (medicamentoEncontrado == false) {
                                    System.out.println("NO SE HA ENCONTRADO ESE MEDICAMENTO");
                                } else {
                                    //SE USA POSICION MEDICAMENTOS PARA MODIFICAR
                                    ModificarMedicamento(leer);
                                }
                                break;
                            case 3:
                                //MODIFICAR-PERSONAL MEDICO
                                System.out.println("INGRESE EL NOMBRE DE EL PERSONAL MEDICO");
                                String nombreBusquedaPersonalMedico = leer.nextLine();
                                posicionPersonalMedico = 0;
                                personalMedicoEncontrado = false;
                                for (int i = 0; i < auxiliarPersonalMedico; i++) {
                                    if (nombreBusquedaPersonalMedico.equalsIgnoreCase(informacionPersonalMedico[i].getNombre())) {
                                        posicionPersonalMedico = i;
                                        MostrarPersonalMedicoActual();
                                        personalMedicoEncontrado = true;
                                    }
                                    if (personalMedicoEncontrado == false) {
                                        System.out.println("NO SE HA ENCONTRADO A ESE MEDICO");
                                    } else {
                                        //SE USA POSICION PERSONAL MEDICO PARA MODIFICAR
                                        ModificarPersonalMedico(leer);
                                    }
                                }
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION VALIDA");
                                break;
                        }
                    }
                    break;
                case 5:
                    //SALIR
                    Salir();
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION VALIDA");
                    break;
            }
            if (opcionMenuPrincipal != 0) {
                System.out.println("¿DESEA HACER ALGUN OTRA ACCION EN EL SISTEMA HOSPITAL OZIEL?\n1.- SI\n0.- NO");
                opcionMenuPrincipal = leer.nextInt();
            }
        } while (opcionMenuPrincipal != 0);
    }

    public static void RegistrarInfoBasica(Scanner leer) {
        System.out.println("*****INFORMACION PERSONAL*****");
        System.out.println("INGRESE SU NOMBRE");
        nombre = leer.nextLine();
        System.out.println("INGRESE SU APELLIDO PATERNO");
        apellidoP = leer.nextLine();
        System.out.println("INGRESE SU APELLIDO MATERNO");
        apellidoM = leer.nextLine();
        System.out.println("INGRESE SU NACIONALIDAD");
        nacionalidad = leer.nextLine();
        System.out.println("INGRESE SU EDAD");
        edad = leer.nextInt();
        System.out.println("INGRESE LA CALLE DE SU DOMICILIO");
        calle = leer.nextLine();
        System.out.println("INGRESE EL NUMERO DE SU DOMICILIO");
        numCasa = leer.nextLine();
        System.out.println("INGRESE LA COLONIA DONDE SE UBICA SU DOMICILIO");
        colonia = leer.nextLine();
        System.out.println("INGRESE LA CIUDAD DONDE SE UBICA SU DOMICILIO");
        ciudad = leer.nextLine();
        System.out.println("INGRESE SU NUMERO DE TELEFONO");
        numTelef = leer.nextLong();
        System.out.println("INGRESE SU PESO");
        peso = leer.nextDouble();
        System.out.println("INGRESE SU ESTATURA");
        estatura = leer.nextDouble();
        imc = (peso / Math.pow(estatura, 2));
        diagImc = "";
        if (imc < 18.5) {
            diagImc = "Bajo peso";
        } else if (imc > 18.5 && imc <= 24.9) {
            diagImc = "Adecuado";
        } else if (imc > 25.0 && imc <= 29.9) {
            diagImc = "Sobrepeso";
        } else if (imc > 30.0 && imc <= 34.9) {
            diagImc = "Obesidad grado 1";
        } else if (imc > 35.0 && imc <= 39.9) {
            diagImc = "Obesidad grado 2";
        } else if (imc > 40) {
            diagImc = "Obesidad grado 3";
        }
        System.out.println("INGRESE SU NUMERO DE SEGURO SOCIAL");
        nss = leer.nextLong();
    }

    public static void RegistrarPaciente(Scanner leer) {
        System.out.println("*****INFORMACION MEDICA*****");
        System.out.println("INGRESE LOS DIAS QUE HA ESTADO HOSPITALIZADO");
        diasHospitalizado = leer.nextInt();
        System.out.println("INGRESE EL DIAGNOSTICO DE ESTE PACIENTE");
        diagnostico = leer.nextLine();
        System.out.println("SELECCIONE SU ESTADO ACTUAL\n1.- Dado de alta\n2.- Estable\n3.- Delicado\n4.- Grave\n5.- En coma");
        estado = "";
        int opcionEstadoActual = 0;
        while (opcionEstadoActual < 1 || opcionEstadoActual > 5) {
            opcionEstadoActual = leer.nextInt();
            switch (opcionEstadoActual) {
                case 1:
                    estado = "Dado de alta";
                    break;
                case 2:
                    estado = "Estable";
                    break;
                case 3:
                    estado = "Delicado";
                    break;
                case 4:
                    estado = "Grave";
                    break;
                case 5:
                    estado = "En coma";
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
        //SE GENERA UN NUMERO 
        Random objetoMetodoAleatorio = new Random(System.currentTimeMillis());
        int numeroAleatorio = objetoMetodoAleatorio.nextInt(1000000000);
        objetoMetodoAleatorio.setSeed(System.currentTimeMillis());
        numRegistro = numeroAleatorio;
        System.out.println("INGRESE SU TALLA");
        talla = leer.nextInt();
        System.out.println("INGRESE SU TIPO DE SANGRE");
        tipoSangre = leer.next();
        System.out.println("¿TIENE TODAS LAS VACUNAS APLICADAS?\n1.- SI\n2.- NO");
        int opcionVacunasAplicadas = 0;
        vacunasComp = false;
        while (opcionVacunasAplicadas < 1 || opcionVacunasAplicadas > 2) {
            opcionVacunasAplicadas = leer.nextInt();
            switch (opcionVacunasAplicadas) {
                case 1:
                    vacunasComp = true;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
        System.out.println("INGRESE SU NIVEL DE GLUCOSA");
        nivelGlucosa = leer.nextInt();
        diagDiabetes = "";
        if (nivelGlucosa < 70) {
            diagDiabetes = "Hipoglucemia";
        } else if (nivelGlucosa >= 80 && nivelGlucosa <= 115) {
            diagDiabetes = "Normal";
        } else if (nivelGlucosa >= 116 && nivelGlucosa <= 149) {
            diagDiabetes = "Entre Normal Y Elevado";
        } else if (nivelGlucosa >= 150 && nivelGlucosa <= 180) {
            diagDiabetes = "Nivel Elevado";
        } else if (nivelGlucosa >= 181 && nivelGlucosa <= 214) {
            diagDiabetes = "Entre Nivel Elevado Y Altamente Elevado";
        } else if (nivelGlucosa > 215) {
            diagDiabetes = "Altamente Elevado";
        }
        System.out.println("INGRESE SU PRESION ARTERIAL");
        presionArterial = leer.nextInt();
        diagPresion = "";
        if (presionArterial < 120) {
            diagPresion = "Normal";
        } else if (presionArterial >= 120 && presionArterial <= 129) {
            diagPresion = "Elevada";
        } else if (presionArterial >= 130 && presionArterial <= 139) {
            diagPresion = "Alta Hipertension Grado 1";
        } else if (presionArterial >= 140 && presionArterial <= 180) {
            diagPresion = "Alta Hipertension Grado 2";
        } else if (presionArterial > 180) {
            diagPresion = "Crisis Hipertensiva";
        }
        int opcionEnfermedadesCronicas = 0;
        enfermCronicas = false;
        System.out.println("¿TIENE ENFERMEDADES CRONICAS?\n1.- SI\n2.- NO");
        while (opcionEnfermedadesCronicas < 1 || opcionEnfermedadesCronicas > 2) {
            opcionEnfermedadesCronicas = leer.nextInt();
            switch (opcionEnfermedadesCronicas) {
                case 1:
                    enfermCronicas = true;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION VALIDA");
                    break;
            }
        }
        Paciente objPaciente = new Paciente(nombre, apellidoP, apellidoM, nacionalidad, edad, calle, numCasa, colonia,
                ciudad, numTelef, peso, estatura, imc, diagImc, nss, diasHospitalizado, diagnostico, estado, numRegistro,
                talla, tipoSangre, vacunasComp, nivelGlucosa, diagDiabetes, presionArterial, diagPresion, enfermCronicas);
        informacionPacientes[auxiliarPaciente++] = objPaciente;
        System.out.println("***EL PACIENTE SE HA REGISTRADO CON EXITO***");
    }

    public static void RegistrarMedicamentos(Scanner leer) {
        System.out.println("*****INFORMACION MEDICAMENTOS*****");
        System.out.println("INGRESE EL CODIGO DE EL MEDICAMENTO");
        codigo = leer.nextInt();
        System.out.println("SELECCIONE EL TIPO DE MEDICAMENTO");
        System.out.println("1.- Analgésico\n2.- Antiácido\n3.- Antialérgico\n4.- Antidiarreico\n5.- Anti infeccioso\n6.- Antinflamatorio\n7.- Antipirético\n8.- Mucolítico \n9.- Otro");
        int opcionTipoMedicamento = 0;
        while (opcionTipoMedicamento < 1 || opcionTipoMedicamento > 9) {
            opcionTipoMedicamento = leer.nextInt();
            switch (opcionTipoMedicamento) {
                case 1:
                    tipo = "Analgésico";
                    break;
                case 2:
                    tipo = "Antiácido";
                    break;
                case 3:
                    tipo = "Antialérgico";
                    break;
                case 4:
                    tipo = "Antidiarreico";
                    break;
                case 5:
                    tipo = "Anti infeccioso";
                    break;
                case 6:
                    tipo = "Antinflamatorio";
                    break;
                case 7:
                    tipo = "Antipirético";
                    break;
                case 8:
                    tipo = "Mucolítico";
                    break;
                case 9:
                    tipo = "Otro";
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
        System.out.println("INGRESE LA CANTIDAD TOTAL");
        cantTotal = leer.nextInt();
        System.out.println("INGRESE EL NOMBRE COMERCIAL");
        nombComercial = leer.nextLine();
        System.out.println("INGRESE EL NOMBRE GENERICO");
        nombGenerico = leer.nextLine();
        System.out.println("INGRESE EL NOMBRE DE LABORATORIO");
        nombLaboratorio = leer.nextLine();
        System.out.println("INGRESE EL LOTE");
        lote = leer.nextLine();
        System.out.println("INGRESE LA FECHA DE CADUCIDAD DE EL LOTE");
        fechaCaducidad = leer.nextLine();
        System.out.println("INGRESE LA CANTIDAD DE MILIGRAMOS POR PIEZA");
        cantEnvase = leer.nextInt();
        System.out.println("INGRESE LA VIA DE ADMINISTRACION");
        viaAdministracion = leer.nextLine();
        System.out.println("¿TIENE EFECTOS SECUNDARIOS?\n1.- SI\n2.- NO");
        int opcionEfectosSecundarios = 0;
        while (opcionEfectosSecundarios < 1 || opcionEfectosSecundarios > 2) {
            opcionEfectosSecundarios = leer.nextInt();
            switch (opcionEfectosSecundarios) {
                case 1:
                    efectosSec = true;
                    break;
                case 2:
                    efectosSec = false;
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
        Medicamentos objMedicamentos = new Medicamentos(codigo, tipo, cantTotal, nombComercial, nombGenerico,
                nombLaboratorio, lote, fechaCaducidad, cantEnvase, viaAdministracion, efectosSec);
        informacionMedicamentos[auxiliarMedicamentos++] = objMedicamentos;
        System.out.println("***EL MEDICAMENTO SE HA REGISTRADO CON EXITO***");
    }

    public static void RegistrarPersonalMedico(Scanner leer) {
        System.out.println("*****INFORMACION PERSONAL MEDICO*****");
        id = ++id;
        System.out.println("SELECCIONE EL TIPO DE PERSONAL");
        System.out.println("1.- Medico general\n2.- Enfermero\n3.- Residente\n4.- Especialista");
        int opcionTipoPersonal = 0;
        while (opcionTipoPersonal < 1 || opcionTipoPersonal > 4) {
            opcionTipoPersonal = leer.nextInt();
            switch (opcionTipoPersonal) {
                case 1:
                    tipoPersonal = "Medico general";
                    break;
                case 2:
                    tipoPersonal = "Enfermero";
                    break;
                case 3:
                    tipoPersonal = "Residente";
                    break;
                case 4:
                    tipoPersonal = "Especialista";
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }

        System.out.println("INGRESE SU CEDULA PROFESIONAL");
        cedula = leer.nextLong();
        System.out.println("SELECCIONE EL GRADO DE ESTUDIOS");
        System.out.println("1.- Bachiller\n2.- Licenciado\n3.- Magíster\n4.- Doctorado");
        int opcionGradoEstudios = 0;
        while (opcionGradoEstudios < 1 || opcionGradoEstudios > 4) {
            opcionGradoEstudios = leer.nextInt();
            switch (opcionGradoEstudios) {
                case 1:
                    gradoEstudios = "Bachiller";
                    break;
                case 2:
                    gradoEstudios = "Licenciado";
                    break;
                case 3:
                    gradoEstudios = "Magíster";
                    break;
                case 4:
                    gradoEstudios = "Doctorado";
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
        System.out.println("INGRESE SU ESPECIALIDAD");
        especialidad = leer.nextLine();
        System.out.println("INGRESE EL SUELDO DE ESTE PERSONAL MEDICO");
        sueldo = leer.nextInt();
        PersonalMedico objPersonalMedico = new PersonalMedico(nombre, apellidoP, apellidoM, nacionalidad, edad, calle,
                numCasa, colonia, ciudad, numTelef, peso, estatura, imc,
                diagImc, diagImc, nss, id, tipoPersonal, cedula, gradoEstudios,
                especialidad, sueldo);
        informacionPersonalMedico[auxiliarPersonalMedico++] = objPersonalMedico;
        System.out.println("***PERSONAL MEDICO SE HA REGISTRADO CON EXITO***");
    }

    public static void MostrarPaciente() {
        for (int i = 0; i < auxiliarPaciente; i++) {
            System.out.println("**************************************************");
            System.out.printf("NOMBRE: \nAPELLIDOS: \nNACIONALIDAD: \nEDAD: \nCALLE: "
                    + "\nNUMERO DE CASA: \nCOLONIA: \nCIUDAD: \nNUMERO TELEFONICO: \nPESO: "
                    + "\nESTATURA: \nIMC: \nDIAGNOSTICO IMC: \nNUMERO DE SEGURIDAD SOCIAL: "
                    + "\nDIAS HOSPITALIDADO: \nDIAGNOSTICO: \nESTADO: \nNUMERO REGISTRO: "
                    + "\nTALLA: \nTIPO DE SANGRE: \nVACUNAS COMPLETAS: \nNIVEL DE GLUCOSA: "
                    + "\nDIAGNOSTICO DIABETES: \nPRESION ARTERIAL: \nDIAGNOSTICO PRESION: \nENFERMEDADES CRONICAS:",
                    informacionPacientes[i].getNombre(), informacionPacientes[i].getApellidoP(), informacionPacientes[i].getApellidoM(),
                    informacionPacientes[i].getNacionalidad(), informacionPacientes[i].getEdad(), informacionPacientes[i].getCalle(),
                    informacionPacientes[i].getNumCasa(), informacionPacientes[i].getColonia(), informacionPacientes[i].getCiudad(),
                    informacionPacientes[i].getNumTelef(), informacionPacientes[i].getPeso(), informacionPacientes[i].getEstatura(),
                    informacionPacientes[i].getImc(), informacionPacientes[i].getDiagImc(),
                    informacionPacientes[i].getNss(), informacionPacientes[i].getDiasHospitalizado(), informacionPacientes[i].getDiagnostico(), informacionPacientes[i].getEstado(),
                    informacionPacientes[i].getNumRegistro(), informacionPacientes[i].getTalla(), informacionPacientes[i].getTipoSangre(),
                    informacionPacientes[i].isVacunasComp(), informacionPacientes[i].getNivelGlucosa(), informacionPacientes[i].getDiagDiabetes(),
                    informacionPacientes[i].getPresionArterial(), informacionPacientes[i].getDiagPresion(), informacionPacientes[i].isEnfermCronicas());
            System.out.println("**************************************************");
        }
    }

    public static void MostrarMedicamento() {
        for (int i = 0; i < auxiliarMedicamentos; i++) {
            System.out.println("**************************************************");
            System.out.printf("CODIGO: \nTIPO: \nCANTIDAD TOTAL: \nNOMBRE COMERCIAL: \nNOMBRE GENERICO: "
                    + "\nNOMBRE LABORATORIO: \nLOTE: \nFECHA DE CADUCIDAD: \nCANTIDAD POR ENVASE: "
                    + "\nVIA DE ADMINISTRACION: \nEFECTOS SECUNDARIOS: \n", informacionMedicamentos[i].getCodigo(),
                    informacionMedicamentos[i].getClasMedicamentos(), informacionMedicamentos[i].getCantTotal(),
                    informacionMedicamentos[i].getNombComercial(), informacionMedicamentos[i].getNombGenerico(),
                    informacionMedicamentos[i].getNombLaboratorio(), informacionMedicamentos[i].getLote(),
                    informacionMedicamentos[i].getFechaCaducidad(), informacionMedicamentos[i].getCantEnvase(),
                    informacionMedicamentos[i].getViaAdministracion(), informacionMedicamentos[i].isEfectosSecundarios());
            System.out.println("**************************************************");
        }
    }

    public static void MostrarPersonalMedico() {
        for (int i = 0; i < auxiliarPersonalMedico; i++) {
            System.out.println("**************************************************");
            System.out.printf("NOMBRE: \nAPELLIDOS: \nNACIONALIDAD: \nEDAD: \nCALLE: "
                    + "\nNUMERO DE CASA: \nCOLONIA: \nCIUDAD: \nNUMERO TELEFONICO: \nPESO:"
                    + "\nESTATURA: \nIMC: \nDIAGNOSTICO IMC: \nNUMERO DE SEGURIDAD SOCIAL: \nID: "
                    + "\nTIPO PERSONAL: \nCEDULA: \nGRADO DE ESTUDIOS: \nESPECIALIDAD: \nSUELDO: ",
                    informacionPersonalMedico[i].getNombre(), informacionPersonalMedico[i].getApellidoP(), informacionPersonalMedico[i].getApellidoM(),
                    informacionPersonalMedico[i].getNacionalidad(), informacionPersonalMedico[i].getEdad(), informacionPersonalMedico[i].getCalle(),
                    informacionPersonalMedico[i].getNumCasa(), informacionPersonalMedico[i].getColonia(), informacionPersonalMedico[i].getCiudad(),
                    informacionPersonalMedico[i].getNumTelef(), informacionPersonalMedico[i].getPeso(), informacionPersonalMedico[i].getEstatura(),
                    informacionPersonalMedico[i].getImc(), informacionPersonalMedico[i].getDiagImc(),
                    informacionPersonalMedico[i].getNss(), informacionPersonalMedico[i].getId(), informacionPersonalMedico[i].getTipoPersonal(),
                    informacionPersonalMedico[i].getCedula(), informacionPersonalMedico[i].getGradoEstudios(),
                    informacionPersonalMedico[i].getEspecialidad(), informacionPersonalMedico[i].getSueldo());
            System.out.println("**************************************************");
        }
    }

    public static void MostrarPacienteActual() {
        int i = posicionPaciente;
        System.out.println("*************************SU INFORMACION ACTUAL ES*************************");
        System.out.printf("NOMBRE: \nAPELLIDOS: \nNACIONALIDAD: \nEDAD: \nCALLE: "
                + "\nNUMERO DE CASA: \nCOLONIA:\nCIUDAD: \nNUMERO TELEFONICO: \nPESO: "
                + "\nESTATURA: \nIMC: \nDIAGNOSTICO IMC: \nNUMERO DE SEGURIDAD SOCIAL: "
                + "DIAS HOSPITALIDADO: \nDIAGNOSTICO: \nESTADO: \nNUMERO REGISTRO: "
                + "\nTALLA: \nTIPO DE SANGRE: \nVACUNAS COMPLETAS: \nNIVEL DE GLUCOSA: "
                + "\nDIAGNOSTICO DIABETES: \nPRESION ARTERIAL: \nDIAGNOSTICO PRESION: \nENFERMEDADES CRONICAS: ",
                informacionPacientes[i].getNombre(), informacionPacientes[i].getApellidoP(), informacionPacientes[i].getApellidoM(),
                informacionPacientes[i].getNacionalidad(), informacionPacientes[i].getEdad(), informacionPacientes[i].getCalle(),
                informacionPacientes[i].getNumCasa(), informacionPacientes[i].getColonia(), informacionPacientes[i].getCiudad(),
                informacionPacientes[i].getNumTelef(), informacionPacientes[i].getPeso(), informacionPacientes[i].getEstatura(),
                informacionPacientes[i].getImc(), informacionPacientes[i].getDiagImc(),
                informacionPacientes[i].getNss(), informacionPacientes[i].getDiasHospitalizado(), informacionPacientes[i].getDiagnostico(), informacionPacientes[i].getEstado(),
                informacionPacientes[i].getNumRegistro(), informacionPacientes[i].getTalla(), informacionPacientes[i].getTipoSangre(),
                informacionPacientes[i].isVacunasComp(), informacionPacientes[i].getNivelGlucosa(), informacionPacientes[i].getDiagDiabetes(),
                informacionPacientes[i].getPresionArterial(), informacionPacientes[i].getDiagPresion(), informacionPacientes[i].isEnfermCronicas());
        System.out.println("**************************************************");

    }

    public static void MostrarMedicamentoActual() {
        int i = posicionMedicamento;
        System.out.println("*************************LA INFORMACION ACTUAL ES*************************");
        System.out.printf("CODIGO: \nTIPO: \nCANTIDAD TOTAL: \nNOMBRE COMERCIAL: \nNOMBRE GENERICO: "
                + "\nNOMBRE LABORATORIO: \nLOTE: \nFECHA DE CADUCIDAD: \nCANTIDAD POR ENVASE: "
                + "\nVIA DE ADMINISTRACION: \nEFECTOS SECUNDARIOS: ", informacionMedicamentos[i].getCodigo(),
                informacionMedicamentos[i].getClasMedicamentos(), informacionMedicamentos[i].getCantTotal(),
                informacionMedicamentos[i].getNombComercial(), informacionMedicamentos[i].getNombGenerico(),
                informacionMedicamentos[i].getNombLaboratorio(), informacionMedicamentos[i].getLote(),
                informacionMedicamentos[i].getFechaCaducidad(), informacionMedicamentos[i].getCantEnvase(),
                informacionMedicamentos[i].getViaAdministracion(), informacionMedicamentos[i].isEfectosSecundarios());
        System.out.println("**************************************************");
    }

    public static void MostrarPersonalMedicoActual() {
        int i = posicionPersonalMedico;
        System.out.println("**************************************************");
        System.out.printf("NOMBRE: \nAPELLIDOS: \nNACIONALIDAD: \nEDAD: \nCALLE: "
                + "\nNUMERO DE CASA: \nCOLONIA: \nCIUDAD: \nNUMERO TELEFONICO: \nPESO: "
                + "\nESTATURA: \nIMC: \nDIAGNOSTICO IMC: \nNUMERO DE SEGURIDAD SOCIAL: \nID: "
                + "\nTIPO PERSONAL: \nCEDULA: \nGRADO DE ESTUDIOS: \nESPECIALIDAD: \nSUELDO: ",
                informacionPersonalMedico[i].getNombre(), informacionPersonalMedico[i].getApellidoP(), informacionPersonalMedico[i].getApellidoM(),
                informacionPersonalMedico[i].getNacionalidad(), informacionPersonalMedico[i].getEdad(), informacionPersonalMedico[i].getCalle(),
                informacionPersonalMedico[i].getNumCasa(), informacionPersonalMedico[i].getColonia(), informacionPersonalMedico[i].getCiudad(),
                informacionPersonalMedico[i].getNumTelef(), informacionPersonalMedico[i].getPeso(), informacionPersonalMedico[i].getEstatura(),
                informacionPersonalMedico[i].getImc(), informacionPersonalMedico[i].getDiagImc(),
                informacionPersonalMedico[i].getNss(), informacionPersonalMedico[i].getId(), informacionPersonalMedico[i].getTipoPersonal(),
                informacionPersonalMedico[i].getCedula(), informacionPersonalMedico[i].getGradoEstudios(),
                informacionPersonalMedico[i].getEspecialidad(), informacionPersonalMedico[i].getSueldo());
        System.out.println("**************************************************");
    }

    public static void BuscarPaciente(Scanner leer) {
        System.out.println("INGRESE EL NOMBRE DEL PACIENTE");
        String nombreBusqueda = leer.nextLine();
        posicionPaciente = 0;
        pacienteEncontrado = false;
        for (int i = 0; i < auxiliarPaciente; i++) {
            if (nombreBusqueda.equalsIgnoreCase(informacionPacientes[i].getNombre())) {
                posicionPaciente = i;
                MostrarPaciente();
                pacienteEncontrado = true;
            }
        }
        if (pacienteEncontrado == false) {
            System.out.println("NO SE HA ENCONTRADO A ESE PACIENTE");
        }
    }

    public static void BuscarMedicamento(Scanner leer) {
        System.out.println("INGRESE EL NOMBRE DEL MEDICAMENTO (POR NOMBRE DE LABORATORIO)");
        String nombreMedicamentoBusqueda = leer.nextLine();
        posicionMedicamento = 0;
        medicamentoEncontrado = false;
        for (int i = 0; i < auxiliarMedicamentos; i++) {
            if (nombreMedicamentoBusqueda.equalsIgnoreCase(informacionMedicamentos[i].getNombLaboratorio())) {
                posicionMedicamento = i;
                MostrarMedicamento();
                medicamentoEncontrado = true;
            }
        }
        if (medicamentoEncontrado == false) {
            System.out.println("NO SE HA ENCONTRADO ESE MEDICAMENTO");
        }
    }

    public static void BuscarPersonalMedico(Scanner leer) {
        System.out.println("INGRESE EL NOMBRE DE EL PERSONAL MEDICO");
        String nombrePersonalMedicoBusqueda = leer.nextLine();
        posicionPersonalMedico = 0;
        personalMedicoEncontrado = false;
        for (int i = 0; i < auxiliarPersonalMedico; i++) {
            if (nombrePersonalMedicoBusqueda.equalsIgnoreCase(informacionPersonalMedico[i].getNombre())) {
                posicionPersonalMedico = i;
                MostrarPersonalMedico();
                personalMedicoEncontrado = true;
            }
        }
    }

    public static void ModificarPaciente(Scanner leer) {
        System.out.println("INGRESE EL NOMBRE");
        nombre = leer.nextLine();
        informacionPacientes[posicionPaciente].setNombre(nombre);
        System.out.println("INGRESE EL APELLIDO PATERNO");
        apellidoP = leer.nextLine();
        informacionPacientes[posicionPaciente].setApellidoP(apellidoP);
        System.out.println("INGRESE EL APELLIDO MATERNO");
        apellidoM = leer.nextLine();
        informacionPacientes[posicionPaciente].setApellidoP(apellidoM);
        System.out.println("INGRESE LA CALLE");
        calle = leer.nextLine();
        informacionPacientes[posicionPaciente].setCalle(calle);
        System.out.println("INGRESE EL NUMERO DE CASA");
        numCasa = leer.nextLine();
        informacionPacientes[posicionPaciente].setNumCasa(numCasa);
        System.out.println("INGRESE LA COLONIA");
        colonia = leer.nextLine();
        informacionPacientes[posicionPaciente].setColonia(colonia);
        System.out.println("INGRESE LA CIUDAD");
        ciudad = leer.nextLine();
        informacionPacientes[posicionPaciente].setCiudad(ciudad);
        System.out.println("INGRESE SU NUMERO TELEFONICO");
        numTelef = leer.nextLong();
        informacionPacientes[posicionPaciente].setNumTelef(numTelef);
        System.out.println("***MODIFICACION DEL PACIENTE FINALIZADA***");
    }

    public static void ModificarMedicamento(Scanner leer) {
        System.out.println("SELECCIONE EL TIPO DE MEDICAMENTO");
        System.out.println("1.- Analgésico\n2.- Antiácido\n3.- Antialérgico\n4.- Antidiarreico\n5.- Anti infeccioso\n6.- Antinflamatorio\n7.- Antipirético\n8.- Mucolítico \n9.- Otro");
        int opcionTipoMedicamento = 0;
        while (opcionTipoMedicamento < 1 || opcionTipoMedicamento > 9) {
            opcionTipoMedicamento = leer.nextInt();
            switch (opcionTipoMedicamento) {
                case 1:
                    tipo = "Analgésico";
                    break;
                case 2:
                    tipo = "Antiácido";
                    break;
                case 3:
                    tipo = "Antialérgico";
                    break;
                case 4:
                    tipo = "Antidiarreico";
                    break;
                case 5:
                    tipo = "Anti infeccioso";
                    break;
                case 6:
                    tipo = "Antinflamatorio";
                    break;
                case 7:
                    tipo = "Antipirético";
                    break;
                case 8:
                    tipo = "Mucolítico";
                    break;
                case 9:
                    tipo = "Otro";
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        informacionMedicamentos[posicionMedicamento].setClasMedicamentos(tipo);
        System.out.println("INGRESE LA CANTIDAD TOTAL");
        cantTotal = leer.nextInt();
        informacionMedicamentos[posicionMedicamento].setCantTotal(cantTotal);
        System.out.println("INGRESE EL NOMBRE COMERCIAL");
        nombComercial = leer.nextLine();
        informacionMedicamentos[posicionMedicamento].setNombComercial(nombComercial);
        System.out.println("INGRESE EL NOMBRE GENERICO");
        nombGenerico = leer.nextLine();
        informacionMedicamentos[posicionMedicamento].setNombGenerico(nombGenerico);
        System.out.println("INGRESE EL NOMBRE DE LABORATORIO");
        nombLaboratorio = leer.nextLine();
        informacionMedicamentos[posicionMedicamento].setNombLaboratorio(nombLaboratorio);
        System.out.println("INGRESE EL LOTE");
        lote = leer.nextLine();
        informacionMedicamentos[posicionMedicamento].setLote(lote);
        System.out.println("INGRESE LA FECHA DE CADUCIDAD");
        fechaCaducidad = leer.nextLine();
        informacionMedicamentos[posicionMedicamento].setFechaCaducidad(fechaCaducidad);
        System.out.println("INGRESE LA CANTIDAD POR ENVASE");
        cantEnvase = leer.nextInt();
        informacionMedicamentos[posicionMedicamento].setCantEnvase(cantEnvase);
        System.out.println("INGRESE LA VIA DE ADMINISTRACION");
        viaAdministracion = leer.nextLine();
        informacionMedicamentos[posicionMedicamento].setViaAdministracion(viaAdministracion);
        System.out.println("¿TIENE EFECTOS SECUNDARIOS?\n1.- SI\n2.- NO");
        int opcionEfectosSecundarios = 0;
        while (opcionEfectosSecundarios < 1 || opcionEfectosSecundarios > 2) {
            opcionEfectosSecundarios = leer.nextInt();
            switch (opcionEfectosSecundarios) {
                case 1:
                    efectosSec = true;
                    break;
                case 2:
                    efectosSec = false;
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
            informacionMedicamentos[posicionMedicamento].setEfectosSecundarios(efectosSec);
            System.out.println("***MODIFICACION DEL MEDICAMENTO FINALIZADA***");
        }
    }

    



    



    }
    
    public static void ModificarPersonalMedico(Scanner leer) {
        System.out.println("SELECCIONE EL TIPO DE PERSONAL MEDICO");
        System.out.println("1.- Medico general\n2.- Enfermero\n3.- Residente\n4.- Especialista");
        int opcionTipoPersonal = 0;
        while (opcionTipoPersonal < 1 || opcionTipoPersonal > 4) {
            opcionTipoPersonal = leer.nextInt();
            switch (opcionTipoPersonal) {
                case 1:
                    tipoPersonal = "Medico general";
                    break;
                case 2:
                    tipoPersonal = "Enfermero";
                    break;
                case 3:
                    tipoPersonal = "Residente";
                    break;
                case 4:
                    tipoPersonal = "Especialista";
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
            informacionPersonalMedico[posicionPersonalMedico].setTipoPersonal(tipoPersonal);
        }

        System.out.println("INGRESE SU CEDULA PROFESIONAL");
        cedula = leer.nextLong();
        informacionPersonalMedico[posicionPersonalMedico].setCedula(cedula);
        System.out.println("SELECCIONE EL GRADO DE ESTUDIOS");
        System.out.println("1.- Bachiller\n2.- Licenciado\n3.- Magíster\n4.- Doctorado");
        int opcionGradoEstudios = 0;
        while (opcionGradoEstudios < 1 || opcionGradoEstudios > 4) {
            opcionGradoEstudios = leer.nextInt();
            switch (opcionGradoEstudios) {
                case 1:
                    gradoEstudios = "Bachiller";
                    break;
                case 2:
                    gradoEstudios = "Licenciado";
                    break;
                case 3:
                    gradoEstudios = "Magíster";
                    break;
                case 4:
                    gradoEstudios = "Doctorado";
                    break;
                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA");
                    break;
            }
            informacionPersonalMedico[posicionPersonalMedico].setGradoEstudios(gradoEstudios);
        }
        leer.skip("\n");
        System.out.println("INGRESE SU ESPECIALIDAD");
        especialidad = leer.nextLine();
        informacionPersonalMedico[posicionPersonalMedico].setEspecialidad(especialidad);
        System.out.println("INGRESE EL SUELDO DE ESTE PERSONAL MEDICO");
        sueldo = leer.nextInt();
        informacionPersonalMedico[posicionPersonalMedico].setSueldo(sueldo);
        System.out.println("***MODIFICACION DEL PERSONAL MEDICO FINALIZADA***");
    }
    
    public static void Salir() {
        opcionMenuPrincipal = 0;
    }
}
