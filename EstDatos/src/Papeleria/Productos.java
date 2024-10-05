package Papeleria;

public class Productos extends InfoGen {
    int cant;
    double precio;

    public Productos(int cant, double precio, String name, int ID) {
        super(name, ID);
        setCant(cant);
        setPrecio(precio);
    }

    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    void getCant(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
