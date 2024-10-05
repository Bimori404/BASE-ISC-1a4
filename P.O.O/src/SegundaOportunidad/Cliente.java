package SegundaOportunidad;

public class Cliente extends Persona{
    
    String calle, numCasa, col;
    int claveclie;

    public Cliente() {
        this.calle = calle;
        this.numCasa = numCasa;
        this.col = col;
        this.claveclie = claveclie;
    }

    public Cliente(String calle, String numCasa, String col, int claveclie, String nombre, String apeP, String apeM, long numTel) {
        super(nombre, apeP, apeM, numTel);
        setCalle(calle);
        setNumCasa(numCasa);
        setCol(col);
        setClaveclie(claveclie);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public int getClaveclie() {
        return claveclie;
    }

    public void setClaveclie(int claveclie) {
        this.claveclie = claveclie;
    }
    
    
    
    
    
}
