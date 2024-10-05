package Tiendita;
public class Empleado extends InfoGen {
    int numempleado, horasT;
    double sueldo;

    public Empleado() {
        numempleado=0;
        horasT=0;
        sueldo=0.0;
    }

    public Empleado(String nombre, String apeP, String apeM, String calle, String col, String cd, String num, int edad, int cp, long numcontact, int numempleado, int horasT, double sueldo) {
        super(nombre, apeP, apeM, calle, col, cd, num, edad, cp, numcontact);
        setNumempleado(numempleado);
        setHorasT(horasT);
        setSueldo(sueldo);
    }

    public int getNumempleado() {
        return numempleado;
    }
    public void setNumempleado(int numempleado) {
        this.numempleado = numempleado;
    }

    public int getHorasT() {
        return horasT;
    }
    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double getobtenerSalario() {
        double res=0;
        res=horasT*sueldo;
        return res;
    }
}
