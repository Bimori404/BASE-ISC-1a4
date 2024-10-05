package PoliInclucion;

public class Rectangulo extends FiguraAbstracta implements InterfaceFigura {
    
    double R;
    int base, altura, r;

    public Rectangulo() {
        base = 0;
        altura = 0;
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double cArea() {
        R=base*altura;
        return R;
    }
    @Override
    public int cPerimetro() {
        r=altura+altura+base+base;
        return r;
    }
}
