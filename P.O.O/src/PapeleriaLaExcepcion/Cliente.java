package PapeleriaLaExcepcion;

public class Cliente extends InfoGen {
    
    int puntos;

    public Cliente(int puntos, String name,String ape, int id) {
        super(name, ape, id);
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
}
