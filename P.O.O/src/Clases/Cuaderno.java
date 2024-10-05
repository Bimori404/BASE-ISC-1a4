
package Clases;

public class Cuaderno {
    String tipo;
    int numHojas;
    String color;
    String marca;
    
    public Cuaderno(){
       tipo="";
       numHojas=0;            
       marca="";
       color="";
    }
    public Cuaderno(String tipo, int numH, String marc, String col){
       setTipo(tipo);
       setNumHojas(numH);        
       setColor(col);
       setColor(marc);
    }
    
    public String getTipo(){ 
        return tipo;
    }
    public void setTipo(String TipoCuaderno){
        this.tipo=TipoCuaderno;
    }
    public String getMarca(){ 
        return marca;
    }
    public void setMarca(String Marca){
        this.marca=Marca;
    }
    public int getNumHojas(){ 
        return numHojas;
    }
    public void setNumHojas(int NumHojas){
        this.numHojas=NumHojas;
    }
    public String getColor(){ 
        return color;
    }
    public void setColor(String Color){
        this.color=Color;
    }
}
