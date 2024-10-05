package proyectoinvernadero;

public class Herramientas extends InfoGeneral {

    String uso;
 
    public Herramientas() {
        uso = "";
    }
    public Herramientas( int id, String nombre,String apellidoP,int telefono,String marca,String cantidad,String uso) {
        super(id,nombre,apellidoP,telefono,marca,cantidad);
        setUso(uso);
        
    }

    public String getUso() {
        return uso;
    }
    public void setUso(String uso) {
        this.uso = uso;
    }

    

}
