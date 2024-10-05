package PapeleriaLaExcepcion;

public class Producto extends InfoGen {
    
    String marca;
    Double precio;
    int existente;

    public Producto(String marca, Double precio, int existente, String name,String ape, int id) {
        super(name, ape, id);
        setMarca(marca);
        setPrecio(precio);
        setExistente(existente);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getExistente() {
        return existente;
    }
    public void setExistente(int existente) {
        this.existente = existente;
    }
    
    
}
