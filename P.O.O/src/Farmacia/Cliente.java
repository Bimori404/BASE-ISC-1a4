package farmacia;

public class Cliente extends InfoGral {

    int puntos;
    long numCliente;
    int numComprar;

    public Cliente(String nombre, int edad, String apellidoM, String apellidoP, String numTelefono, String calle, String col,
            String ciudad, int puntos, long numCliente, int numComprar) {
        super(nombre, edad, apellidoM, apellidoP, numTelefono, calle, col, ciudad);
        setPuntos(puntos);
        setNumCliente(numCliente);
        setNumComprar(numComprar);
    }

    public Cliente() {
        setPuntos(0);
        setNumCliente(0);
        setNumComprar(0);
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public long getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(long numCliente) {
        this.numCliente = numCliente;
    }

    public int getNumComprar() {
        return numComprar;
    }

    public void setNumComprar(int numComprar) {
        this.numComprar = numComprar;
    }
}
