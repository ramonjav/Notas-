package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escribir_Objetos {

	private FileOutputStream file;
	
	private ObjectOutputStream output;
	
	public void abrir() throws IOException {
		
		file = new FileOutputStream("onjeto_robot.rb");
		output = new ObjectOutputStream(file);
	}
	
	public void ver() {
		
		
		
	}
	
	public void cerra() throws IOException {
		if(output != null) {
			output.close();
		}
	}
	
	public void esribir (Robot robot) throws IOException {
		if(output != null) {
			output.writeObject(robot);
		}
	}
	
}
