
package test;
public class Divicion {
    double a;
    double b;
    
    public Divicion(){
       a=0.0;
       b=0.0;
   }
    public Divicion( double a, double b){
       setA(a);
       setB(b);
   }

    public void setA(double a) {
        this.a=a;
    }
    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b=b;
    }
    public double getB() {
        return b;
    }
    
    public double div() {
        double div;
        div=a/b;
        return div;
    }
}
