package Vivero;
public class Rosal extends Planta {
    String color;

    public Rosal() {
        color = "";
    }
    public Rosal(String color, int id, String nombre) {
        super(id, nombre);
        setColor(color);
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
