package TiendaDeTelefonia;

public class Empleado extends Persona {
    int codempleado;
    int ventas;
    double sueldo;

    public Empleado() {
        codempleado=0;
        ventas=0;
        sueldo=0.0;
    }
    public Empleado(String nombre, String apeP, String apeM, String calle, String col, int edad, int ventas, double sueldo, int codempleado) {
        super(nombre, apeP, apeM, calle, col, edad);
        setCodempleado(codempleado);
        setVentas(ventas);
        setSueldo(sueldo);
    }
    
    public int getCodempleado() {
        return codempleado;
    }
    public void setCodempleado(int codempleado) {
        this.codempleado = codempleado;
    }

    public int getVentas() {
        return ventas;
    }
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void Print(){//Esto se usa para mandar los siguientes parametros y ahorrarnos codigo en la clase main
        System.out.println("EMP"+this.codempleado);
        
    }
}
