package Paleteria;
public class Nieve extends Productos {
    double calorias;
    int clavenie;
    
    public Nieve() {
        calorias = 0.0;
        clavenie = 0;
    }
    public Nieve(double calorias, String nombre, int cantexistente, double precio, int clavenie) {
        super(nombre, cantexistente, precio);
        setCalorias(calorias);
        setClavenie( clavenie);
    }
    
    public double getCalorias() {
        return calorias;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public int getClavenie() {
        return clavenie;
    }
    public void setClavenie(int clavenie) {
        this.clavenie = clavenie;
    }
    
    
}
