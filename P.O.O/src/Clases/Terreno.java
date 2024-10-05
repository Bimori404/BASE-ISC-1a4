
package Clases;

public class Terreno {
    double medsolar;
    String contsolar;
    
    public Terreno(){
       contsolar="";
       medsolar=0;            
    }
    public Terreno(String cont, double med){
       setMedSolar(med);
       setContSolar(cont);        
    }
    
    public double getMedSolar(){ 
        return medsolar;
    }
    public void setMedSolar(double MedSolar){
        this.medsolar=MedSolar;
    }
    public String getContSolar(){ 
        return contsolar;
    }
    public void setContSolar(String ContSolar){
        this.contsolar=ContSolar;
    }
}
