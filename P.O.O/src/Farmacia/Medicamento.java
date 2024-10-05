package farmacia;

public class Medicamento {

    String nombre;
    int contenido;
    double precio;
    long codigo;
    String formula;
    String laboratorio;
    int grupo;
    int cantidad;

    public Medicamento(String nombre, int contenido, double precio, long codigo, String formula, String laboratorio,
            int grupo, int cantidad) {
        setNombre(nombre);
        setContenido(contenido);
        setPrecio(precio);
        setCodigo(codigo);
        setFormula(formula);
        setLaboratorio(laboratorio);
        setGrupo(grupo);
        setCantidad(cantidad);
    }

    public Medicamento() {
        setNombre("");
        setContenido(0);
        setPrecio(0);
        setCodigo(0);
        setFormula("");
        setLaboratorio("");
        setGrupo(0);
        setCantidad(0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
