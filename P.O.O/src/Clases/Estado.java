
package Clases;

public class Estado {
    String clima;
    String nombre="";
    double area;
    
    public Estado(){
       nombre="";
       area=0;            
       clima="";
    }
    public Estado(String nom, double ar, String clim){
       setNombre(nom);      
       setArea(ar);
       setClima(clim);        
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public double getArea(){ 
        return area;
    }
    public void setArea(double Area){
        this.area=Area;
    }
    public String getClima(){ 
        return clima;
    }
    public void setClima(String Clima){
        this.clima=Clima;
    }
}
 