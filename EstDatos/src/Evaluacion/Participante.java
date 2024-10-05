package Evaluacion;

public class Participante extends InfoGen {
    String apePar;
    int edad;

    public Participante(String apePar, int edad, String nombre, int ID) {
        super(nombre, ID);
        setApePar(apePar);
        setEdad(edad);
    }

    public String getApePar() {
        return apePar;
    }
    public void setApePar(String apePar) {
        this.apePar = apePar;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
