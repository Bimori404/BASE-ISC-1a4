package proyectoinvernadero;

public class InfoGeneral {

    int id;
    String nombre;
    String apellidoP;
    int telefono;
    String marca;
    String cantidad;
    
    public InfoGeneral(){
     id=0;
     nombre="";
    }

    public InfoGeneral(int id, String nombre,String apellidoP,int telefono,String marca,String cantidad) {
       setId( id);
       setNombre(nombre);
       setApellidoP(apellidoP);
       setTelefono(telefono);
       setMarca(marca);
       setCantidad(cantidad);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String  cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
