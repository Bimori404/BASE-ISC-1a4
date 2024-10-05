
package TiendaDeTelefonia;

public class Telefonos {
    String modelo, marca, color;
    int numprod, espacio, ram, precio;
    boolean tomaFotos;

    public Telefonos() {
        modelo = "";
        marca = "";
        color = "";
        precio=0;
        numprod=0;
        espacio = 0;
        ram = 0;
        tomaFotos = false;
    }
    public Telefonos(String modelo, String marca, String color, int espacio, int ram, int numprod, int precio, boolean tomaFotos) {
        setModelo(modelo);
        setMarca(marca);
        setColor(color);
        setEspacio(espacio);
        setRam(ram);
        setNumprod(numprod);
        setPrecio(precio);
        setTomaFotos(tomaFotos);
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getEspacio() {
        return espacio;
    }
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getNumprod() {
        return numprod;
    }
    public void setNumprod(int numprod) {
        this.numprod = numprod;
    }
    
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public boolean isTomaFotos() {
        return tomaFotos;
    }
    public void setTomaFotos(boolean tomaFotos) {
        this.tomaFotos = tomaFotos;
    }
}
