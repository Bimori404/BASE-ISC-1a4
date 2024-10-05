package test;

public class Persona {
  
    String nombre="";
    int edad;
    double estatura;
   
    
//////Esto es un contructor/////////////////////////////////////////////////
       //SE DEBE DE LLAMAR IGUAL QUE LA CLASE A LA QUE PERTENECE//
       //DEBE SER PUBLICO//
       //NO CONTIENE TIPO DE DATO//
       //CUANDO ES EL CONTRUCTOR POR DEFECTO NO RECIVE PARAMETROS//
   public Persona(){
       nombre="";
       edad=0;             //POR DEFECTO//
       estatura=0;
   }
   
   public Persona(String n){
       setNombre(n);
   }
   public Persona(int var){
       setEdad(var);
   }
   public Persona(double es){
       setEstatura(es);
   }
   
   public Persona(String nom, int ed, double es){
       setNombre(nom);
       setEdad(ed);        //CREADO//
       setEstatura(es);
   }
///////////////////////////////////////////////////////////////////////////
   
   
    public String getNombre(){ //cualquier otro tipo menos void
        return nombre;
    }
    public void setNombre(String nombre) { //siempre tipo void
        this.nombre=nombre;
    }
 
    public int getEdad() {
        return edad;
    }
    public void setEdad(int Edad) {
        this.edad=Edad;
    }
    
    public double getEstatura(){
        return estatura;
    }
    public void setEstatura(double estatura){
        this.estatura=estatura;
    }
    
}
