package farmacia;

public class OTC extends Medicamento{
    
    boolean Existencia;
    
    public OTC(String nombre, int contenido, double precio, long codigo, String formula, String laboratorio,
            int grupo, int cantidad,boolean Existencia) {
        super(nombre, contenido, precio, codigo, formula, laboratorio, grupo, cantidad);
        setExistencia(Existencia);
    }
    
    public OTC() {
        setExistencia(false);
    }
    
    public boolean isExistencia() {
        return Existencia;
    }
    
    public void setExistencia(boolean Existencia) {
        this.Existencia = Existencia;
    }
    
}
