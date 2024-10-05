package Evaluacion;

public class Proyecto extends InfoGen {
    String nomAse, nomPar, cat;

    public Proyecto(String nomAse, String nomPar, String cat, String nombre, int ID) {
        super(nombre, ID);
        setNomAse(nomAse);
        setNomPar(nomPar);
        setCat(cat);
    }

    public String getNomAse() {
        return nomAse;
    }
    public void setNomAse(String nomAse) {
        this.nomAse = nomAse;
    }

    public String getNomPar() {
        return nomPar;
    }
    public void setNomPar(String nomPar) {
        this.nomPar = nomPar;
    }

    public String getCat() {
        return cat;
    }
    public void setCat(String cat) {
        this.cat = cat;
    }
    
    
}
