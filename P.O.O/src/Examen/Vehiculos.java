package Examen;

public class Vehiculos {
    
    String marca, dueño, matricula, tipo;
    float pesoVehiculo;
    int MotorCaballos;

    
    public Vehiculos() {
        marca="";
        dueño="";
        matricula="";
        tipo="";
        pesoVehiculo=(float) 0.0;
    }
    public Vehiculos(String marca, String dueño, String matricula, String tipo, float pesoVehiculo, int MotorCaballos) {
        setMarca(marca);
        setDueño(dueño);
        setMatricula(matricula);
        setTipo(tipo);
        setPesoVehiculo(pesoVehiculo);
        setMotorCaballos(MotorCaballos);
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPesoVehiculo() {
        return pesoVehiculo;
    }
    public void setPesoVehiculo(float pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
    }

    public int getMotorCaballos() {
        return MotorCaballos;
    }
    public void setMotorCaballos(int MotorCaballos) {
        this.MotorCaballos = MotorCaballos;
    }
    
    
    public void MostrarCaracteristicas(){
        System.out.println(" ");
    }
}
