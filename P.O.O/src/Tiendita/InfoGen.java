package Tiendita;
public class InfoGen {
    String nombre, apeP, apeM, calle, col, ciudad, num;
    int edad, cp;
    long numcontact;

    public InfoGen() {
        nombre="";
        apeP="";
        apeM="";
        calle="";
        col="";
        ciudad="";
        num="";
        edad=0;
        cp=0;
        numcontact=0;
    }
    public InfoGen(String nombre, String apeP, String apeM, String calle, String col, String cd, String num, int edad, int cp, long numcontact) {
        setNombre (nombre);
        setApeP (apeP);
        setApeM (apeM);
        setCalle (calle);
        setCol (col);
        setCiudad (cd);
        setNum (num);
        setEdad (edad);
        setCp (cp);
        setNumcontact (numcontact);
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

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String cd) {
        this.ciudad = cd;
    }

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCp() {
        return cp;
    }
    public void setCp(int cp) {
        this.cp = cp;
    }

    public long getNumcontact() {
        return numcontact;
    }
    public void setNumcontact(long numcontact) {
        this.numcontact = numcontact;
    }
}
