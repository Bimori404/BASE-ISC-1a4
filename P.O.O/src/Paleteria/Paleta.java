package Paleteria;
public class Paleta extends Productos {
    String sabor;
    int clavepal;
    
    public Paleta() {
        sabor = "";
        clavepal = 0;
    }
    public Paleta(String sabor, String nombre, int cantexistente, double precio, int clavepal) {
        super(nombre, cantexistente, precio);
        setSabor(sabor);
        setClavepal(clavepal);
    }
    
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getClavepal() {
        return clavepal;
    }
    public void setClavepal(int clavepal) {
        this.clavepal = clavepal;
    }
    
    
}
