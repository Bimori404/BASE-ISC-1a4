package filehandling;
import java.io.FileWriter;

public class EscrituraFicheros {
	public static void main(String[] args) {
		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };//Cadena de caracteres
		FileWriter fichero = null;
		try {
			fichero = new FileWriter("FEscribir.txt");
			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}
			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}