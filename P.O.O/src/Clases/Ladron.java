
package Clases;

public class Ladron {
    String caract;
    String nombre="";
    double altura;
    
    public Ladron(){
       nombre="";
       altura=0;
       caract="";
    }
    public Ladron(String nom, String car, double al){
       setNombre(nom);      
       setAltura(al);
       setCaract(car);
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String NombLadron){
        this.nombre=NombLadron;
    }
    public double getAltura(){ 
        return altura;
    }
    public void setAltura(double AlturaLadron){
        this.altura=AlturaLadron;
    }
     public String getCaract(){ 
        return caract;
    }
    public void setCaract(String CaracteristicasLadron){
        this.caract=CaracteristicasLadron;
    }
}
