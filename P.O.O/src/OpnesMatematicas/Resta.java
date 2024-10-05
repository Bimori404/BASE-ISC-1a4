
package test;

public class Resta {
    int a;
    int b;
    
    public Resta(){
       a=0;
       b=0;
   }
    public Resta( int a, int b){
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
    
    public int res() {
        int res;
        res=a-b;
        return res;
    }
}

