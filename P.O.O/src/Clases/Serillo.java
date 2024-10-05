
package Clases;

public class Serillo {
     String marca;
    int contenidocaja;
    
    public Serillo(){
       marca="";
       contenidocaja=0;            
    }
    public Serillo(String marc, int cont){
       setMarca(marc);
       setContCaja(cont);        
    }
    
    public String getMarca(){ 
        return marca;
    }
    public void setMarca(String Marca){
        this.marca=Marca;
    }
    public int getContCaja(){ 
        return contenidocaja;
    }
    public void setContCaja(int ContenidoCaja){
        this.contenidocaja=ContenidoCaja;
    }
}
