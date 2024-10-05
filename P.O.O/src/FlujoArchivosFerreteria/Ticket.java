package FlujoArchivosFerreteria;

public class Ticket implements Cobro {
    
    int numTicket, total;
    String fecha, clente;

    public Ticket() {
        numTicket = 0;
        total = 0;
        fecha = "";
        clente = "";
    }
    public Ticket(int numTicket, int total, String fecha, String clente) {
        setNumTicket(numTicket);
        setTotal(total);
        setFecha(fecha);
        setClente(clente);
    }
    
    public int getNumTicket() {
        return numTicket;
    }
    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getClente() {
        return clente;
    }
    public void setClente(String clente) {
        this.clente = clente;
    }
    
    @Override
    public double CalcIVA(double total){
       double R=0;
       R=total*0.18;
       return R;
    }
    @Override
    public double CalcPrecio(int cant, double precio){
       double r=0;
       r=cant*precio;
       return r;
    }
    @Override
    public double CalcPrecioFin(double total, double iva){
        double r=0;
        r=total + iva;
        return  r;
    }
    
}
