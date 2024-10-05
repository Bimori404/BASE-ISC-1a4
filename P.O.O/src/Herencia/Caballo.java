package Herencia;

public class Caballo extends Mascota {
    String color;
    
    public Caballo() {
        color="";
    }
    public Caballo(String nomDue, String nombre, String color) {
        super(nombre , nomDue);
        setColor(color);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
