package Medicos;

public class Neurocirujano extends Doctor implements Accion {

    int horaQuirofano;
    int NumPersonas;

    public Neurocirujano() {
        horaQuirofano = 0;
        NumPersonas = 0;
    }

    public Neurocirujano(int cedula, String nombre, int horaQuirofano, int NumPersonas) {
        super(cedula, nombre);
        setHoraQuirofano(horaQuirofano);
        setNumPersonas(NumPersonas);
    }

    @Override
    public void operar() {
        System.out.println("Este es el numero de personas");
        System.out.println(NumPersonas);
        System.out.println("Este es su nombre");
        System.out.println(nombre);
    }

    @Override
    public double cHonorario() {
        return NumPersonas*horaQuirofano*600;
    }

    public int getHoraQuirofano() {
        return horaQuirofano;
    }

    public void setHoraQuirofano(int horaQuirofano) {
        this.horaQuirofano = horaQuirofano;
    }

    public int getNumPersonas() {
        return NumPersonas;
    }

    public void setNumPersonas(int NumPersonas) {
        this.NumPersonas = NumPersonas;
    }

}
