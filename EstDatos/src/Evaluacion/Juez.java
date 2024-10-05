package Evaluacion;

public class Juez extends InfoGen{
    String ape;
    int cedula;

    Juez(String nombre, String ape, int cedula, int ID) {
        super(nombre, ID);
        setApe(ape);
        setCedula(cedula);
    }
    
    public String getApe() {
        return ape;
    }
    public void setApe(String ape) {
        this.ape = ape;
    }
    
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    } 
    
    
}
