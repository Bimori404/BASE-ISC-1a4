package PoliInclucion;

public class Triangulo extends FiguraAbstracta implements InterfaceFigura {

    double R;
    int base, altura, lado, r;

    public Triangulo() {
        base = 0;
        altura = 0;
    }
    public Triangulo(int base, int altura, int lado) {
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

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
     
    @Override
    public double cArea() {
        R=base*altura/2;
        return R;
    }
    @Override
    public int cPerimetro() {
        r=base+lado+lado;
        return r;
    }

}
