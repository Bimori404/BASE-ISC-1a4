package PoliInclucion;

import java.util.Scanner;

public class PoliInclucion {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int op, opDo;
        do{
            System.out.println("Progrma para calcular areas"
                          +"\n1.-Cuadrado\n2.-Rectangulo"
                          +"\n3.-Triangulo\n4.-Circulo"
                          +"\n5.-Trapecio\n6.-Pentagono");
            op = leer.nextInt();
            switch(op){
                case 1:
                    Cuadrado refCuadrado = new Cuadrado();
                    Cuadrado objCuadrado = new Cuadrado();
                    System.out.println("Ingrese el lado");
                    objCuadrado.setLado(leer.nextInt());
                    refCuadrado = objCuadrado;
                    double areaCuadrado = refCuadrado.cArea();
                    double arCuadrado = refCuadrado.cPerimetro();
                    System.out.println("El area del cuadrado es: " +areaCuadrado);
                    System.out.println("El perimetro del cuadrado es: "+arCuadrado);
                break;
                case 2:
                    Rectangulo refRectangulo = new Rectangulo();
                    Rectangulo objRectangulo = new Rectangulo();
                    System.out.println("Ingrese la base");
                    objRectangulo.setBase(leer.nextInt());
                    System.out.println("Ingrese la altura");
                    objRectangulo.setAltura(leer.nextInt());
                    refRectangulo = objRectangulo;
                    double areaRectangulo = refRectangulo.cArea();
                    double arRectangulo = refRectangulo.cPerimetro();
                    System.out.println("El area del rectangulo es: " + areaRectangulo);
                    System.out.println("El perimetro del rectangulo es: "+arRectangulo);
                break;
                case 3:
                    Triangulo refTriangulo = new Triangulo();
                    Triangulo objTriangulo = new Triangulo();
                    System.out.println("Ingrese la base");
                    objTriangulo.setBase(leer.nextInt());
                    System.out.println("Ingrese la altura");
                    objTriangulo.setAltura(leer.nextInt());
                    System.out.println("Ingrese la medida de sus lados");
                    objTriangulo.setLado(leer.nextInt());
                    refTriangulo = objTriangulo;
                    double areaTriangulo = refTriangulo.cArea();
                    double arTriangulo = refTriangulo.cPerimetro();
                    System.out.println("El area del triangulo es: " + areaTriangulo);
                    System.out.println("El perimetro del triangulo es: "+arTriangulo);
                break;
                case 4:
                    Circulo refCirculo = new Circulo();
                    Circulo objCirculo = new Circulo();
                    System.out.println("Ingrese el radio");
                    objCirculo.setRadio(leer.nextInt());
                    refCirculo = objCirculo;
                    double areaCirculo = refCirculo.cArea();
                    double arCirculo = refCirculo.cPerimetro();
                    System.out.println("El area del circulo es: " + areaCirculo);
                    System.out.println("El perimetro del circulo es: "+arCirculo);
                break;
                case 5:
                    Trapecio refTrapecio = new Trapecio();
                    Trapecio objTrapecio = new Trapecio();
                    System.out.println("Ingrese la altura");
                    objTrapecio.setAltura(leer.nextDouble());
                    System.out.println("Ingrese la base menor");
                    objTrapecio.setBaseMe(leer.nextInt());
                    System.out.println("Ingrese la base mayor");
                    objTrapecio.setBaseMa(leer.nextInt());
                    System.out.println("Ingrese el lado a");
                    objTrapecio.setLadoA(leer.nextInt());
                    System.out.println("Ingrese el lado b");
                    objTrapecio.setLadoA(leer.nextInt());
                    refTrapecio = objTrapecio;
                    double areaTrapecio = refTrapecio.cArea();
                    double arTrapecio = refTrapecio.cPerimetro();
                    System.out.println("El area del trapecio es: " + areaTrapecio);
                    System.out.println("El perimetro del trapecio es: "+arTrapecio);
                break;
                case 6:
                    Pentagono refPentagono = new Pentagono();
                    Pentagono objPentagono = new Pentagono();
                    System.out.println("Ingrese el apotema");
                    objPentagono.setApotema(leer.nextInt());
                    System.out.println("Ingrese la medida de sus lados");
                    objPentagono.setMedlado(leer.nextDouble());
                    refPentagono = objPentagono;
                    double areaPentagono = refPentagono.cArea();
                    double arPentagono = refPentagono.cPerimetro();
                    System.out.println("El area del pentagono es: " + areaPentagono);
                    System.out.println("El perimetro del pentagono es: "+arPentagono);
                break;
            }
         System.out.println("\nDesea realizar otra operacion\n1.-Si\n2.-No");
        opDo = leer.nextInt();
        }while( opDo == 1 );
    }
    
}
