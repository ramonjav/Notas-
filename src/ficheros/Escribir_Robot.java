package ficheros;

import java.io.IOException;

public class Escribir_Robot {

	public static void main(String[] args) {
		
		Robot robot1 = new Robot ("RoboRock", 100);
		Robot robot2 = new Robot ("ROBdelacasastark", 1);
		Robot robot;
		Leer_Objetos entrada = new Leer_Objetos();
		Escribir_Objetos salida = new Escribir_Objetos();
		Leer_Objetos leer = new Leer_Objetos();
		
		try {
			salida.abrir();
			salida.esribir(robot1);
			salida.esribir(robot2);
			salida.cerra();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			leer.abrir();
			
			System.out.println(leer.leer(robot1));;
			System.out.println(leer.leer(robot2));
			leer.cerrar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
