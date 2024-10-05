package SegundaOportunidad;

public class Empleado extends Persona {
    
    double sueldoxHora;
    int id, horasT;

    public Empleado() {
        id=0;
        horasT=0;
        sueldoxHora=0.0;
    }

    public Empleado(double sueldoxHora, int id, int horasT, String nombre, String apeP, String apeM, long numTel) {
        super(nombre, apeP, apeM, numTel);
        setSueldoxHora(sueldoxHora);
        setId(id);
        setHorasT(horasT);
    }

    public double getSueldoxHora() {
        return sueldoxHora;
    }
    public void setSueldoxHora(double sueldoxHora) {
        this.sueldoxHora = sueldoxHora;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getHorasT() {
        return horasT;
    }
    public void setHorasT(int hrasT) {
        this.horasT = hrasT;
    }

    public double cSalario(){
        return (horasT * sueldoxHora)/ 7;
    }
    
}
