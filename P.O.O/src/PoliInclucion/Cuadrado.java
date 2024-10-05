package PoliInclucion;

public class Cuadrado extends FiguraAbstracta implements InterfaceFigura {
    
    int lado, r;
    double R;
    
    public Cuadrado() {
        lado=0;
    }
    public Cuadrado(int lado) {
        setLado(lado);
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double cArea() {
        R=lado*lado;
        return R;
    }
    @Override
    public int cPerimetro() {
        r=lado+lado+lado+lado;
        return r;
    }
}