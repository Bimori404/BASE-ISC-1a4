
public class Circulo extends Figura {
    int radio;
    
    @Override
    public int calcArea(){
        return (int)(Math.PI * radio * radio);
    }

    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
}

