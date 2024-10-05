
package Clases;

public class Alumno {
    String materias;
    String grado;
    int edad;
    String nombre="";
    double altura;
    
    public Alumno(){
       nombre="";
       edad=0;            
       altura=0;
       materias="";
       grado="";
    }
    public Alumno(String nom, int ed, double es, String mat, String gra){
       setNombre(nom);
       setEdad(ed);        
       setAltura(es);
       setMaterias(mat);        
       setGrado(gra);
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
    public String getMaterias(){ 
        return materias;
    }
    public void setMaterias(String Materias){
        this.materias=Materias;
    }
    public String getGrado(){ 
        return grado;
    }
    public void setGrado(String Grado){
        this.grado=Grado;
    }
    
}
