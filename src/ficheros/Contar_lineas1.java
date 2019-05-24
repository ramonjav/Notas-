package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Contar_lineas1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("La cantidad de lineas es: " + cuenta("nombres.txt"));
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}
	
	public static int cuenta(String fichero) throws IOException {
		int con = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		
		String linea = "";
		
		while((linea = br.readLine()) != null) {
			con ++;
		}
		
		return con;
	}

}
