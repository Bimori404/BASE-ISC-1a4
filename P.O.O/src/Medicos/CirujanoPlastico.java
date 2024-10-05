package Medicos;

public class CirujanoPlastico extends Doctor implements Accion {

    int numImplantes;
    double calidadImplante;
    double r;
    
    public CirujanoPlastico() {
        numImplantes = 0;
        calidadImplante = 0;
        r=0;
    }
    public CirujanoPlastico(int cedula, String nombre, int numImplante, double calidadImplante) {
        super(cedula, nombre);
        setNumImplantes(numImplantes);
        setCalidadImplante(calidadImplante);
    }
    
    public int getNumImplantes() {
        return numImplantes;
    }
    public void setNumImplantes(int numImplantes) {
        this.numImplantes = numImplantes;
    }

    public double getCalidadImplante() {
        return calidadImplante;
    }
    public void setCalidadImplante(double calidadImplante) {
        this.calidadImplante = calidadImplante;
    }
    

    @Override
    public double cHonorario() {
        r=(numImplantes*calidadImplante)*500;
        return r;
    }
    @Override
    public void operar() {
        System.out.println("Su numero de cedula es");
        System.out.println(cedula);
        System.out.println("Su nombres es");
        System.out.println(nombre);
    }

}
