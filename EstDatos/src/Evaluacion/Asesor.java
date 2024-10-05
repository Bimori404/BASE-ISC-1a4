package Evaluacion;

public class Asesor extends InfoGen{
    String apeAs, esc;
    int anti;

    public Asesor(String apeAs, String esc, int anti, String nombre, int ID) {
        super(nombre, ID);
        setApeAs(apeAs);
        setEsc(esc);
        setAnti(anti);
    }
    
    public String getApeAs() {
        return apeAs;
    }
    public void setApeAs(String apeAs) {
        this.apeAs = apeAs;
    }

    public String getEsc() {
        return esc;
    }
    public void setEsc(String esc) {
        this.esc = esc;
    }

    public int getAnti() {
        return anti;
    }
    public void setAnti(int anti) {
        this.anti = anti;
    }
}
