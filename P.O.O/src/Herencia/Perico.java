package Herencia;

public class Perico extends Mascota{
   boolean habla; 
   
    public Perico(){
        habla=false;
    }
    public Perico(String nombre, String nomDue, boolean habla) {
        super(nombre , nomDue);
        setHabla(habla);
    }

    public boolean getHabla() {
        return habla;
    }
    public void setHabla(boolean habla) {
        this.habla = habla;
    }
}
