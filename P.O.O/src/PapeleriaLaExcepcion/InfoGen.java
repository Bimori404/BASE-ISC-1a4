package PapeleriaLaExcepcion;

public class InfoGen {
    
    String name, ape;
    int id;

    public InfoGen(String name, String ape, int id) {
        setName(name);
        setApe(ape);
        setId(id);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getApe() {
        return ape;
    }
    public void setApe(String ape) {
        this.ape = ape;
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
