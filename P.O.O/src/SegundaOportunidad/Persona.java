package SegundaOportunidad;

public class Persona {
    String nombre, apeP, apeM;
    long numTel;

    public Persona() {
        nombre = "";
        apeP = "";
        apeM = "";
        numTel = 000;
    }
    
    
    
    public Persona(String nombre, String apeP, String apeM, long numTel) {
        setNombre(nombre);
        setApeP(apeP);
        setApeM(apeM);
        setNumTel(numTel);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeP() {
        return apeP;
    }
    public void setApeP(String apeP) {
        this.apeP = apeP;
    }

    public String getApeM() {
        return apeM;
    }
    public void setApeM(String apeM) {
        this.apeM = apeM;
    }

    public long getNumTel() {
        return numTel;
    }
    public void setNumTel(long numTel) {
        this.numTel = numTel;
    } 
    
}
