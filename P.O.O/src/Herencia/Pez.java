package Herencia;

public class Pez extends Mascota {
    String especie;
    int tamaño;

    public Pez() {
        especie = "";
        tamaño = 0;
    }
    public Pez(String nombre, String nomDue, String especie,int tamaño) {
        super(nombre , nomDue);
        setEspecie(especie);
        setTamaño(tamaño);
    }
   
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
