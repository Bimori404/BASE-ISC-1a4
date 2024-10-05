package farmacia;

public class Empleado extends InfoGral {

    int numEmpleado;
    double sueldo;
    int horasT;

    public Empleado() {
        setNumEmpleado(0);
        setSueldo(0);
        setHorasT(0);
    }

    public Empleado(String nombre, int edad, String apellidoM, String apellidoP, String numTelefono, String calle,
            String col, String ciudad, double sueldoBase, int numEmpleado, double sueldo, int horasT) {
        super(nombre, edad, apellidoM, apellidoP, numTelefono, calle, col, ciudad);
        setNumEmpleado(numEmpleado);
        setHorasT(horasT);
        setSueldo(sueldo);
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

}
