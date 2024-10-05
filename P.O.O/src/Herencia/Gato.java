package Herencia;

public class Gato extends Mascota {
    int numvidas;
    
    public Gato(){
        numvidas=0;
    }
    public Gato(String nombre, String nomDue, int numvidas) {
        super(nombre , nomDue);
        setNumVidas(numvidas);
    }

    public int getNumVidas() {
        return numvidas;
    }
    public void setNumVidas(int numvidas) {
        this.numvidas = numvidas;
    }
}
