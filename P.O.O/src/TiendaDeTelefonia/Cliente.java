
package TiendaDeTelefonia;

public class Cliente extends Persona {
    String modtel;
    int saldo, codcliente;
    long numtel;

    public Cliente() {
        codcliente = 0;
        numtel = 0;
        modtel = "";
        saldo = 0;
    }

    public Cliente(long numtel, String modtel, int saldo, String nombre, String apeP, String apeM, String calle, String col, int edad, int codcliente) {
        super(nombre, apeP, apeM, calle, col, edad);
        setCodcliente(codcliente);
        setNumtel(numtel);
        setModtel(modtel);
        setSaldo(saldo);
    }

    public int getCodcliente() {
        return codcliente;
    }
    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public long getNumtel() {
        return numtel;
    }
    public void setNumtel(long numtel) {
        this.numtel = numtel;
    }

    public String getModtel() {
        return modtel;
    }
    public void setModtel(String modtel) {
        this.modtel = modtel;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }  
    
    public void Print(){//Esto se usa para mandar los siguientes parametros y ahorrarnos codigo en la clase main
        System.out.println("CLI"+this.codcliente);
    }
}
