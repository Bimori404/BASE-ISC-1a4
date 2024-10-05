package PapeleriaLaExcepcion;

public class Ticket implements Operaciones {
    
    String cliente, vendedor;
    int fechaComp, id;

    public Ticket(String cliente, String vendedor, int fechaComp, int id) {
        setCliente(cliente);
        setVendedor(vendedor);
        setFechaComp(fechaComp);
        setId(id);
    }
    
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getFechaComp() {
        return fechaComp;
    }
    public void setFechaComp(int fechaComp) {
        this.fechaComp = fechaComp;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
//Excepcion
    @Override
    public double CalcIVA(double total) {
        double R=0;
       R=total*0.18;
       return R;
    }
    @Override
    public double CalcSubTotal(int cant, double precio) {
        double r=0;
       r=cant*precio;
       return r;
    }
    @Override
    public double CalcPrecioFin(double total, double iva) {
        double r=0;
        r=total + iva;
        return  r;
    }
}
