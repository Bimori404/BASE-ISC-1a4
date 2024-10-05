
package Clases;

public class Universidad {
    int salones;
    double densTerreno;
    
    public Universidad(){
       salones=0;
       densTerreno=0;
    }
    public Universidad(int sal, double dens){
       setSalones(sal);
       setDensTerreno(dens);
    }

    public int getSalones(){ 
        return salones;
    }
    public void setSalones(int Salones){
        this.salones=Salones;
    }
    public double getDensTerreno(){ 
        return densTerreno;
    }
    public void setDensTerreno(double DensidadTerreno){
        this.densTerreno=DensidadTerreno;
    }
}
