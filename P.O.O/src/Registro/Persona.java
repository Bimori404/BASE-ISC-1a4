
package Registro;

public class Persona {
     String nombre, apellidoP, apellidoM, sexo;
    int edad;

    public Persona() {
        nombre="";
        apellidoP="";
        apellidoM="";
        sexo="";
        edad=0;
    }

    public Persona(String nombre, String apellidoP, String apellidoM, String sexo, int edad) {
        setNom(nombre);
        setApeP(apellidoP);
        setApeM(apellidoM);
        setSexo(sexo);
        setEdad(edad);
    }

    public String getNom() {
        return nombre;
    }
    public void setNom(String nombre) {
        this.nombre = nombre;
    }

    public String getApeP() {
        return apellidoP;
    }
    public void setApeP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApeM() {
        return apellidoM;
    }
    public void setApeM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String calcMayoria(){
        String R;
        if(edad<18){
            R="y eres menor de edad";    
        }else{
            R="y eres mayor de edad";
        }  
       return R; 
    }
    public void generaClave(){
       String clave;
       clave=nombre.substring(0,2)+""+apellidoP.substring(0,2)+""+apellidoM.substring(0,2)+""+obtieneNum();
       System.out.println(clave.toUpperCase());
    }
    public String obtieneNum(){
        String R;
        if(edad<18){
            R=String.valueOf(edad*8);
        }else{
            R=String.valueOf(edad/2);
        }
        return R;
    }
}
