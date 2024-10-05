package farmacia;

public class Psicotropico extends Controlado {
    
    public Psicotropico(String nombre, int contenido, double precio, long codigo, String formula, String laboratorio,
            int grupo, int cantidad, String tipoReceta, int vigenciaReceta, int limiteSurtido, int numeroSellos) {
        super(nombre, contenido, precio, codigo, formula, laboratorio, grupo, cantidad, tipoReceta, vigenciaReceta, limiteSurtido, numeroSellos);
    }
}
