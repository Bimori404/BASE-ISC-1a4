package Ferreteria;

public class Info {
    
    String nombre, tipo;

    public Info() {
        nombre = "";
        tipo = "";
    }
    public Info(String nombre, String tipo) {
        setNombre(nombre);
        setTipo(tipo);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
