package hospital;

public class Medicamentos {

    int codigo;
    String clasMedicamentos;
    int cantTotal;
    String nombComercial;
    String nombGenerico;
    String nombLaboratorio;
    String lote;
    String fechaCaducidad;
    int cantEnvase;
    String viaAdministracion;
    boolean efectosSecundarios;

    public Medicamentos(int codigo, String clasMedicamentos, int cantTotal, String nombComercial, String nombGenerico,
            String nombLaboratorio, String lote, String fechaCaducidad, int cantEnvase, String viaAdministracion, boolean efectosSecundarios) {
        setCodigo(codigo);
        setClasMedicamentos(clasMedicamentos);
        setCantTotal(cantTotal);
        setNombComercial(nombComercial);
        setNombGenerico(nombGenerico);
        setNombLaboratorio(nombLaboratorio);
        setLote(lote);
        setFechaCaducidad(fechaCaducidad);
        setCantEnvase(cantEnvase);
        setViaAdministracion(viaAdministracion);
        setEfectosSecundarios(efectosSecundarios);
    }

    public Medicamentos() {
        setCodigo(0);
        setClasMedicamentos("");
        setCantTotal(0);
        setNombComercial("");
        setNombGenerico("");
        setNombLaboratorio("");
        setLote("");
        setFechaCaducidad("");
        setCantEnvase(0);
        setViaAdministracion("");
        setEfectosSecundarios(false);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClasMedicamentos() {
        return clasMedicamentos;
    }

    public void setClasMedicamentos(String clasMedicamentos) {
        this.clasMedicamentos = clasMedicamentos;
    }

    public int getCantTotal() {
        return cantTotal;
    }

    public void setCantTotal(int cantTotal) {
        this.cantTotal = cantTotal;
    }

    public String getNombComercial() {
        return nombComercial;
    }

    public void setNombComercial(String nombComercial) {
        this.nombComercial = nombComercial;
    }

    public String getNombGenerico() {
        return nombGenerico;
    }

    public void setNombGenerico(String nombGenerico) {
        this.nombGenerico = nombGenerico;
    }

    public String getNombLaboratorio() {
        return nombLaboratorio;
    }

    public void setNombLaboratorio(String nombLaboratorio) {
        this.nombLaboratorio = nombLaboratorio;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getCantEnvase() {
        return cantEnvase;
    }

    public void setCantEnvase(int cantEnvase) {
        this.cantEnvase = cantEnvase;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public boolean isEfectosSecundarios() {
        return efectosSecundarios;
    }

    public void setEfectosSecundarios(boolean efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

}
