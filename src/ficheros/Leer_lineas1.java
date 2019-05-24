package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public final class Leer_lineas1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>lista = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		leer.useDelimiter(";");
		
		String linea = "";
		
		try {
			BufferedReader bw = new BufferedReader (new FileReader("numeros.txt"));
			
			while((linea = bw.readLine()) != null) {
				
				try {
					lista.add(Integer.parseInt(linea));
				}catch (NumberFormatException e) {
				}
			}
		} catch (IOException e) {
		}

		Collections.sort(lista);
		
		System.out.println("El menor es: " + lista.get(0));
		System.out.println("El mayor es: " + lista.get(lista.size()-1));
		
	}

}
