
package Clases;

public class Arbol {
    String tipo;
    double anchura;
    String nombre;
    double altura;
    
    public Arbol(){
       nombre="";          
       altura=0;
       anchura=0;
       tipo="";
    }
    public Arbol(String nom, String tip, double al, double anch){
       setNombre(nom);
       setTipo(tip);        
       setAltura(al);
       setAnchura(anch);        
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public double getAltura(){ 
        return altura;
    }
    public void setAltura(double Altura){
        this.altura=Altura;
    }
    public String getTipo(){ 
        return tipo;
    }
    public void setTipo(String Tipo){
        this.tipo=Tipo;
    }
    public double getAnchura(){ 
        return anchura;
    }
    public void setAnchura(double Anchura){ 
        this.anchura=Anchura;
    }

}
