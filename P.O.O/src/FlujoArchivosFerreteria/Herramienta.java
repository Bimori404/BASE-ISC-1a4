package FlujoArchivosFerreteria;

public class Herramienta extends Info{
    
    String tamaño, color, uso;
    int cantidad;
    double precio;

    public Herramienta() {
        this.tamaño = "";
        this.color = "";
        this.uso = "";
        this.cantidad = 0;
        this.precio = 0.0;
    }
    public Herramienta(String nombre, String tamaño, String tipo, String color, int cantidad, double precio) {
        super(nombre, tipo);
        setTamaño(tamaño);
        setColor(color);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
