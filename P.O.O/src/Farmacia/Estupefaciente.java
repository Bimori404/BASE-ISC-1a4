package farmacia;
public class Estupefaciente extends Controlado{
    String codigoBarras;
    int vigencia;
    int conteoMedicamento;

    public Estupefaciente(){
        setCodigoBarras("");
        setVigencia(0);
        setConteoMedicamento(0);
    }
    
    public Estupefaciente(String nombre, int contenido, double precio, long codigo, String formula, String laboratorio,
            int grupo, int cantidad,String tipoReceta, int vigenciaReceta, int limiteSurtido, int numeroSellos,String codigoBarras,
            int vigencia, int conteoMedicamento){
        super(nombre, contenido, precio, codigo, formula, laboratorio, grupo, cantidad, tipoReceta, vigenciaReceta, limiteSurtido, numeroSellos);
        setCodigoBarras("");
        setVigencia(0);
        setConteoMedicamento(0);
    }
    
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public int getConteoMedicamento() {
        return conteoMedicamento;
    }

    public void setConteoMedicamento(int conteoMedicamento) {
        this.conteoMedicamento = conteoMedicamento;
    }
    
    
}
