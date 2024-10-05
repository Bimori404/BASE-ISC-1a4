package PoliTrabajos;

public class Programador extends Trabajador implements InterfaceTrabajadores{
    int proyecto;

    public Programador(int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        proyecto=0;
    }
    
    public Programador(int proyecto, int horasT, double sueldoBase) {
        super(horasT, sueldoBase);
        this.proyecto = proyecto;
    }

    public int getProyecto() {
        return proyecto;
    }
    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }
    
    public void programar(){
        System.out.println("Ya se programar el \"System.out.println(\"Hola mundo\"); xD");
    }
    
    @Override
    public double cSalario(){
        return horasT * sueldoBase + getProyecto() + 100;
    }
}
