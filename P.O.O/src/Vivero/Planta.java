package Vivero;
public class Planta {
    int id;
    String nombre;

    public Planta() {
        id = 0;
        nombre = "";
    }
    public Planta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
