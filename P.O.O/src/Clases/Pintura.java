
package Clases;

public class Pintura {
    int añocreacion;
    double medida;
    String nombre="";
    
    public Pintura(){
       medida=0;          
       añocreacion=0;
       nombre="";
    }
    public Pintura(String nom, int añoc, double med){
       setNombre(nom);
       setAñoCreacion(añoc);        
       setMedida(med);    
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public int getAñoCreacion(){ 
        return añocreacion;
    }
    public void setAñoCreacion(int AñoCreacion){
        this.añocreacion=AñoCreacion;
    }
    public double getMedida(){ 
        return medida;
    }
    public void setMedida(double Medida){
        this.medida=Medida;
    }
}
