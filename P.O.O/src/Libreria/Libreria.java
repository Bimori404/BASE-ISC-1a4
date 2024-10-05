package Libreria;
import java.util.Scanner;
public class Libreria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        String nombre, genero, autor, busqueda, datoActualizado;
        int id = 1, aux = 0, busquedaID = 0;
        boolean encontrado = false;
        Libros arregloLibro[] = new Libros [1000];
        do{
            System.out.println("Bienvenido a la biblioteca \n ¿Que desea hacer el dia de hoy? \n"+
                    "1.- Registrar \n"+"2.- Mostrar \n"+"3.- Actualizar/Corregir \n"+"4.- salir");
            op = leer.nextInt();
            switch(op){
                case 1: //Registrar
                    Libros objLibro;
                    System.out.println("ID "+id);
                    System.out.println("Ingrese nombre: ");
                    nombre = leer.next();
                    System.out.println("Ingrese genero");
                    genero = leer.next();
                    System.out.println("Ingrese autor");
                    autor = leer.next();
                    objLibro = new Libros (nombre, genero, autor, id);
                    id++;
                    if(aux < 1000){
                        arregloLibro[aux] = objLibro;
                        aux++;
                    }else{
                        System.out.println("Libro no registrado");
                    }
                break;
                case 2://Mostrar
                    System.out.println("Ingresa el tipo de busqueda \n"
                    +"1.- Nombre \n"+"2.- Genero \n"+"3.- Autor \n"+"4.- Id \n"+"5.- Mostrar todos");
                    op = leer.nextInt();
                    switch(op){
                        case 1://Nombre
                            System.out.println("Ingrese nombre");
                            busqueda = leer.next();
                            for(int i = 0; 1 < aux; i++){
                            if(busqueda.equals(arregloLibro[1].getNombre())){
                                System.out.println("Nombre: "+arregloLibro[i].getNombre()
                                +"\n Genero: "+arregloLibro[i].getGenero()
                                +"\n Autor: "+arregloLibro[i].getAutor()
                                +"\n Id: "+arregloLibro[i].getId());
                            }
                        }
                        case 2://Genero
                            System.out.println("Ingrese nombre");
                            busqueda = leer.next();
                            for(int i = 0; 1 < aux; i++){
                            if(busqueda.equals(arregloLibro[1].getGenero())){
                                System.out.println("Nombre: "+arregloLibro[i].getNombre()
                                +"\n Genero: "+arregloLibro[i].getGenero()
                                +"\n Autor: "+arregloLibro[i].getAutor()
                                +"\n Id: "+arregloLibro[i].getId());
                            }
                        }
                        break;
                        case 3://Autor
                        System.out.println("Ingrese nombre");
                            busqueda = leer.next();
                            for(int i = 0; 1 < aux; i++){
                            if(busqueda.equals(arregloLibro[1].getAutor())){
                                System.out.println("Nombre: "+arregloLibro[i].getNombre()
                                +"\n Genero: "+arregloLibro[i].getGenero()
                                +"\n Autor: "+arregloLibro[i].getAutor()
                                +"\n Id: "+arregloLibro[i].getId());
                            }
                        }
                        break;
                        case 4://Id
                        System.out.println("Ingrese nombre");
                            busqueda = leer.next();
                            for(int i = 0; 1 < aux; i++){
                            if(busqueda.equals(arregloLibro[1].getId())){
                                System.out.println("Nombre: "+arregloLibro[i].getNombre()
                                +"\n Genero: "+arregloLibro[i].getGenero()
                                +"\n Autor: "+arregloLibro[i].getAutor()
                                +"\n Id: "+arregloLibro[i].getId());
                            }
                        }
                    }
                break;
                case 3://Actualizar/Corregir
                    System.out.println("Ingrese libro a Actualizar/Corregir");
                    busqueda = leer.next();
                    for(int i = 0; i < aux; i++){
                        if(busqueda.equals(arregloLibro[i].getNombre())){
                            encontrado = true;
                            System.out.println("Nombre: "+arregloLibro[i].getNombre()+
                                    "\n Genero: "+arregloLibro[i].getGenero()+
                                    "\n Autor: "+arregloLibro[i].getAutor()+
                                    "\n Id: "+arregloLibro[i].getId());
                        }
                    }
                break;
                case 4://Mostrar todos
                    for(int i = 0; i < aux; i++){
                        System.out.println("Nombre: "+arregloLibro[i].getNombre()+
                                "\n Genero: "+arregloLibro[i].getGenero()+
                                "\n Autor: "+arregloLibro[i].getAutor()+
                                "\n Id: "+arregloLibro[i].getId());
                    }
                break;
            }
        }while(op != 5);
    }
}