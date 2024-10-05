package Herencia;
public class Perro extends Mascota {
    String raza;

    public Perro(){
        raza="";
    }
    public Perro(String nombre, String nomDue, String raza) {
        super(nombre , nomDue);
        setRaza(raza);
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
}
