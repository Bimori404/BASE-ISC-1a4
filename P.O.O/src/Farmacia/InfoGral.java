package farmacia;
public class InfoGral {
    String nombre;
    int edad;
    String apellidoM;
    String apellidoP;
    String numTelefono;
    String calle;
    String col;
    String ciudad;

    public InfoGral(String nombre,int edad,String apellidoM,String apellidoP, String numTelefono,String calle, String col,String ciudad){
        setNombre(nombre);
        setEdad(edad);
        setApellidoM(apellidoM);
        setApellidoP(apellidoP);
        setNumTelefono(numTelefono);
        setCalle(calle);
        setCol(col);
        setCiudad(ciudad);
    }
    
    public InfoGral(){
        setNombre("");
        setEdad(0);
        setApellidoM("");
        setApellidoP("");
        setNumTelefono("");
        setCalle("");
        setCol("");
        setCiudad("");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
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

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
