package farmacia;

public class Controlado extends Medicamento {

    String tipoReceta;
    int vigenciaReceta;
    int limiteSurtido;
    int numeroSellos;

    public Controlado(String nombre, int contenido, double precio, long codigo, String formula, String laboratorio,
            int grupo, int cantidad,String tipoReceta, int vigenciaReceta, int limiteSurtido, int numeroSellos) {
        super(nombre, contenido, precio, codigo, formula, laboratorio, grupo, cantidad);
        setTipoReceta(tipoReceta);
        setVigenciaReceta(vigenciaReceta);
        setLimiteSurtido(limiteSurtido);
        setNumeroSellos(numeroSellos);
    }

    public Controlado() {
        setTipoReceta("");
        setVigenciaReceta(0);
        setLimiteSurtido(0);
        setNumeroSellos(0);
    }

    public String getTipoReceta() {
        return tipoReceta;
    }

    public void setTipoReceta(String tipoReceta) {
        this.tipoReceta = tipoReceta;
    }

    public int getVigenciaReceta() {
        return vigenciaReceta;
    }

    public void setVigenciaReceta(int vigenciaReceta) {
        this.vigenciaReceta = vigenciaReceta;
    }

    public int getLimiteSurtido() {
        return limiteSurtido;
    }

    public void setLimiteSurtido(int limiteSurtido) {
        this.limiteSurtido = limiteSurtido;
    }

    public int getNumeroSellos() {
        return numeroSellos;
    }

    public void setNumeroSellos(int numeroSellos) {
        this.numeroSellos = numeroSellos;
    }

}
