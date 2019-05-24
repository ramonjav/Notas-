package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Leer_Objetos {
	
	private FileInputStream file;
	private ObjectInputStream input;

	
	public void abrir() throws IOException {
		
		file = new FileInputStream("onjeto_robot.rb");
		
		input = new ObjectInputStream(file);
		
	}
	
	public void cerrar() throws IOException {
		if(input != null) {
			input.close();
		}
	}
	
	public Robot leer(Robot robo1) {
		
		Robot robot = null;
		
		if(input != null) {
			try {
				robot = (Robot)input.readObject();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return robot;
	}

}
