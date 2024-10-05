package Paleteria;
public class Productos {
    String nombre;
    int cantexistente;
    double precio;

    public Productos() {
        nombre = "";
        cantexistente = 0;
        precio = 0.0;
    }
    public Productos(String nombre, int cantexistente, double precio) {
        setNombre(nombre);
        setCantexistente(cantexistente);
        setPrecio(precio);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantexistente() {
        return cantexistente;
    }
    public void setCantexistente(int cantexistente) {
        this.cantexistente = cantexistente;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
