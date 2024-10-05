package Herencia;
import java.util.Scanner;
public class HerenciaBasica {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        int op;
        System.out.println("-Sistema de registro de mascotas-");
        System.out.println("Elija la opcion correspondiente\n1.-Perro\n2.-Gato\n3.-Perico\n4.-Pez\n5.-Tortuga\n6.-Caballo");
        op=leer.nextInt();
        switch(op){
            case 1:
                Perro objPerro=new Perro();
                System.out.println("Como se llama usted");
                objPerro.nomDue=leer.next();
                System.out.println("Como se llama su mascota");
                objPerro.nombre=leer.next();
                System.out.println("Que raza es su perro");
                objPerro.raza=leer.next();
                Perro objPerro1=new Perro(objPerro.nombre, objPerro.nomDue, objPerro.raza);
                System.out.println("Bienvenido "+objPerro1.nomDue+", su mascota se llama "+objPerro1.nombre+
                                               " y es de raza "+objPerro1.raza);
            break;
            case 2:
                Gato objGato=new Gato();
                System.out.println("Como se llama usted");
                objGato.nomDue=leer.next();
                System.out.println("Como se llama su mascota");
                objGato.nombre=leer.next();
                System.out.println("Cuantas vidas cree que tiene actualmente");
                objGato.numvidas=leer.nextInt();
                Gato objGato1=new Gato(objGato.nombre, objGato.nomDue, objGato.numvidas);
                System.out.println("Bienvenido "+objGato1.nomDue+", su mascota se llama "+objGato1.nombre+
                                               " y le quedan "+objGato1.numvidas+" vidas");
            break;
            case 3:
                Perico objPerico=new Perico();
                System.out.println("Como se llama usted");
                objPerico.nomDue=leer.next();
                System.out.println("Como se llama su mascota");
                objPerico.nombre=leer.next();
                System.out.println("Su perico habla");
                objPerico.habla=leer.nextBoolean();
                Perico objPerico1=new Perico(objPerico.nombre, objPerico.nomDue, objPerico.habla);
                System.out.println("Bienvenido "+objPerico1.nomDue+", su mascota se llama "+objPerico1.nombre+
                                               " y el "+objPerico1.habla+" habla");
            break;
            case 4:
                Pez objPez=new Pez();
                System.out.println("Como se llama usted");
                objPez.nomDue=leer.next();
                System.out.println("Como se llama su mascota");
                objPez.nombre=leer.next();
                System.out.println("Que especie es su pez");
                objPez.especie=leer.next();
                System.out.println("De que tamaño es su pez");
                objPez.tamaño=leer.nextInt();
                Pez objPez1=new Pez(objPez.nombre, objPez.nomDue, objPez.especie,objPez.tamaño);
                System.out.println("Bienvenido "+objPez1.nomDue+", su mascota se llama "+objPez1.nombre+", su tamaño es de "
                                                +objPez1.tamaño+"cm y es de la especie "+objPez1.especie);
            break;
            case 5:
                Tortuga objTortuga=new Tortuga();
                System.out.println("Como se llama usted");
                objTortuga.nomDue=leer.next();
                System.out.println("Como se llama su mascota");
                objTortuga.nombre=leer.next();
                System.out.println("De que tipo es su tortuga");
                objTortuga.tipo=leer.next();
                Tortuga objTortuga1=new Tortuga(objTortuga.nomDue,objTortuga.nombre, objTortuga.tipo);
                System.out.println("Bienvenido "+objTortuga1.nomDue+", su mascota se llama "+objTortuga1.nombre+
                                               " y es del tipo "+objTortuga1.tipo);
            break;
            case 6:
                Caballo objCaballo=new Caballo();
                System.out.println("Como se llama usted");
                objCaballo.nomDue=leer.next();
                System.out.println("Como se llama su mascota");
                objCaballo.nombre=leer.next();
                System.out.println("De que color en especifico es su caballo");
                objCaballo.color=leer.next();
                Caballo objCaballo1=new Caballo(objCaballo.nomDue,objCaballo.nombre, objCaballo.color);
                System.out.println("Bienvenido "+objCaballo1.nomDue+", su mascota se llama "+objCaballo1.nombre+
                                               " y es de color "+objCaballo1.color);
            break;
        }
        
    } 
}
