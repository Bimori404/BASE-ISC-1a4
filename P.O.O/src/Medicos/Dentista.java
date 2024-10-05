package Medicos;

public class Dentista extends Doctor implements Accion {

    double mlAnestecia;
    int cantEspecialidad;
    
    public Dentista(){
        mlAnestecia=0;
        cantEspecialidad=0;
    }
    public Dentista(int cedula, String nombre,double mlAnestecia, int cantEspecialidad) {
       super(cedula, nombre); 
        setMlAnestecia( mlAnestecia);
        setCantEspecialidad(cantEspecialidad);
    }

    public double getMlAnestecia() {
        return mlAnestecia;
    }
    public void setMlAnestecia(double mlAnestecia) {
        this.mlAnestecia = mlAnestecia;
    }

    public int getCantEspecialidad() {
        return cantEspecialidad;
    }
    public void setCantEspecialidad(int cantEspecialidad) {
        this.cantEspecialidad = cantEspecialidad;
    }
    
    @Override
    public void operar() {
        System.out.println("Su nombre es");
        System.out.println(nombre);
        System.out.println("Su cantidad de especialidades es");
        System.out.println(cantEspecialidad);
    }
    @Override
    public double cHonorario() {
        return (mlAnestecia*100/2)*(cantEspecialidad/4);
    }

}
