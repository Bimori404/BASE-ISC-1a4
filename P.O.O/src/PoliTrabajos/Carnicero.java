package PoliTrabajos;

public class Carnicero extends Trabajador implements InterfaceTrabajadores{
    
    int ComClieAtendidos;

    public Carnicero(int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        ComClieAtendidos = 0;
    }
    public Carnicero(int ComClieAtendidos, int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        this.ComClieAtendidos = ComClieAtendidos;
    }

    public int getComClieAtendidos() {
        return ComClieAtendidos;
    }
    public void setComClieAtendidos(int ComClieAtendidos) {
        this.ComClieAtendidos = ComClieAtendidos;
    }  
    
    public void PesarCarne(){
        System.out.println("Cuantos kilos va a llevar guero?");
    }
    @Override
    public double cSalario(){
        return horasT * sueldoBase + getComClieAtendidos() + 5;
    }
    
}
