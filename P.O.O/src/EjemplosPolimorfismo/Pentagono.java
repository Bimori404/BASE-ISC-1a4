package EjemplosPolimorfismo;

public class Pentagono extends FiguraAbstracta implements InterfaceFigura {
    
    int r;
    double R, medlado, apotema;
    
    public Pentagono() {
        medlado = 0.0;
        apotema = 0.0;
    }
    public Pentagono(double medlado, double apotema) {
        setMedlado(medlado);
        setApotema(apotema);
    }

    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void getMedlado() {
        double medlado;
    }
    public void setMedlado(double medlado) {
        this.medlado = medlado;
    }
    
    
    public int cPerimetro() {
        r=(int) (5*medlado);
        return r;
    }
    @Override
    public double cArea() {
        R=(cPerimetro()*apotema)/2;
        return R;
    }
    
}
