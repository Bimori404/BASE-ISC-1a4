package Tiendita;
public class Producto{
    String nombre;
    int existente, numprod;
    double precio;

    public Producto() {
        nombre="";
        existente=0;
        numprod=0;
        precio=0.0;
    }
    public Producto(String nombre, int existente, int numprod, double precio) {
        setNombre(nombre);
        setExistente(existente);
        setNumprod(numprod);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistente() {
        return existente;
    }
    public void setExistente(int existente) {
        this.existente = existente;
    }
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumprod() {
        return numprod;
    }
    public void setNumprod(int numprod) {
        this.numprod = numprod;
    }
    
    
}
