
package test;

public class Multiplicacion {
    int a;
    int b;
    
    public Multiplicacion(){
       a=0;
       b=0;
   }
    public Multiplicacion( int a, int b){
       setA(a);
       setB(b);
   }

    private void setA(int a) {
        this.a=a;
    }
    int getA() {
        return a;
    }

    private void setB(int b) {
        this.b=b;
    }
    private int getB() {
        return b;
    }
    
    public int mult() {
        int mult;
        mult=a*b;
        return mult;
    }
}
