package farmacia;

public class Antibiotico extends Medicamento {

    int duracionTratamiento;
    String medicoEmisor;
    int numeroControl;
    int cantidadEnLibro;

    public Antibiotico(String nombre, int contenido, double precio, long codigo, String formula, String laboratorio,
            int grupo, int cantidad,int duracionTratamiento, String medicoEmisor, int numeroControl, int cantidadEnLibro) {
        super(nombre, contenido, precio, codigo, formula, laboratorio, grupo, cantidad);
        setDuracionTratamiento(duracionTratamiento);
        setMedicoEmisor(medicoEmisor);
        setNumeroControl(numeroControl);
        setCantidadEnLibro(cantidadEnLibro);
    }

    public Antibiotico() {
        setDuracionTratamiento(0);
        setMedicoEmisor("");
        setNumeroControl(0);
        setCantidadEnLibro(0);
    }

    public int getDuracionTratamiento() {
        return duracionTratamiento;
    }

    public void setDuracionTratamiento(int duracionTratamiento) {
        this.duracionTratamiento = duracionTratamiento;
    }

    public String getMedicoEmisor() {
        return medicoEmisor;
    }

    public void setMedicoEmisor(String medicoEmisor) {
        this.medicoEmisor = medicoEmisor;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(int numeroControl) {
        this.numeroControl = numeroControl;
    }

    public int getCantidadEnLibro() {
        return cantidadEnLibro;
    }

    public void setCantidadEnLibro(int cantidadEnLibro) {
        this.cantidadEnLibro = cantidadEnLibro;
    }

}
