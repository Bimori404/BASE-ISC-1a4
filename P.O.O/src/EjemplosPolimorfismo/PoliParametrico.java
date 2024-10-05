package EjemplosPolimorfismo;

public class PoliParametrico {
    void calculo(int a){
        System.out.println( a );
    }
    
    void calculo(int a, int b){
        System.out.println( a*b );
    }
    
    double calculo(double a){
        System.out.println( a );
        return a*a;
    }
}
