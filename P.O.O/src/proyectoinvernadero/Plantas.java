package proyectoinvernadero;
public class Plantas extends InfoGeneral {
    String familia;
    String fechaS;
    String tipo;
    public Plantas(){
    familia="";
    fechaS="";
    tipo="";
    }

    public Plantas(int id, String nombre,String apellidoP,int telefono,String marca,String cantidad,String familia,String fechaS, String tipo) {
       super(id,nombre,apellidoP,telefono,marca,cantidad);
        setFamilia( familia);
        setFechaS(fechaS);
        setTipo(tipo);
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getFechaS() {
        return fechaS;
    }

    public void setFechaS(String fechaS) {
        this.fechaS = fechaS;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
