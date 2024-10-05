
package Clases;

public class Figura {
    String nombre="";
    String color="";
    double area, base, altura;
    
     public Figura(){
       nombre="";
       area=0;            
       base=0;
       altura=0;
    }
    public Figura(String nom, double ar, double al, double ba){
       setNombre(nom);      
       setArea(ar);
       setAltura(al); 
       setBase(ba);
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public String getColor(){ 
        return color;
    }
    public void setColor(String Color){
        this.color=Color;
    }
    public double getBase(){ 
        return base;
    }
    public void setBase(double Base){
        this.base=Base;
    }
    public double getArea(){ 
        return area;
    }
    public void setArea(double Area){
        this.area=Area;
    }
    public double getAltura(){ 
        return altura;
    }
    public void setAltura(double Altura){
        this.altura=Altura;
    }
}
