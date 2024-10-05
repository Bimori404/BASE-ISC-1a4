package proyectoinvernadero;

public class Productos extends InfoGeneral {

    
    String contenido;
    

    public Productos() {
        contenido = "";
    }

    public Productos(int id, String nombre,String apellidoP,int telefono,String marca,String cantidad, String contenido) {
        super(id,nombre,apellidoP,telefono,marca,cantidad);
        setContenido(contenido);
    }

    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    

}
