package PapeleriaLaExcepcion;

public class Servicios extends InfoGen {
    
    double costo;
    int recarga;

    public Servicios(double costo, int recarga, String name,String ape, int id) {
        super(name, ape, id);
        setCosto(costo);
        setRecarga(recarga);
    }
    
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getRecarga() {
        return recarga;
    }
    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }
    
    
    
}
