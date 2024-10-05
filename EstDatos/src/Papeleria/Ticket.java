package Papeleria;

public class Ticket extends InfoGen implements Operaciones {
    double Total, precioT;
    int cantT;

    public Ticket(double Total, double precioT, int cantT, String name, int ID) {
        super(name, ID);
        setTotal(Total);
        setPrecioT(precioT);
        setCantT(cantT);
    }

    public double getTotal() {
        return Total;
    }
    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getPrecioT() {
        return precioT;
    }
    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public int getCantT() {
        return cantT;
    }
    public void setCantT(int cantT) {
        this.cantT = cantT;
    }
    
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

