package Evaluacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner leer=new Scanner(System.in);
        //Informacion general
        String nombre;
        int ID=0;
        //Clase juez
        ArrayList<Juez> arrJuez=new ArrayList<Juez>();
        Juez objJuez = null;
        String ape;
        int cedula;
        //Clase participante
        ArrayList<Participante> arrParticipante=new ArrayList<Participante>();
        Participante objParticipante = null;
        String apePar;
        int edad;
        //Clase asesor
        ArrayList<Asesor> arrAsesor=new ArrayList<Asesor>();
        Asesor objAsesor = null;
        String apeAs, esc;
        int anti;
        //Clase proyecto
        ArrayList<Proyecto> arrProyecto=new ArrayList<Proyecto>();
        Proyecto objProyecto = null;
        String nomAse, nomPar, cat;
        //Arreglo Categoria
        String[] arrCat = new String[] {"Petit", "Kids", "Juvenil", "Media Superior", "Superior", "Posgrado"};
        
        int opDo=0, opJue=0, opPar=0, opAs=0, opPro=0;
        do{
        System.out.println("Menu del sistema\nA que apartado desea ingresar \n1.-Juez \n2.-Participante \n3.-Asesor \n4.-Proyecto \n5.-Salir");
        int op1=leer.nextInt();
        switch(op1){
            case 1:
            do{
                System.out.println("---------- J U E Z ----------");
                System.out.println("Que desea hacer? \n1.-Registrar \n2.-Mostrar \n3.-Actualizar \n4.-Buscar \n5.-Eliminar \n6.-Salir");
                opJue=leer.nextInt();
                switch(opJue){
                    case 1://Registrar
                        System.out.println("Ingrese el nombre del juez");
                        nombre=leer.next();
                        System.out.println("Ingrese el apellido del juez");
                        ape=leer.next();
                        System.out.println("Ingresa la cedula del juez");
                        cedula=leer.nextInt();
                        objJuez = new Juez(nombre, ape, cedula, arrJuez.size()+1);
                        arrJuez.add(objJuez);
                    break;
                    case 2://Mostrar
                        for(Juez a : arrJuez){
                            System.out.println("Nombre " + objJuez.getNombre()+" "+objJuez.getApe());
                            System.out.println("Cedula " + objJuez.getCedula());
                            System.out.println("--------------------------------");
                        }
                    break;
                    case 3://Actualizar
                        System.out.println("Ingrese el nombre que desee buscar para actualizar");
                        String buscar=leer.next();
                        for (int i = 0; i < arrJuez.size(); i++) {
                            for(Juez a : arrJuez){
                                System.out.println("Ingrese el nuevo nombre");
                                arrJuez.get(i).setNombre(nombre=leer.next());
                                System.out.println("Actualizado!");
                                System.out.println("Nuevo nombre " + objJuez.getNombre());
                            }
                        }
                    break;
                    case 4://Buscar
                        System.out.println("Ingrese el nombre que desee buscar");
                        buscar=leer.next();
                        for (int i = 0; i < arrJuez.size(); i++) {
                            for(Juez a : arrJuez){
                                System.out.println("");
                                System.out.println("Nombre " + objJuez.getNombre()+" "+objJuez.getApe());
                                System.out.println("Cedula " + objJuez.getCedula());
                                System.out.println("--------------------------------");
                            }
                        }
                    break;
                    case 5://Eliminar
                        System.out.println("Ingrese el nombre que desee buscar");
                        buscar=leer.next();
                        for (int i = 0; i < arrJuez.size(); i++) {
                            if (buscar.equals(arrJuez.get(i).getNombre())) {
                                arrJuez.remove(i);
                            }
                        }
                    break;
                    case 6://Salir
                    break;
                    }
                   System.out.println("Desea volver al menu de Juez?? \n1.-Si \n2.-No");
                  opDo = leer.nextInt();
                 }while(opDo!=2);
            break;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 2:
                do{
                System.out.println("---------- P A R T I C I P A N T E ----------");
                System.out.println("Que desea hacer? \n1.-Registrar \n2.-Mostrar \n3.-Actualizar \n4.-Buscar \n5.-Eliminar \n6.-Salir");
                opPar=leer.nextInt();
                switch(opPar){
                    case 1://Registrar
                        System.out.println("Ingrese el nombre del participante");
                        nombre=leer.next();
                        System.out.println("Ingrese el apellido del participante");
                        apePar=leer.next();
                        System.out.println("Ingresa la edad del participante");
                        edad=leer.nextInt();
                        objParticipante = new Participante(apePar, edad, nombre, arrParticipante.size()+1);
                        arrParticipante.add(objParticipante);
                    break;
                    case 2://Mostrar
                        for(Participante m : arrParticipante){
                            System.out.println("Nombre " + m.getNombre()+" "+m.getApePar());
                            System.out.println("Edad " + m.getEdad());
                            System.out.println("ID " + m.getID());
                            System.out.println("--------------------------------");
                        }
                    break;
                    case 3://Actualizar
                        System.out.println("Ingrese la ID del particiepante que quiera actualizar");
                        int act=leer.nextInt();
                        for (Participante ac : arrParticipante) {
                            if (ac.getID() == act) {
                                System.out.println("Ingresa el nuevo nombre");
                                ac.setNombre(leer.next());
                                System.out.println("El nombre a sido actualizado correctamente");
                                break;
                            }
                        }
                    break;
                    case 4://Buscar
                        System.out.println("Ingrese la ID del particiepante que quiera buscar");
                        int bus=leer.nextInt();
                        boolean gotcha = false;
                        for (Participante ac : arrParticipante) {
                            if (ac.getID() == bus) {
                                gotcha = true;
                                break;
                            }
                        }
                        if (gotcha) {
                            System.out.println("Encontrado");
                        }else{
                            System.out.println("Lo sentimos \nNo existe dentro de la base de datos");
                        }
                    break;
                    case 5://Eliminar
                        System.out.println("Ingrese la ID del particiepante que quiera actualizar");
                        int eli=leer.nextInt();
                        for (Participante el : arrParticipante) {
                            if (el.getID() == eli) {
                                arrParticipante.remove(el);
                                break;
                            }
                        }
                    break;
                    case 6://Salir
                    break;
                }
                System.out.println("Desea volver al menu de Participante?? \n1.-Si \n2.-No");
                  opDo = leer.nextInt();
                 }while(opDo!=2);
                break;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 3:
                do{
                System.out.println("---------- A S E S O R ----------");
                System.out.println("Que desea hacer? \n1.-Registrar \n2.-Mostrar \n3.-Actualizar \n4.-Buscar \n5.-Eliminar \n6.-Salir");
                opAs=leer.nextInt();
                switch(opAs){
                    case 1://Registrar
                        System.out.println("Ingrese el nombre del asesor");
                        nombre=leer.next();
                        System.out.println("Ingrese el apellido del asesor");
                        apeAs=leer.next();
                        System.out.println("Ingrese la escuela del asesor");
                        esc=leer.next();
                        System.out.println("Ingresa la antiguedad del asesor");
                        anti=leer.nextInt();
                        objAsesor = new Asesor(apeAs, esc, anti, nombre, arrAsesor.size()+1);
                        arrAsesor.add(objAsesor);
                    break;
                    case 2://Mostrar
                        for(Participante m : arrParticipante){
                            System.out.println("Nombre " + m.getNombre()+" "+m.getApePar());
                            System.out.println("Edad " + m.getEdad());
                            System.out.println("ID " + m.getID());
                            System.out.println("--------------------------------");
                        }
                    break;
                    case 3://Actualizar
                        System.out.println("Ingrese la ID del asesor que quiera actualizar");
                        int act=leer.nextInt();
                        for (Asesor ac : arrAsesor) {
                            if (ac.getID() == act) {
                                System.out.println("Ingresa el nuevo nombre");
                                ac.setNombre(leer.next());
                                System.out.println("El nombre a sido actualizado correctamente");
                                break;
                            }
                        }
                    break;
                    case 4://Buscar
                        System.out.println("Ingrese la ID del asesor que quiera buscar");
                        int bus=leer.nextInt();
                        boolean gotcha = false;
                        for (Participante ac : arrParticipante) {
                            if (ac.getID() == bus) {
                                gotcha = true;
                                break;
                            }
                        }
                        if (gotcha) {
                            System.out.println("Encontrado");
                        }else{
                            System.out.println("Lo sentimos \nNo existe dentro de la base de datos");
                        }
                    break;
                    case 5://Eliminar
                        System.out.println("Ingrese la ID del asesor que quiera actualizar");
                        int eli=leer.nextInt();
                        for (Asesor el : arrAsesor) {
                            if (el.getID() == eli) {
                                arrAsesor.remove(el);
                                break;
                            }
                        }
                    break;
                    case 6://Salir
                    break;
                }
                System.out.println("Desea volver al menu de Asesor?? \n1.-Si \n2.-No");
                  opDo = leer.nextInt();
                 }while(opDo!=2);
            break;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 4:
                do{
                System.out.println("---------- P R O Y E C T O ----------");
                System.out.println("Que desea hacer? \n1.-Registrar \n2.-Mostrar \n3.-Actualizar \n4.-Buscar \n5.-Eliminar \n6.-Salir");
                opPro=leer.nextInt();
                switch(opPro){
                    case 1://Registrar
                        System.out.println("Ingrese el nombre del proyecto");
                        nombre=leer.next();
                        System.out.println("Ingrese el asesor del proyecto");
                        nomAse=leer.next();
                        boolean cont = false;
                        for (int i = 0; i < arrAsesor.size(); i++) {
                            if (nomAse.equals(arrAsesor.get(i).getNombre())) {
                                cont = true;
                                break;
                            }
                        }
                        if (cont == false) {
                            System.out.println("Ingrese el nombre del asesor");
                            nombre=leer.next();
                            System.out.println("Ingrese el apellido del asesor");
                            apeAs=leer.next();
                            System.out.println("Ingrese la escuela del asesor");
                            esc=leer.next();
                            System.out.println("Ingresa la antiguedad del asesor");
                            anti=leer.nextInt();
                            objAsesor = new Asesor(apeAs, esc, anti, nombre, arrAsesor.size()+1);
                            arrAsesor.add(objAsesor);
                        }
                        System.out.println("Ingrese el autor del proyecto");
                        nomPar=leer.next();
                        cont = false;
                        for (int i = 0; i < arrParticipante.size(); i++) {
                            if (nomPar.equals(arrParticipante.get(i).getNombre())) {
                                cont = true;
                                break;
                            }
                        }
                        if (cont == false) { //Si no se encuentra es registrado
                            System.out.println("Ingrese el nombre del participante");
                            nombre=leer.next();
                            System.out.println("Ingrese el apellido del participante");
                            apePar=leer.next();
                            System.out.println("Ingresa la edad del participante");
                            edad=leer.nextInt();
                            objParticipante = new Participante(apePar, edad, nombre, arrParticipante.size()+1);
                            arrParticipante.add(objParticipante);
                        }
                        int cate=0;
                        do{
                            System.out.println("Ingresa la categoria del proyecto");
                            for (int i = 0; i <= 6; i++) {
                                System.out.println(i +", "+arrCat[i-1]);
                                System.out.println("Selecciona una opcion");
                                cate=leer.nextInt();
                                if (cate<1 || cate>6)
                                    System.out.println("Eso no es una categoria");
                            }
                        }while(cate < 1 || cate > 6);
                        cat = arrCat[cate-1];
                        objProyecto = new Proyecto(nomAse, nomPar, cat, nombre, arrParticipante.size()+1);
                        arrProyecto.add(objProyecto);
                    break;
                    case 2://Mostrar
                        for(Proyecto m : arrProyecto){
                            System.out.println("Nombre del proyecto " + m.getNombre());
                            System.out.println("Asesor del proyecto " + m.getNomAse());
                            System.out.println("Autor del proyecto " + m.getNomPar());
                            System.out.println("Categoria del proyecto " + m.getCat());                            
                            System.out.println("ID " + m.getID());
                            System.out.println("--------------------------------");
                        }
                    break;
                    case 3://Actualizar
                        System.out.println("Ingrese la ID del particiepante que quiera actualizar");
                        int act=leer.nextInt();
                        for (Proyecto ac : arrProyecto) {
                            if (ac.getID() == act) {
                                System.out.println("Ingresa el nuevo nombre");
                                ac.setNombre(leer.next());
                                System.out.println("El nombre a sido actualizado correctamente");
                                break;
                            }
                        }
                    break;
                    case 4://Buscar
                        System.out.println("Ingrese la ID del particiepante que quiera buscar");
                        int bus=leer.nextInt();
                        boolean gotcha = false;
                        for (Proyecto ac : arrProyecto) {
                            if (ac.getID() == bus) {
                                gotcha = true;
                                break;
                            }
                        }
                        if (gotcha) {
                            System.out.println("Encontrado");
                        }else{
                            System.out.println("Lo sentimos \nNo existe dentro de la base de datos");
                        }
                    break;
                    case 5://Eliminar
                        System.out.println("Ingrese la ID del particiepante que quiera actualizar");
                        int eli=leer.nextInt();
                        for (Proyecto el : arrProyecto) {
                            if (el.getID() == eli) {
                                arrProyecto.remove(el);
                                break;
                            }
                        }
                    break;
                    case 6://Salir
                    break;
                }
                System.out.println("Desea volver al menu de Juez?? \n1.-Si \n2.-No");
                  opDo = leer.nextInt();
                 }while(opDo!=2);
            break;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        }
        System.out.println("Desea volver al menu? \n1.-Si\n2.-No");
        opDo=leer.nextInt();
       }while(opDo!=2);
    }
}
