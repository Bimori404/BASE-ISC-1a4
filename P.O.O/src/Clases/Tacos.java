
package Clases;

public class Tacos {
    String contenido;
    String tortilla;
    int costo;
    
    public Tacos(){
       tortilla="";
       contenido="";            
    }
    public Tacos(String tort, String cont, int cost){
       setTortilla(tort);
       setContenido(cont); 
       setCosto(cost);
    }
    
    public String getContenido(){ 
        return contenido;
    }
    public void setContenido(String Contenido){
        this.contenido=Contenido;
    }
    public String getTortilla(){ 
        return tortilla;
    }
    public void setTortilla(String Tortilla){
        this.tortilla=Tortilla;
    }
    public int getCosto(){ 
        return costo;
    }
    public void setCosto(int Costo){
        this.costo=Costo;
    }
}
