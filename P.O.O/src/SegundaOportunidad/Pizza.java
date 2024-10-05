package SegundaOportunidad;

public class Pizza {
    String nomPizza, tamaño;
    int codigo, cantIngre;
    double precio;

    public Pizza() {
    }

    public Pizza(String nomPizza, String tamaño, int codigo, int cantIngre, double precio) {
        setNomPizza(nomPizza);
        setTamaño(tamaño);
        setCodigo(codigo);
        setCantIngre(cantIngre);
        setPrecio(precio);
    }

    public String getNomPizza() {
        return nomPizza;
    }

    public void setNomPizza(String nomPizza) {
        this.nomPizza = nomPizza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantIngre() {
        return cantIngre;
    }

    public void setCantIngre(int cantIngre) {
        this.cantIngre = cantIngre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
