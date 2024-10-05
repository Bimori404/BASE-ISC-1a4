package Papeleria;

public class Gerente extends InfoGen {
    String apeGe, direccion;
    double salario;
    int numtel;

    public Gerente(String apeGe, String direccion, double salario, int numtel, String name, int ID) {
        super(name, ID);
        setApeGe(apeGe);
        setDireccion(direccion);
        setSalario(salario);
        setNumtel(numtel);
    }

    public String getApeGe() {
        return apeGe;
    }
    public void setApeGe(String apeGe) {
        this.apeGe = apeGe;
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
