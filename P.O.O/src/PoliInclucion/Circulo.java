package PoliInclucion;

public class Circulo extends FiguraAbstracta implements InterfaceFigura {
    
    int radio;

    public Circulo() {
        radio = 0;
    }
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double cArea() {
        return (int)(Math.PI * radio * radio);
    }
    @Override
    public int cPerimetro() {
        return (int)((Math.PI*2)*radio);
    }
}
