
package Clases;

public class Mesa {
    String tipoMesa;
    String material;
    double precio;
    
    public Mesa(){
       material="";          
       precio=0;
       tipoMesa="";
    }
    public Mesa(String mat, String tip, double pre){
       setMaterial(mat);
       setTipoMesa(tip);        
       setPrecio(pre);    
    }
    
    public String getTipoMesa(){ 
        return tipoMesa;
    }
    public void setTipoMesa(String TipoMesa){
        this.tipoMesa=TipoMesa;
    }
    public String getMaterial(){ 
        return material;
    }
    public void setMaterial(String Material){
        this.material=Material;
    }
     public double getPrecio(){ 
        return precio;
    }
    public void setPrecio(double Precio){
        this.precio=Precio;
    }
}
