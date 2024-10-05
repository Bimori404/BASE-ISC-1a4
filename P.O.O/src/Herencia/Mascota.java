
package Herencia;

public class Mascota {
    String nombre, nomDue;
    
    public Mascota(){
        nombre="";
        nomDue="";
    }
    public Mascota(String nombre, String nomDue) {
        this.nombre = nombre;
        this.nomDue = nomDue;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNomDue(String nomDue) {
        this.nomDue = nomDue;
    }
    public String getNomDue() {
        return nomDue;
    }
}
