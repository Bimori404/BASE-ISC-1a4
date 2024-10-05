
package Clases;

public class Deporte {
    int integrantes;
    String tipo;
    String nombre="";
    
    public Deporte(){
       nombre="";
       integrantes=0;
       tipo="";
    }
    public Deporte(String nom, int inte, String tip){
       setNombre(nom);
       setIntegrantes(inte);        
       setTipo(tip);
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public String getTipo(){ 
        return tipo;
    }
    public void setTipo(String Tipo){
        this.tipo=Tipo;
    }
    public double getIntegrantes(){ 
        return integrantes;
    }
    public void setIntegrantes(int Integrantes){ 
        this.integrantes=Integrantes;
    }
}
