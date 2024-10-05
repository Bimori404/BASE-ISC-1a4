package Papeleria;

public class Cliente extends InfoGen {
    int  tel;
    String dir;

    public Cliente(int tel, String dir, String name, int ID) {
        super(name, ID);
        setNumtel(tel);
        setDir(dir);
    }

    public int getTel() {
        return tel;
    }
    public void setNumtel(int tel) {
        this.tel = tel;
    }

    public String getDir() {
        return dir;
    }
    public void setDir(String dir) {
        this.dir = dir;
    }

}
