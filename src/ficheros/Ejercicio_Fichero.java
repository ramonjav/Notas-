package ficheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_Fichero {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		leer.useDelimiter("\n");
		
		System.out.print("Introduce un texto: ");
		String texto = leer.next();

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("nombres.txt", true));
			bw.write(texto + "\r\n");
			bw.close();
		} catch (IOException e) {
			
			
		}
		
	}

}
