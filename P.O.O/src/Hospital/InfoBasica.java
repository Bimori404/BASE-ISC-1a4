package hospital;

public class InfoBasica {

    String nombre;
    String apellidoP;
    String apellidoM;
    String nacionalidad;
    int edad;
    String calle;
    String numCasa;
    String colonia;
    String ciudad;
    long numTelef;
    double peso;
    double estatura;
    double imc;
    String diagImc;//Bajo peso, Normal, Sobrepeso, Obesidad grado 1, Obesidad grado 2, Obesidad grado 3
    long nss;

    public InfoBasica() {
        setNombre("");
        setApellidoP("");
        setApellidoM("");
        setNacionalidad("");
        setEdad(0);
        setCalle("");
        setNumCasa("");
        setColonia("");
        setCiudad("");
        setNumTelef(0);
        setPeso(0);
        setEstatura(0);
        setImc(0);
        setDiagImc("");
        setNss(0);
    }  
    
    public InfoBasica(String nombre, String apellidoP, String apellidoM, String nacionalidad, int edad, String calle,
        String numCasa, String colonia, String ciudad, long numTelef, double peso, double estatura, double imc, String diagImc, long nss) {
        setNombre(nombre);
        setApellidoP(apellidoP);
        setApellidoM(apellidoM);
        setNacionalidad(nacionalidad);
        setEdad(edad);
        setCalle(calle);
        setNumCasa(numCasa);
        setColonia(colonia);
        setCiudad(ciudad);
        setNumTelef(numTelef);
        setPeso(peso);
        setEstatura(estatura);
        setImc(imc);
        setDiagImc(diagImc);
        setNss(nss);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidoP() {
        return apellidoP;
    }
    
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    
    public String getApellidoM() {
        return apellidoM;
    }
    
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
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
    
    public String getColonia() {
        return colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public long getNumTelef() {
        return numTelef;
    }
    
    public void setNumTelef(long numTelef) {
        this.numTelef = numTelef;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getEstatura() {
        return estatura;
    }
    
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public double getImc() {
        return imc;
    }
    
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public String getDiagImc() {
        return diagImc;
    }
    
    public void setDiagImc(String diagImc) {
        this.diagImc = diagImc;
    }
    
    public long getNss() {
        return nss;
    }
    
    public void setNss(long nss) {
        this.nss = nss;
    }
    
    public void obtenerImc() {
        
    }
    
}
