package farmacia;
public class Farmacia {
    double sueldoBase;

    public Farmacia(double sueldoBase){
        setSueldoBase(sueldoBase);
    }
    
    public Farmacia(){
        setSueldoBase(0);
    }
    
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
}
