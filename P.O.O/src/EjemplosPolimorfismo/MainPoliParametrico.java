package EjemplosPolimorfismo;

import java.util.Scanner;

public class MainPoliParametrico {
     public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
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
        
     }
}
