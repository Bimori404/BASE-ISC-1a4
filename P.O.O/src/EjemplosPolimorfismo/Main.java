package EjemplosPolimorfismo;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---Polimorfismo basico---");
        Animal objAnimal=new Perro();
        Animal objDog=new Perro();
        Animal objCat=new Gato();
        objAnimal.HaceRuido();
        objDog.HaceRuido();
        objCat.HaceRuido();
        
        System.out.println(" ");
        System.out.println("---Polimorfismo parametrico---");
        double res;
        PoliParametrico Objeto= new PoliParametrico();
        System.out.println("Arroja el valor entero dado a ´A´ ");
        Objeto.calculo(10);
        System.out.println("Arroja el valor multiplicado de ´A´ por ´B´ ");
        Objeto.calculo(10, 20);
        System.out.println("Arroja el valor double dado a ´A´ ");
        res = Objeto.calculo(5.5);
        System.out.println("Arroja el valor de una operacion retorneda(multiplicacion) con el dato double anterior ");
        System.out.println("O/P "+res);
        
        System.out.println(" ");
        System.out.println("---Polimorfismo de inclucion---");
        
        int op;
            System.out.println("Progrma para calcular areas"
                          +"\n1.-Cuadrado\n2.-Circulo\n3.-Pentagono");
            
                    Cuadrado refCuadrado = new Cuadrado();
                    Cuadrado objCuadrado = new Cuadrado();
                    System.out.println("Ingrese el lado");
                    objCuadrado.setLado(leer.nextInt());
                    refCuadrado = objCuadrado;
                    double areaCuadrado = refCuadrado.cArea();
                    double arCuadrado = refCuadrado.cPerimetro();
                    System.out.println("El area del cuadrado es: " +areaCuadrado);
                    System.out.println("El perimetro del cuadrado es: "+arCuadrado);
            System.out.println(" ");
                    Circulo refCirculo = new Circulo();
                    Circulo objCirculo = new Circulo();
                    System.out.println("Ingrese el radio");
                    objCirculo.setRadio(leer.nextInt());
                    refCirculo = objCirculo;
                    double areaCirculo = refCirculo.cArea();
                    double arCirculo = refCirculo.cPerimetro();
                    System.out.println("El area del circulo es: " + areaCirculo);
                    System.out.println("El perimetro del circulo es: "+arCirculo);
            System.out.println(" ");
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
    }
}
