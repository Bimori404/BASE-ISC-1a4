
package Clases;

public class Planeta {
    double masa;
    double distancia;
    String color="";
    String atmosfera;
    String nombre;
    
    public Planeta(){
      masa=0;
      distancia=0;
      color="";
      atmosfera="";
      nombre="";
    }
    public Planeta(String nom, String col, String at, double mas, double dis){
       setNombre(nom);
       setColor(col);        
       setAtmosfera(at);
       setMasa(mas);
       setDistancia(dis);
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
    public String getAtmosfera(){ 
        return atmosfera;
    }
    public void setAtmosfera(String Atmosfera){
        this.atmosfera=Atmosfera;
    }
    public double getMasa(){ 
        return masa;
    }
    public void setMasa(double Masa){
        this.masa=Masa;
    }
    public double getDistancia(){ 
        return distancia;
    }
    public void setDistancia(double Distancia){
        this.distancia=Distancia;
    }
}
