package PoliInclucion;

public class Trapecio extends FiguraAbstracta implements InterfaceFigura {
    int ladoA, ladoB, baseMa, baseMe, r;
    double R, altura;
    
    public Trapecio() {
        ladoA = 0;
        ladoB = 0;
        baseMa = 0;
        baseMe = 0;
        altura = 0.0;
    }
    public Trapecio(int ladoA, int ladoB, int baseMa, int baseMe, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.baseMa = baseMa;
        this.baseMe = baseMe;
        this.altura = altura;
    }

    public int getLadoA() {
        return ladoA;
    }
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getBaseMa() {
        return baseMa;
    }
    public void setBaseMa(int baseMa) {
        this.baseMa = baseMa;
    }

    public int getBaseMe() {
        return baseMe;
    }
    public void setBaseMe(int baseMe) {
        this.baseMe = baseMe;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double cArea() {
        R=(baseMa+baseMe)*altura/2;
        return R;
    }
    @Override
    public int cPerimetro() {
        int sumaAB;
        sumaAB=ladoA+ladoB;
        r=baseMa+baseMe+(sumaAB*2);
        return r;
    }
}
