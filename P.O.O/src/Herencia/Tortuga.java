package Herencia;

public class Tortuga extends Mascota {
    String tipo;
    
    public Tortuga() {
        tipo="";
    }
    public Tortuga(String nomDue, String nombre, String tipo) {
        super(nombre , nomDue);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
   
}
