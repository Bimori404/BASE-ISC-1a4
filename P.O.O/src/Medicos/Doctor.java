package Medicos;
public class Doctor {
    
    int cedula;
    String nombre;
    
    public Doctor(){
    cedula=0;
    nombre="";
    }
    public Doctor(int cedula, String nombre) {
       setCedula(cedula);
       setNombre(nombre);            
    }

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
    
}
