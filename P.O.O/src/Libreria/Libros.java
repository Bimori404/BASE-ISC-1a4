package Libreria;
public class Libros {
    String nombre, genero, autor;
    int id;
    
    public Libros(){
        nombre="";
        genero="";
        autor="";
        id=0;
    }
    
    public Libros(String nombre, String genero, String autor, int id){
        setAutor(autor);
        setGenero(genero);
        setId(id);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
