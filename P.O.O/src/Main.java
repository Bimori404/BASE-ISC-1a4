
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        int op, opDo;
        do{
        System.out.println("Progrma para calcular areas"
                          +"\n1.-Cuadrado\n2.-Rectangulo"
                          +"\n3.-Triangulo\n4.-Circulo");
            op=leer.nextInt();
            
        Figura objFigura=new Figura();
        Figura refFigura = new Figura();
        
        switch(op){
            case 1:
                Cuadrado objCuadrado = new Cuadrado();
                System.out.println("Ingrese el lado");
                objCuadrado.setBase(leer.nextInt());
                refFigura = objCuadrado;
                int areaCuadrado = refFigura.calcArea();
                System.out.println("El area del cuadrado es: " + areaCuadrado);
            break;
            case 2:
                Rectangulo objRectangulo = new Rectangulo();
                System.out.println("Ingrese el lado");
                objRectangulo.setBase(leer.nextInt());
                System.out.println("Ingrese la altura");
                objRectangulo.setAltura(leer.nextInt());
                refFigura = objRectangulo;
                int areaRectangulo = refFigura.calcArea();
                System.out.println("El area del rectangulo es: " + areaRectangulo);
            break;
            case 3:
                Triangulo objTriangulo = new Triangulo();
                System.out.println("Ingrese la base");
                objTriangulo.setBase(leer.nextInt());
                System.out.println("Ingrese la altura");
                objTriangulo.setAltura(leer.nextInt());
                refFigura = objTriangulo;
                int areaTriangulo = refFigura.calcArea();
                System.out.println("El area del rectangulo es: " + areaTriangulo);
            break;
            case 4:
                Circulo objCirculo = new Circulo();
                System.out.println("Ingrese la base");
                objCirculo.setRadio(leer.nextInt());
                refFigura = objCirculo;
                int areaCirculo = refFigura.calcArea();
                System.out.println("El area del rectangulo es: " + areaCirculo);
            break;
          }
        System.out.println("\nDesea realizar otra operacion\n1.-Si\n2.-No");
      opDo = leer.nextInt();
     }while( opDo == 1 );
    System.out.println("Hasta pronto c:");
  }
}
