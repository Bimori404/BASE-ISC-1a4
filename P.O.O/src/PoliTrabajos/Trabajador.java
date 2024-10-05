 package PoliTrabajos;

public class Trabajador {
    int horasT;
    double sueldoBase;

    public Trabajador(int horasT, double sueldoBase) {
        setHorasT(horasT);
        setSueldoBase(sueldoBase);
    }

    
    public int getHorasT() {
        return horasT;
    }
    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
    
    
}
