package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer_Ficheros1 {

	public static void main(String[] args) {
		
		leerfichero("nombres.txt");

	}
	
	public static void leerfichero(String fichero) {
		
		String linea = "";
		BufferedReader br;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			
			while((linea = br.readLine()) != null)
				System.out.println(linea);;
				
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
