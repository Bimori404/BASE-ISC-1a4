package PoliTrabajos;

public class Taxista extends Trabajador implements InterfaceTrabajadores{

    double cobroKm;

    public Taxista(int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        cobroKm = 0.0;
    }
    
    public Taxista(double cobroKm, int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        this.cobroKm = cobroKm;
    }

    public double getCobroKm() {
        return cobroKm;
    }
    public void setCobroKm(double cobroKm) {
        this.cobroKm = cobroKm;
    }
    
    public void Transportar(){
        System.out.println("Hasta onde lo llevo, jefe");
    }
    @Override
    public double cSalario(){
        return horasT * sueldoBase + getCobroKm() + 20;
    }
}
