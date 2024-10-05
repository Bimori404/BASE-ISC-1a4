package Papeleria;

public interface Operaciones {
    abstract double CalcIVA(double total);
    abstract double CalcSubTotal(int cant, double precio);
    abstract double CalcPrecioFin(double total, double iva);
}
