
package Clases;
import java.util.Scanner;
public class ClaseMain {
     public static void main(String[]args){
        int op;
        Scanner objLeer=new Scanner(System.in);
        System.out.println("Objetos.....");
        System.out.println("1.-Clase Alumno");
        System.out.println("2.-Clase Arbol");
        System.out.println("3.-Clase Cafeteria");
        System.out.println("4.-Clase Cancion");
        System.out.println("5.-Clase Corrector");
        System.out.println("6.-Clase Cuaderno");
        System.out.println("7.-Clase Deporte");
        System.out.println("8.-Clase Estado");
        System.out.println("9.-Clase Figura");
        System.out.println("10.-Clase Ladron");
        System.out.println("11.-Clase Maestro");
        System.out.println("12.-Clase Mesa");
        System.out.println("13.-Clase Pintura");
        System.out.println("14.-Clase Planeta");
        System.out.println("15.-Clase Prima");
        System.out.println("16.-Clase Serillo");
        System.out.println("17.-Clase Tacos");
        System.out.println("18.-Clase Terreno");
        System.out.println("19.-Clase Tomate");
        System.out.println("20.-Clase Universidad");
        System.out.println("Escoge una clase para ver sus caracteristicas..");
        op=objLeer.nextInt();
        switch(op){
            case 1:
                Alumno obj1 = new Alumno();
                System.out.println("la inf de tu objeto sin parametros es: "+
                        "\n"+obj1.getNombre()+"\n"+obj1.getEdad()+
                        "\n"+obj1.getGrado()+"\n"+obj1.getMaterias()+"\n"+obj1.getAltura());
            
                System.out.println("Ingresa tu nombre: ");
            obj1.nombre = objLeer.next();
            System.out.println("Ingresa tu edad: ");
            obj1.edad = objLeer.nextInt();
            System.out.println("Ingresa tu estatura: ");
            obj1.altura = objLeer.nextDouble();
            Alumno obj1A = new Alumno(obj1.nombre,obj1.edad,obj1.altura,obj1.materias,obj1.grado);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj1A.getNombre()+"\n"+obj1A.getEdad()+"\n"+obj1A.getAltura()+
                    "\n"+obj1A.getGrado()+"\n"+obj1A.getMaterias());
            break;
            case 2:
                Arbol obj2 = new Arbol();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj2.getNombre()+"\n"+obj2.getAltura()+
                        "\n"+obj2.getTipo()+""+obj2.getAnchura());
                
                System.out.println("Ingresa su nombre: ");
            obj2.nombre = objLeer.next();
            System.out.println("Ingresa su tipo: ");
            obj2.tipo = objLeer.next();
            System.out.println("Ingresa su anchura: ");
            obj2.altura = objLeer.nextDouble();
            System.out.println("Ingresa su altura: ");
            obj2.altura = objLeer.nextDouble();
            Arbol obj2A = new Arbol(obj2.nombre,obj2.tipo,obj2.altura,obj2.anchura);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj2A.getNombre()+"\n"+obj2A.getTipo()+"\n"+obj2A.getAltura()+
                    "\n"+obj2A.getAnchura());
            break;
            case 3:
                Cafeteria obj3 = new Cafeteria();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj3.getNombre()+"\n"+obj3.getArticulo()+"\n"+obj3.getCosto());
                
                System.out.println("Ingresa su nombre: ");
            obj3.nombre = objLeer.next();
            System.out.println("Ingresa un articulo: ");
            obj3.articulo = objLeer.next();
            System.out.println("Ingresa su costo: ");
            obj3.costo = objLeer.nextInt();
            Cafeteria obj3A = new Cafeteria(obj3.nombre,obj3.costo,obj3.articulo);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj3A.getNombre()+"\n"+obj3A.getCosto()+"\n"+obj3A.getArticulo());
            break;
            case 4:
                Cancion obj4 = new Cancion();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj4.getNombre()+"\n"+obj4.getAño()+"\n"+obj4.getDuracion()+
                        "\n"+obj4.getArtista()+"\n"+obj4.getGenero());
                
                System.out.println("Ingresa su nombre: ");
            obj4.nombre = objLeer.next();
            System.out.println("Ingresa su año: ");
            obj4.año = objLeer.nextInt();
            System.out.println("Ingresa su duracion: ");
            obj4.duracion = objLeer.nextInt();
            System.out.println("Ingresa su artista: ");
            obj4.artista = objLeer.next();
            System.out.println("Ingresa su genero: ");
            obj4.genero = objLeer.next();
            Cancion obj4A = new Cancion(obj4.nombre,obj4.año,obj4.duracion,obj4.artista,obj4.genero);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj4A.getNombre()+"\n"+obj4A.getAño()+"\n"+obj4A.getDuracion()+
                    "\n"+obj4A.getArtista()+"\n"+obj4A.getGenero());
            break;
            case 5:
                Corrector obj5 = new Corrector();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj5.getMarcaArticulo()+"\n"+obj5.getContNeto());
                
                System.out.println("Ingresa su marca: ");
            obj5.marca = objLeer.next();
            System.out.println("Ingresa su contenido(ml): ");
            obj5.cont = objLeer.nextDouble();
            Corrector obj5A = new Corrector(obj5.marca,obj5.cont);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj5A.getContNeto()+"\n"+obj5A.getMarcaArticulo());
            break;
            case 6:
                Cuaderno obj6 = new Cuaderno();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj6.getColor()+"\n"+obj6.getMarca()+
                        "\n"+obj6.getTipo()+"\n"+obj6.getNumHojas());
                
                System.out.println("Ingresa su marca: ");
            obj6.marca = objLeer.next();
            System.out.println("Ingresa su color: ");
            obj6.color = objLeer.next();
            System.out.println("Ingresa su tipo: ");
            obj6.tipo = objLeer.next();
            System.out.println("Ingresa su numero de hojas: ");
            obj6.numHojas = objLeer.nextInt();
            Cuaderno obj6A = new Cuaderno(obj6.tipo,obj6.numHojas,obj6.marca,obj6.color);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj6A.getTipo()+"\n"+obj6A.getColor()+
                    "\n"+obj6A.getNumHojas()+"\n"+obj6A.getMarca());
            break;
            case 7:
                Deporte obj7 = new Deporte();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj7.getNombre()+"\n"+obj7.getTipo()+"\n"+obj7.getIntegrantes());
                
                System.out.println("Ingresa su nombre: ");
            obj7.nombre = objLeer.next();
            System.out.println("Ingresa su tipo: ");
            obj7.tipo = objLeer.next();
            System.out.println("Ingresa su numero de integrantes: ");
            obj7.integrantes = objLeer.nextInt();
            Deporte obj7A = new Deporte(obj7.nombre,obj7.integrantes,obj7.tipo);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj7.getNombre()+"\n"+obj7.getTipo()+"\n"+obj7.getIntegrantes());
            break;
            case 8:
                Estado obj8 = new Estado();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj8.getNombre()+"\n"+obj8.getClima()+"\n"+obj8.getArea());
                
                System.out.println("Ingresa su nombre: ");
            obj8.nombre = objLeer.next();
            System.out.println("Ingresa su area: ");
            obj8.area = objLeer.nextDouble();
            System.out.println("Ingresa su clima: ");
            obj8.clima = objLeer.next();
            Estado obj8A = new Estado(obj8.nombre,obj8.area,obj8.clima);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj8.getNombre()+"\n"+obj8.getClima()+"\n"+obj8.getArea());
            break;
            case 9:
                Figura obj9 = new Figura();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj9.getNombre()+"\n"+obj9.getColor()+"\n"+obj9.getArea()+
                        "\n"+obj9.getBase()+"\n"+obj9.getAltura());
                
                System.out.println("Ingresa su nombre: ");
            obj9.nombre = objLeer.next();
            System.out.println("Ingresa su area: ");
            obj9.area = objLeer.nextDouble();
            System.out.println("Ingresa su altura: ");
            obj9.altura = objLeer.nextInt();
            System.out.println("Ingresa su base: ");
            obj9.base = objLeer.nextInt();
            Figura obj9A = new Figura(obj9.nombre,obj9.area,obj9.altura,obj9.base);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj9.getNombre()+"\n"+obj9.getColor()+"\n"+obj9.getArea()+
                    "\n"+obj9.getBase()+"\n"+obj9.getAltura());
            break;
            case 10:
                Ladron obj10 = new Ladron();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj10.getNombre()+"\n"+obj10.getCaract()+"\n"+obj10.getAltura());
                
                System.out.println("Ingresa su nombre: ");
            obj10.nombre = objLeer.next();
            System.out.println("Ingresa una caracteristica fisica: ");
            obj10.caract = objLeer.next();
            System.out.println("Ingresa su altura estimada: ");
            obj10.altura = objLeer.nextDouble();
            Ladron obj10A = new Ladron(obj10.nombre,obj10.caract,obj10.altura);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj10.getNombre()+"\n"+obj10.getCaract()+"\n"+obj10.getAltura());
            break;
            case 11:
                Maestro obj11 = new Maestro();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj11.getNombre()+"\n"+obj11.getEdad()+
                        "\n"+obj11.getAltura()+"\n"+obj11.getAsignatura());
                
                System.out.println("Ingresa tu nombre: ");
            obj11.nombre = objLeer.next();
            System.out.println("Ingresa tu edad: ");
            obj11.edad = objLeer.nextInt();
            System.out.println("Ingresa tu estatura: ");
            obj11.altura = objLeer.nextDouble();
            Maestro obj11A = new Maestro(obj11.nombre,obj11.edad,obj11.altura,obj11.asignatura);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj11.getNombre()+"\n"+obj11.getEdad()+
                     "\n"+obj11.getAltura()+"\n"+obj11.getAsignatura());
            break;
            case 12:
                Mesa obj12 = new Mesa();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj12.getTipoMesa()+"\n"+obj12.getMaterial()+"\n"+obj12.getPrecio());
                
                System.out.println("Ingresa su tipo: ");
            obj12.tipoMesa = objLeer.next();
            System.out.println("Ingresa su material: ");
            obj12.material = objLeer.next();
            System.out.println("Ingresa su precio: ");
            obj12.precio = objLeer.nextDouble();
            Mesa obj12A = new Mesa(obj12.material,obj12.tipoMesa,obj12.precio);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj12.getTipoMesa()+"\n"+obj12.getMaterial()+"\n"+obj12.getPrecio());
            break;
            case 13:
                Pintura obj13 = new Pintura();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj13.getNombre()+"\n"+obj13.getAñoCreacion()+"\n"+obj13.getMedida());
                
                System.out.println("Ingresa tu nombre: ");
            obj13.nombre = objLeer.next();
            System.out.println("Ingresa su año de creacion: ");
            obj13.añocreacion = objLeer.nextInt();
            System.out.println("Ingresa su medida: ");
            obj13.medida = objLeer.nextDouble();
            Pintura obj13A = new Pintura(obj13.nombre,obj13.añocreacion,obj13.medida);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj13.getNombre()+"\n"+obj13.getAñoCreacion()+"\n"+obj13.getMedida());
                    
            break;
            case 14:
                Planeta obj14 = new Planeta();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj14.getNombre()+"\n"+obj14.getAtmosfera()+"\n"+obj14.getColor()+
                        "\n"+obj14.getDistancia()+"\n"+obj14.getMasa());
                
                System.out.println("Ingresa su nombre: ");
            obj14.nombre = objLeer.next();
            System.out.println("Ingresa su atmosfera: ");
            obj14.atmosfera = objLeer.next();
            System.out.println("Ingresa su color: ");
            obj14.color = objLeer.next();
            System.out.println("Ingresa su distancia: ");
            obj14.distancia = objLeer.nextDouble();
            System.out.println("Ingresa su masa: ");
            obj14.masa = objLeer.nextDouble();
            Planeta obj14A = new Planeta(obj14.nombre,obj14.color,obj14.atmosfera,obj14.masa,obj14.distancia);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj14.getNombre()+"\n"+obj14.getAtmosfera()+"\n"+obj14.getColor()+
                        "\n"+obj14.getDistancia()+"\n"+obj14.getMasa());
            break;
            case 15:
                Prima obj15 = new Prima();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj15.getActitud()+"\n"+obj15.getEdad()+"\n"+obj15.getNombre()+"\n"+obj15.getAltura());
                
                System.out.println("Ingresa su nombre: ");
            obj15.nombre = objLeer.next();
            System.out.println("Ingresa su actitud: ");
            obj15.actitud = objLeer.next();
            System.out.println("Ingresa su edad: ");
            obj15.edad = objLeer.nextInt();
            System.out.println("Ingresa su estatura: ");
            obj15.altura = objLeer.nextDouble();
            Prima obj15A = new Prima(obj15.nombre,obj15.edad,obj15.altura,obj15.actitud);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj15.getActitud()+"\n"+obj15.getEdad()+"\n"+obj15.getNombre()+"\n"+obj15.getAltura());
            break;
            case 16:
                Serillo obj16 = new Serillo();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj16.getMarca()+"\n"+obj16.getContCaja());
                
                System.out.println("Ingresa su marca: ");
            obj16.marca = objLeer.next();
            System.out.println("Ingresa su contenido(piezas): ");
            obj16.contenidocaja = objLeer.nextInt();
            Serillo obj16A = new Serillo(obj16.marca,obj16.contenidocaja);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                        "\n"+obj16.getMarca()+"\n"+obj16.getContCaja());
                    
            break;
            case 17:
                Tacos obj17 = new Tacos();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj17.getContenido()+"\n"+obj17.getTortilla()+"\n"+obj17.getCosto());
                
                System.out.println("Ingresa su contenido: ");
            obj17.contenido = objLeer.next();
            System.out.println("Ingresa su tipo de tortilla: ");
            obj17.tortilla = objLeer.next();
            System.out.println("Ingresa su costo: ");
            obj17.costo = objLeer.nextInt();
            Tacos obj17A = new Tacos(obj17.contenido,obj17.tortilla,obj17.costo);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                    "\n"+obj17.getContenido()+"\n"+obj17.getTortilla()+"\n"+obj17.getCosto());
            break;
            case 18:
                Terreno obj18 = new Terreno();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj18.getMedSolar()+"\n"+obj18.getContSolar());
                
                System.out.println("Ingresa la medida del solar: ");
            obj18.medsolar = objLeer.nextDouble();
            System.out.println("Ingresa el contenido del solar: ");
            obj18.contsolar = objLeer.next();
            Terreno obj18A = new Terreno(obj18.contsolar,obj18.medsolar);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                        "\n"+obj18.getMedSolar()+"\n"+obj18.getContSolar());
            break;
            case 19:
                Tomate obj19 = new Tomate();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj19.getDias()+"\n"+obj19.getPeso()+"\n"+obj19.getColorTomate());
                
                System.out.println("Ingresa el color: ");
            obj19.color = objLeer.next();
            System.out.println("Ingresa el peso(kg): ");
            obj19.peso = objLeer.nextDouble();
            System.out.println("Ingresa los dias que tiene cosechado: ");
            obj19.dias = objLeer.nextInt();
            Tomate obj19A = new Tomate(obj19.color,obj19.dias,obj19.peso);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                        "\n"+obj19.getDias()+"\n"+obj19.getPeso()+"\n"+obj19.getColorTomate());
            break;
            case 20:
                Universidad obj20 = new Universidad();
                System.out.println("la inf de tu objeto: "+
                        "\n"+obj20.getSalones()+"\n"+obj20.getDensTerreno());
                
                System.out.println("Ingresa la medida aproximada del terreno: ");
            obj20.densTerreno = objLeer.nextDouble();
            System.out.println("Ingresa el cuantos salones tiene: ");
            obj20.salones = objLeer.nextInt();
            Universidad obj20A = new Universidad(obj20.salones,obj20.densTerreno);
            System.out.println("La inf del objeto Alumno con parametros es: "+
                        "\n"+obj20.getSalones()+"\n"+obj20.getDensTerreno());
            break;    
        }
    }
}
