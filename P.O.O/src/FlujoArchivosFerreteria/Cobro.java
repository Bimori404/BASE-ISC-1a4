package FlujoArchivosFerreteria;

public interface Cobro {
    
    abstract double CalcIVA(double total);
    abstract double CalcPrecio(int cant, double precio);
    abstract double CalcPrecioFin(double total, double iva);
    
}
