package FlujoArchivosFerreteria;

public class Trabajador extends Info {
    
    int numTrabajador;
    double salario;

    public Trabajador() {
        numTrabajador = 0;
        salario = 0.0;
    }
    public Trabajador(String nombre, String tipo,int numTrabajador, double salario) {
        super(nombre, tipo);
        setNumTrabajador(numTrabajador);
        setSalario(salario);
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }
    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
