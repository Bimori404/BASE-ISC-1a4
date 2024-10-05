
package Clases;

public class Cancion {
    int año;
    String artista;
    String genero;
    double duracion;
    String nombre="";
    
    public Cancion(){
       nombre="";
       año=0;            
       duracion=0;
       artista="";
       genero="";
    }
    public Cancion(String nom, int año, double dur, String art, String gen){
       setNombre(nom);
       setAño(año);        
       setDuracion(dur);
       setArtista(art);        
       setGenero(gen);
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public int getAño(){ 
        return año;
    }
    public void setAño(int Año){
        this.año=Año;
    }
    public double getDuracion(){ 
        return duracion;
    }
    public void setDuracion(double Duracion){
        this.duracion=Duracion;
    }
    public String getArtista(){ 
        return artista;
    }
    public void setArtista(String Artista){
        this.artista=Artista;
    }
    public String getGenero(){ 
        return genero;
    }
    public void setGenero(String Genero){
        this.genero=Genero;
    }
}
