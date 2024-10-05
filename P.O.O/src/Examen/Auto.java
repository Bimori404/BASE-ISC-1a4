package Examen;

public class Auto extends Vehiculos {
    
    boolean descapotable;

    public Auto(boolean descapotable) {
        descapotable = false;
    }

    public Auto(boolean descapotable, String marca, String dueño, String matricula, String tipo, float pesoVehiculo, int MotorCaballos) {
        super(marca, dueño, matricula, tipo, pesoVehiculo, MotorCaballos);
        setDescapotable(descapotable);
    }

    
    public boolean isDescapotable() {
        return descapotable;
    }
    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
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
        System.out.println("Su auto es descapotable ");
        System.out.println(descapotable);
    }
}
