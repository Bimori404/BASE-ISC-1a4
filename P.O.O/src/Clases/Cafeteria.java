
package Clases;


public class Cafeteria {
    String articulo;
    String nombre="";
    int costo;
    
    public Cafeteria(){
       nombre="";
       costo=0;
       articulo="";
    }
    public Cafeteria(String nom, int cos, String art){
       setNombre(nom);
       setCosto(cos);        
       setArticulo(art);
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public int getCosto(){ 
        return costo;
    }
    public void setCosto(int Costo){
        this.costo=Costo;
    }
    public String getArticulo(){ 
        return articulo;
    }
    public void setArticulo(String Articulo){ 
        this.articulo=Articulo;
    }
     
}
