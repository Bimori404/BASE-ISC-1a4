package proyectoinvernadero;

public class Clientes extends InfoGeneral {

   
    String direccion;

    public Clientes() {
        direccion = "";
    }

    public Clientes(int id, String nombre,String apellidoP,int telefono,String marca,String cantidad,String direccion) {
        super(id,nombre,apellidoP,telefono,marca,cantidad);
        setDireccion(direccion);
    }

  
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
