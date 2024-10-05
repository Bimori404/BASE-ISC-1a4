package Papeleria;

public class Empleado extends InfoGen {
    String apeEm, direccion;
    double salario;
    int numtel;

    public Empleado(String apeEm, String direccion, double salario, int numtel, String name, int ID) {
        super(name, ID);
        setApeEm(apeEm);
        setDireccion(direccion);
        setSalario(salario);
        setNumtel(numtel);
    }

    public String getApeEm() {
        return apeEm;
    }
    public void setApeEm(String apeEm) {
        this.apeEm = apeEm;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumtel() {
        return numtel;
    }
    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }
    
    
}
