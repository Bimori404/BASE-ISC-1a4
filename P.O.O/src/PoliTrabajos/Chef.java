package PoliTrabajos;

public class Chef extends Trabajador implements InterfaceTrabajadores{
    
    int comicionPlatillo;

    public Chef(int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        comicionPlatillo = 0;
    }
    public Chef(int comicionPlatillo, int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        this.comicionPlatillo = comicionPlatillo;
    }

    public int getComicionPlatillo() {
        return comicionPlatillo;
    }
    public void setComicionPlatillo(int comicionPlatillo) {
        this.comicionPlatillo = comicionPlatillo;
    } 
    
    public void Cosinar(){
        System.out.println("Cuantos platillos va aquerer, caballero");
    }
    
    @Override
    public double cSalario(){
        return horasT * sueldoBase + getComicionPlatillo() + 100;
    }
}
