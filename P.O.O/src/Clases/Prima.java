
package Clases;

public class Prima {
    String actitud;
    int edad; 
    String nombre;
    double altura;
    
    public Prima(){
       nombre="";
       edad=0;            
       altura=0;
       actitud="";
    }
    public Prima(String nom, int ed, double alt, String act){
       setNombre(nom);
       setEdad(ed);        
       setAltura(alt);
       setActitud(act);
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
    public int getEdad(){ 
        return edad;
    }
    public void setEdad(int Edad){
        this.edad=Edad;
    }
    public double getAltura(){ 
        return altura;
    }
    public void setAltura(double Altura){
        this.altura=Altura;
    }
    public String getActitud(){ 
        return actitud;
    }
    public void setActitud(String Actitud){
        this.actitud=Actitud;
    }
}
