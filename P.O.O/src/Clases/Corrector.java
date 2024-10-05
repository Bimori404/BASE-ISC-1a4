
package Clases;

public class Corrector {
    String marca;
    double cont;
    
    public Corrector(){
       marca="";
       cont=0;            
    }
    public Corrector(String marc, double cont){
       setMarcaArticulo(marc);
       setContNeto(cont);        
    }
    
    public String getMarcaArticulo(){ 
        return marca;
    }
    public void setMarcaArticulo(String MarcaArticulo){
        this.marca=MarcaArticulo;
    }
    public double getContNeto(){ 
        return cont;
    }
    public void setContNeto(double ContNeto){
        this.cont=ContNeto;
    }
}
