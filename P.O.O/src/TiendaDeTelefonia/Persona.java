package TiendaDeTelefonia;

public class Persona {
      String nombre, apeP, apeM, calle, col;
        int edad;

    public Persona(){
        nombre = "";
        apeP = "";
        apeM = "";
        calle = "";
        col = "";
        edad = 0;
    }
    public Persona(String nombre, String apeP, String apeM, String calle, String col, int edad) {
        setNombre(nombre);
        setApeP(apeP);
        setApeM(apeM);
        setCalle(calle);
        setCol(col);
        setEdad(edad);
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

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCol() {
        return col;
    }
    public void setCol(String col) {
        this.col = col;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
