package Medicos;
public class Obstetra extends Doctor implements Accion{
    
    int horasLabor;
    double anestecia;
    
    public Obstetra(){
        horasLabor=0;
        anestecia=0;
    }
    public Obstetra(int cedula, String nombre,int horasLabor, double anestecia) {
        super(cedula, nombre);
        setHorasLabor(horasLabor);
        setAnestecia(anestecia);
    }

    public int getHorasLabor() {
        return horasLabor;
    }
    public void setHorasLabor(int horasLabor) {
        this.horasLabor = horasLabor;
    }

    public double getAnestecia() {
        return anestecia;
    }
    public void setAnestecia(double anestecia) {
        this.anestecia = anestecia;
    }
    
    @Override
    public void operar() {
        System.out.println("Estas son tus horas trabajadas");
        System.out.println(horasLabor);
        System.out.println("Este es el nombre");
        System.out.println(nombre);
        System.out.println("Esta es tu cedula");
        System.out.println(cedula);
    }
    @Override
    public double cHonorario() {
     return (horasLabor*1000)+(anestecia*200);  
    }
}
