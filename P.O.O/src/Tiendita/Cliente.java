package Tiendita;
public class Cliente extends InfoGen {
    int numcliente, numcompras;

    public Cliente() {
        numcliente=0;
        numcompras=0;
    }
    
    public Cliente(int numcliente, int numcompras,String nombre, String apeP, String apeM, String calle, String col, String cd, String num, int edad, int cp, long numcontact) {
        super(nombre, apeP, apeM, calle, col, cd, num, edad, cp, numcontact);
        setNumcliente(numcliente);
        setNumcompras(numcompras);
    }

    public int getNumcliente() {
        return numcliente;
    }
    public void setNumcliente(int numcliente) {
        this.numcliente = numcliente;
    }

    public int getNumcompras() {
        return numcompras;
    }
    public void setNumcompras(int numcompras) {
        this.numcompras = numcompras;
    }
    
 
}
