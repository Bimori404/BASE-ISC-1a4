
package test;
public class Suma {
    int a;
    int b;
    
    public Suma(){
       a=0;
       b=0;
   }
    public Suma( int a, int b){
       setA(a);
       setB(b);
   }

    private void setA(int a) {
        this.a=a;
    }
    double getA() {
        return a;
    }

    private void setB(int b) {
        this.b=b;
    }
    private int getB() {
        return b;
    }
    
    public int sum() {
        int res;
        res=a+b;
        return res;
    }
}
