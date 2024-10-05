
package Clases;

public class Maestro {
    String asignatura;
    int edad;
    String nombre="";
    double altura;
    
    public Maestro(){
       nombre="";
       edad=0;            
       altura=0;
       asignatura="";
    }
    public Maestro(String nom, int ed, double es, String as){
       setNombre(nom);
       setEdad(ed);        
       setAltura(es);
       setAsignatura(as);        
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
    public int getEdad(){ 
        return edad;
    }
    public void setEdad(int Edad){
        this.edad=Edad;
    }
    public String getAsignatura(){ 
        return asignatura;
    }
    public void setAsignatura(String Asignatura){
        this.asignatura=Asignatura;
    }
    
}
