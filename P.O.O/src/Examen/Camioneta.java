package Examen;

public class Camioneta extends Vehiculos {

    int cargaMaxima;

    public Camioneta(boolean descapotable) {
        descapotable = false;
    }

    public Camioneta(int cargaMaxima, String marca, String dueño, String matricula, String tipo, float pesoVehiculo, int MotorCaballos) {
        super(marca, dueño, matricula, tipo, pesoVehiculo, MotorCaballos);
        setCargaMaxima(cargaMaxima);
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    
    @Override
    public void MostrarCaracteristicas() {
        System.out.println("Su nombre es");
        System.out.println(dueño);
        System.out.println("Su marca es: ");
        System.out.println(marca);
        System.out.println("Su matricula es: ");
        System.out.println(matricula);
        System.out.println("Su tipo es: ");
        System.out.println(tipo);        
        System.out.println("El peso aprox del vehiculo es: ");
        System.out.println(pesoVehiculo);
        System.out.println("Los caballos de fuerza que tiene su motor son: ");
        System.out.println(MotorCaballos);
    }
    
}
