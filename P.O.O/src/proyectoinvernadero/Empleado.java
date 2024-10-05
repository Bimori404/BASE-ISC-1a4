package proyectoinvernadero;

public class Empleado extends InfoGeneral {
    double sueldo;
    int horasT;
    String ocupacion;

    public Empleado() {
        sueldo = 0;
        horasT = 0;
        ocupacion = "";
    }

    public Empleado( int id, String nombre,String apellidoP,int telefono,String marca,String cantidad,double sueldo, int horasT, String ocupacion) {
        super(id,nombre,apellidoP,telefono,marca,cantidad);
        setSueldo(sueldo);
        setHorasT(horasT);
        setOcupacion(ocupacion);
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

}
