package Evaluacion;

public class InfoGen {
    String nombre;
    int ID;

    public InfoGen(String nombre, int ID) {
        setNombre(nombre);
        setID(ID);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
