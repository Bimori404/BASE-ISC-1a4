
package Clases;

public class Tomate {
    int dias;
    double peso;
    String color;
    
    public Tomate(){
       peso=0;
       color="";
       dias=0;
    }
    public Tomate(String col, int dia, double pesokg){
       setDias(dia);
       setColorTomate(col);
       setPeso(pesokg);
    }
    
    public int getDias(){ 
        return dias;
    }
    public void setDias(int Dias){
        this.dias=Dias;
    }
    public String getColorTomate(){ 
        return color;
    }
    public void setColorTomate(String Color){
        this.color=Color;
    }
    public double getPeso(){ 
        return peso;
    }
    public void setPeso(double Peso){
        this.peso=Peso;
    }
}
